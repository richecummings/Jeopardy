<%@ page import="com.jeopardy.beans.Question" %>
<%@ page import="com.jeopardy.servlets.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jeopardy</title>
    </head>
    <body>
        <jsp:useBean id="questions" type="com.jeopardy.beans.Question" 
                     scope="request" />
        ${name} $${score}
        <form method="post" action="question">
        <table id="grid">
            <thead>
                <tr>
                    <th>Programming</th>
                    <th>Video Games</th>
                    <th>Ice Hockey</th>
                    <th>Ancient History</th>
                    <th>Astronomy</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="submit" name="button" value="0" ${questions[0].picked}/>
                        $200
                    </td>
                    <td>$200</td><td>$200</td><td>$200</td><td>$200</td>
                </tr>
                <tr>
                    <td>$400</td><td>$400</td><td>$400</td><td>$400</td><td>$400</td>
                </tr>
                <tr>
                    <td>$600</td><td>$600</td><td>$600</td><td>$600</td><td>$600</td>
                </tr>
                <tr>
                    <td>$800</td><td>$800</td><td>$800</td><td>$800</td><td>$800</td>
                </tr>
                <tr>
                    <td>$1000</td><td>$1000</td><td>$1000</td><td>$1000</td><td>$1000</td>
                </tr>
            </tbody>
        </table>
        </form>
    </body>
</html>
