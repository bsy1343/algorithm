# [Silver III] Diamond Inheritance (Small) - 12382

[문제 링크](https://www.acmicpc.net/problem/12382)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 52, 맞힌 사람: 45, 정답 비율: 73.770%

### 분류

브루트포스 알고리즘, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are asked to help diagnose class diagrams to identify instances of diamond inheritance. The following example class diagram illustrates the property of diamond inheritance. There are four classes: A, B, C and D. An arrow pointing from X to Y indicates that class X inherits from class Y.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Silver/12382.%E2%80%85Diamond%E2%80%85Inheritance%E2%80%85(Small)/251d1227.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/12382.%E2%80%85Diamond%E2%80%85Inheritance%E2%80%85(Small)/251d1227.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12382/images-49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<p>In this class diagram, D inherits from both B and C, B inherits from A, and C also inherits from A. An inheritance path from X to Y is defined as a sequence of classes X, C<sub>1</sub>, C<sub>2</sub>, C<sub>3</sub>, ..., C<sub>n</sub>, Y where X inherits from C<sub>1</sub>, C<sub>i</sub>&nbsp;inherits from C<sub>i + 1</sub>&nbsp;for 1 &le; i &le; n - 1, and C<sub>n</sub>&nbsp;inherits from Y. There are two inheritance paths from D to A in the example above. The first path is D, B, A and the second path is D, C, A.</p>

<p>A class diagram is said to contain a diamond inheritance if there exists a pair of classes X and Y such that there are at least two different inheritance paths from X to Y. The above class diagram is a classic example of diamond inheritance. Your task is to determine whether or not a given class diagram contains a diamond inheritance.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, each specifies a class diagram. The first line of each test case gives the number of classes in this diagram,&nbsp;<strong>N</strong>. The classes are numbered from 1 to&nbsp;<strong>N</strong>.&nbsp;&nbsp;<strong>N</strong>&nbsp;lines follow. The i<sup>th</sup>&nbsp;line starts with a non-negative integer&nbsp;<strong>M<sub>i</sub></strong>&nbsp;indicating the number of classes that class&nbsp;<em>i</em>&nbsp;inherits from. This is followed by&nbsp;<strong>M<sub>i</sub></strong>&nbsp;distinct positive integers each from 1 to&nbsp;<strong>N</strong>&nbsp;representing those classes. You may assume that:</p>

<ul>
	<li>If there is an inheritance path from X to Y then there is no inheritance path from Y to X.</li>
	<li>A class will never inherit from itself.</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>0 &le;&nbsp;<strong>M<sub>i</sub></strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50.</li>
</ul>

### 출력

<p>For each diagram, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is &quot;Yes&quot; if the class diagram contains a diamond inheritance, &quot;No&quot; otherwise.</p>