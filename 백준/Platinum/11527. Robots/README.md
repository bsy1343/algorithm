# [Platinum IV] Robots - 11527

[문제 링크](https://www.acmicpc.net/problem/11527)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 52, 정답: 14, 맞힌 사람: 12, 정답 비율: 27.907%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>While you weren&#39;t watching, your N robots have developed a life of their own and spread throughout your hometown. Each of your hometown&#39;s N intersections (numbered 0,&hellip;,N-1) contains exactly one robot. On each intersection i, there is exactly one red signpost pointing to an intersection, r<sub>i</sub> &ne; i, and exactly one green signpost pointing to an intersection g<sub>i</sub> &ne; i. When you press the red button on your remote control, each robot will move to the intersection indicated by the red signpost (robots at intersection i move to r<sub>i</sub>). When you press the green button, each robot will move to the intersection indicated by the green signpost (robots at intersection i move to g<sub>i</sub>). Write a program that determines whether you can make the robots all meet at the same intersection at the same time via some sequence of commands on your remote control.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 500), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists three lines of input as follows:</p>

<ul>
	<li>The first line contains the data set number, K, followed by a single integer N which is the number of intersections.</li>
	<li>The second line contains N space separated integers r<sub>0</sub>, &hellip;, r<sub>N-1</sub> (0 &le; r<sub>i</sub> &le; N-1 and r<sub>i</sub> &ne; i).</li>
	<li>The third line contains N space separated integers g<sub>0</sub>, &hellip;, g<sub>N-1</sub> (0 &le; g<sub>i</sub> &le; N-1 and g<sub>i</sub> &ne; i).</li>
</ul>

<p>On some intersections, both signposts might point the same way (i.e. r<sub>i</sub> = g<sub>i</sub>).</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the string &ldquo;YES&rdquo; if you can make all robots meet or &ldquo;NO&rdquo; otherwise.</p>

### 힌트

<p>Note: For the second case, the button press sequence GREEN, RED, RED, GREEN makes all robots meet at intersection 2.</p>