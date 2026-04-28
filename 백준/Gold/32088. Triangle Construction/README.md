# [Gold III] Triangle Construction - 32088

[문제 링크](https://www.acmicpc.net/problem/32088)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 120, 정답: 66, 맞힌 사람: 63, 정답 비율: 58.879%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are given a regular $N$-sided polygon. Label one arbitrary side as side $1$, then label the next sides in clockwise order as side $2, 3, \dots , N$. There are $A_i$ special points on side $i$. These points are positioned such that side $i$ is divided into $A_i + 1$ segments with equal length.</p>

<p>For instance, suppose that you have a regular $4$-sided polygon, i.e., a square. The following illustration shows how the special points are located within each side when $A = [3, 1, 4, 6]$. The uppermost side is labelled as side $1$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ed32a404-915b-43f4-86e4-fd9202656831/-/preview/" style="width: 199px; height: 200px;" /></p>

<p>You want to create as many <strong>non-degenerate triangles</strong> as possible while satisfying the following requirements. Each triangle consists of $3$ distinct special points (not necessarily from different sides) as its corners. Each special point can only become the corner of at most $1$ triangle. All triangles must not intersect with each other.</p>

<p>Determine the maximum number of non-degenerate triangles that you can create.</p>

<p>A triangle is <strong>non-degenerate</strong> if it has a positive area.</p>

### 입력

<p>The first line consists of an integer $N$ ($3 &le; N &le; 200\, 000$).</p>

<p>The following line consists of $N$ integers $A_i$ ($1 &le; A_i &le; 2 \cdot 10^9$).</p>

### 출력

<p>Output a single integer representing the maximum number of non-degenerate triangles that you can create.</p>