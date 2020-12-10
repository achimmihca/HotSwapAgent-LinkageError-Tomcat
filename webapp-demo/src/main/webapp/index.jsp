<%@page contentType="text/html;charset=UTF-8"%>

<%@page import="config.ConfigAccess"%>

<html>
  <head>
    <title>Hello world!</title>
  </head>
  <body>
    <p>
      <%= ConfigAccess.getConfig().getDefaultGreeting() %>
    </p>
  </body>
</html>
