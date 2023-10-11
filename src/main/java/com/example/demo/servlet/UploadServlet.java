package com.example.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.awt.geom.RectangularShape;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(value ="/upload-file")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Writer writer = resp.getWriter();
        writer.write("<html><body>");

        writer.write("<form action='upload-file' method='POST' enctype='multipart/form-data' >");

        writer.write("<input type='file' name='file' size ='50' />");

        writer.write("<input type='submit' value='Upload File' />");
        writer.write("</form>");
        writer.write("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Part part = req.getPart("file");
            String realPath = req.getServletContext().getRealPath("/images");
            String filename = Path.of(part.getSubmittedFileName()).getFileName().toString();
            if(!Files.exists(Path.of(realPath))){
                Files.createDirectory(Path.of(realPath));
            }
            part.write(realPath+"/"+filename);
            try(PrintWriter out =resp.getWriter()) {
                out.print("<img src= 'images/>"+filename+"'>");
            }catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
