/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestWebServlet;

import jakarta.servlet.RequestDispatcher;
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
public class Login extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        PrintWriter p = response.getWriter();
        
        String name = request.getParameter("name");
        String pin = request.getParameter("pin");
        
        if("Andrei".equals(name) && "0312".equals(pin)) {
            RequestDispatcher rd = request.getRequestDispatcher("servlet2");  
            rd.forward(request, response);  
        } else if("Ana".equals(name)) {
            response.sendRedirect("reply.jsp?name=redirect");
//            RequestDispatcher rd = request.getRequestDispatcher("/reply.jsp");  
//            rd.forward(request, response);  
        } else {
            p.print("Sorry UserName or Password Error!");  
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");  
            rd.include(request, response); 
        }
        
    }
    
    
    
}
