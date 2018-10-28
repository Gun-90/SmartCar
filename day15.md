

http://70.12.50.152/h2/cc1.html

css와 자바스크립트 영역은 <title>과  </head> 사이에 주로 씀



```html
<style>
    #hh1{
        color: white;
        background: red;
    }

    h1{
        color:red;
        background: black;
    }
    .c1{
        color: yellow;
        background: blue;
    }

</style>
</head>
<body>
    <h1>Header1</h1>
    <h1 id="hh1" class="c1">Header2</h1> <!-- id가 우선 --> 
    <h3 class="c1">Header3</h1>
    <h4>Header4</h1>
    <h5>Header5</h1>
    <h6>Header6</h1>
    <h1>Paragraph</h1>
</body>
```



```html
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
    p:nth-child(1){  /* 첫번째 p만 빨간색으로 표시*/
        color: red;
    }
</style>

</head>


<body>
<p>Paragraph1</p>
<p>Paragraph1</p>
<p>Paragraph1</p>
<p>Paragraph1</p>
<p>Paragraph1</p>
<p>Paragraph1</p>
<p>Paragraph1</p>
ID<input type="text" name="id"><br>
PWD<input type="password" name="pwd"><br>

</body>
</html>

```

## CSS파일 분리하기

1. css파일 생성 new → other

![1024-001](C:\Workspace\SmartCar\image\1024-001.png)

2. <style></style> 안의 내용을 cc1.css 파일로 이동

```css
@charset "EUC-KR";
*{
        background: cyan;
    }
    #hh1{
        color: white;
        background: red;
    }

    h1,h2,p{
        color:red;
        background: black;
    }
    .c1{
        color: yellow;
        background: blue;
    }
```
3. html 파일에 link type 추가

```html
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
    
<link type="text/css" rel="stylesheet" href="cc1.css">

</head>
<body>
    
    <h1>Header1</h1>
    <h1 id="hh1" class="c1">Header2</h1>
    <h3 class="c1">Header3</h1>
    <h4>Header4</h1>
    <h5>Header5</h1>
    <h6>Header6</h1>
    <p>Paragraph</h1>
</body>
</html>
```

