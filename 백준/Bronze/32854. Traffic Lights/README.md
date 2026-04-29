# [Bronze I] Traffic Lights - 32854

[문제 링크](https://www.acmicpc.net/problem/32854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 101, 정답: 69, 맞힌 사람: 41, 정답 비율: 65.079%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>You are staring down a street with $n$ traffic lights. Each traffic light has been set to alternate its color between $r$ seconds of red and $g$ seconds of green based on the two duration parameters $r$ and $g$. These two parameters may vary across different traffic lights.</p>

<p>You saw that all the traffic lights had been green, but had just all turned red at the same time. You are wondering how many seconds it would take before the traffic lights are all green again.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 ≤ n ≤ 10$), the number of traffic lights.</p>

<p>The next n lines each contain two integers $r$ and $g$ ($1 ≤ r, g ≤ 10$), giving the number of seconds that a traffic light stays red and green respectively.</p>

### 출력

<p>Output a single integer, the earliest time that the lights are all green again. If this will never happen, output $-1$.</p>