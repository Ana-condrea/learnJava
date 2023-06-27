<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <%
        String s1 = request.getParameter("name");
        out.println("HI there gorgeaus " + s1);
    %>
</html>

