# [Platinum III] Biggest - 24324

[문제 링크](https://www.acmicpc.net/problem/24324)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 1024 MB

### 통계

제출: 415, 정답: 3, 맞힌 사람: 2, 정답 비율: 0.995%

### 분류

애드 혹, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Two players, A and B, play the following game. A comes up with a permutation p[1], p[2], ..., p[N] of the integers 1, 2, &hellip;, N, which B does not know. B can ask questions of the type &quot;Which of p[x] and p[y] is greater?&quot; for any numbers x and y, such that 1 &le; x, y &le; N. B wants to find the indices in the permutation of the K largest numbers (i.e. the numbers N, N&minus;1, &hellip;, N&minus;K + 1) using the smallest possible count of queries, given that the first N &minus; 1 queries are not counted towards the total number of queries. The jury program will play the role of A, and yours - of B.</p>

<p>Write a function <code>biggest()</code>, which will be compiled with the jury&#39;s program and, by asking questions, will try to find the indices in the permutation of the K largest numbers with the smallest possible count of queries. Note that the first N-1 queries are not counted towards the total number of queries.</p>

### 입력



### 출력



### 제한

<ul>
	<li>N = 100 000 in all tests</li>
	<li>1 &le; K &le; 100 000</li>
</ul>