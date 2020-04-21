package CaseStudy.Models;

public class Room extends Services {
    private String freeServices;

    public Room(float usedArea, int rentCost, int maxPeoples, String typeOfRent, String freeServices) {
        super(usedArea, rentCost, maxPeoples, typeOfRent);
        this.freeServices = freeServices;
        this.nameService = "Room";
        this.id = "Room" + Services.quantityOfService;
    }


    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }


    @Override
    public void showInfor() {

        System.out.println("ID Room : "  + id);
        System.out.println("Kiểu thuê : " + typeOfRent);
        System.out.println("Lượng khách tối đa : "+maxPeoples);
        System.out.println("Dịch vụ miễn phí : " + freeServices);

    }



    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", rentCost=" + rentCost +
                ", maxPeoples=" + maxPeoples +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
