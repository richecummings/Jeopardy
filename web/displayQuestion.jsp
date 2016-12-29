<%@ page import="com.jeopardy.beans.Question" %>
<%@ page import="com.jeopardy.servlets.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question</title>
    </head>
    <body>
        <jsp:useBean id="currentQuestion" class="com.jeopardy.beans.Question" 
                     scope="session" />
        <h3>
            ${currentQuestion.getQuestion}
        </h3>
        <form method="post" action="answer">
            <input type="submit" name="ansButton" value="1">
            ${currentQuestion.getAnswer1}
            
        </form>
    </body>
</html>
