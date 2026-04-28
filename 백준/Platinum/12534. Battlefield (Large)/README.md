# [Platinum V] Battlefield (Large) - 12534

[문제 링크](https://www.acmicpc.net/problem/12534)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 52, 맞힌 사람: 44, 정답 비율: 55.000%

### 분류

그래프 이론, 그래프 탐색, 오일러 경로

### 문제 설명

<p>You are playing a game where the battlefield consists of&nbsp;<strong>N</strong>&nbsp;cities and&nbsp;<strong>R</strong>&nbsp;bidirectional roads. Your goal is to start at some city&nbsp;<strong>C</strong>&nbsp;of your choice and visit all&nbsp;<strong>R</strong>&nbsp;roads exactly once ending this trip at&nbsp;<strong>C</strong>. If this is not possible you must add the minimum number of additional roads to the initial set of roads to make this trip feasible. Please note that there might be more than one road connecting the same pair of cities and that you are allowed to add roads between any pair of cities regardless of whether they already had roads connecting them or not as shown in the sample input/output.</p>

### 입력

<p>The first line of input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the value&nbsp;<strong>N</strong>, the number of cities.</li>
	<li>One line containing the value&nbsp;<strong>R</strong>, the number of roads.</li>
	<li><strong>R</strong>&nbsp;lines corresponding to the roads. Each contains 2 values&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;separated by one space.&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;are 2 distinct integers (0 &le;&nbsp;<strong>A</strong>,<strong>B</strong>&nbsp;&lt;&nbsp;<strong>N</strong>) indicating the end points of that road.</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 30</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 10<sup>4</sup></li>
</ul>

<div>&nbsp;</div>

<p>&nbsp;</p>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot;, where&nbsp;<strong>x</strong>&nbsp;is the number of the test case, followed by the minimum number of roads needed.</p>