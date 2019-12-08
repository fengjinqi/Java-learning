package com.fengjinqi.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
@WebServlet("/dowload")
public class ServletContextDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext1 = this.getServletContext();
        String file = req.getParameter("file");
        System.out.println(file);
        String realPath = servletContext.getRealPath("/img/"+file);
        System.out.println(realPath);
         FileInputStream fileOutputStream = new FileInputStream(realPath);
        resp.setContentType(servletContext.getMimeType(file));
        resp.setHeader("content-disposition","attachment;filename="+file);


        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len =0;
        while ((len=fileOutputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        System.out.println(realPath);
        fileOutputStream.close();

    }
}
