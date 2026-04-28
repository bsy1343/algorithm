# [Silver II] Practice - 29883

[문제 링크](https://www.acmicpc.net/problem/29883)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 39, 맞힌 사람: 31, 정답 비율: 64.583%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>John practiced for $N$ days in preparation for the olympiad. He solved $X_i$ tasks on day $i$.</p>

<p>After the olympiad he wanted to know whether there was a span of consecutive days when he solved exacly $Y$ tasks. In other words, are there integers $a$ and $b$ such that $1 \le a \le b \le N$ and $X_a + X_{a+1} + \ldots + X_b = Y$?</p>

<p>Write a program to help John answer that question.</p>

### 입력

<p>The first line of input contains $N$, the number of days ($1 \le N \le 1\,000$), and $M$, the number of questions ($1 \le M \le 1\,000\,000$).</p>

<p>The second line contains $N$ space-separated integers $X_i$ ($0 \le X_i \le 1\,000$, where $1 \le i \le N$), the numbers of tasks John solved each day.</p>

<p>The third line contains $M$ space-separated integers $Y_j$ ($1 \le Y_j \le 1\,000\,000$, where $1 \le j \le M$), the numbers of tasks in John&#39;s questions.</p>

### 출력

<p>Output $M$ lines, one per question. On the line $j$ output the word &#39;<code>JAH</code>&#39;, if there exists a span of consecutive days when John solved exactly $Y_j$ tasks, or the word &#39;<code>EI</code>&#39;, if there&#39;s no such span of days.</p>