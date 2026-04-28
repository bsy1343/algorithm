# [Platinum V] Bovine Alliance - 5907

[문제 링크](https://www.acmicpc.net/problem/5907)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 61, 맞힌 사람: 52, 정답 비율: 64.198%

### 분류

수학, 그래프 이론, 자료 구조, 그래프 탐색, 조합론, 분리 집합

### 문제 설명

<p>Bessie and her bovine pals from nearby farms have finally decided that they are going to start connecting their farms together by trails in an effort to form an alliance against the farmers.  The cows in each of the N (1 &lt;= N &lt;= 100,000) farms were initially instructed to build a trail to exactly one other farm, for a total of N trails.  However months into the project only M (1 &lt;= M &lt; N) of these trails had actually been built.</p><p>Arguments between the farms over which farms already built a trail now threaten to split apart the cow alliance.  To ease tension, Bessie wishes to calculate how many ways the M trails that exist so far could have been built.  For example, if there is a trail connecting farms 3 and 4, then one possibility is that farm 3 built the trail, and the other possibility is that farm 4 built the trail.  Help Bessie by calculating the number of different assignments of trails to the farms that built them, modulo 1,000,000,007.  Two assignments are considered different if there is at least one trail built by a different farm in each assignment.</p>

### 입력

<ul><li>Line 1: Two space-separated integers N and M</li><li>Lines 2..1+M: Line i+1 describes the ith trail.  Each line contains two space-separated integers u_i and v_i (1 &lt;= u_i, v_i &lt;= N, u_i != v_i) describing the pair of farms connected by the trail.</li></ul>

### 출력

<ul><li>Line 1: A single line containing the number of assignments of trails to farms, taken modulo 1,000,000,007.  If no assignment satisfies the above conditions output 0.</li></ul>

### 힌트

<h4>Input Details</h4><p>Note that there can be two trails between the same pair of farms.</p><h4>Output Details</h4><p>There are 6 possible assignments.  Letting {a,b,c,d} mean that farm 1 builds trail a, farm 2 builds trail b, farm 3 builds trail c, and farm 4 builds trail d, the assignments are: {2, 3, 4, 5} {2, 3, 5, 4} {1, 3, 4, 5} {1, 3, 5, 4} {1, 2, 4, 5} {1, 2, 5, 4}</p>