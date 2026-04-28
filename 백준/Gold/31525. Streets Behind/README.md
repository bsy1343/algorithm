# [Gold III] Streets Behind - 31525

[문제 링크](https://www.acmicpc.net/problem/31525)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 52, 정답: 14, 맞힌 사람: 14, 정답 비율: 35.000%

### 분류

수학

### 문제 설명

<p>Your running club has some serious runners and some casual runners. You schedule several training runs with a mixture of serious runners and casual runners. Serious runners run at a faster pace than casual runners, and will leave them behind.</p>

<p>You want all the runners to become serious runners, so when you schedule training runs, you carefully choose the number of serious and casual runners who will participate. You know that when there are $x$ serious runners and $y$ casual runners in a training run, if $\frac{x}{x+y}$ is greater than or equal to a threshold $\frac{a}{b}$, then after the run, all $y$ casual runners, feeling the pressure to keep up with the serious runners become serious runners moving forward.</p>

<p>Compute the minimum number of training runs you need to convert all members of the club into serious runners.</p>

### 입력

<p>The first line of input contains a single integer $t$ ($1\leq t \leq 100$). This is the number of test cases.</p>

<p>Each of the next $t$ lines contains a test case. Each test case consists of four integers $n$, $k$, $a$, $b$ ($1 \leq n, k, a, b \leq 10^{9}$ and $a \leq b$), where $n$ is the number of serious runners, $k$ is the number of casual runners, and $\frac{a}{b}$ is the threshold which converts casual runners to serious runners.</p>

### 출력

<p>Output $t$ lines, each containing a single integer. For each test case, output the minimum number of training runs needed to convert all casual runners to serious runners. If it is impossible to convert all casual runners to serious runners, output $-1$ for that test case.</p>