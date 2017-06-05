package servlet;

import bean.Animal;
import bean.Car;
import dao.AnimalsList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/animals")
public class AnimalServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Animal> animalList = AnimalsList.getList();

        request.setAttribute("animalList", animalList);

        RequestDispatcher rq = request.getRequestDispatcher("/animalsList.jsp");
        rq.forward(request, response);
    }
}
