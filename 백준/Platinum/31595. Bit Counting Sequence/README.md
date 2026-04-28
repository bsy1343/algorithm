# [Platinum V] Bit Counting Sequence - 31595

[문제 링크](https://www.acmicpc.net/problem/31595)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 353, 정답: 111, 맞힌 사람: 96, 정답 비율: 32.542%

### 분류

수학, 애드 혹

### 문제 설명

<p>For a non-negative integer $x$, let $p(x)$ be the number of ones in the binary representation of $x$. For example, $p(26) = 3$ because $26 = (11010)_2$.</p>

<p>You are given a sequence of $n$ integers $(a_1, a_2, \dots , a_n)$. Your task is to determine whether there exists a non-negative integer $x$ such that $(p(x), p(x + 1), \dots , p(x + n - 1))$ is equal to $(a_1, a_2, \dots , a_n)$. Furthermore, if it exists, compute the smallest $x$ satisfying the condition.</p>

### 입력

<p>The first line of input contains one integer $t$ ($1 &le; t &le; 1000$) representing the number of test cases. After that, $t$ test cases follow. Each of them is presented as follows.</p>

<p>The first line contains one integer $n$ ($1 &le; n &le; 500\, 000$). The second line contains $n$ integers $a_1, a_2, \dots , a_n$ ($0 &le; a_i &le; 60$ for all $i$).</p>

<p>The sum of $n$ across all test cases in one input file does not exceed $500\, 000$.</p>

### 출력

<p>For each test case, output the smallest non-negative integer $x$ satisfying the condition above. If there is no such $x$, output <code>-1</code> instead.</p>