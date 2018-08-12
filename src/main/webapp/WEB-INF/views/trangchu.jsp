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
                        <li><a href="dangnhap/">ĐĂNG NHẬP</a></li>
                        <li><a href="#">ĐĂNG KÝ</a></li>
                        <li>
                            <a href="#"><img src="<c:url value='/resoures/image/ic_shopping_cart_white_24dp_1x.png'/> "></a>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="envent-header wow">
            <div class="container">
                <div class="row">
                    <span>Ngày 17/10 - 23//2018</span>
                </div>
                <div class="row">
                    <h2>Mua 1 TẶNG 1</h2>
                </div>
                <div class="row">
                    <button class="button-xemngay">XEM NGAY</button>
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
                <h6>Cam kết giá rẻ nhất Việt Nam giúp các bạn tiết kiệm hơn 20% cho sản phẩm </h6>
            </div>
            <div class="col-sm-12 col-sm-4 col-md-4">
                <img  class="icon" src="<c:url value='/resoures/image/icon_giaohang.png'/> "/><br/>
                <span>GIAO HÀNG</span><br/>
                <h6>Giao hàng tận nơi</h6>
            </div>
        </div>
    </div>
    <div id="title-sanpham" class="container">
        <span>SẢN PHẨM HÓT</span>
        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-3">
                <div class="border-sanpham">
                    <img class="sanpham" src="<c:url value= '/resoures/image/1%20(5).jpg'/> "><br/>
                    <span>Áo sơ mi</span><br/>
                    <span class="gia">150.000VND</span>
                </div>
            </div>
        </div>
    </div>
    <%--End content--%>

    <%--Start footer--%>
    <div id="footer">
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-md-4">
                    <p><span>THÔNG TIN SẢN PHẨM</span></p>
                    <h5>YaMe cam kết chất lượng cho tất cả sản phẩm bán tại cửa hàng </h5>
                </div>
                <div class="col-sm-4 col-md-4">
                    <p><span>LIÊN HỆ</span></p>
                    <h5>YaMe Q.10: 770F, Sư Vạn Hạnh (nd), P.12</h5>
                    <h5>(028) 7307 1441</h5>
                </div>
                <div class="col-sm-4 col-md-4">
                    <div class="noidung">
                        <p><span>GÓP Ý</span></p>
                        <form action="" method="post">
                            <input name="name" type="text" placeholder="Email"
                                   style="margin-bottom: 10px; width: 100%;height: 35px"/><br/>
                            <textarea name="age" style="margin-bottom: 10px; width: 100%" rows="4" cols="50" placeholder="Nội Dung"
                                      class="text-noidung"></textarea><br/>
                            <button class="material-button" type="submit">ĐỒNG Ý</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%--End footer--%>

</body>
</html>
