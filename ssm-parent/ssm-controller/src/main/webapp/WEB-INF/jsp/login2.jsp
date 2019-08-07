<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="static/layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="static/layui/css/login.css">
<title>登录</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body
	style="background-image: url(static/layui/images/bg.jpg); background-size: 100%">
	<div class="login">
		<div class="container-fluid">
			<div class="row">
				${msg }

				<div class="col-md-9">
					<div class="row">
						<div class="col-md-3">
							<img src="static/layui/images/a.JPG" width="90%" height="70%" />
						</div>
						<div class="col-md-7">
							<form role="form" action="" method="post" name="sss">

								<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">账号:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputName"
											placeholder="账号" name="name" value="${name }">
									</div>
								</div>
								<div class="form-group row">
									<label for="inputPass" class="col-sm-2 col-form-label">密码:</label>
									<div class="col-sm-10">
										<input type="password" class="form-control" id="inputPass"
											placeholder="密码" name="pass">
									</div>
								</div>

								<div class="form-group row">
									<div class="col-sm-10">
										<div class="button">
											<button type="submit" class="btn btn-primary" onclick="login()">登录</button>
											<button type="submit" class="btn btn-primary" onclick="register()">注册</button>
										</div>
									</div>
									</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script >
		function login(){
			document.sss.action="login";
			document.sss.submit();
			}
		function register(){
			document.sss.action="toregister";
			document.sss.submit;
			}
	</script>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="static/popper/popper.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>