/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilterEx;

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
public class MyServlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
          
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            out.print("welcome ADMIN");
        }  
          
    }  
  
}
