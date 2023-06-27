/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LearnServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 *
 * @author Admin
 */
public class AddNumbersServlet extends HttpServlet {
    


//    @Override
//    public void init() throws ServletException {
//       
//    }

//    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
         int first = Integer.parseInt(request.getParameter("num1"));
         int second = Integer.parseInt(request.getParameter("num2"));
         
         int result = first + second;
         
         System.out.println("Result is " + result);
        
    }

//    @Override
//    public void destroy() {
//        // nothing
//    }
    
}
