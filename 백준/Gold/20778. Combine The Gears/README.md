# [Gold II] Combine The Gears - 20778

[문제 링크](https://www.acmicpc.net/problem/20778)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

배낭 문제

### 문제 설명

<p>With the rapid development of society, the demand for high-precision clocks is constantly rising. Recently, the China Clock Production Company is developing a new type of clock, which can represent a wide range of times.</p>

<p>The novel clock displays the current time in an unusual fashion. The clock consists of several pointers, each controlled by a gear. All gears rotate synchronously -- one tooth per period. However, the numbers of teeth of the gears may differ. If a gear has $t$ teeth, then the corresponding pointer can point to $t$ different directions, denoted $0, 1, 2, \cdots, t-1$, respectively, where $0$ is the initial direction. Furthermore, if a clock is equipped with $n$ pointers, the $i$-th of which is controlled by a $t_i$-tooth gear, then the $i$-th pointer will point to $k \bmod t_i$ after $k$ periods of time.</p>

<p>The price for a $t$-tooth gear is $t$ yuan. Given a total budget of $b$ yuan, you need to design a combination of gears, such that the number of valid combinations of directions of pointers is maximized, and the total cost on gears does not exceed the budget. A combination of directions $(d_1, d_2, \cdots, d_n)$ is valid, if it can be written $$ (k \bmod t_1, k \bmod t_2, \cdots, k \bmod t_n) $$ for some nonnegative integer $k$, where $t_i$ is the number of teeth of the $i$-th gear. Since the answer may be too large, output the answer in natural logarithm (logarithm with base $e = 2.718281828\cdots)$.</p>

### 입력

<p>The first line of input is a single integer $T$ $(1 \leq T \leq 30\;000)$, indicating the number of test cases. Each test case is a single line of an integer $b$ $(1 \leq b \leq 30\;000)$, denoting the total budget.</p>

### 출력

<p>For each test case, print the natural logarithm, within an absolute or relative error of no more than $10^{-6}$, of the maximum number of valid combinations, in a single line.</p>

### 힌트

<p>For the second sample data, a 3-tooth gear along with a 4-tooth gear may yield 12 different combinations of directions, with total cost exactly being 7. So you should print the value of $\ln 12$, which is approximately 2.484906650.</p>