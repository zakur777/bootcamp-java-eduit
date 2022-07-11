<%@ page import="ar.com.educacionit.domain.Menu" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collection" %><%--
  Created by IntelliJ IDEA.
  User: zakur
  Date: 10-07-22
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
  <div class="container-fluid">
      <%  Collection<Menu> menuList = (Collection<Menu>)request.getAttribute("menu");%>
      <ul class="nav nav-tabs">
          <%System.out.println(menuList);%>
          <% for(Menu menu: menuList) {%>
              <% if( menu.isRoot() && !menu.getSubMenu().isEmpty()) {%>

              <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false"><%=menu.getTexto()%></a>
                  <ul class="dropdown-menu">
                      <li><a class="dropdown-item" href="#">Prueba 1</a></li>
                      <li><a class="dropdown-item" href="#">Prueba 2</a></li>
                      <li><a class="dropdown-item" href="#">Prueba 3</a></li>
                  </ul>
              </li>
              <%}else if(menu.isRoot()){%>
                  <li class="nav-item">
                      <a class="nav-link active" aria-current="page" href="#"><%=menu.getTexto()%></a>
                  </li>
              <%}%>
          <%}%>
          <%--<li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Dropdown</a>
              <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Separated link</a></li>
              </ul>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item">
              <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
          </li>--%>
      </ul>
  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
