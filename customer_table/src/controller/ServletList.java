package controller;

import com.fil.model.Customer;
import view.CustomerList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletList")
public class ServletList extends HttpServlet {
    private CustomerList customerList = new CustomerList();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        ArrayList<Customer> customers = CustomerList.customers;
        request.setAttribute("list",customers);
        requestDispatcher.forward(request,response);

    }
}
