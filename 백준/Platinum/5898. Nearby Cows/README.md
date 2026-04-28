# [Platinum IV] Nearby Cows - 5898

[문제 링크](https://www.acmicpc.net/problem/5898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 163, 정답: 84, 맞힌 사람: 72, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has noticed that his cows often move between nearby fields. Taking this into account, he wants to plant enough grass in each of his fields not only for the cows situated initially in that field, but also for cows visiting from nearby fields.</p><p>Specifically, FJ&apos;s farm consists of N fields (1 &lt;= N &lt;= 100,000), where some pairs of fields are connected with bi-directional trails (N-1 of them in total).  FJ has designed the farm so that between any two fields i and j, there is a unique path made up of trails connecting between i and j. Field i is home to C(i) cows, although cows sometimes move to a different field by crossing up to K trails (1 &lt;= K &lt;= 20).</p><p>FJ wants to plant enough grass in each field i to feed the maximum number of cows, M(i), that could possibly end up in that field -- that is, the number of cows that can potentially reach field i by following at most K trails.  Given the structure of FJ&apos;s farm and the value of C(i) for each field i, please help FJ compute M(i) for every field i.</p>

### 입력

<ul><li>Line 1: Two space-separated integers, N and K.</li><li>Lines 2..N: Each line contains two space-separated integers, i and j (1 &lt;= i,j &lt;= N) indicating that fields i and j are directly connected by a trail.</li><li>Lines N+1..2N: Line N+i contains the integer C(i). (0 &lt;= C(i) &lt;= 1000)</li></ul>

### 출력

<ul><li>Lines 1..N: Line i should contain the value of M(i).</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 6 fields, with trails connecting (5,1), (3,6), (2,4), (2,1), and (3,2).  Field i has C(i) = i cows.</p><h4>Output Details</h4><p>Field 1 has M(1) = 15 cows within a distance of 2 trails, etc.</p>