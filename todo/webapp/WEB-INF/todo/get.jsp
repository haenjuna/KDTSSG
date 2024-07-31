<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp"%>

<div class="container mt-5">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">To-Do Item</h3>
        </div>
        <div class="card-body">
            <p class="card-text">${todo}</p>
            <a href="/todo/edit?tno=${todo.tno}" class="btn btn-primary">Modify/Delete</a>
        </div>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>