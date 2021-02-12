package org.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet", value = "/checkCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/formCookie.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Cookie [] cookies = request.getCookies();
        boolean found = false;
        PrintWriter writer = response.getWriter();
        for(Cookie item : cookies){
            if(name.equals(item.getName())){

                writer.append(item.getValue());
                found = true;
            }
        }

        if(!found){
            writer.append("NO COOKIE");
        }
    }
}
