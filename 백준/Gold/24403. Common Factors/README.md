# [Gold I] Common Factors - 24403

[문제 링크](https://www.acmicpc.net/problem/24403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 177, 정답: 90, 맞힌 사람: 79, 정답 비율: 52.318%

### 분류

수학, 그리디 알고리즘, 정수론, 유클리드 호제법, 오일러 피 함수

### 문제 설명

<p>Everyone likes to share things in common with other people.</p>

<p>Numbers are the same way! Numbers like it when they have a factor in common.</p>

<p>For example, $4$ and $6$ share a common factor of $2$, which gives them something to talk about.</p>

<p>For a given integer $n$, we define a function, $f(n)$, equal to the number of integers in the range [$1$, $n$] that share a common factor greater than $1$ with $n$.</p>

<p>Furthermore, we can define a second function, $g(n)$, which characterizes the fraction of numbers that like a given number as follows: $g(n) = \frac{f(n)}{n}$.</p>

<p>What we really want to know though, is, for any integer $2 &le; k &le; n$, what is the maximum value of $g(k)$?</p>

### 입력

<p>The input consists of a single integer $n$ ($2 &le; n &le; 10^{18}$), the value of $n$ for the input case.</p>

### 출력

<p>For the provided test case, output the result as a fraction, in lowest terms, in the form $p$/$q$ where the greatest common divisor of $p$ and $q$ is 1.</p>