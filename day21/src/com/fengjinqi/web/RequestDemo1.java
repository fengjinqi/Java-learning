package com.fengjinqi.web;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/redirect")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("https//:www.fengjinqi.com");
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width =100;
        int height =50;
        BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.PINK);
        graphics.fillRect(0,0,width,height);
        graphics.setColor(Color.BLUE);
        graphics.drawRect(0,0,width-1,height-1);

        String str="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        Random random = new Random();
        for (int i = 1; i <=4; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            String s = str.valueOf(c);

            graphics.drawString(s,width/5*i,height/2);
        }

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(width);
            int i2 = random.nextInt(width);
            int i3 = random.nextInt(height);
            int i4 = random.nextInt(height);
            graphics.drawLine(i1,i3,i2,i4);
        }


        boolean jpg = ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());

    }
}
