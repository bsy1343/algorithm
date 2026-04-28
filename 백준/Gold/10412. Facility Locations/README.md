# [Gold III] Facility Locations - 10412

[문제 링크](https://www.acmicpc.net/problem/10412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

자료 구조, 애드 혹, 분리 집합

### 문제 설명

<p>The HDWBP Inc. has n clients and needs to service these clients by opening k facilities. Each opened facility can serve any number of clients and each client must be served by an open facility. There are m potential locations for these k facilities. The cost of serving client j at potential location i is a non-negative integer c<sub>ij</sub> . These costs satisfy a locality property: for two clients j and j&#39; and two facilities i and i&#39;, we have c<sub>ij</sub> &le; c<sub>i&#39;j</sub> + c<sub>i&#39;j&#39;</sub> + c<sub>ij&#39;</sub>. Given the costs, the CEO of HDWBP Inc. ultimately wants to know the cheapest way to open k facilities and assign clients to these open facilities. For now, he needs your help to determine if it is possible to do this task without any cost (i.e. with cost zero).</p>

### 입력

<p>The input consists of a single test case. The first line contains three integers m, n, k where 1 &le; m &le; 100, 1 &le; n &le; 100 and 1 &le; k &le; m. Each of the next m lines contains n non-negative integers where the jth integer in the ith line is c<sub>ij</sub> &le; 10 000.</p>

### 출력

<p>Display yes if it is possible to do the task with cost zero; otherwise, display no.</p>