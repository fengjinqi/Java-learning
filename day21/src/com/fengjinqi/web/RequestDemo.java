package com.fengjinqi.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/request")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        System.out.println(new String(name.getBytes("iso8859-1"),"utf-8"));//乱码
        String[] parameterValues = req.getParameterValues("sex");
        Enumeration<String> parameterNames = req.getParameterNames();
        Map<String, String[]> parameterMap = req.getParameterMap();

       // req.getRequestDispatcher("url").forward(req,resp);
//        req.setAttribute();
//        req.getAttribute();
//        req.removeAttribute();
        //ServletContext servletContext = req.getServletContext();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameter("name"));
    }
}
