# [Gold V] Being Smarty! - 4919

[문제 링크](https://www.acmicpc.net/problem/4919)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 161, 정답: 37, 맞힌 사람: 25, 정답 비율: 18.382%

### 분류

파싱, 문자열

### 문제 설명

<p>A web template engine is a software that is designed to process web templates and content information to produce web documents. A template is an html page, but without the content. In a way, a template system facilitates the separation between the information in a web page, and the presentation of it.</p>

<p>A template system normally comes with a (restricted and specialized) programming language to allow the variation of the presentation depending on certain properties of the information. For example, when presenting a bank statement, the bank may decide to display in red any transaction with an amount above \$1,000 in order to grab the attention of the user.</p>

<p>Another technique, frequently used in printing tables, is to alternate the background color of rows to make it easier for the reader to visually follow a row. For example, the background color in Table (a) alternates after each row, while in Table (b) the color alternates every three rows.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4919/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%204.30.14.png" style="height:275px; width:241px" /></p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4919/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%204.30.24.png" style="height:277px; width:243px" /></p>

<p>A properly designed template language would have a construct to allow the designer to alternate the properties of table rows. In this problem we shall concentrate on one such construct that takes three arguments: N, P<sub>1</sub>, and P<sub>2</sub>. The template engine would then apply P<sub>1</sub> on the first N rows, P<sub>2</sub> on the second N rows, and then back to P<sub>1</sub> on the third N rows, and so on.</p>

<p>Write a program that takes the current row number (starting at one,) the number N, and properties P<sub>1</sub>, and P<sub>2</sub> and determines which of P<sub>1</sub> or P<sub>2</sub> should be applied to the current row.</p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case is specified on a separate line. Each line specifies four values: R, N, P<sub>1</sub>, and P<sub>2</sub>, all separated by one or more spaces.</p>

<p>R is the current row number (first row is numbered 1) while N is as described above. Note that 0 &lt; R,N &lt; 1,000,000,000.</p>

<p>P<sub>1</sub> and P<sub>2</sub> are properties. A property is a string made of upper- or lower-case letters, digits, and/or spaces. A property may be surrounded by double quotes, (but the double quotes are not part of the property.) If a property contains spaces, the surrounding double quotes are mandatory. No property will be longer than 512 characters (including the double quotes, if present.)</p>

<p>The last line of the input file is made of a single zero.</p>

### 출력

<p>For each test case, output the result on a single line using the following format:</p>

<p>k.␣result</p>

<p>Where k is the test case number (starting at 1,) and result is P<sub>1</sub> or P<sub>2</sub>. Note that the double quotes are never printed. In addition, all letters are printed in lower case.</p>