# [Gold II] Power of Divisors - 28152

[문제 링크](https://www.acmicpc.net/problem/28152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 260, 정답: 123, 맞힌 사람: 98, 정답 비율: 49.495%

### 분류

수학, 브루트포스 알고리즘, 정수론, 소인수분해

### 문제 설명

<p>Consider a positive integer $n$. Let $f(n)$ be the number of positive integer divisors of $n$. For example, if $n=8$ then $f(n)=4$, since the divisors of $8$ are $1$, $2$, $4$ and $8$.</p>

<p>Now, consider a positive integer $x$. What is the smallest value of $n$ such that $n^{f(n)}=x$?</p>

### 입력

<p>The single line of input contains a single integer $x$ ($1 \le x \le 10^{18}$). This is the $x$ of the statement above.</p>

### 출력

<p>Output a single integer, which is the smallest value of $n$ such that $n^{f(n)}=x$, or $-1$ if no such value of $n$ exists.</p>