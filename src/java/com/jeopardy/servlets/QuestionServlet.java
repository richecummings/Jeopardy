package com.jeopardy.servlets;

import com.jeopardy.beans.Question;
import java.util.*;
import java.io.*;
import static java.lang.Integer.parseInt;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/question")
public class QuestionServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        HttpSession session = request.getSession();
        
        int currentQuestion = parseInt(request.getParameter("button"));
        /*
        PrintWriter out = response.getWriter();
        CreateQuestions cq = new CreateQuestions();
        
        Question[] questions = cq.getQuestions();
        
        out.println(currentQuestion);
        out.println(questions[currentQuestion].getQuestion());*/
        session.setAttribute("currentQuestion", ((Question[])session.getAttribute("questions"))[currentQuestion]);
        
        RequestDispatcher view = 
                request.getRequestDispatcher("displayQuestion.jsp");
        view.forward(request, response);
    }
}
