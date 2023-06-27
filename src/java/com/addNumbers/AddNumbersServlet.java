/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.addNumbers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Admin
 */
public class AddNumbersServlet extends HttpServlet {
    


//    @Override
//    public void init() throws ServletException {
//       
//    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int first = Integer.parseInt(request.getParameter("num1"));
         int second = Integer.parseInt(request.getParameter("num2"));
         
         int result = first + second;
         
         PrintWriter printWriter = response.getWriter();
         printWriter.println("<h1>" + result + "</h1>");
        
    }

//    @Override
//    public void destroy() {
//        // nothing
//    }
    
}
