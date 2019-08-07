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
<title>增加商品</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body
	style="background-image: url(static/layui/images/bg.jpg); background-size: 100%">
	${msg }
	<div class="login">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-9">
					<div class="row">
						<div class="col-md-3">
							<img src="static/layui/images/a.JPG" width="100%" height="60%" />
						</div>
						<div class="col-md-7">
							<form role="form" action="" method="post" name="sss">

								<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">名称:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputName"
											placeholder="名称" name="name" >
									</div>
								</div>
								<div class="form-group row">
									<label for="inputPass" class="col-sm-2 col-form-label">价格:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputPass"
											placeholder="价格" name="price">
									</div>
								</div>
								<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">数量:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputAddress"
											placeholder="数量" name="num" >
									</div>
									</div>
									<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">类型:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="inputPhone"
											placeholder="3:护肤品  4:保健品  5:残次品" name="type" >
									</div>
									</div>
								<div class="form-group row">
									<div class="col-sm-10">
										<div class="button">
											<button type="submit" class="btn btn-primary" onclick="register()">增加商品</button>
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
		function register(){
			document.sss.action="add";
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