<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Welcome</title>
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css"
      integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
      crossorigin="anonymous"
    />
    <style>
      body {
        background-color: rgb(155, 242, 155);
        font-size: 30px;
        border: 3px solid red;
        display: flex;
        justify-content: center;
        padding: 10px;
        margin: 10px;
      }

      div,
      p,
      a {
        text-align: center;
      }
    </style>
  </head>

  <body>
    <div class="content">
      <h1>Welcome</h1>
      <p class="lead">Hello! This is Prajeet. Welcome to my servlet.</p>
      <div>
        The page that you are seeing now is the <b>index.jsp</b> page. To check
        for it, go to -
      </div>
      <a
        href="<%= request.getContextPath() %>/helloservlet"
        class="btn btn-primary btn-lg active"
        role="button"
      >
        Helloservlet
      </a>
    </div>
  </body>
</html>
