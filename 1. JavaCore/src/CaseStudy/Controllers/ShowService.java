package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.*;

public class ShowService {
    static void showAllVillaIsNotDuplicate() {
        ArrayList<Villa> temp = ReadWriteData.loadVillaList();
        TreeSet<Villa> villas = new TreeSet<>(new Comparator<Villa>() {
            @Override
            public int compare(Villa o1, Villa o2) {
                return o2.getNameService().compareTo(o1.getNameService());
            }
        });
        villas.addAll(temp);
        villas.forEach(item->item.showInfor());
    }

    static void showAllHouseIsNotDuplicate() {
    }

    static void showAllRoomIsNotDuplicate() {
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
