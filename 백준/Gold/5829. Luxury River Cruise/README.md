# [Gold III] Luxury River Cruise - 5829

[문제 링크](https://www.acmicpc.net/problem/5829)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 970, 정답: 270, 맞힌 사람: 215, 정답 비율: 27.319%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 깊이 우선 탐색, 희소 배열

### 문제 설명

<p>Farmer John is taking Bessie and the cows on a cruise! They are sailing on a network of rivers with N ports (1 &lt;= N &lt;= 1,000) labeled 1..N, and Bessie starts at port 1. Each port has exactly two rivers leading out of it which lead directly to other ports, and rivers can only be sailed one way.</p><p>At each port, the tour guides choose either the &quot;left&quot; river or the &quot;right&quot; river to sail down next, but they keep repeating the same choices over and over. More specifically, the tour guides have chosen a short sequence of M directions (1 &lt;= M &lt;= 500), each either &quot;left&quot; or &quot;right&quot;, and have repeated it K times (1 &lt;= K &lt;= 1,000,000,000). Bessie thinks she is going in circles -- help her figure out where she ends up!</p>

### 입력

<ul><li>Line 1: Three space-separated integers N, M, and K.</li><li>Lines 2..N+1: Line i+1 has two space-separated integers, representing the number of the ports that port i&apos;s left and right rivers lead to, respectively.</li><li>Line N+2: M space-separated characters, either &apos;L&apos; or &apos;R&apos;. &apos;L&apos; represents a choice of  &apos;left&apos; and &apos;R&apos; represents a choice of &apos;right&apos;.</li></ul>

### 출력

<ul><li>Line 1: A single integer giving the number of the port where Bessie&apos;s cruise ends.</li></ul>

### 힌트

<h4>Input Details</h4><p>The port numbers are arranged clockwise in a circle, with &apos;L&apos; being a clockwise rotation and &apos;R&apos; being a counterclockwise rotation. The sequence taken is LLRLLRLLR.</p><h4>Output Details</h4><p>After the first iteration of the sequence of directions, Bessie is at port 2 (1 -&gt; 2 -&gt; 3 -&gt; 2); after the second, she is at port 3 (2 -&gt; 3 -&gt; 4 -&gt; 3), and at the end she is at port 4 (3 -&gt; 4 -&gt; 1 -&gt; 4).</p>