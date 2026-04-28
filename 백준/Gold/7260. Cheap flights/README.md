# [Gold I] Cheap flights - 7260

[문제 링크](https://www.acmicpc.net/problem/7260)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 15, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

자료 구조, 그래프 이론, 그리디 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Justas built a passenger airplane, and now he wants to start a low cost airline, called Justas Airlines.</p>

<p>Justas made a list of the N most popular cities among tourists, and calculated which routes between these cities would be profitable. Each route connects two cities. The profitability of the route indicates how many Euros per month Justas Airlines would earn by operating the route.</p>

<p>Routes have to be chosen so that any two routes have one city in common. Calculate the maximum profit that Justas Airlines can make in one month.</p>

### 입력

<p>The first line shows the number of cities N, and the number of profitable routes M. Cities are labeled 1 to N. The following M lines contain three numbers each &ndash; a<sub>i</sub>, b<sub>i</sub>, and p<sub>i</sub>, where a<sub>i</sub> and b<sub>i</sub> are the two cities joined by the i-th routes, and p<sub>i</sub> is the profitability of the route. No two routes connect the same pair of cities.</p>

### 출력

<p>Output a single number: the maximum possible profit.</p>

### 제한

<ul>
	<li>1 &le; N &le; 300 000</li>
	<li>1 &le; M &le; 500 000</li>
	<li>1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N</li>
	<li>1 &le; p<sub>i</sub> &le; 1 000 000 000</li>
</ul>