<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world!

<a href="test/hello?username=hehe">简单案例</a>
<a href="hello">简单案例</a>
<hr/>

<%--<form action="test/beans">
    <table border="1px">
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="password"></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input name="account.username" type="text"></td>
        </tr>
        <tr>
            <td>薪水:</td>
            <td><input name="account.money" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="account.email" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>--%>
<form action="test/beans">
    <table border="1px">
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="password"></td>
        </tr>
        <tr>
            <td>list姓名:</td>
            <td><input name="accounts[0].username" type="text"></td>
        </tr>
        <tr>
            <td>list薪水:</td>
            <td><input name="accounts[0].money" type="text"></td>
        </tr>
        <tr>
            <td>list邮箱:</td>
            <td><input name="accounts[0].email" type="text"></td>
        </tr>
        <tr>
            <td>map姓名:</td>
            <td><input name="accountMap['one'].username" type="text"></td>
        </tr>
        <tr>
            <td>map薪水:</td>
            <td><input name="accountMap['one'].money" type="text"></td>
        </tr>
        <tr>
            <td>map邮箱:</td>
            <td><input name="accountMap['one'].email" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
