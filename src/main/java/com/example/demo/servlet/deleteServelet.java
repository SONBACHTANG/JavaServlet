package com.example.demo.servlet;

import com.example.demo.service.EmployeeManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "deleteServelet" ,value = "/delete")
public class deleteServelet extends HttpServlet {


//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id=req.getParameter("id");
//        boolean check= EmployeeManager.delete(Integer.parseInt(id));
//        System.out.println("===========================");
//        System.out.println(check);
//        if(check==true){
//            req.getRequestDispatcher("/User/list.jsp");
//        }
//    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //super.doPost(req, resp);
//        String id=req.getParameter("id");
//        boolean check= EmployeeManager.delete(Integer.parseInt(id));
//        System.out.println("===========================");
//        System.out.println(check);
//        if(check==true){
//            req.getRequestDispatcher("/User/list.jsp");
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        String id=req.getParameter("id");
        boolean check= EmployeeManager.delete(Integer.parseInt(id));
        System.out.println("===========================");
        System.out.println(check);
        if(check==true){
            System.out.println("jjjjjjjjjjjjjjjjj");
            req.getRequestDispatcher("/User/list.jsp");
        }
    }
}
