# [Platinum I] Secret Permutation - 27402

[문제 링크](https://www.acmicpc.net/problem/27402)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 3, 맞힌 사람: 3, 정답 비율: 21.429%

### 분류

(분류 없음)

### 문제 설명

<p>The Scientific Committee has hidden from you a permutation P of all the integers from 1 to N. (3 &le; N &le; 256). You need to find it. Permutation P is fixed (the grader is not adaptive).</p>

<p>In your endeavor, you are allowed to ask queries that take as parameter another permutation V of all the integers from 1 to N:</p>

<p>query(V) will return sum(i = 1..N - 1, abs(P[V[i]] - P[V[i + 1]])).</p>

<p>Performing a number of queries, you are to discover permutation P, or any other permutation P&#39; that is indistinguishable from P. Two permutations are indistinguishable if queried in all possible ways they both yield the same answers.</p>

### 입력



### 출력

