# [Platinum III] Diamond Dealer - 5414

[문제 링크](https://www.acmicpc.net/problem/5414)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 18, 맞힌 사람: 10, 정답 비율: 23.256%

### 분류

기하학, 볼록 껍질

### 문제 설명

<p>Mr. Chou is the flatworld diamond dealer. It is important that he knows the value of his (two dimensional) diamonds in order to be a successful businessman. Mr. Chou is tired of calculating the values by hand and you have to write a program that makes the calculation for him.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/5414/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%203.51.04.png" style="height:184px; width:175px" /></p>

<p>The value of a diamond is determined by smoothness of its surface. This depends on the amount of faces on the surface, more faces means a smoother surface. If there are dents (marked red in figure 2) in the surface of the diamond, the value of the diamond decreases. Counting the number of dents in the surface (a) and the number of faces on the surface that are not in dents (b), the value of the diamond is determined by the following formula: v = &minus;a &middot; p + b &middot; q. When v is negative, the diamond has no value (ie. zero value).</p>

### 입력

<ul>
	<li>The first line of input consists of the integer number n, the number of test cases;&nbsp;</li>
	<li>Then, for each test case:
	<ul>
		<li>One line containing:
		<ul>
			<li>The cost for a dent in the surface of a diamond (0 &lt;= p &lt;= 100);&nbsp;</li>
			<li>The value of a face in the surface of a diamond (0 &lt;= q &lt;= 100);&nbsp;</li>
			<li>The number of vertices (3 &lt;= n &lt;= 30) used to describe the shape of the diamond.</li>
		</ul>
		</li>
		<li>n lines containing one pair of integers (-1000 &lt;=x<sub>i</sub>,y<sub>i</sub> &lt;= 1000) describing the surface of the diamond (x<sub>0</sub>,y<sub>0</sub>) - (x<sub>1</sub>,y<sub>1</sub>) -.....-(x<sub>n-1</sub>, y<sub>n-1</sub>) - (x<sub>0</sub> ,y<sub>0</sub>) in clockwise order.</li>
	</ul>
	</li>
</ul>

<p>No combination of three vertices within one diamond will be linearly aligned.</p>

### 출력

<p>For each test case, the output contains one line with one number: the value of the diamond.</p>