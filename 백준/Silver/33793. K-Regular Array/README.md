# [Silver IV] K-Regular Array - 33793

[문제 링크](https://www.acmicpc.net/problem/33793)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 64, 정답: 45, 맞힌 사람: 38, 정답 비율: 74.510%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>An array $a$ of size $n$ is considered $k$-regular if every subarray of $a$ of size $k$ contains all integers from $1$ to $k$, inclusive.</p>

<p>For example, $a = [2, 1, 3, 2]$ is $3$-regular, because its two subarrays of size $3$ are $[2, 1, 3]$ and $[1, 3, 2]$, each of which contains all integers from $1$ to $3$. On the other hand, $a = [1, 2, 3, 4]$ is not $3$-regular because the subarray $[2, 3, 4]$ of size $k=3$ does not contain $1$.</p>

<p>Your task is to find a $k$-regular array $a$ of size $n$ such that the sum of its elements is maximized.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing two integers $n$ and $k$ ($1 \le k \le n \le 2\cdot 10^5$) --- the desired size of the array $a$, and the parameter $k$ described above.</p>

<p>It is guaranteed that the sum of $n$ across all test cases is at most $2\cdot 10^5$.</p>

### 출력

<p>For each test case, output a single line containing $n$ integers $a_1, a_2, \cdots a_n$ --- a $k$-regular array $a$ of size $n$ with maximal sum.</p>

<p>If there are multiple solutions, you may print any.</p>

### 힌트

<p>In the first sample case, the array $a = [3, 1, 2, 3]$ is $3$-regular because its two subarrays of size $3$ are $[3, 1, 2]$ and $[1, 2, 3]$, each of which contains all integers from $1$ to $3$. The sum of this array is $3 + 1 + 2 + 3 = 9$, which we can show is maximal for this $n$ and $k$.</p>

<p>In the second sample case, each subarray of size $1$ must contain $1$, and therefore, the array must consist only of ones.</p>