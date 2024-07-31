<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../includes/header.jsp"%>

<div class="container mt-5">
    <h1 class="mb-4">Edit Page</h1>

    <div class="card mb-4">
        <div class="card-body">
            <h5 class="card-title">To-Do Details</h5>
            <p class="card-text">${todo}</p>
        </div>
    </div>

    <form action="/todo/edit" method="post" class="mb-4">
        <div class="mb-3">
            <label for="tno" class="form-label">TNO</label>
            <input type="text" id="tno" name="tno" class="form-control" value="${todo.tno}" readonly>
        </div>
        <div class="mb-3">
            <label for="title" class="form-label">TITLE</label>
            <input type="text" id="title" name="title" class="form-control" value="${todo.title}">
        </div>
        <div class="mb-3">
            <label for="writer" class="form-label">WRITER</label>
            <input type="text" id="writer" name="writer" class="form-control" value="${todo.writer}">
        </div>
        <div>
            <button type="submit" class="btn btn-primary">MODIFY</button>
        </div>
    </form>

    <form action="/todo/remove" method="post">
        <input type="hidden" name="tno" value="${todo.tno}">
        <button type="submit" class="btn btn-danger">REMOVE</button>
    </form>
</div>

<%@include file="../includes/footer.jsp"%>