# [Gold IV] Circle Through Three Points - 6458

[문제 링크](https://www.acmicpc.net/problem/6458)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 179, 정답: 30, 맞힌 사람: 23, 정답 비율: 52.273%

### 분류

기하학, 구현, 수학

### 문제 설명

<p>Your team is to write a program that, given the Cartesian coordinates of three points on a plane, will find the equation of the circle through them all. The three points will not be on a straight line.</p>

<p>The solution is to be printed as an equation of the form</p>

<p>\[(x - h)^{2} + (y - k)^{2} = r^{2}\]</p>

<p>and an equation of the form</p>

<p>\[x^{2} + y^{2} + cx + dy - e = 0\]</p>

### 입력

<p>Each line of input to your program will contain the \(x\) and \(y\) coordinates of three points, in the order \(A_{x}\), \(A_{y}\), \(B_{x}\), \(B_{y}\), \(C_{x}\), \(C_{y}\). &nbsp;These coordinates will be real numbers separated from each other by one or more spaces.</p>

### 출력

<p>Your program must print the required equations on two lines using the format given in the sample below. Your computed values for \(h\), \(k\), \(r\), \(c\), \(d\), and \(e\) in Equations 1 and 2 above are to be printed with three digits after the decimal point. Plus and minus signs in the equations should be changed as needed to avoid multiple signs before a number. Plus, minus, and equal signs must be separated from the adjacent characters by a single space on each side. No other spaces are to appear in the equations. Print a single blank line after each equation pair.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6458.%E2%80%85Circle%E2%80%85Through%E2%80%85Three%E2%80%85Points/c1dff2bf.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6458/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:515px; width:500px" /></p>