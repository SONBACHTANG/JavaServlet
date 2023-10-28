package com.example.demo.servlet;

import com.example.demo.service.EmployeeManager;
import entities.Employees;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/list_user")//thằng này đại diện cho cả lớp này khi được gọi mapping tìm đến đây
public class ListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        List<Employees> list = EmployeeManager.getAll();//tạo list chứa lúc thằng con gọi user
        req.setAttribute("list1", list);//nhờ thằng request ném thằng user lên cho server
        req.getRequestDispatcher("/views/list.jsp").forward(req, resp);//địa chỉ khi mapping vào
//        for (User u : list) {//đoạn này test trên log thuii
//            System.out.println(list.toString());
//        }
    }


}
