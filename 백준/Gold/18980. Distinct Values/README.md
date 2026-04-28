# [Gold III] Distinct Values - 18980

[문제 링크](https://www.acmicpc.net/problem/18980)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵, 우선순위 큐, 두 포인터

### 문제 설명

<p>Chiaki has an array of $n$ positive integers. You are told some facts about the array: for every two elements $a_i$ and $a_j$ in the subarray $a_{l..r}$ ($l \le i &lt; j \le r$), $a_i \ne a_j$ holds.</p>

<p>Chiaki would like to find a lexicographically minimal array which meets the facts.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($1 \le n, m \le 10^5$) -- the length of the array and the number of facts. Each of the next $m$ lines contains two integers $l_i$ and $r_i$ ($1 \le l_i \le r_i \le n$).</p>

<p>It is guaranteed that neither the sum of all $n$ nor the sum of all $m$ exceeds $10^6$.</p>

### 출력

<p>For each test case, output $n$ integers denoting the lexicographically minimal array. Integers should be separated by a single space, and no extra spaces are allowed &nbsp;at the end of lines.</p>