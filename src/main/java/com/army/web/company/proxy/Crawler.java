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

    public void bikes(){
//        giantRoadBike();
//        giantMountainBike();
//        giantElectricBike();
        trekBike();
    }
    private void trekBike(){
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
//            System.out.println("===========출력물==========="+image.attr("src"));
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).text());
//                bicycle.setImage(image.get(i).select("img").attr("src"));
                bicycle.setYear(year.get(i).text());
                bicycle.setPrice(price.get(i).text());
                bicycle.setManufacturer("TREK");
                bicycle.setKind("MOUNTAIN");
                bicycleRepository.save(bicycle);
            }
        } catch (Exception e) {
            println("Error" + e);
        }

    }
    public void specializedBike(){
        inventory.clear();
        try {
            String url = "https://www.specialized.com/kr/ko/shop/bikes/road-bikes/c/road?q=%3Aprice-desc%3Aarchived%3Afalse%3Agroup%3A%EC%9E%90%EC%A0%84%EA%B1%B0%3Agroup%3AE-Bikes&show=All";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("a.product-list__name");
//            Elements image = d.select("div.main-product-list-image");
//            Elements year = d.select("span.product-tile__model-year");
//            Elements price = d.select("div.product-list__item-price.div.div");
            Bicycle bicycle = null;
//            System.out.println("===========출력물==========="+image.attr("src"));
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).text());
//                bicycle.setImage(image.get(i).select("img").attr("data-src"));
//                bicycle.setYear(year.get(i).text());
//                bicycle.setPrice(price.get(i).text());
//                bicycleRepository.save(bicycle);
                System.out.println(bicycle.toString());
            }
        } catch (Exception e) {
            println("Error" + e);
        }

    }
    private void giantRoadBike(){
        inventory.clear();
        try {
            String url = "https://www.giant-bicycles.com/kr/bikes/road-bikes";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("div.caption");
            Elements image = d.select("picture.image");
            Elements year = d.select("div.caption");
            Elements price = d.select("span.price");
            Bicycle bicycle = null;
//            System.out.println("===========출력물==========="+image.select("img").attr("src"));
//            System.out.println("===========출력물==========="+title.text());
//            System.out.println("===========출력물==========="+year.text());
//            System.out.println("===========출력물==========="+price.text());
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).select("h3").text());
                bicycle.setImage(image.get(i).select("img").attr("src"));
                bicycle.setYear(year.get(i).select("h4").text());
                bicycle.setPrice(price.get(i).text());
                bicycle.setManufacturer("GIANT");
                bicycle.setKind("ROAD");
                bicycleRepository.save(bicycle);
            }
        } catch (Exception e) {
            println("Error" + e);
        }

    }
    private void giantMountainBike() {
        inventory.clear();
        try {
            String url = "https://www.giant-bicycles.com/kr/bikes/mountain-bikes";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("div.caption");
            Elements image = d.select("picture.image");
            Elements year = d.select("div.caption");
            Elements price = d.select("span.price");
            Bicycle bicycle = null;
//            System.out.println("===========출력물==========="+image.select("img").attr("src"));
//            System.out.println("===========출력물==========="+title.text());
//            System.out.println("===========출력물==========="+year.text());
//            System.out.println("===========출력물==========="+price.text());
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).select("h3").text());
                bicycle.setImage(image.get(i).select("img").attr("src"));
                bicycle.setYear(year.get(i).select("h4").text());
                bicycle.setPrice(price.get(i).text());
                bicycle.setManufacturer("GIANT");
                bicycle.setKind("MOUNTAIN");
                bicycleRepository.save(bicycle);
            }
        } catch (Exception e) {
            println("Error" + e);
        }
    }
    private void giantElectricBike() {
        inventory.clear();
        try {
            String url = "https://www.giant-bicycles.com/kr/bikes/electric-bikes";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("div.caption");
            Elements image = d.select("picture.image");
            Elements year = d.select("div.caption");
            Elements price = d.select("span.price");
            Bicycle bicycle = null;
//            System.out.println("===========출력물==========="+image.select("img").attr("src"));
//            System.out.println("===========출력물==========="+title.text());
//            System.out.println("===========출력물==========="+year.text());
//            System.out.println("===========출력물==========="+price.text());
            for(int i=0; i<title.size(); i++){
                bicycle = new Bicycle();
                bicycle.setTitle(title.get(i).select("h3").text());
                bicycle.setImage(image.get(i).select("img").attr("src"));
                bicycle.setYear(year.get(i).select("h4").text());
                bicycle.setPrice(price.get(i).text());
                bicycle.setManufacturer("GIANT");
                bicycle.setKind("ELECTRIC");
                bicycleRepository.save(bicycle);
            }
        } catch (Exception e) {
            println("Error" + e);
        }
    }
}
