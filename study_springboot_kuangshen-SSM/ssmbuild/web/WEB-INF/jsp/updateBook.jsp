<%--
  Created by IntelliJ IDEA.
  User: 16697
  Date: 2022/10/10
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>


<div class="container">
    <div class="row clearfix">

        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>

        </div>

        <form action="/updateBook" method="post">
<%--            隐藏域  --%>

            <input type="hidden" name="bookId" value="${book.bookId}">

            <div form-group>
                <label for="bookName">书籍名称:</label>
                <%--                required:该字段为必填选项，如果没填就不能提交   --%>
                <input type="text" class="form-control" id="bookName" value="${book.bookName}" required name="bookName">
            </div>
            <div form-group>
                <label for="bookCounts">书籍数量:</label>
                <input type="text" class="form-control" id="bookCounts" value="${book.bookCounts}" required name="bookCounts">
            </div>
            <div form-group>
                <label for="detail">书籍详情:</label>
                <input type="text" class="form-control" id="detail" value="${book.detail}" required name="detail">
            </div>

            <div form-group>
                <input type="submit" class="form-control" value="修改">
            </div>

        </form>





    </div>




</div>







</body>
</html>
