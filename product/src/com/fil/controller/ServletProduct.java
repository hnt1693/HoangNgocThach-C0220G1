package com.fil.controller;

import com.fil.model.Product;
import com.fil.services.ProductService;
import com.fil.services.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@WebServlet(name = "ServletProduct", urlPatterns = "/product")
public class ServletProduct extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                create(request, response);
                break;
            }
            case "delete": {
                delete(request, response);
                break;
            }
            case "edit": {
                edit(request, response);
                break;
            }

            default: {
                list(request, response);
                break;

            }
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
       Collection<Product> products =  this.productService.searchByName(name);
        request.setAttribute("listProduct1",products);
        request.getRequestDispatcher("product/search.jsp").forward(request,response);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String production = request.getParameter("production");
        Product product = new Product(id, name, price, description, production);
        this.productService.update(product.getId(), product);
        try {
            response.sendRedirect("product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                showCreate(request, response);
                break;
            }
            case "delete": {
                delete(request, response);
                break;
            } case "search": {
                search(request,response);
                break;
            }
            case "edit": {
                showEdit(request, response);
                break;
            }
            case "view": {
                showView(request, response);
                break;
            }
            default: {
                list(request, response);
                break;

            }
        }
    }

    private void showView(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = ProductServiceImpl.products.get(id);
        request.setAttribute("productById", product);
        try {
            request.getRequestDispatcher("product/view.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = ProductServiceImpl.products.get(id);
        request.setAttribute("productById", product);
        try {
            request.getRequestDispatcher("product/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String production = request.getParameter("production");
        Product product = new Product(ProductServiceImpl.products.size() + 1, name, price, description, production);
        ProductServiceImpl.products.put(product.getId(), product);
        response.sendRedirect("product");

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ProductServiceImpl.products.remove(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("product");

    }

    private void list(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        request.setAttribute("listProduct", ProductServiceImpl.products);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
