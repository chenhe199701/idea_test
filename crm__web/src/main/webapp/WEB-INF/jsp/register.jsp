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
    <title>客户登录页面</title>
</head>
<body>

<h3 style="color: aqua">欢迎您的到来 ， 请进行注册</h3>
<form action="${pageContext.request.contextPath}/customer/save_Customer.action"
      method="post">

    <table border="5px" style="border: gainsboro">

        <tr>
            <td>昵称</td>
            <td> <input type="text" name="nickname"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td> <input type="password" name="password"></td>
        </tr>
        <tr>
            <td>头像</td>
            <td> <input type="file" name=""></td>
        </tr>
       <tr>
           <td>性别</td>
           <td >
               <input id="man" type="radio" checked="checked" name="1" />男
                <input id="woman" type="radio"  name="1"/>女
           </td>
       </tr>
        <tr>
            <td>身高</td>
            <td>
                <select name="height">
                    <option>165</option>
                    <option>175</option>
                    <option>185</option>
                    <option>195</option>
                    <option>200</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>体重</td>
            <td> <input type="text" name="weight"></td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <td>所在城市</td>
            <td>

                <select name="city">
                    <option>北京</option>
                    <option>上海</option>
                    <option>深圳</option>
                    <option>杭州</option>
                    <option>南京</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
