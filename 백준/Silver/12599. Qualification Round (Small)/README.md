# [Silver III] Qualification Round (Small) - 12599

[문제 링크](https://www.acmicpc.net/problem/12599)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 27, 정답 비율: 67.500%

### 분류

그리디 알고리즘, 구현, 수학

### 문제 설명

<p>You&#39;ve just advanced from the Qualification Round of Google Code Jam Africa 2010, and you want to know how many of your fellow contestants advanced with you. To give yourself a challenge, you&#39;ve decided only to look at how many people solved each problem.</p>

<p>The Qualification Round consisted of&nbsp;<strong>P</strong>&nbsp;problems; the i<sup>th</sup>&nbsp;problem was fully solved by&nbsp;<strong>S<sub>i</sub></strong>contestants. Contestants had to solve&nbsp;<strong>C</strong>&nbsp;problems in order to advance to the next round. Your job is to figure out, using only that information, the maximum number of contestants who could have advanced.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>. T lines follow. Each will consist only of space-separated integers: first&nbsp;<strong>P</strong>, then&nbsp;<strong>C</strong>, then P integers&nbsp;<strong>S<sub>0</sub>...S<sub>P-1</sub></strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; C &le; P</li>
	<li>1 &le; P &le; 6</li>
	<li>0 &le; S<sub>i</sub>&nbsp;&le; 1000</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the maximum number of contestants who could have advanced (in other words, the maximum number of contestants who could have solved at least&nbsp;<strong>C</strong>problems).</p>