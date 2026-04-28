# [Platinum IV] Sequence - 19465

[문제 링크](https://www.acmicpc.net/problem/19465)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 27, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

그리디 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>ZZX has a sequence of boxes numbered $1, 2, \ldots, n$. Each box can contain at most one ball.</p>

<p>You are given the initial configuration of the balls. For $1 \le i \le n$, if the $i$-th box is empty, then $a_i = 0$, otherwise the $i$-th box contains exactly one ball, the color of which is $a_i$, a positive integer. Balls of the same color cannot be distinguished.</p>

<p>ZZX will perform $m$ operations in order. During $i$-th operation, he collects all the balls from boxes $l_i, l_i + 1, \ldots, r_i - 1, r_i$, and then arbitrarily puts them back into these boxes. Note that each box should always contain at most one ball.</p>

<p>ZZX wants to change the configuration of the balls from $a_1, a_2, \ldots, a_n$ to $b_1, b_2, \ldots, b_n$ using these operations. Please tell ZZX whether it is possible to achieve his goal.</p>

### 입력

<p>The first line contains an integer $T \le 60$. Then $T$ test cases follow. In each test case:</p>

<p>The first line of the test case contains two integers $n$ and $m$ ($1 \le n \le 1000$, $0 \le m \le 1000$, sum of $n$ over all test cases does not exceed $2000$, sum of $m$ over all test cases does not exceed $2000$).</p>

<p>The second line contains $a_1, a_2, \ldots ,a_n$ ($0 \le a_i \le n$). The third line contains $b_1, b_2, \ldots, b_n$ ($0 \le b_i \le n$). Each of the next $m$ lines contains two integers $l_i$ and $r_i$ ($1 \le l_i \le r_i \le n$).</p>

### 출력

<p>For each test case, print &quot;<code>Yes</code>&quot; or &quot;<code>No</code>&quot; on a separate line.</p>