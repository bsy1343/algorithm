# [Silver III] Fractional Sequence - 35378

[문제 링크](https://www.acmicpc.net/problem/35378)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 23, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

브루트포스 알고리즘, 수학, 유클리드 호제법, 정수론

### 문제 설명

<p>Consider the following increasing sequence, <strong>$S$</strong>, of rational numbers: \[ 1, 2, 2\frac{1}{2}, 3, 3\frac{1}{3}, 3\frac{2}{3} , 4, 4\frac{1}{4}, 4\frac{1}{2}, 4\frac{3}{4}, 5, 5\frac{1}{5}, 5\frac{2}{5}, 5\frac{3}{5}, 5\frac{4}{5}, 6, \ldots . \] $S$ is composed of an infinite set of blocks, $N_1, N_2, N_3, \ldots$, where block $N_i$ is \[ i, i+1/i, i+2/i, \ldots,  i+(i-1)/i . \] So $S(1) = 1, S(2) = 2, S(3) = 2\frac{1}{2}$, etc. Write a program which takes as input an integer $n$ and outputs $S(n)$.</p>

### 입력

<p>Input is a single line containing an integer, $n$ ($1 \leq n \leq 4\cdot 10^9$).</p>

### 출력

<p>Output $S(n)$  as a single integer if the answer is a whole number. Otherwise, output the integer part, a single space and a proper fraction $a/b$ in lowest terms (i.e. $0 &lt; a &lt; b$ and $GCD(a,b) = 1$). See the sample outputs.</p>