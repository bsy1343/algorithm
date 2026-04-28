# [Gold I] Halfway There - 24645

[문제 링크](https://www.acmicpc.net/problem/24645)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 61, 맞힌 사람: 52, 정답 비율: 74.286%

### 분류

수학, 브루트포스 알고리즘, 애드 혹, 정수론, 유클리드 호제법

### 문제 설명

<p>Given an integer $n$, find the median of the list of all integers from $1$ to $n - 1$ that are coprime with $n$.</p>

<p>Recall that integers $a$ and $b$ are called <em>coprime</em> if their greatest common divisor is 1. The <em>median</em> of a list $L$ is defined to be the $\frac {|L|}{2}$-th element of $L$ if $|L|$ is even, and the $\frac {|L|+1}{2}$-th element of $L$ if $|L|$ is odd. Here $L$ is assumed to be sorted in ascending order, $|L|$ denotes the length of $L$, and indices are $1$-based.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^3$). Description of the test cases follows.</p>

<p>The only line of each test case contains a single integer $n$ ($2 \le n \le 10^{18}$).</p>

### 출력

<p>For each test case, print a single integer --- the median of the list of integers from $1$ to $n - 1$ that are coprime with $n$.</p>