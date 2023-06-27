/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestWebServlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class SecondServlet extends HttpServlet {  
  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            Cookie ck[] = request.getCookies();
            out.print("Hello "+ck[0].getValue());
        }  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
    
}
