package com.army.web.company.proxy;

import com.army.web.company.entity.Bicycle;
import com.army.web.company.repositorys.BicycleRepository;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("crawler") @Lazy
public class Crawler extends Proxy{
    @Autowired Inventory<Bicycle> inventory;
    @Autowired BicycleRepository bicycleRepository;

    public void trekBike(){
        inventory.clear();
        try {
            String url = "https://www.trekbikes.com/kr/ko_KR/%EC%9E%90%EC%A0%84%EA%B1%B0/c/B100/?q=%3Arelevance&page=0&pageSize=72";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("h3.product-tile__title");
//            Elements image = d.select("div.product-tile__image-wrap");
            Elements year = d.select("span.product-tile__model-year");
            Elements price = d.select("span.product-tile__saleprice");
            Bicycle bicycle = null;
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).text());
//                bicycle.setImage(image.get(i).select("img").attr("src"));
                bicycle.setYear(year.get(i).text());
                bicycle.setPrice(price.get(i).text());
                bicycleRepository.save(bicycle);
            }
        } catch (Exception e) {
            println("Error" + e);
        }

    }
}
