package com.zdzislaw.controller;

import com.zdzislaw.model.FormatterContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String textAreaValue = request.getParameter("textArea");
        FormatterContext formatterContext = new FormatterContext(request.getParameter("selectedOption"));
        String newText = null;
        try {
            newText = formatterContext.transformText(textAreaValue).trim();
        } catch (NullPointerException e) {
            System.out.println("Select correct tranformation");
        }
        request.getSession().setAttribute("newText", newText);

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
