package org.example;

import org.example.Dao.CarDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowCars", value = "/showCars")
public class ShowCars extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     /*   CarDao carDao = new CarDao();
        List<Car> cars = new ArrayList<>();
        cars = carDao.getCars();
        request.setAttribute("cars", cars);*/
        getServletContext().getRequestDispatcher("/showCars.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
