<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 16697
  Date: 2022/10/8
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

    <div class="container">
        <div class="row clearfix">
            <div class=" col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表</small>
                    </h1>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4 column">
                    <a href="/toAddBook">新增书籍</a>
                </div>

                <div class="col-md-4 column">
                    <form action="/queryBook" method="post">
                        <input type="text" name="bookName" class="form-control" placeholder="请输入书籍名">
                        <input type="submit" value="查询">

                    </form>

                </div>

            </div>






        </div>


        <div class="row clearfix">
            <div class=" col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数量</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookId}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="/toUpdateBook/${book.bookId}">修改</a>
                                &nbsp;|&nbsp;
                                <a href="/toDeleteBook/${book.bookId}">删除</a>
                            </td>
                        </tr>


                    </c:forEach>

                    </tbody>
                </table>
            </div>

        </div>

    </div>











</body>
</html>
