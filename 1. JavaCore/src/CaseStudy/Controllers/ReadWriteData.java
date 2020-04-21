package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteData {
    public static void write(ArrayList<Services> services) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("D:\\6. MODULE2\\HoangNgocThach-C0220G1\\1. JavaCore\\src\\CaseStudy\\Data\\" + "services.csv", false);
//            fout = new FileOutputStream("/media/fil-arettes/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/services.csv", false);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(services);


            System.out.println("Xong!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList<Services> load() {
        ArrayList<Services> services = null;
        try {
//            FileInputStream fi = new FileInputStream(new File("/media/fil-arettes/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/services.csv"));
              FileInputStream fi = new FileInputStream(new File("D:\\6. MODULE2\\HoangNgocThach-C0220G1\\1. JavaCore\\src\\CaseStudy\\Data\\services.csv"));

            ObjectInputStream oi = new ObjectInputStream(fi);
            services = (ArrayList<Services>) oi.readObject();
            oi.close();
            fi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return services;
    }
}
