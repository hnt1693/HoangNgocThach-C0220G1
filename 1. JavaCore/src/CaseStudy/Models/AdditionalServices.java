package CaseStudy.Models;

public class AdditionalServices {
    String servicesName;
    int quantities;
    int price;

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AdditionalServices(String servicesName, int quantities, int price) {
        this.servicesName = servicesName;
        this.quantities = quantities;
        this.price = price;
    }
}
