# [Platinum III] Running Away From the Barn - 5862

[문제 링크](https://www.acmicpc.net/problem/5862)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 58, 맞힌 사람: 43, 정답 비율: 53.750%

### 분류

자료 구조, 트리, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>It&apos;s milking time at Farmer John&apos;s farm, but the cows have all run away! Farmer John needs to round them all up, and needs your help in the search.</p><p>FJ&apos;s farm is a series of N (1 &lt;= N &lt;= 200,000) pastures numbered 1...N connected by N - 1 bidirectional paths. The barn is located at pasture 1, and it is possible to reach any pasture from the barn.</p><p>FJ&apos;s cows were in their pastures this morning, but who knows where they ran to by now. FJ does know that the cows only run away from the barn, and they are too lazy to run a distance of more than L. For every pasture, FJ wants to know how many different pastures cows starting in that pasture could have ended up in.</p><p>Note: 64-bit integers (int64 in Pascal, long long in C/C++ and long in Java) are needed to store the distance values.</p>

### 입력

<ul><li>Line 1: 2 integers, N and L (1 &lt;= N &lt;= 200,000, 1 &lt;= L &lt;= 10^18)</li><li>Lines 2..N: The ith line contains two integers p_i and l_i. p_i (1 &lt;= p_i &lt; i) is the  first pasture on the shortest path between pasture i and the barn, and l_i  (1 &lt;= l_i &lt;= 10^12) is the length of that path.</li></ul>

### 출력

<ul><li>Lines 1..N: One number per line, the number on line i is the number pastures that can be  reached from pasture i by taking roads that lead strictly farther away from  the barn (pasture 1) whose total length does not exceed L.</li></ul>

### 힌트

<h4>Output Details</h4><p>Cows from pasture 1 can hide at pastures 1, 2, and 4. Cows from pasture 2 can hide at pastures 2 and 3. Pasture 3 and 4 are as far from the barn as possible, and the cows can hide there.</p>