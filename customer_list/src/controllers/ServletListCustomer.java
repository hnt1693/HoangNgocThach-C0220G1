package controllers;

import models.Customer;
import view.CustomerServiceIpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletListCustomer", urlPatterns = "/display")
public class ServletListCustomer extends HttpServlet {
    private CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("null")) {
            action = "";
        } else {
            switch (action) {
                case "create": {
                    break;
                }
                case "edit": {
                    break;
                }
                case "delete": {
                    break;
                }
                case "view": {
                   listCustomers(request,response);
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
    List<Customer> customers = this.customerServiceIpml.findAll();
    request.setAttribute("customers",customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try{
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
