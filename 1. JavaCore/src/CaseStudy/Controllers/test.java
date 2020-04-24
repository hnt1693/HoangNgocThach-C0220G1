package CaseStudy.Controllers;

import CaseStudy.Models.House;

import javax.net.ssl.HostnameVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws ParseException {
//        House house1 = new House("1","House1",23.3f,300000,20,"Week","4star","max",3);
//        house1.showInfor();
//        String pattern = "([A-Z][a-z]+\s)+([A-Z][a-z]+)$";
//        System.out.println(Pattern.matches(pattern,"Hoang  Ngoc Thac"));
//
//        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//        Date date = format.parse("20-12-1993");
//        System.out.println(date.getDate());
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse("20-02-1993");
        System.out.println(date1);
    }
}
