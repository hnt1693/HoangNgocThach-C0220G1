package CaseStudy.Controllers;

import CaseStudy.Models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;


public class ReadWriteData {
    public static void write(Object object) {
        String path = "/media/fil/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/" + (object).getClass().getSimpleName() + ".csv";
        if (object instanceof Villa) {
            try {
                FileWriter fileWriter = new FileWriter(new File(path), true);
//                Writer writer = Files.newBufferedWriter(Paths.get(fileName));
//                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT.withHeader("id", "serviceName", "usedArea",
//                        "rentCost", "maxPeoples", "typeOfRent", "standardOfRoom", "details", "swimPoolArea", "stories"));
                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
                csvPrinter.printRecord(((Services) object).getId(), ((Services) object).getNameService(), ((Services) object).getUsedArea(),
                        ((Services) object).getRentCost(), ((Services) object).getMaxPeoples(), ((Services) object).getTypeOfRent(), ((Villa) ((Services) object)).getStandardsOfRoom()
                        , ((Villa) ((Services) object)).getDetails(), ((Villa) ((Services) object)).getSwimPoolArea(), ((Villa) ((Services) object)).getStories());
                csvPrinter.flush();
                fileWriter.close();
                csvPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (object instanceof House) {
            try {
                FileWriter fileWriter = new FileWriter(new File(path), true);
                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
                csvPrinter.printRecord(((Services) object).getId(), ((Services) object).getNameService(), ((Services) object).getUsedArea(),
                        ((Services) object).getRentCost(), ((Services) object).getMaxPeoples(), ((Services) object).getTypeOfRent(), ((House) ((Services) object)).getStandardsOfRoom()
                        , ((House) ((Services) object)).getDetails(), ((House) ((Services) object)).getStories());
                csvPrinter.flush();
                fileWriter.close();
                csvPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (object instanceof Room) {
            try {
                FileWriter fileWriter = new FileWriter(new File(path), true);
                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
                csvPrinter.printRecord(((Services) object).getId(), ((Services) object).getNameService(), ((Services) object).getUsedArea(),
                        ((Services) object).getRentCost(), ((Services) object).getMaxPeoples(), ((Services) object).getTypeOfRent(), ((Room) ((Services) object)).getFreeServices());
                csvPrinter.flush();
                fileWriter.close();
                csvPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (object instanceof Customer) {
            try {
                FileWriter fileWriter = new FileWriter(new File(path), true);
                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
                csvPrinter.printRecord(((Customer) object).getName(), ((Customer) object).getDob(), ((Customer) object).getGender(), ((Customer) object).getCmnd(),
                        ((Customer) object).getPhone(), ((Customer) object).getEmail()
                        , ((Customer) object).getTypeOfCustomer(), ((Customer) object).getAddress());
                csvPrinter.flush();
                fileWriter.close();
                csvPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (object instanceof Booking) {
            try {
                FileWriter fileWriter = new FileWriter(new File(path), true);
                CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);
                csvPrinter.printRecord(((Booking) object).getCustomer().getCmnd(), ((Booking) object).getServices().getId());
                csvPrinter.flush();
                fileWriter.close();
                csvPrinter.close();
                System.out.println("Thêm booking thành công !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public static ArrayList<Room> loadRoomList() {
        ArrayList<Room> rooms = new ArrayList<>();
        try {
            String path = "/media/fil/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/Room.csv";
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                String id = csvRecord.get(0);
                String serviceName = csvRecord.get(1);
                Float usedArea = Float.parseFloat(csvRecord.get(2));
                int rentCost = Integer.parseInt(csvRecord.get(3));
                int maxPeoples = Integer.parseInt(csvRecord.get(4));
                String typeOfRent = csvRecord.get(5);
                String freeServices = csvRecord.get(6);
                Room room = new Room(id, serviceName, usedArea, rentCost, maxPeoples, typeOfRent, freeServices);
                rooms.add(room);
            }
        } catch (Exception e) {

        }

        return rooms;
    }

    public static ArrayList<House> loadHouseList() {
        ArrayList<House> houses = new ArrayList<>();
        try {
            String path = "/media/fil/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/House.csv";
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                String id = csvRecord.get(0);
                String serviceName = csvRecord.get(1);
                Float usedArea = Float.parseFloat(csvRecord.get(2));
                int rentCost = Integer.parseInt(csvRecord.get(3));
                int maxPeoples = Integer.parseInt(csvRecord.get(4));
                String typeOfRent = csvRecord.get(5);
                String standardOfRoom = csvRecord.get(6);
                String details = csvRecord.get(7);
                int stories = Integer.parseInt(csvRecord.get(8));
                House house = new House(id, serviceName, usedArea, rentCost, maxPeoples, typeOfRent, standardOfRoom, details, stories);
                houses.add(house);
            }
        } catch (Exception e) {

        }

        return houses;
    }

    public static ArrayList<Villa> loadVillaList() {
        ArrayList<Villa> villas = new ArrayList<>();
        try {
            String path = "/media/fil/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/Villa.csv";
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                String id = csvRecord.get(0);
                String serviceName = csvRecord.get(1);
                Float usedArea = Float.parseFloat(csvRecord.get(2));
                int rentCost = Integer.parseInt(csvRecord.get(3));
                int maxPeoples = Integer.parseInt(csvRecord.get(4));
                String typeOfRent = csvRecord.get(5);
                String standardOfRoom = csvRecord.get(6);
                String details = csvRecord.get(7);
                Float swimPoolArea = Float.parseFloat(csvRecord.get(8));
                int stories = Integer.parseInt(csvRecord.get(9));
                Villa villa = new Villa(id, serviceName, usedArea, rentCost, maxPeoples, typeOfRent, standardOfRoom, details, swimPoolArea, stories);
                villas.add(villa);
            }
        } catch (Exception e) {

        }

        return villas;
    }

    public static ArrayList<Customer> LoadCustomerList() {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            String path = "/media/fil/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/Customer.csv";
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                String name = csvRecord.get(0);
                String dob = csvRecord.get(1);
                String gender = (csvRecord.get(2));
                String cmnd = (csvRecord.get(3));
                String phone = (csvRecord.get(4));
                String email = csvRecord.get(5);
                String typeOfRent = csvRecord.get(6);
                String address = csvRecord.get(7);
                Customer customer = new Customer(name, dob, gender, cmnd, phone, email, typeOfRent, address);
                customers.add(customer);
            }
        } catch (Exception e) {

        }

        return customers;
    }

}
