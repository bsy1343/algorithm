# [Platinum V] BFFs (Large) - 14380

[문제 링크](https://www.acmicpc.net/problem/14380)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 39, 맞힌 사람: 33, 정답 비율: 68.750%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are a teacher at the brand new Little Coders kindergarten. You have&nbsp;N&nbsp;kids in your class, and each one has a different student ID number from 1 through&nbsp;N. Every kid in your class has a single best friend forever (BFF), and you know who that BFF is for each kid. BFFs are not necessarily reciprocal -- that is, B being A&#39;s BFF does not imply that A is B&#39;s BFF.</p>

<p>Your lesson plan for tomorrow includes an activity in which the participants must sit in a circle. You want to make the activity as successful as possible by building the largest possible circle of kids such that each kid in the circle is sitting directly next to their BFF, either to the left or to the right. Any kids not in the circle will watch the activity without participating.</p>

<p>What is the greatest number of kids that can be in the circle?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of two lines. The first line of a test case contains a single integer&nbsp;N, the total number of kids in the class. The second line of a test case contains&nbsp;N&nbsp;integers&nbsp;F<sub>1</sub>,&nbsp;F<sub>2</sub>, ...,&nbsp;F<sub>N</sub>, where&nbsp;F<sub>i</sub>&nbsp;is the student ID number of the BFF of the kid with student ID i.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;F<sub>i</sub>&nbsp;&le;&nbsp;N, for all i.</li>
	<li>F<sub>i</sub>&nbsp;&ne; i, for all i. (No kid is their own BFF.)</li>
	<li>3 &le;&nbsp;N&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the maximum number of kids in the group that can be arranged in a circle such that each kid in the circle is sitting next to his or her BFF.</p>

### 힌트

<p>In sample case #4, the largest possible circle seats the following kids in the following order:&nbsp;<code>7 9 3 10 4 1</code>. (Any reflection or rotation of this circle would also work.) Note that the kid with student ID 1 is next to the kid with student ID 7, as required, because the list represents a circle.</p>