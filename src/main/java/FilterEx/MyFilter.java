/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FilterEx;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Admin
 */
public class MyFilter implements Filter {
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
          
    String password=req.getParameter("password");  
    if(password.equals("admin")){  
    chain.doFilter(req, resp);//sends request to next resource  
    }  
    else{
        out.print("Sorry UserName or Password Error!");
        resp.setContentType("text/html");
        RequestDispatcher rd = req.getRequestDispatcher("index.html");
        rd.include(req, resp);   
    }  
          
}  
    public void destroy() {}  
   
}
