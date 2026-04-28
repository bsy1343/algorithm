# [Gold III] Lazy - 27427

[문제 링크](https://www.acmicpc.net/problem/27427)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 14, 맞힌 사람: 13, 정답 비율: 28.889%

### 분류

임의 정밀도 / 큰 수 연산, 그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Everybody knows that Romanian construction workers are very lazy. One of these workers is Dorel, who works for a company that builds roads across the country. Yesterday he received his new task: he is given N Romanian cities across the country (labeled from 1 to N), and M two-way roads (labeled from 1 to M) which are not yet built, each connecting exactly two cities; out of these roads he has to select and build N-1 so that all the cities become connected. Unfortunately the problem is not so simple for Dorel: each road i has two associated costs: C1<sub>i</sub> - the effort to build the road and C2<sub>i</sub> - the profit obtained per unit of effort spent for building the road. C1<sub>i</sub> * C2<sub>i</sub> is the profit of building the road. Of course Dorel wants to work as little as possible so the most important thing is that the effort of building all the roads must be minimum; if there are more ways of building roads so that the total effort is minimum, Dorel wants the total profit (the sum of profits for each road) to be maximum.</p>

<p>You have to solve Dorel&#39;s problem!</p>

### 입력

<p>On the first line of the standard input there are two numbers N and M, the number of cities and the number of roads. Next are M lines, the i-th of these lines has 4 natural numbers: a<sub>i</sub> and b<sub>i</sub> representing the cities road i connects, C1<sub>i</sub> and C2<sub>i</sub>.</p>

### 출력

<p>You must print to the standard output must contain N-1 lines representing the indexes (according to the input) of the roads which should be chosen by Dorel.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 200.000</li>
	<li>1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N</li>
	<li>1 &le; C1<sub>i</sub> &lt; 10<sup>17</sup></li>
	<li>-10<sup>17</sup> &lt; C2<sub>i</sub> &lt; 10<sup>17</sup></li>
	<li>if there are several solutions you can output anyone of them</li>
</ul>