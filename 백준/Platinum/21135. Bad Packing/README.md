# [Platinum V] Bad Packing - 21135

[문제 링크](https://www.acmicpc.net/problem/21135)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 46, 맞힌 사람: 42, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 정렬, 누적 합, 배낭 문제

### 문제 설명

<p>We have a knapsack of integral capacity and some objects of assorted integral sizes. We attempt to fill the knapsack up, but unfortunately, we are really bad at it, so we end up wasting a lot of space that can&rsquo;t be further filled by any of the remaining objects. In fact, we are optimally bad at this! How bad can we possibly be?</p>

<p>Figure out the least capacity we can use where we cannot place any of the remaining objects in the knapsack. For example, suppose we have $3$ objects with weights $3$, $5$ and $3$, and our knapsack has capacity $6$. If we foolishly pack the object with weight $5$ first, we cannot place either of the other two objects in the knapsack. That&rsquo;s the worst we can do, so $5$ is the answer.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 1,000$) and $c$ ($1 \le c \le 10^5$), where $n$ is the number of objects we want to pack and $c$ is the capacity of the knapsack.</p>

<p>Each of the next $n$ lines contains a single integer $w$ ($1 \le w \le c$). These are the weights of the objects.</p>

### 출력

<p>Output a single integer, which is the least capacity we can use where we cannot place any of the remaining objects in the knapsack.</p>