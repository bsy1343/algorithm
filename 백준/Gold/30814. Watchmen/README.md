# [Gold IV] Watchmen - 30814

[문제 링크](https://www.acmicpc.net/problem/30814)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 21, 맞힌 사람: 18, 정답 비율: 81.818%

### 분류

수학, 자료 구조, 집합과 맵, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>Watchmen are in a danger and Doctor Manhattan together with his friend Daniel Dreiberg should warn them as soon as possible. There are $n$ watchmen on a plane, the $i$-th watchman is located at point $(x_i, y_i)$.</p>

<p>They need to arrange a plan, but there are some difficulties on their way. As you know, Doctor Manhattan considers the distance between watchmen $i$ and $j$ to be $|x_i - x_j| + |y_i - y_j|$. Daniel, as an ordinary person, calculates the distance using the formula $\sqrt{(x_i - x_j)^2 + (y_i - y_j)^2}$.</p>

<p>The success of the operation relies on the number of pairs $(i, j)$ ($1 \leq i &lt; j \leq n$), such that the distance between watchman $i$ and watchmen $j$ calculated by Doctor Manhattan is equal to the distance between them calculated by Daniel. You were asked to compute the number of such pairs.</p>

### 입력

<p>The first line of the input contains the single integer $n$ ($1 \leq n \leq 200\,000$) --- the number of watchmen.</p>

<p>Each of the following $n$ lines contains two integers $x_i$ and $y_i$ ($|x_i|, |y_i| \leq 10^9$).</p>

### 출력

<p>Print the number of pairs of watchmen such that the distance between them calculated by Doctor Manhattan is equal to the distance calculated by Daniel.</p>

### 힌트

<p>In the first sample, the distance between watchman $1$ and watchman $2$ is equal to $|1 - 7| + |1 - 5| = 10$ for Doctor Manhattan and $\sqrt{(1 - 7)^2 + (1 - 5)^2} = 2 \cdot \sqrt{13}$ for Daniel. For pairs $(1, 1)$, $(1, 5)$ and $(7, 5)$, $(1, 5)$ Doctor Manhattan and Daniel will calculate the same distances.</p>