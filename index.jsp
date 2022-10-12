<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
        <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>

<u>Company share List</u>
</br></br>
<a href="companyEntry">Enlist a new Company</a>
</h3>
<hr size="1" color="cyan"/>

<h4>
<table border="1" >
  <tr bgcolor="Orange"><h3>
    <th>Company Id</th>
    <th>Company Name</th>
    <th>share Price</th>
	<th>Action</th>
	</h3>
  </tr>
    <c:forEach  items="${companyList}" var="comp">
      <tr bgcolor="yellow">
      <td>${comp.companyId}</td>
      <td>${comp.companyName}</td>
      <td>${comp.sharePrice}</td>
      <td><h5>
      	<a href="edit-company/${comp.companyId}">Edit share price</a>&nbsp;&nbsp;
      	<a href="delete/${comp.companyId}">Delete company</a> 
      	<br/>  	
      </h5>
      </td>
      
      </tr>
     </c:forEach>
  </table>
  </h4>
  

</div>
</body>
</html>