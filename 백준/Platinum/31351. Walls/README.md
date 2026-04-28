# [Platinum IV] Walls - 31351

[문제 링크](https://www.acmicpc.net/problem/31351)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

그래프 이론, 자료 구조, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>Poor bobo is trapped in a maze!</p>

<p>The maze is divided into $n$ rows and $m$ columns. Each cell of the maze contains a wall across the diagonal. Thus, there are only two types of cells.</p>

<p>Thanks to bobo&#39;s magic power, he can change the type of cell $(i, j)$ with cost $c_{i, j}$. As a kind magician, bobo would like to make the maze unable to trap people anymore. That is to say, there will be no closed area surrounded by walls.</p>

<p>Find the minimum total cost for bobo to achieve the goal.</p>

### 입력

<p>The first line contains $2$ integers $n, m$ ($1 \leq n, m \leq 1000$).</p>

<p>Each of the following $n$ lines contains $m$ characters, which denotes the direction of wall in the cell.</p>

<p>Each of the last $n$ lines contains $m$ integers $c_{i, 1}, c_{i, 2}, \dots, c_{i, m}$ ($1 \leq c_{i, j} \leq 1000$).</p>

### 출력

<p>A single number denotes the minimum of cost.</p>