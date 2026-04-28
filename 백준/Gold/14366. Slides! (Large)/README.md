# [Gold II] Slides! (Large) - 14366

[문제 링크](https://www.acmicpc.net/problem/14366)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 23, 맞힌 사람: 23, 정답 비율: 57.500%

### 분류

애드 혹, 비트마스킹, 해 구성하기, 방향 비순환 그래프, 그래프 이론

### 문제 설명

<p>Gooli is a huge company that owns&nbsp;B&nbsp;buildings in a hilly area. The buildings are numbered from 1 to&nbsp;B.</p>

<p>The CEO wants to build a set of slides between buildings that she can use to travel from her office in building 1 to her favorite cafe in building&nbsp;B. Slides, of course, are one-way only, but the buildings are tall and have elevators, so a slide can start in any building and end in any other building, and can go in either direction. Specifically, for any two buildings x and y, you can build either zero or one slides from x to y, and you can build either zero or one slides from y to x. The exception is that no slides are allowed to originate in building&nbsp;B, since once the CEO reaches that building, there is no need for her to do any more sliding.</p>

<p>In honor of Gooli becoming exactly&nbsp;M&nbsp;milliseconds old, the design must ensure that the CEO has&nbsp;exactly&nbsp;M&nbsp;different ways to travel from building 1 to building&nbsp;B&nbsp;using the new slides. A way is a sequence of buildings that starts with building 1, ends with building&nbsp;B, and has the property that for each pair of consecutive buildings x and y in the sequence, a slide exists from x to y. Note that the CEO is&nbsp;not&nbsp;requiring that any building be reachable from any other building via slides.</p>

<p>Can you come up with any set of one or more slides that satisfies the CEO&#39;s requirements, or determine that it is impossible?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;lines follow; each consists of one line with two integers&nbsp;B&nbsp;and&nbsp;M, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the word&nbsp;<code>POSSIBLE</code>&nbsp;or&nbsp;<code>IMPOSSIBLE</code>, depending on whether the CEO&#39;s requirements can be fulfilled or not. If it is possible, output an additional&nbsp;B&nbsp;lines containing&nbsp;B&nbsp;characters each, representing a matrix describing a valid way to build slides according to the requirements. The j-th character of the i-th of these lines (with both i and j counting starting from 1) should be&nbsp;<code>1</code>&nbsp;if a slide should be built going from building i to building j, and&nbsp;<code>0</code>&nbsp;otherwise. The i-th character of the i-th line should always be&nbsp;<code>0</code>, and every character of the last line should be&nbsp;<code>0</code>.</p>

<p>If multiple solutions are possible, you may output any of them.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;B&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 10<sup>18</sup>.</li>
</ul>

### 힌트

<p>The sample outputs show one possible way to fulfill the specifications for each case. Other valid answers may exist.</p>

<p>Here is an illustration of the sample answer for Case #1:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Gold/14366.%E2%80%85Slides!%E2%80%85(Large)/0a77cf23.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14365/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%20(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The four ways to get from building 1 to building 5 are:</p>

<ul>
	<li>1 to 5</li>
	<li>1 to 2 to 3 to 5</li>
	<li>1 to 2 to 4 to 5</li>
	<li>1 to 2 to 4 to 3 to 5</li>
</ul>

<p>In Case #3, building slides from 1 to 2, 2 to 3, 3 to 1, and 1 to 4 would create infinitely many ways for the CEO to reach building 4 (she could go directly to 4, or go around the loop once and then go to 4, or go around the loop twice...), but the CEO requested&nbsp;<em>exactly</em>&nbsp;20 ways.</p>