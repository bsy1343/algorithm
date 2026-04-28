# [Platinum I] Game With Numbers - 27462

[문제 링크](https://www.acmicpc.net/problem/27462)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 29, 맞힌 사람: 19, 정답 비율: 35.849%

### 분류

브루트포스 알고리즘, 애드 혹, 게임 이론, 재귀

### 문제 설명

<p>Two players are playing a game. They are given an array $a_1 , a_2 , \dots , a_n$ as well as an array $b_1 , b_2 , \dots , b_m$.</p>

<p>The game consists of m rounds. Players are participating in rounds alternatively. During the $i$-th round (for $i$ from $1$ to $m$) the corresponding player (first player, if $i$ is odd, and second if $i$ is even) has to do exactly one of the following:</p>

<ul>
	<li>remove all elements from the array $a$ that <strong>are divisible</strong> by $b_i$,</li>
	<li>remove all elements from the array $a$ that <strong>are not divisible</strong> by $b_i$.</li>
</ul>

<p>The first player wants to minimize the sum of the remaining elements in the array $a$ after all $m$ rounds, and the second wants to maximize it. Find the sum of the remaining elements in the array $a$ after all $m$ rounds if both players are playing optimally.</p>

### 입력

<p>The first line contains two integers $n$, $m$ ($1 &le; n &le; 2 &sdot; 10^4$, $1 &le; m &le; 2 &sdot; 10^5$) - the length of the array $a$ and the number of rounds in the game.</p>

<p>The second line contains $n$ integers $a_1 , a_2 , \dots , a_n$ ($-4 &sdot; 10^{14} &le; a_i &le; 4 &sdot; 10^{14}$) - the elements of the array $a$.</p>

<p>The third line contains $m$ integers $b_1 , b_2 , \dots , b_m$ ($1 &le; b_i &le; 4 &sdot; 10^{14}$) - the elements of the array $b$.</p>

### 출력

<p>Output a single integer - the sum of the remaining elements of the array $a$ after all $m$ rounds if both players are playing optimally.</p>

### 힌트

<p>In the first sample, one possible flow of the game is the following:</p>

<ul>
	<li>Round 1: first player removes from $a$ all elements divisible by $2$. $a$ becomes $(5, 7)$.</li>
	<li>Round 2: second player removes from $a$ all elements divisible by $5$. $a$ becomes $(7)$. If he had removed from $a$ all elements not divisible by $5$, $a$ would become $(5)$, which has a smaller sum of elements and therefore is not desirable for the second player.</li>
</ul>