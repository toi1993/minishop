<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="header.jsp"/>
</head>
<body>
    <%--Start Header--%>
    <div class="container-fluid header ">
        <nav class="navbar navbar-default none_nav">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#"><img src="<c:url value='/resoures/image/icon_yame_shop.png'/> "></a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-center">
                        <li class="active"><a href="#">TRANG CHỦ</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li><a href="#">DỊCH VỤ</a></li>
                        <li><a href="#">LIÊN HỆ</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">ĐĂNG NHẬP</a></li>
                        <li><a href="#">ĐĂNG KÝ</a></li>
                        <li>
                            <a href="#"><img src="<c:url value='/resoures/image/ic_shopping_cart_white_24dp_1x.png'/> "></a>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="envent-header">
            <div class="container">
                <div class="row">
                    <span>Ngày 17/10 - 23//2018</span>
                </div>
                <div class="row">
                    <h2>Mua 1 TẶNG 1</h2>
                </div>
                <div class="row">
                    <button>XEM NGAY</button>
                </div>
            </div>
        </div>
    </div>
    <%--End Header--%>

    <%--Start content--%>
    <div id="info" class="container">
        <div class="row">
            <div class="col-sm-12 col-sm-4 col-md-4">
                <img  class="icon" src="<c:url value='/resoures/image/icon_chatluong.png'/> "/><br/>
                <span>CHẤT LƯỢNG</span><br/>
                <h6>Chúng tôi cam kết sẽ cam kết với bạn chất lượng tốt nhất</h6>
            </div>
            <div class="col-sm-12 col-sm-4 col-md-4">
                <img class="icon" src="<c:url value='/resoures/image/icon_conheo.png'/> "/><br/>
                <span>TIẾT KIỆM CHI PHÍ</span><br/>
                <h6>Cam kết giá rẻ nhất </h6>
            </div>
            <div class="col-sm-12 col-sm-4 col-md-4">
                <img  class="icon" src="<c:url value='/resoures/image/icon_giaohang.png'/> "/><br/>
                <span>GIAO HÀNG</span><br/>
                <h6>Giao hàng tận nơi</h6>
            </div>
        </div>
    </div>

    <div class="container">
        <h2>SẢN PHẨM HOT</h2>
        <div class="row">
            <div class="col-xs-2 col-sm-4 col-md-3 sanpham">
                <img src="<c:url value= '/resoures/image/1%20(2).jpg'/> "/>
            </div>
            <div class="col-xs-2 col-sm-4 col-md-3 sanpham">
                <img src="<c:url value= '/resoures/image/1%20(3).jpg'/> "/>
            </div>
            <div class="col-xs-2 col-sm-4 col-md-3 sanpham">
                <img src="<c:url value= '/resoures/image/1%20(5).jpg'/> "/>
            </div>
            <div class="col-xs-2 col-sm-4 col-md-3 sanpham ">
                <img src="<c:url value= '/resoures/image/1%20(7).jpg'/> "/>
            </div>
        </div>
    </div>
    <%--End content--%>

    <%--Start footer--%>
    <div>

    </div>
    <%--End footer--%>

</body>
</html>
