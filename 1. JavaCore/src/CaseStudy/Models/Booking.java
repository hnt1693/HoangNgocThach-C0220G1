package CaseStudy.Models;

public class Booking {
    private Services services;
    private Customer customer;

    public Booking(Services services, Customer customer) {
        this.services = services;
        this.customer = customer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
