package com.example.demo.servlet;

import com.example.demo.service.EmployeeManager;
import entities.Employees;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "save_user", value = "/save_user")

public class addnewEmployee extends HttpServlet {
    Employees employ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String path=req.getPathInfo();

            String name=req.getParameter("userName");
            String phone=req.getParameter("email");

            String email=req.getParameter("phone");
            if(name !=null){
                employ=new Employees(name,phone,email);
                EmployeeManager.create(employ);
                resp.sendRedirect("./list_user");

        }
    }



}






