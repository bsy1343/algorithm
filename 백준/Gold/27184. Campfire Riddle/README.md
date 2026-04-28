# [Gold IV] Campfire Riddle - 27184

[문제 링크](https://www.acmicpc.net/problem/27184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 18, 정답 비율: 81.818%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제

### 문제 설명

<p>One day Yurik found himself in a forest near the campfire where $n$ people had gathered. </p>

<p>It turned out that some of them are friends. Let&#39;s number all people with integers from $1$ to $n$. Let&#39;s denote the number of people that are friends with the $i$-th person, as $d_i$. It suddenly turned out that two people with numbers $i$ and $j$ ($i \ne j$) are friends if and only if $d_i = d_j$.</p>

<p>When Yurik came home he got curious, what is the minimum number of pairs of people that could be friends, so that the condition described above to be satisfied?</p>

### 입력

<p>The only line contains one integer $n$ ($1 \le n \le 5\,000$) --- the number of people.</p>

### 출력

<p>Print one integer --- the minimum number of pairs of friends.</p>

### 힌트

<p>Consider the first example. All possible cases are described below:</p>

<ol>
	<li>Each two people are friends with each other. In this case the number of pairs of friends is $\frac{4 \cdot 3}{2} = 6$.</li>
	<li>Three people are pairwise friends with each other, and the fourth person is not friend with anyone. In this case the number of pairs of friends is $3$.</li>
</ol>