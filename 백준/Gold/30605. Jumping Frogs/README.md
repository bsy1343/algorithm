# [Gold II] Jumping Frogs - 30605

[문제 링크](https://www.acmicpc.net/problem/30605)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 31, 맞힌 사람: 26, 정답 비율: 76.471%

### 분류

이분 탐색, 그리디 알고리즘

### 문제 설명

<p>Julia is a fan of wild nature photos. Yesterday, she took two photos of a beautiful river with water lilies and some frogs sitting on them. </p>

<p>There are many water lilies on the river, numbered with consecutive positive integers from left to right, starting from $1$. Both photos were taken from exactly the same spot, and both photos have the same $n$ frogs sitting on water lilies. Each water lily can hold at most one frog.</p>

<p>After comparing the photos, Julia found out that all the frogs moved between the photos, since no water lily had a frog sitting on it in both photos. However, Julia couldn&#39;t understand which frog from the first photo moved to which water lily in the second photo, as all frogs looked exactly the same!</p>

<p>One thing is for sure: each frog jumped to a different water lily. Some frogs moved <em>to the left</em>, to a water lily with a smaller number, while the other frogs moved <em>to the right</em>, to a water lily with a larger number.</p>

<p>To investigate the movement of frogs, Julia wants to answer the following question: how many frogs moved to the left between the photos? As it may not be possible to find a unique answer to this question, you need to help Julia to find all possible answers.</p>

### 입력

<p>The first line contains a single integer $n$, denoting the number of frogs ($1 \le n \le 200\,000$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$, denoting the water lilies with frogs on them in the first photo, in increasing order ($1 \le a_1 &lt; a_2 &lt; \cdots &lt; a_n \le 10^9$).</p>

<p>The third line contains $n$ integers $b_1, b_2, \ldots, b_n$, denoting the water lilies with frogs on them in the second photo, in increasing order ($1 \le b_1 &lt; b_2 &lt; \cdots &lt; b_n \le 10^9$).</p>

<p>All $2n$ given integers are distinct: no water lily has a frog sitting on it in both photos.</p>

### 출력

<p>In the first line, print a single integer $k$, denoting the number of possible answers to Julia&#39;s question.</p>

<p>In the second line, print $k$ integers $c_1, c_2, \ldots, c_k$, denoting all possible answers in increasing order ($0 \le c_1 &lt; c_2 &lt; \cdots &lt; c_k \le n$).</p>

### 힌트

<p>In the first example, frogs that ended up on water lilies $1$ and $2$ must have moved to the left, while frogs that ended up on water lilies $51$ and $52$ must have moved to the right. Thus, we know for sure that exactly $2$ frogs moved to the left between the photos.</p>