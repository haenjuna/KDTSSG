<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp"%>

<style>
    .msg {
        width: 200px;
        height: 100px;
        background-color: lightblue;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        display: none; /* Initially hidden */
        opacity: 0; /* Initially transparent */
        animation: showHide 3s forwards; /* 3 seconds animation */
    }

    @keyframes showHide {
        0% {
            display: block; /* Make it visible */
            opacity: 0;
        }
        10% {
            opacity: 1;
        }
        90% {
            opacity: 1;
        }
        100% {
            opacity: 0;
            display: none; /* Hide it again */
        }
    }
</style>
<script>
    window.onload = function() {
// Show the div when the page loads
        document.querySelector('.msg').style.display = 'block';
    };
</script>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Todo List Page</h1>
    <a href="/todo/register" class="btn btn-primary mb-4">Todo Register</a>

    <c:if test="${param.tno != null || param.result}">
        <div class="msg">
            <h1>처리 결과 입니다.</h1>
        </div>
    </c:if>

    <ul class="list-group">
        <c:forEach items="${list}" var="todo">
            <li class="list-group-item todo-item">
                <div class="d-flex justify-content-between">
                    <div>${todo.tno}</div>
                    <a href="/todo/get?tno=${todo.tno}">${todo.title}</a>
                </div>
            </li>
        </c:forEach>
    </ul>

    <nav aria-label="Page navigation">
        <ul class="pagination mt-4">
            <c:if test="${pageInfo.prev}">
                <li class="page-item">
                    <a class="page-link" href="/todo/list?page=${pageInfo.start - 1 }">Previous</a>
                </li>
            </c:if>

            <c:forEach begin="${pageInfo.start}" end="${pageInfo.end}" var="num">
                <li class="page-item ${pageInfo.page == num ?'active':''}">
                    <a class="page-link" href="/todo/list?page=${num}">${num}</a>
                </li>
            </c:forEach>

            <c:if test="${pageInfo.next}">
                <li class="page-item">
                    <a class="page-link" href="/todo/list?page=${pageInfo.end + 1 }">Next</a>
                </li>
            </c:if>
        </ul>
    </nav>
</div>


<%--<c:out value="${tag}"/>--%>

<%--<ul>--%>
<%--    <c:forEach items="${nums}" var="num">--%>
<%--        <li class="button" ${num%2==0 ?'EVEN':'ODD'}>--%>
<%--            AAA ${num}--%>
<%--        </li>--%>
<%--    </c:forEach>--%>

<%--</ul>--%>


<%@include file="../includes/footer.jsp"%>