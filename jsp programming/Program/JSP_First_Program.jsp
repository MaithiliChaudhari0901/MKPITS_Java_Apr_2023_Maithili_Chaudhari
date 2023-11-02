<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/1/2023
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>
<%

    Connection connection;
    String r = request.getParameter("Roll_no");
    String p = request.getParameter("Phy");
    String c = request.getParameter("Chem");
    String m = request.getParameter("Math");




    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loaded");
    connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "@mile18hari");
    System.out.println("Connection Established");

    PreparedStatement preparedstatement = connection.prepareStatement("insert into marksdetails values(?,?,?,?)");
    preparedstatement.setString(1, r);
    preparedstatement.setString(2, p);
    preparedstatement.setString(3, c);
    preparedstatement.setString(4, m);

    int returnValue=preparedstatement.executeUpdate();
    PrintWriter printWriter=response.getWriter();
    if (returnValue != 0) {

        printWriter.println("inserted");
    } else {
        printWriter.println("not inserted");
    }



%>
<html>
<head>
    <title>Title</title>
</head>
 <body>

</body>
</html>
