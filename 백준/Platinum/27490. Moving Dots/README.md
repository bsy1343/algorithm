# [Platinum IV] Moving Dots - 27490

[문제 링크](https://www.acmicpc.net/problem/27490)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 78, 맞힌 사람: 75, 정답 비율: 81.522%

### 분류

수학, 이분 탐색, 조합론

### 문제 설명

<p>We play a game with $n$ dots on a number line.</p>

<p>The initial coordinate of the $i$-th dot is $x_i$. These coordinates are distinct. Every dot starts moving simultaneously with the same constant speed.</p>

<p>Each dot moves in the direction of the closest dot (different from itself) until it meets another dot. In the case of a tie, it goes to the left. Two dots meet if they are in the same coordinate, after that, they stop moving.</p>

<p>After enough time, every dot stops moving. The result of a game is the number of distinct coordinates where the dots stop.</p>

<p>Because this game is too easy, calculate the sum of results when we play the game for every subset of the given $n$ dots that has at least two dots. As the result can be very large, print the sum modulo $10^9+7$.</p>

### 입력

<p>The first line contains one integer $n$ ($2 \leq n \leq 3000$).</p>

<p>The next line contains $n$ integers $x_1, x_2, \ldots, x_n$ ($1 \leq x_1 &lt; x_2 &lt; \ldots &lt; x_n \leq 10^9$), where $x_i$ represents the initial coordinate of $i$-th dot.</p>

### 출력

<p>Print the sum of results modulo $10^9+7$.</p>