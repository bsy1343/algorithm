# [Gold V] How Many Balls? - 35379

[문제 링크](https://www.acmicpc.net/problem/35379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 9, 정답 비율: 40.909%

### 분류

브루트포스 알고리즘, 수학

### 문제 설명

<p>If a bag contains $r$ red balls and $g$ green balls and two balls are drawn at random, the probability of getting one ball of each color is $$ P(r, g) = \frac{2rg}{(r+g)(r + g - 1)} $$</p>

<p>Write a program which takes as input a rational number $p/q$ in lowest terms and determines whether there is a number $r \leq 10^6$ and a $g \geq r$ for which  $P(r, g) = p/q$.</p>

### 입력

<p>The only line of input contains two space-separated positive integers $p$ ($p &gt; 0$) and $q$ ($ 2p - 1 \leq q \leq 1000$). These two integers are guaranteed to be relatively prime.</p>

### 출력

<p>If there is a solution, print the two positive integers $r$ and $g$ satisfying the conditions above, separated by a space. If there are multiple solutions, output the one with the smallest $r$ value. For any $r$ value, there is at most one $g$ value ($g \geq r$), which solves $P(r,g) = p/q$. If there is no solution with $r \leq 10^6$, print the word <code>impossible</code>.</p>