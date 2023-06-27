
package TestWebServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        
        try {
            response.setContentType("text/html");
            try (PrintWriter out = response.getWriter()) {
                String n=request.getParameter("userName");
                out.print("Welcome "+n);
                
                Cookie ck=new Cookie("uname",n);//creating cookie object
                response.addCookie(ck);//adding cookie in the response
                
                //creating submit button
                out.print("<form action='secondServlet' method='post'>");
                out.print("<input type='submit' value='go'>");
                out.print("</form>");
            }  
     
        }catch(IOException e){System.out.println(e);}  
    }
    
}
