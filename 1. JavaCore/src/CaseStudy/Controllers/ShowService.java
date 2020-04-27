package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import javax.lang.model.type.MirroredTypeException;
import java.util.*;

public class ShowService {
    static void showAllVillaIsNotDuplicate() {
        ArrayList<Villa> temp = ReadWriteData.loadVillaList();
        TreeSet<Villa> villas = new TreeSet<>((o1, o2) -> o1.getNameService().compareTo(o2.getNameService()));
        villas.addAll(temp);
        villas.forEach(item -> item.showInfor());
    }

    static void showAllHouseIsNotDuplicate() {
        TreeSet<House> houses = new TreeSet<>((o1, o2) ->  o1.getNameService().compareTo(o2.getNameService()));
        houses.addAll(ReadWriteData.loadHouseList());
        houses.forEach(item->item.showInfor());
    }

    static void showAllRoomIsNotDuplicate() {
        TreeSet<Room> rooms = new TreeSet<>((o1, o2) -> o1.getNameService().compareTo(o2.getNameService()));
        rooms.addAll(ReadWriteData.loadRoomList());
        rooms.forEach(item->item.showInfor());
    }

    static void showRoomList() {
        ArrayList<Room> roomList = ReadWriteData.loadRoomList();
        if (roomList.size() == 0) {
            System.out.println("Empty List");
        } else {
            System.out.println("Hiện tại đang có : " + roomList.size() + " ROOM");
            roomList.forEach(item -> item.showInfor());
        }
    }

    static void showHouseList() {
        ArrayList<House> houseList = ReadWriteData.loadHouseList();
        if (houseList.size() == 0) {
            System.out.println("EmptyList");
        } else {
            System.out.println("Hiện tại đang có : " + houseList.size() + " HOUSE");
            houseList.forEach(item -> item.showInfor());
        }
    }

    static void showVillaList() {
        ArrayList<Villa> villaList = ReadWriteData.loadVillaList();
        if (villaList.size() == 0) {
            System.out.println("EmptyList");
        } else {
            System.out.println("Hiện tại đang có : " + villaList.size() + " VILLA");
            villaList.forEach(item -> item.showInfor());
        }
    }
}
