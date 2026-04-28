# [Platinum III] Mini Market - 21036

[문제 링크](https://www.acmicpc.net/problem/21036)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 19, 맞힌 사람: 19, 정답 비율: 23.171%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>There are two giant mini market companies in Indonesia, Amart (ACMmart) and Imart (ICPCmart).</p>

<p>There are <em>N</em> points in Indonesia aligned from left to right. The leftmost point is numbered 1 and the rightmost point is numbered&nbsp;<em>N</em>. In each point there is exactly one person. The distance from point i to point j is |i - j|.</p>

<p>There are exactly <em>M</em> Amarts and <em>K</em> Imarts in Indonesia. Every person will go to his/her nearest mini market. If the nearest Amart and the nearest Imart has the same distance from him/her, he/she will go to Imart.</p>

<p>At the end of the day, the number of visitors of Amart is the total number of people that go to any Amart on that day. Similarly, the number of visitors of Imart is the total number of people that go to any Imart on that day.</p>

<p>The <em>i</em>-th Amart is located on point <em>A<sub>i</sub></em>. You want to choose where to put the <em>K</em> Imarts such that the number of visitors of Imart is maximized. There might be more than one mini market on one point.</p>

<p>The story of this problem is actually inspired from real-life events. While the brand names in this problem are fictitious, any apparent similarity with the real-life brand names might not be purely coincidental.</p>

### 입력

<p>The first line contains three integers: <em>N</em> <em>M</em> <em>K</em> (1 &le; <em>K</em> &le; <em>N</em> &le; 2,000,000,000; 1 &le; <em>M</em> &le; 100,000) in a line denoting the number of points, the number of Amarts, and the number of Imarts. The next line contains <em>M</em> integers: <em>A</em><sub>1</sub>, <em>A</em><sub>2</sub>, ..., <em>A<sub>M</sub></em> (1 &le; <em>A<sub>i</sub></em> &le; <em>N</em>) denoting the position of the Amarts.</p>

### 출력

<p>The output contains the maximum number of visitors of Imart, in a single line.</p>