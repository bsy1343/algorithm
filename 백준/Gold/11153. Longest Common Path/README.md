# [Gold I] Longest Common Path - 11153

[문제 링크](https://www.acmicpc.net/problem/11153)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 22, 정답: 15, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 역추적

### 문제 설명

<p>Per and P&aring;l are friends, and like to hang out together. They are also very impatient, so they always take the shortest possible way when they need to go somewhere.</p>

<p>It&rsquo;s the end of the school day, and they need to go home. Naturally, they want to arrive at home as early as possible. They also want to maximize the time they walk together while walking towards their homes. You have been asked to write a computer program that calculates the maximal time they can walk together. Their neighbourhood is modelled as a graph where intersections are nodes and roads are edges. The roads are bidirectional, and it takes the same time to traverse a road in both directions. All important destinations happen to be located at an intersection. Also, the school and the two homes are never located at the same intersection. There exists a path between every pair of intersections.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. The next line contains two integers N and M, the number of intersections and the number of bidirectional roads in the city, respectively. The following line contains three integers S, P and Q, indicating the position of the school, Per&rsquo;s home and P&aring;l&rsquo;s home, respectively. The next M lines contain three integers a<sub>i</sub>, b<sub>i</sub> and t<sub>i</sub>, indicating that there is a bidirectional road between intersections a<sub>i</sub> and b<sub>i</sub> which takes c<sub>i</sub> minutes to traverse. All intersections are numbered from 0 to N &minus; 1, inclusive.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>3 &le; N &le; 2000</li>
	<li>N &minus; 1 &le; M &le; min(N(N-1)/2, 10000)</li>
	<li>0 &le; a<sub>i</sub> &lt; b<sub>i</sub> &lt; N</li>
	<li>0 &lt; c<sub>i</sub> &le; 1000</li>
	<li>0 &le; S, P, Q, a<sub>i</sub>, b<sub>i</sub> &lt; N</li>
</ul>

### 출력

<p>For each test case, output the length of the longest distance Per and P˚al can walk together while still arriving at their own homes as fast as possible.</p>