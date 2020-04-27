package CaseStudy.Controllers;

import CaseStudy.Models.House;
import org.w3c.dom.ls.LSOutput;

import javax.net.ssl.HostnameVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
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
//        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse("20-02-1993");
//        System.out.println(date1);
//
//        TreeSet<String> arr = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student(19, "Xuan Khanh"));
//        students.add(new Student(17, "Xuan Khanh"));
//        students.add(new Student(17, "Xuan Khanh"));
//        students.add(new Student(17, "Ngoc Thach"));
//        students.add(new Student(17,"Nbc - xyz"));
////        students.forEach(item -> System.out.println(item.toString()));
//        TreeSet<Student> st = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int value = o1.getName().compareTo(o2.getName());
//                if (value == 0) {
//                    if (o1.getAge() > o2.getAge())
//                        return 1;
//                    else if (o1.getAge() < o2.getAge())
//                        return -1;
//                    else return 0;
//                } else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//
//            }
//
//            ;
//        });
//        st.addAll(students);
//        st.forEach(item -> System.out.println(item.toString()));

        Queue <String> bookingMovie = new LinkedList<>();
        bookingMovie.add("abc");
        bookingMovie.add("cdf");
        bookingMovie.add("efg");
        bookingMovie.offer("vmn");
        bookingMovie.offer("MMM");

        System.out.println(bookingMovie.poll());
        Iterator<String> a = bookingMovie.iterator();
       while (a.hasNext()){
           System.out.println(a.next());
       }
    }
}

class Student {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
