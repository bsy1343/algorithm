# [Platinum III] One-Way Roads - 11308

[문제 링크](https://www.acmicpc.net/problem/11308)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 106, 정답: 58, 맞힌 사람: 49, 정답 비율: 59.036%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 단절점과 단절선

### 문제 설명

<p>In the ACM kingdom, there are N cities connected by M two-way roads. These cities are connected, i.e., one can reach from any city X to any other city Y by going through some of these roads. One day, the government wishes to assign for each road a direction, such that one can still reach from any city to any other. You are asked to determine whether this task is possible.</p>

### 입력

<p>The first line of input contains T(0 &le; T &le; 100), the number of test cases. The first line of each test case consists of two integers, N(1 &le; N &le; 50), and M(1 &le; M &le; N(N &minus; 1)/2). Each of the next M lines describes a road, and consists of two integers, X and Y, (1 &le; X, Y &le; N; X &ne; Y), indicating that there is a road between city X and Y. There is at most one road that directly connects each pair of cities.</p>

### 출력

<p>For each test case, if it is impossible, output a single line NO. Otherwise, output YES on the first line, followed by M lines describing one possible direction assignment to these M roads. Each of these M lines should consist of two integers, X, Y, indicating that there is a one-way road from city X to city Y. These M lines can be output in any order.</p>