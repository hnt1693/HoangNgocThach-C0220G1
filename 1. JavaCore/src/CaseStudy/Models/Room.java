package CaseStudy.Models;

public class Room extends Services {
    private String freeServices;
    static int quantityOfRoom = 0;

    public Room(String id, String nameService, float usedArea, int rentCost, int maxPeoples, String typeOfRent, String freeServices) {
        super(id, nameService, usedArea, rentCost, maxPeoples, typeOfRent);
        this.freeServices = freeServices;

    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }


    @Override
    public void showInfor() {

        System.out.println("ID Room : " + id);
        System.out.println("Tên phòng " +  nameService);
        System.out.println("Kiểu thuê : " + typeOfRent);
        System.out.println("Lượng khách tối đa : " + maxPeoples);
        System.out.println("Dịch vụ miễn phí : " + freeServices);
        System.out.println("=============XX=============");

    }


    @Override
    public String toString() {
        return "Room [ id=" + id + " , usedArea=" + usedArea + " , rentCost=" + rentCost + " , maxPeoples=" + maxPeoples + " , typeOfRent=" + typeOfRent
                + " , freeServices=" + freeServices + " ]\n";
    }
}
