package com.example.projectdb.controller;

/**
 * @project ProjectDb
 * @author Victoria Zhirnova
 */


import com.example.projectdb.db.ProductDB;
import com.example.projectdb.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            Product product = new Product(name, price);
            ProductDB.insert(product);
            response.sendRedirect(request.getContextPath()+"/index");
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}
