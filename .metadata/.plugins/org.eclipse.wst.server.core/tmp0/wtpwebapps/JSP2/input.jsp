<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h2>쇼핑몰 상품을 선택하고 수량을 입력한 후 장바구니에 담으세요</h2>
        <form action="output.jsp" method="get">
                <select name="product">
                        <option value="bag">가방(1개 50000)<br>
                        <option value="shoes">구두(1개 70000)<br>
                        <option value="tie">넥타이(1개 15000)<br>
                </select>
                <input type="text" name="cnt" size=3>개
                <br><br>
                <input type="submit" value="장바구니담기">
                <input type="reset" value="사지 않는다">
        </form>
</body>
</html>