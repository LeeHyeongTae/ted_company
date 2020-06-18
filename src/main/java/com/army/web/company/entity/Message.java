package com.army.web.company.entity;

import java.util.Date;
import java.util.Objects;

public class Message {
    private Integer id;
    private String text;
    private Date createDate;

    public Message(String text) {
        this.text = text;
    }

    public Message(Integer id, String text, Date createDate) {
        this.id = id;
        this.text = text;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;
        return Objects.equals(id, message.id);
    }

    public int hashCode () {
        return Objects.hash(id);
    }
}
