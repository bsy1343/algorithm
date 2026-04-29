# [Platinum II] Try This at Home - 33289

[문제 링크](https://www.acmicpc.net/problem/33289)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

수학, 조합론

### 문제 설명

<p>For an integer array $b$, let's define $f(b)$ as the lexicographically smallest array of the same length that is lexicographically greater than $b$ and its <strong>set</strong> of elements is the same as $b$'s set of elements. If such an array does not exist, $f(b)$ is undefined. For example, $f([3,2,3,2,6,6]) = [3,2,3,3,2,6]$. In this problem, "the set of array's elements" means an unordered collection of array's elements, where each element is only considered once regardless of how many times it appears in that array. Arrays $[3,2,3,2,6,6]$ and $[3,2,3,3,2,6]$ have the same set of elements $\{2,3,6\}$, despite some values appearing a different amount of times in the first and the second array.</p>

<p>Let $f^k(b)$ denote the function $f$ applied $k$ times to $b$; here, we consider $f(\text{undefined})$ as undefined too. For example, $f^2([3,2,3,2,6,6]) = f([3,2,3,3,2,6]) = [3,2,3,3,3,6]$. </p>

<p>You are given an integer array $a$ of length $n$. In this problem, the array satisfies an additional constraint: <strong>every</strong> value in the array $a$ appears there <strong>at least twice</strong>. Find the smallest positive integer $k$ such that $f^k(a)$ is not undefined and the array $f^k(a)$ contains some value that appears exactly once in it, or report that there is no such $k$. As the answer may be very large, find it modulo $10^9 + 7$.</p>

### 입력

<p>The input contains one or more test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^5$).  </p>

<p>Each test case is given on two lines. The first of these lines contains an integer $n$ ($2 \le n \le 10^5$). The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 10^6$). Every value in the array $a$ appears there at least twice.</p>

<p>The sum of $n$ for all test cases does not exceed $6 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single line with the answer modulo $10^9 + 7$, or <code>-1</code> if there is no answer.</p>