package org.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddCar", value = "/addCar")
public class AddCar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/form.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        List<Car> cars = (List<Car>) session.getAttribute("cars");

        if(cars == null){
            cars = new ArrayList<>();
        }

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        Car car = new Car(brand, model);

        cars.add(car);
        session.setAttribute("cars", cars);
        response.sendRedirect("/index.jsp");
    }
}
