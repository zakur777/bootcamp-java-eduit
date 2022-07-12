<%@ page import="ar.com.educacionit.domain.Menu" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%--
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
      <%  List<Menu> menuList = (List<Menu>)request.getAttribute("menu");%>
      <ul class="nav nav-tabs">
          <%! public String renderMenu(Menu menuForSearch){

              String htmlString = "";
              StringBuilder stringBuilder = new StringBuilder();

                   if( menuForSearch.isRoot() && !menuForSearch.getSubMenu().isEmpty()) {

                       stringBuilder.append("<li class=\"nav-item dropdown\">")
                               .append("<a class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\">"+menuForSearch.getTexto()+"</a>");
                          if(menuForSearch.getSubMenu() != null) {
                              stringBuilder.append("<ul class=\"dropdown-menu\">");
                                  for (Menu menuRecursive: menuForSearch.getSubMenu()) {
                                      stringBuilder.append("<li><a class=\"dropdown-item\" href=\"#\">"+ menuRecursive.getTexto() +"</a></li>");
                                      renderMenu(menuRecursive);
                                  }
                                  stringBuilder.append("</ul>");

                              }
                               stringBuilder.append("</li>");
                       return stringBuilder.toString();
                  } else if (menuForSearch.isRoot()) {
                        htmlString = "<li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#\">"+ menuForSearch.getTexto() +"</a></li>";
                          return htmlString;

                   }
                  return "sin menu";
          }%>
          <% for(Menu menu: menuList) {%>
          <%=renderMenu(menu)%>
          <%}%>
      </ul>
  </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
