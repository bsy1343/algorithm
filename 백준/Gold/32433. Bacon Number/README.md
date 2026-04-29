# [Gold I] Bacon Number - 32433

[문제 링크](https://www.acmicpc.net/problem/32433)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 16, 맞힌 사람: 11, 정답 비율: 36.667%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 애드 혹

### 문제 설명

<p>Carlinhos loves movies, and recently he has been fascinated by the <em>Bacon Number</em>, which is defined as follows.</p>

<ul>
	<li>The Bacon number of the actor Kevin Bacon is equal to $0$;</li>
	<li>If the smallest Bacon number of an actor with whom $X$ has appeared in the same movie is $b$, the bacon number of the actor $X$ is $b + 1$.</li>
</ul>

<p>That is, the Bacon number measures the shortest path between any actor and the actor Kevin Bacon, in which two actors are connected if they appeared together in the same movie.</p>

<p>Carlinhos is interested in a more general problem: given two actors, how to connect them through intermediate movies and actors? Given $N$ movies, and, for each movie, which of the existing $M$ actors acted in it. Carlinhos wants to answer $Q$ queries: in the $i$-th of them, we want to compute some way to connect actor $x_i$ with actor $y_i$. We must find some sequence $x_i = a_1, f_1, a_2, f_2, \dots , f_{k-1}, a_k = y_i$, where $1 ≤ a_j ≤ N$ are actors and $1 ≤ f_j ≤ M$ are movies, and actor $a_j$ acted in movies $f_{j-1}$ and $f_j$, or indicate that no such sequence exists.</p>

### 입력

<p>In the first line of the input, two integers $N$ ($1 ≤ N ≤ 100$) and $M$ ($1 ≤ M ≤ 10^6$) are given, the number of movies and the number of actors.</p>

<p>$N$ lines follow. In the $i$-th line, the first integer $n_i$ ($1 ≤ n_i ≤ M$) denotes the number of actors in movie $i$. Next, $n_i$ numbers in ascending order separated by spaces: the indices, from $1$ to $M$, of the actors who acted in movie $i$.</p>

<p>The next line, contains an integer $Q$ ($1 ≤ Q ≤ 10^4$): the number of queries.</p>

<p>The next $Q$ lines describe the queries. In the $i$-th of them, read two numbers $x_i$, $y_i$ ($1 ≤ x_i \ne y_i ≤ M$), the actors we want to connect. It is guaranteed that the total number of actors in the movies is at most $10^6$. That is, $\sum_{i}{n_i} ≤ 10^6$.</p>

### 출력

<p>For each of the queries, if there is no sequence, print a line with <code>-1</code>. Otherwise, print two lines. In the first line, print the number of actors $k_i$ ($2 ≤ k_i ≤ 10^6$) in some way to connect $x_i$ and $y_i$. In the second, print the sequence as described, with $k_i$ actors and $k_i - 1$ movies, alternating. If there is more than one way to connect the actors, print any of them.</p>