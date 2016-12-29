package com.jeopardy.servlets;

import com.jeopardy.beans.Question;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/session")
public class Session extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
      
        response.setContentType("text/html");
        
        String name = request.getParameter("username");
        int score = 0;
        
        HttpSession session = request.getSession();
        
        session.setAttribute("username", name);
        session.setAttribute("score", score);
        
        CreateQuestions cq = new CreateQuestions();
        
        Question[] questions = cq.getQuestions();
        
        session.setAttribute("questions", questions);
        
        Random rand = new Random();
        
        int dailyDouble1 = rand.nextInt((25 - 1) + 1);
        int dailyDouble2 = rand.nextInt((25 - 1) + 1);
        
        session.setAttribute("dailyDouble1", dailyDouble1);
        session.setAttribute("dailyDouble2", dailyDouble2);
        
        response.sendRedirect("game.jsp");
    }
}