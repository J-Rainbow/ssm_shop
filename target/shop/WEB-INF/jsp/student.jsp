<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-3.6.0.js">
    </script>
</head>
<body>
<script>
    function querySno() {
        let inputSno = $('#inputSno').val();
        if (inputSno == "") {
            alert("请输入学号")
        } else {
            $.ajax({
                url: "${pageContext.request.contextPath}/studentUser/" + inputSno,
                type: "GET",
                dataType:"text",
                success:function (data) {
                    var data = data;
                    var v = eval("("+data+")");
                    if (v.msg!==null){
                        alert(v.msg)
                    }else {
                        alert("该学号的学生名为:"+v.student.sname)
                    }
                }
            })
        }

    }
</script>
<input id="inputSno" name="sno" type="text" placeholder="请输入学号">
<button onclick="querySno()">点击</button>
</body>
</html>