# [Platinum IV] Game of Chairs - 19263

[문제 링크](https://www.acmicpc.net/problem/19263)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 20, 맞힌 사람: 18, 정답 비율: 62.069%

### 분류

누적 합, 스위핑

### 문제 설명

<p>You are participating in a strange game. There are $n$ chairs in a row at a distance of one meter from each other. Each chair is painted by one of $c$ different colors.</p>

<p>At the beginning, you can sit on any chair. Then the jury will choose a color and announce it. Each color has $\frac{1}{c}$ probability to be chosen. Your task is to move to any chair of this color.</p>

<p>Of course, you will move to the nearest appropriate chair. If you are already sitting on it, you will not move at all.</p>

<p>You want to pick a chair to sit at the beginning to minimize the expected distance which you will have to walk.</p>

### 입력

<p>In the first line there are two integers $n$ and $c$: the number of chairs and the number of colors ($1 \leq c \leq n \leq 10^6$).</p>

<p>The second line contains $n$ integers $a_i$: the colors of chairs ($1 \leq a_i \leq c$). There is at least one chair of each color.</p>

### 출력

<p>Output the expected distance as an irreducible fraction.</p>