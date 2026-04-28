# [Platinum IV] Trapezoid Counting - 24002

[문제 링크](https://www.acmicpc.net/problem/24002)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 16, 맞힌 사람: 14, 정답 비율: 63.636%

### 분류

조합론, 수학, 정렬, 두 포인터

### 문제 설명

<p>In this problem, we will consider a&nbsp;<i>trapezoid</i>&nbsp;to be a convex quadrilateral with&nbsp;<u>exactly</u>&nbsp;one pair of parallel sides. If the lengths of the two non-parallel sides are equal, we say the trapezoid is&nbsp;<i>isosceles</i>.</p>

<p>You have some wooden sticks of various lengths, and you need to pick exactly four of them to form the four sides of an&nbsp;<b>isosceles trapezoid</b>. How many different sets of four sticks will allow this? Even if two sticks have the same length, they are considered to be different sticks. Sticks could not be bended and broke into parts.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow; each consists of two lines. The first line consists of one integer&nbsp;<b>N</b>, the number of sticks. The second line consists of&nbsp;<b>N</b>&nbsp;integers; the i-th of these,&nbsp;<b>L<sub>i</sub></b>, represents the length of the i-th stick.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1), and&nbsp;<code>y</code>&nbsp;is the number of different sets of four sticks that can form an isosceles trapezoid, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>L<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are five ways to choose four out of the five given sticks, and any one of those five sets of four sticks can be used to form an isosceles trapezoid.</p>

<p>In Sample Case #2, note that the set {1, 1, 3, 5} cannot form an isosceles trapezoid, even though two of its sticks are of equal length.</p>

<p>In Sample Case #3, note that the set {2, 2, 3, 3} can form a rectangle, but in this problem, a rectangle is not considered to be an isosceles trapezoid.</p>