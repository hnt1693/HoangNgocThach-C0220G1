package CaseStudy.Models;

public class Villa extends Services {
    private String standardsOfRoom;
    private String details;
    private float swimPoolArea;
    private int stories;

    public Villa(float usedArea, int rentCost, int maxPeoples, String typeOfRent, String standardsOfRoom
            , String details, float swimPoolArea, int stories) {
        super( usedArea, rentCost, maxPeoples, typeOfRent);
        this.standardsOfRoom = standardsOfRoom;
        this.nameService = "Villa";
        this.details = details;
        this.swimPoolArea = swimPoolArea;
        this.stories = stories;
        this.id = "Villa" + Services.quantityOfService;
    }

    public float getSwimPoolArea() {
        return swimPoolArea;
    }

    public void setSwimPoolArea(float swimPoolArea) {
        this.swimPoolArea = swimPoolArea;
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

        System.out.println("ID Villa : " +id);
        System.out.println("Kiểu thuê : " + typeOfRent);
        System.out.println("Số người tối đa : " + maxPeoples);
        System.out.println("Tiêu chuẩn phong : " + standardsOfRoom);
        System.out.println("Mô tả : " + details);
        System.out.println("Diện tích hồ bơi : " + swimPoolArea);
        System.out.println("Số tầng : " + stories);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardsOfRoom='" + standardsOfRoom + '\'' +
                ", details='" + details + '\'' +
                ", swimPoolArea=" + swimPoolArea +
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
