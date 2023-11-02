<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/2/2023
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "@mile18hari");
    Statement statement=connection.createStatement();
   ResultSet resultSet=statement.executeQuery("select * from marksdetails");
//    ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
%>
<html>
<head>
    <title>TITLE</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <th> Roll_no </th>
        <th> Phy </th>
        <th> Chem </th>
        <th> Math </th>
    </tr>

    <%
        while(resultSet.next())
        {
    %>

    <tr>
        <td> <%=resultSet.getString(1)%> </td>
        <td> <%=resultSet.getString(2)%> </td>
        <td> <%=resultSet.getString(3)%> </td>
        <td> <%=resultSet.getString(4)%> </td>

    </tr>

    <%
    }
    %>

 </table>
 </body>
 </html>
