package CaseStudy.Models;

public class Villa extends Services {
    private String standardsOfRoom;
    private String details;
    private float swimPoolArea;
    private int stories;
    static int quantitiesOfVilla = 0;


    public Villa(String id, String nameService, float usedArea, int rentCost, int maxPeoples, String typeOfRent, String standardsOfRoom, String details, float swimPoolArea, int stories) {
        super(id, nameService, usedArea, rentCost, maxPeoples, typeOfRent);
        this.standardsOfRoom = standardsOfRoom;
        this.details = details;
        this.swimPoolArea = swimPoolArea;
        this.stories = stories;
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

        System.out.println("ID Villa : " + id);
        System.out.println("Tên Villa : " + nameService);
        System.out.println("Giá thuê : " + rentCost);
        System.out.println("Kiểu thuê : " + typeOfRent);
        System.out.println("Số người tối đa : " + maxPeoples);
        System.out.println("Kiểu thuê :" + typeOfRent);
        System.out.println("Tiêu chuẩn phong : " + standardsOfRoom);
        System.out.println("Mô tả : " + details);
        System.out.println("Diện tích hồ bơi : " + swimPoolArea);
        System.out.println("Số tầng : " + stories);
        System.out.println("==========XXX==========");
    }

    @Override
    public String toString() {
        return "Villa [ id=" + id + " , usedArea=" + usedArea + " , rentCost=" + rentCost + " , maxPeoples=" + maxPeoples + " , typeOfRent=" + typeOfRent
                + " , standardOfRoom=" + standardsOfRoom + " , details=" + details + " , swimPoolArea=" + swimPoolArea + " , stories=" + stories + " ]\n";
    }
}
