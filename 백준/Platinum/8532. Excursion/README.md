# [Platinum IV] Excursion - 8532

[문제 링크](https://www.acmicpc.net/problem/8532)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Byteasar is planning an excursion along Byteland. Some pairs of cities in Byteland are connected by bidirectional bus transportation. Byteasar would like his excursion to start and end in the same city and be the cheapest non-empty path that does not use the same bus connection more than once (after taking the route from A to B he doesn&#39;t want to use any of the connections: A -&gt; B, B -&gt; A any more). Write a program that finds the cheapest closed path along Byteland without any duplicate bus connections or determines that it is not possible to find any such path.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input contains two integers n and m (1 &le; n &le; 500, 0 &le; m &le; 50,000) separated with a single space that represent the number of cities in Byteland and the number of bidirectional bus connections between these cities. Each of the following m lines contains three integers x<sub>i</sub>, y<sub>i</sub> and c<sub>i</sub> (1 &le; x<sub>i</sub>,y<sub>i</sub> &le; n, x<sub>i</sub> &ne; y<sub>i</sub>, 1 &le; c<sub>i</sub> &le; 100,000): the starting city, the ending city and the cost of the i-th connection. Each pair of cities is connected by at most one such connection.</p>

<p>&nbsp;</p>

### 출력

<p>The first line of the output should contain the number t of cities visited on the cheapest path (the starting city is counted twice). The next line should contain t space-separated integers: the numbers of cities visited on the path.</p>

<p>If there is more than one optimal solution, output any one of them. If there are no solutions, the first and only line of the output should contain a single word BRAK (Polish for none).</p>