# [Platinum I] Rasterized Lines - 23362

[문제 링크](https://www.acmicpc.net/problem/23362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 347, 정답: 96, 맞힌 사람: 81, 정답 비율: 29.562%

### 분류

수학, 정수론, 소수 판정, 소인수분해, 오일러 피 함수, 폴라드 로, 밀러–라빈 소수 판별법

### 문제 설명

<p>Tomas is a computer graphics student. He has a homework which is very easy for him. He has to make a program that draws a line from point (0, 0) to (a, b), where integers&nbsp;<b>a, b (a&gt;0, b&gt; 0)</b>&nbsp;are the input of the program.</p>

<p>He uses the following algorithm. He divides the plane into squares 1x1 &ndash; these squares are pixels. When the line from (0, 0) to (a, b) intersects a square&nbsp;<b>in more than one point</b>, the square (pixel) will be black. Otherwise it will be white. Look at the example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23362.%E2%80%85Rasterized%E2%80%85Lines/2cde773f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23362.%E2%80%85Rasterized%E2%80%85Lines/2cde773f.png" data-original-src="https://upload.acmicpc.net/2dc788c7-fe0f-4e0c-97fd-4ce111ef94a9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Tomas is a computer graphics student. He has a homework which is very easy for him. He has to make a program that draws a line from point (0, 0) to (a, b), where integers&nbsp;<b>a, b (a&gt;0, b&gt; 0)</b>&nbsp;are the input of the program.</p>

<p>He uses the following algorithm. He divides the plane into squares 1x1 &ndash; these squares are pixels. When the line from (0, 0) to (a, b) intersects a square&nbsp;<b>in more than one point</b>, the square (pixel) will be black. Otherwise it will be white. Look at the example:</p>

### 입력

<p>The first line of the input file contains an integer&nbsp;<b>T</b>&nbsp;specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case looks as follows: The one and only line contains a positive integer&nbsp;<b>N</b>. You can assume that number&nbsp;<b>N</b>&nbsp;has at most 47 divisors.</p>

### 출력

<p>For each test case output one line with one integer &ndash; the number of lines that use exactly&nbsp;<b>N</b>&nbsp;black pixels.</p>

### 제한

<ul>
	<li>1 &le; T &le; 60</li>
</ul>