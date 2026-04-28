# [Platinum V] Maths - 31385

[문제 링크](https://www.acmicpc.net/problem/31385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 34, 맞힌 사람: 19, 정답 비율: 67.857%

### 분류

백트래킹, 해 구성하기, 다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>Android Vasya attends Maths classes. His group started to study the number theory recently. The teacher gave them several tasks as a homework. One of them is as follows.</p>

<p>There is an integer $n$. The problem is to find a sequence of integers $a_1, \ldots, a_n$ such that for any $k$ from 2 to $n$ the sum $a_1 + \ldots + a_k$ has exactly $a_k$ different positive divisors. Help Vasya to cope with this task.</p>

### 입력

<p>The only line contains an integer $n$ ($2 \leq n \leq 100\,000$).</p>

### 출력

<p>If there is no such sequence output <code>Impossible</code>. Otherwise output space-separated integers $a_1, \ldots, a_n$ ($1 \leq a_i \leq 300$).</p>