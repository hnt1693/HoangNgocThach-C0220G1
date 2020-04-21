package CaseStudy.Models;

public class House extends Services {
    private String standardsOfRoom;
    private String details;
    private int stories;

    public House(float usedArea, int rentCost, int maxPeoples, String typeOfRent
            , String standardsOfRoom, String details, int stories) {
        super(usedArea, rentCost, maxPeoples, typeOfRent);
        this.standardsOfRoom = standardsOfRoom;
        this.details = details;
        this.stories = stories;
        this.nameService = "House";
        this.id = "House" + Services.quantityOfService;
    }
    
    public String getStandardsOfRoom() {
        return standardsOfRoom;
    }

    public void setStandardsOfRoom(String standardsOfRoom) {
        this.standardsOfRoom = standardsOfRoom;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }


    @Override
    public void showInfor() {
        System.out.println("ID : " + id);
        System.out.println("Kiểu thuê : " + typeOfRent);
        System.out.println("Số lượng khách tối đa : " + maxPeoples);
        System.out.println("Giá thuê : "+rentCost);
        System.out.println("Tiêu chuẩn phòng : " + standardsOfRoom);
        System.out.println("Mô tả : " + details);
        System.out.println("Số tầng : " + stories);
    }

    @Override
    public String toString() {
        return "House{" +
                "standardsOfRoom='" + standardsOfRoom + '\'' +
                ", details='" + details + '\'' +
                ", stories=" + stories +
                ", id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", rentCost=" + rentCost +
                ", maxPeoples=" + maxPeoples +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
