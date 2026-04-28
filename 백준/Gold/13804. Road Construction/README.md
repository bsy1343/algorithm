# [Gold I] Road Construction - 13804

[문제 링크](https://www.acmicpc.net/problem/13804)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 14, 맞힌 사람: 13, 정답 비율: 35.135%

### 분류

그래프 이론, 그리디 알고리즘, 트리, 최단 경로, 데이크스트라

### 문제 설명

<p>King Mercer is the king of ACM kingdom. There are one capital and some cities in his kingdom. Amazingly, there are no roads in the kingdom now. Recently, he planned to construct roads between the capital and the cities, but it turned out that the construction cost of his plan is much higher than expected.</p>

<p>In order to reduce the cost, he has decided to create a new construction plan by removing some roads from the original plan. However, he believes that a new plan should satisfy the following conditions:</p>

<ul>
	<li>For every pair of cities, there is a route (a set of roads) connecting them.</li>
	<li>The minimum distance between the capital and each city does not change from his original plan.</li>
</ul>

<p>Many plans may meet the conditions above, but King Mercer wants to know the plan with minimum cost. Your task is to write a program which reads his original plan and calculates the cost of a new plan with the minimum cost.</p>

### 입력

<p>The input consists of several datasets. Each dataset is formatted as follows.</p>

<pre>
<code>N M 
u<sub>1</sub> v<sub>1</sub> d<sub>1</sub> c<sub>1 </sub>
. 
. 
. 
u<sub>M</sub> v<sub>M</sub> d<sub>M</sub> c<sub>M </sub></code></pre>

<p>The first line of each dataset begins with two integers, N and M (1 &le; N &le; 10000, 0 &le; M &le; 20000). N and M indicate the number of cities and the number of roads in the original plan, respectively.</p>

<p>The following M lines describe the road information in the original plan. The i-th line contains four integers, u<sub>i </sub>, v<sub>i</sub> , d<sub>i</sub> and c<sub>i </sub>(1 &le; u<sub>i</sub> , v<sub>i</sub> &le; N, u<sub>i</sub>&nbsp;&ne; v<sub>i</sub> , 1 &le; d<sub>i</sub> &le; 1000, 1 &le; c<sub>i</sub> &le; 1000). u<sub>i </sub>, v<sub>i</sub> , d<sub>i</sub> and c<sub>i </sub>indicate that there is a road which connects u<sub>i</sub>-th city and v<sub>i</sub>-th city, whose length is d<sub>i</sub> and whose cost needed for construction is c<sub>i</sub> .</p>

<p>Each road is bidirectional. No two roads connect the same pair of cities. The 1-st city is the capital in the kingdom.</p>

<p>The end of the input is indicated by a line containing two zeros separated by a space. You should not process the line as a dataset.</p>

### 출력

<p>For each dataset, print the minimum cost of a plan which satisfies the conditions in a line.</p>