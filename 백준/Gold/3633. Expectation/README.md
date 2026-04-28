# [Gold I] Expectation - 3633

[문제 링크](https://www.acmicpc.net/problem/3633)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 59, 정답: 34, 맞힌 사람: 31, 정답 비율: 58.491%

### 분류

수학, 확률론, 기댓값의 선형성, 통계학

### 문제 설명

<p>Eric has constructed an easy scheme for generating random integer numbers. His scheme inputs an integer $n$ and generates evenly distributed random integer value between 0 and $(n-1)$ inclusive. For example, if $n=3$, the scheme generates 0, 1 or 2, each with probability $1/3$.</p>

<p>Now Eric is planning to construct more complicated schemes. The first one will consist of two independent random generators with their outputs forwarded to his favorite \texttt{XOR} gate, which does bitwise <em>exclusive or</em> with its two inputs.</p>

<p>Eric&#39;s friend Nick studies math. Nick said that the scheme is very interesting, and the most interesting thing is the expectation of the result. Now they both think how to calculate the expectation. Could you help them?</p>

<p>Remember that the expectation of the random variable is its average value. For a variable $\xi$ with non-negative integer values it can be calculated as $$\mathbf{E}\xi=\sum_{i=0}^{+\infty} i\cdot p_i,$$ where $p_i$ is the probability of $\xi$ being equal to $i$.</p>

### 입력

<p>The first line of the input contains the number $k$ of cases to solve ($1\le k\le 1\,000$). Each case consists of a single integer $1\le n\le 10^9$ on a separate line.</p>

### 출력

<p>For each case output the expected value of the new Eric&#39;s scheme with at least two digits after the decimal point. Output each result on a separate line.</p>