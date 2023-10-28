package com.example.demo.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter(urlPatterns = {"/upload-file"})

public class AuthenFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            String uri = request.getRequestURI();
            if (username == null) {
                response.sendRedirect("login-servlet");
            }
            filterChain.doFilter(request, response);


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void destroy() {

    }
}

