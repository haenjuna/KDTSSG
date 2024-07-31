<%@include file="../includes/header.jsp"%>


<div class="card" style="margin:3em";>
    <h1>Todo Register Page</h1>
    <div class="card-body">

        <FORM action="/todo/register" method="post" >
            <div class="mb-3">
                <label class="form-label">Title</label>
                <input type="text" name="title" class="form-control"  placeholder="title">
            </div>
            <div class="mb-3">
                <label class="form-label">Writer</label>
                <input type="text" name="writer" class="form-control"  placeholder="writer">
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">SAVE</button>
            </div>
        </FORM>
    </div>
</div>



<%@include file="../includes/footer.jsp"%>