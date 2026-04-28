# [Gold IV] Airport Walkways (Large) - 12484

[문제 링크](https://www.acmicpc.net/problem/12484)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 25, 맞힌 사람: 22, 정답 비율: 68.750%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>You&#39;re in an airport, standing at point 0. A corridor of length&nbsp;<strong>X</strong>&nbsp;leads to the gate, where your plane is about to leave. There are moving walkways in the corridor, each moving with some speed&nbsp;<strong>w<sub>i</sub></strong>. When you walk or run on one of those, you move with speed (your speed +&nbsp;<strong>w<sub>i</sub></strong>). The walkways do not change their position; they just make you move faster. The walkways do not overlap: at any given point of the corridor there is at most one walkway, but one walkway can begin at the point where another ends.</p>

<p>Your normal walking speed is&nbsp;<strong>S</strong>. You are worried that you might not catch your plane, though, so you can run a bit - you can run with speed&nbsp;<strong>R</strong>&nbsp;for at most&nbsp;<strong>t</strong>&nbsp;seconds in total. You do not have to run for&nbsp;<strong>t</strong>&nbsp;consecutive seconds: you can split these&nbsp;<strong>t</strong>&nbsp;seconds into any number of intervals, or even not use some part of them.</p>

<p>How long does it take you to get to the gate, assuming you choose when to walk and when to run in order to reach it as soon as possible?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with a line containing five integers:&nbsp;<strong>X</strong>&nbsp;(the length of the corridor, in meters),&nbsp;<strong>S</strong>(your walking speed, in meters per second),&nbsp;<strong>R</strong>&nbsp;(your running speed, in meters per second),&nbsp;<strong>t</strong>&nbsp;(the maximum time you can run, in seconds) and&nbsp;<strong>N</strong>&nbsp;(the number of walkways).</p>

<p>Each of the next&nbsp;<strong>N</strong>&nbsp;lines contains three integers:&nbsp;<strong>B<sub>i</sub></strong>,&nbsp;<strong>E<sub>i</sub></strong>&nbsp;and&nbsp;<strong>w<sub>i</sub></strong>&nbsp;- the beginning and end of the walkway (in meters from your starting point) and the speed of the walkway (in meters per second).</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 40.</li>
	<li>1 &le;&nbsp;<strong>S</strong>&nbsp;&lt;&nbsp;<strong>R</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>w<sub>i</sub></strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>E<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>X</strong>.</li>
	<li><strong>E<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>B<sub>i+1</sub></strong>.</li>
	<li>1 &le;&nbsp;<strong>t</strong>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>1 &le;&nbsp;<strong>X</strong>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the time (in seconds) you need to reach point&nbsp;<strong>X</strong>&nbsp;if you walk and run optimally. Answers with relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be accepted.</p>

### 힌트

<p>The best solution in the first case is to start running immediately and run for one second.</p>