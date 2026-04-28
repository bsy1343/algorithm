# [Silver I] Limited Swaps - 26874

[문제 링크](https://www.acmicpc.net/problem/26874)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 50, 맞힌 사람: 49, 정답 비율: 67.123%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>Lina is playing with $n$ cubes placed in a row. Each cube has an integer from $1$ to $n$ written on it. Every integer from $1$ to $n$ appears on exactly one cube.</p>

<p>Initially, the numbers on the cubes from left to right are $a_1, a_2, \ldots, a_n$. Lina wants the numbers on the cubes from left to right to be $b_1, b_2, \ldots, b_n$.</p>

<p>Lina can swap any two adjacent cubes, but only if the difference between the numbers on them is at least $2$. This operation can be performed at most $20\,000$ times.</p>

<p>Find any sequence of swaps that transforms the initial configuration of numbers on the cubes into the desired one, or report that it is impossible.</p>

### 입력

<p>The first line contains a single integer $n$ --- the number of cubes ($1 \le n \le 100$).</p>

<p>The second line contains $n$ distinct integers $a_1, a_2, \ldots, a_n$ --- the initial numbers on the cubes from left to right ($1 \le a_i \le n$).</p>

<p>The third line contains $n$ distinct integers $b_1, b_2, \ldots, b_n$ --- the desired numbers on the cubes from left to right ($1 \le b_i \le n$).</p>

### 출력

<p>If it is impossible to obtain the desired configuration of numbers on the cubes from the initial one, print a single integer $-1$.</p>

<p>Otherwise, in the first line, print a single integer $k$ --- the number of swaps in your sequence ($0 \le k \le 20\,000$).</p>

<p>In the second line, print $k$ integers $s_1, s_2, \ldots, s_k$ describing the operations in order ($1 \le s_i \le n - 1$). Integer $s_i$ stands for &quot;swap the $s_i$-th cube from the left with the $(s_i + 1)$-th cube from the left&quot;.</p>

<p>You do not have to find the shortest solution. Any solution satisfying the constraints will be accepted.</p>

### 힌트

<p>In the first example test, the configuration of numbers changes as follows:</p>

<p style="text-align: center;">$1$ $\underline{3\,5}$ $2$ $4$ $\rightarrow$ $\underline{1\,5}$ $3$ $2$ $4$ $\rightarrow$ $5$ $\underline{1\,3}$ $2$ $4$ $\rightarrow$ $5$ $3$ $1$ $\underline{2\,4}$ $\rightarrow$ $\underline{5\,3}$ $1$ $4$ $2$ $\rightarrow$ $3$ $5$ $1$ $4$ $2$</p>

<p>In the second example test, making even a single swap in the initial configuration is impossible.</p>