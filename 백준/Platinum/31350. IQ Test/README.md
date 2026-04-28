# [Platinum II] IQ Test - 31350

[문제 링크](https://www.acmicpc.net/problem/31350)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 6, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리

### 문제 설명

<p>As a truly clever guy, bobo has never entered any kind of IQ tests. But here comes one.</p>

<p>The test consists of $n$ questions, which are numbered conveniently by $1, 2, \dots, n$. Each question has two options -- namely options &quot;<code>A</code>&quot; and &quot;<code>B</code>&quot;. The $i$-th question is &quot;How many questions among questions $1, 2, \dots, (i - 1)$ are answered by option $t_i$?&quot;. ($t_i$ is either &quot;<code>A</code>&quot; or &quot;<code>B</code>&quot;.) Option &quot;<code>A</code>&quot; says there are $x_i$ questions while option &quot;<code>B</code>&quot; says $y_i$.</p>

<p>bobo soon notices that the test is poorly-designed, so he wonder how many questions he can answer correctly at most.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \leq n \leq 200000$).</p>

<p>Each of the following $n$ lines contains a character $t_i$ and $2$ integers $x_i, y_i$ ($t_i \in \{A, B\}, 0 \leq x_i, y_i \leq n$).</p>

### 출력

<p>A single integer denotes the maximum number of questions he can answer correctly.</p>