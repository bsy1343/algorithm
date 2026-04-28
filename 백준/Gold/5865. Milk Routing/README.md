# [Gold II] Milk Routing - 5865

[문제 링크](https://www.acmicpc.net/problem/5865)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 71, 맞힌 사람: 64, 정답 비율: 82.051%

### 분류

그래프 이론, 집합과 맵, 최단 경로, 데이크스트라

### 문제 설명

<p>Farmer John&apos;s farm has an outdated network of M pipes (1 &lt;= M &lt;= 500) for pumping milk from the barn to his milk storage tank.  He wants to remove and update most of these over the next year, but he wants to leave exactly one path worth of pipes intact, so that he can still pump milk from the barn to the storage tank.</p><p>The pipe network is described by N junction points (1 &lt;= N &lt;= 500), each of which can serve as the endpoint of a set of pipes.  Junction point 1 is the barn, and junction point N is the storage tank.  Each of the M bi-directional pipes runs between a pair of junction points, and has an associated latency (the amount of time it takes milk to reach one end of the pipe from the other) and capacity (the amount of milk per unit time that can be pumped through the pipe in steady state).  Multiple pipes can connect between the same pair of junction points.</p><p>For a path of pipes connecting from the barn to the tank, the latency of the path is the sum of the latencies of the pipes along the path, and the capacity of the path is the minimum of the capacities of the pipes along the path (since this is the &quot;bottleneck&quot; constraining the overall rate at which milk can be pumped through the path).  If FJ wants to send a total of X units of milk through a path of pipes with latency L and capacity C, the time this takes is therefore L + X/C.</p><p>Given the structure of FJ&apos;s pipe network, please help him select a single path from the barn to the storage tank that will allow him to pump X units of milk in a minimum amount of total time.</p>

### 입력

<ul><li>Line 1: Three space-separated integers: N M X (1 &lt;= X &lt;= 1,000,000).</li><li>Lines 2..1+M: Each line describes a pipe using 4 integers: I J L C. I and J (1 &lt;= I,J &lt;= N) are the junction points at both ends of the pipe.  L and C (1 &lt;= L,C &lt;= 1,000,000) give the latency and capacity of the pipe.</li></ul>

### 출력

<ul><li>Line 1: The minimum amount of time it will take FJ to send milk along a single path, rounded down to the nearest integer.</li></ul>

### 힌트

<h4>Input Details</h4><p>FJ wants to send 15 units of milk through his pipe network.  Pipe #1 connects junction point 1 (the barn) to junction point 2, and has a latency of 10 and a capacity of 3.  Pipes #2 and #3 are similarly defined.</p><h4>Output Details</h4><p>The path 1-&gt;3 takes 14 + 15/1 = 29 units of time.  The path 1-&gt;2-&gt;3 takes 20 + 15/2 = 27.5 units of time, and is therefore optimal.</p>