# [Gold I] Eureka - 19436

[문제 링크](https://www.acmicpc.net/problem/19436)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 64 MB

### 통계

제출: 72, 정답: 15, 맞힌 사람: 12, 정답 비율: 29.268%

### 분류

조합론, 기하학, 포함 배제의 원리, 수학

### 문제 설명

<p>Professor Zhang draws $n$ points on the plane which are conveniently labeled by $1, 2, \ldots, n$. The $i$-th point is at $(x_i, y_i)$. Professor Zhang wants to know the number of <em>best sets</em>. As the value could be very large, print it modulo $10^9 + 7$.</p>

<p>A set $P$ ($P$ contains the labels of the points) is called a <em>best set</em> if and only if there is at least one <em>best pair</em> in $P$. Two numbers $u$ and $v$ $(u, v \in P, u \ne v)$ are called a <em>best pair</em> if for every $w \in P$, $f(u, v) \ge g(u, v, w)$, where $f(u, v) = \sqrt{(x_u - x_v)^2 + (y_u - y_v)^2}$ and $g(u, v, w) = \frac{f(u, v) + f(v, w) + f(w, u)}{2}$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ $(1 \le n \le 1000)$: the number of points.</p>

<p>Each of the following $n$ lines contains two integers $x_i$ and $y_i$ $(-10^9 \le x_i, y_i \le 10^9)$: coordinates of the $i$-th point.</p>

<p>There are no more than $250$ test cases, and the sum of $n$ in all the test cases is at most $40\,000$.</p>

### 출력

<p>For each test case, output a single integer: the number of <em>best sets</em> modulo $10^9 + 7$.</p>