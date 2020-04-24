package CaseStudy.Models;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Services implements Serializable {
    String id;
    String nameService;
    float usedArea;
    int rentCost;
    int maxPeoples;
    String typeOfRent;
    ArrayList<AdditionalServices> additionalServicesList = new ArrayList<>();

    public Services(String id, String nameService, float usedArea, int rentCost, int maxPeoples, String typeOfRent) {
        this.id = id;
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.rentCost = rentCost;
        this.maxPeoples = maxPeoples;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(float usedArea) {
        this.usedArea = usedArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeoples() {
        return maxPeoples;
    }

    public void setMaxPeoples(int maxPeoples) {
        this.maxPeoples = maxPeoples;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public abstract void showInfor();

}
