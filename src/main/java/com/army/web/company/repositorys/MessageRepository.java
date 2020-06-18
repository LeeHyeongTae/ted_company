package com.army.web.company.repositorys;

import com.army.web.company.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class MessageRepository {
    private final static Logger log = LoggerFactory.getLogger(MessageRepository.class);

    private DataSource dataSource;

    public MessageRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Message  saveMessage(Message message) {
        Connection c = DataSourceUtils.getConnection(dataSource);

        try {
            String insertSql = "insert into messages ('id', 'text', 'created_date') value (null, ?, ?)";
            PreparedStatement ps = c.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, message.getText());
            ps.setTimestamp(2, new Timestamp(message.getCreateDate().getTime()));

            int rowsAffected = ps.executeUpdate();

            if(rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);
                    return new Message(id, message.getText(), message.getCreateDate());
                } else {
                    log.error("failed to retrivev id, no row in result set");
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            log.error("Failed to save message connection", ex);
            try{
                c.close();
            }catch (SQLException e){
                log.error("Failed to close connection", e);
            }
        } finally {
            DataSourceUtils.releaseConnection(c, dataSource);
        }
        return null;
    }
}
