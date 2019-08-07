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
<title>更新</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body
	style="background-image: url(static/layui/images/bg.jpg); background-size: 100%">
	<div class="update">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-9">
					<div class="row">
						<div class="col-md-3">
							<img src="static/layui/images/a.JPG" width="90%" height="70%" />
						</div>
						<div class="col-md-7">
							<form role="form" action="update" method="post" >

								<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">请输入商品id:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="id"
											placeholder="id" name="id" >
									</div>
								</div>
								<div class="form-group row">
									<label for="inputPass" class="col-sm-2 col-form-label">商品名称:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="updateName"
											placeholder="商品名称" name="name">
									</div>
								</div>
								<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">商品价格:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="updatePrice"
											placeholder="xx.xx" name="price" >
									</div>
									</div>
									<div class="form-group row">
									<label for="inputName" class="col-sm-2 col-form-label">商品数量:</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" id="updateNum"
											placeholder="1-99" name="num" >
									</div>
									</div>
								<div class="form-group row">
									<div class="col-sm-10">
										<div class="button">
											<button type="submit" class="btn">提交</button>
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
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="static/popper/popper.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>