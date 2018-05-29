<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/5/24
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户录入页面</title>
</head>
<body>

     <form action="${pageContext.request.contextPath}/Tb_customer/save_TbCustometr.action" method="post">
         ID： <input type="text" name="id"><br/>
         姓名 ： <input type="text" name="name"><br/>
         性别 ： <input type="text" name="gender"><br/>
         年龄 ： <input type="text" name="age"><br/>
          <input type="submit" value="提交">
     </form>


</body>
</html>
