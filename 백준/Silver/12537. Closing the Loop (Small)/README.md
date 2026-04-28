# [Silver V] Closing the Loop (Small) - 12537

[문제 링크](https://www.acmicpc.net/problem/12537)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 81, 맞힌 사람: 72, 정답 비율: 87.805%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Given a bag full of rope segments, you will build the longest loop of rope while alternating colors. The bag contains&nbsp;<strong>S</strong>&nbsp;segments and each segment will either be blue (<strong>B</strong>) or red (<strong>R</strong>). You are required to alternate between colors and because of this requirement you might not use every segment in the bag. If you only have segments of a single color, you will not be able to tie any knots and should output&nbsp;<code>0</code>. Each segment length is provided in centimeters and each knot in the loop consumes one centimeter of length from the loop. In other words, a knot consumes one-half of a centimeter from of the two segment it connects.</p>

<p>Note that pieces of string that have length 1, if used in making the cycle, might get reduced to just a pair of knots of total length 0. This is allowed, and each such piece counts as having been used.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.<br />
<strong>N</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the value&nbsp;<strong>S</strong>, the number of rope segments in the bag.</li>
	<li>One line containing a space separated list of&nbsp;<strong>S</strong>&nbsp;values. Each value&nbsp;<strong>L</strong>&nbsp;indicates the segment length in centimeters followed by the letter&nbsp;<strong>B</strong>&nbsp;or&nbsp;<strong>R</strong>&nbsp;to indicate the segment color.</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le; number of rope segments (<strong>S</strong>) &le; 1000</li>
	<li>1 &le; length of a rope segment (<strong>L</strong>) &le; 100</li>
	<li><strong>N</strong>&nbsp;&le; 5</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed by the maximum length of the rope loop that can be generated with the rope segments provided.</p>