# [Gold I] Potato - 8360

[문제 링크](https://www.acmicpc.net/problem/8360)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Marcin is peeling a potato. For simplicity, we assume that the potato is a convex polygon<sup>1</sup>, which edge is called a&nbsp;<i>rind</i>.</p>

<p>Marcin can perform straight cuts with his knife. With each cut, Marcin selects some straight line, along which a cut is being performed. After a cut is done, he throws away one of the parts of the potato. All points along the cut-line are also thrown away, so for instance when cutting along the line containing some edge belonging to the rind of the potato, that edge gets peeled.</p>

<p>A potato is said to be peeled only when it does not contain any point of the original rind. Marcin wants to perform as little work as possible when peeling the potato, which is why he would like to peel it with a limited number of cuts. Nevertheless, he wants to maximize the size of the peeled potato. What is the largest area of the pealed potato that can be obtained with at most <em>k</em>&nbsp;cuts?</p>

<p>Write a program which:</p>

<ul>
	<li>reads a description of the potato from the standard input,</li>
	<li>determines the largest possible area of the peeled potato assuming that at most <em>k</em>&nbsp;cuts can be performed,</li>
	<li>writes the result to the standard output.</li>
</ul>

<p><sup>1</sup>Convex polygon is a polygon with all inner angles smaller than 180&deg;.</p>

### 입력

<p>In the first line of the standard input there are two integers <em>n</em>&nbsp;(3 &le; <em>n</em> &le; 100) and <em>k</em>&nbsp;(3 &le; <em>k</em> &le; <em>n</em>), separated by a single space and denoting the number of vertices of the polygon representing a potato under consideration and the maximal number of cuts that Marcin wants to perform to peel the potato. The following <em>n</em>&nbsp;lines contain a description of the following vertices of the potato. They are specified in clockwise or anti-clockwise order. Each line contains two integers <em>x</em>&nbsp;and&nbsp;<em>y</em>, -10 000 &le; <em>x</em>, <em>y</em> &le; 10 000, representing coordinates of the following potato&#39;s vertex.</p>

### 출력

<p>In the first and only line of the standard output your program should write one real number, written with exactly one digit after the dot and representing the largest possible area of the peeled potato that can be obtained with at most <em>k</em>&nbsp;cuts. You should not round this number, the second and following digits after the dot do not impact the outcome.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8360.%E2%80%85Potato/e2d8c0b5.png" data-original-src="https://upload.acmicpc.net/485cb3fe-c09c-42eb-a04f-2670a15ab7f6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Sample potato can be optimally peeled with 3&nbsp;cuts in the way demonstrated above.</p>