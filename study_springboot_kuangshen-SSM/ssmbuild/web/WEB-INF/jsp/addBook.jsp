<%--
  Created by IntelliJ IDEA.
  User: 16697
  Date: 2022/10/9
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
</head>
<body>


<div class="container">
    <div class="row clearfix">

        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>

        </div>

        <form action="/addBook" method="post">

            <div form-group>
                <label for="bookName">书籍名称:</label>
<%--                required:该字段为必填选项，如果没填就不能提交   --%>
                <input type="text" class="form-control" id="bookName" required name="bookName">
            </div>
            <div form-group>
                <label for="bookCounts">书籍数量:</label>
                <input type="text" class="form-control" id="bookCounts" required name="bookCounts">
            </div>
            <div form-group>
                <label for="detail">书籍详情:</label>
                <input type="text" class="form-control" id="detail" required name="detail">
            </div>

            <div form-group>
                <input type="submit" class="form-control" value="添加">
            </div>

        </form>





    </div>




</div>






</body>
</html>
