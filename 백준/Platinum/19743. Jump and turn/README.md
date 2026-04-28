# [Platinum I] Jump and turn - 19743

[문제 링크](https://www.acmicpc.net/problem/19743)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 10, 맞힌 사람: 9, 정답 비율: 18.750%

### 분류

애드 혹, 많은 조건 분기, 해 구성하기, 구현

### 문제 설명

<p>Vanya is now sleeping and in the dream he&#39;s standing on grid of size $n \times m$. He wants to visit every cell of grid exactly once.</p>

<p>Vanya can initialy stand in the center of any cell and then he can jump from the cell he&#39;s standing on now to any other cell. Every time Vanya jumps exactly to the center of cell.</p>

<p>Vanya can jump from any cell to any other cell but there&#39;s a problem. Every time after jump he must turn strictly left. Specifically any three cells Vanya visit successively must satisfy following: if stand in the center of first cell and look at center of second cell then center of third cell must be in the left half-plane excluding line between centers of first and second cells. Particularly centers of three successively visited cells must not lie on one straight line.</p>

<p>Columns of grid are numbered from left to right from $1$ to $n$. Rows of grid are numbered from bottom to top from $1$ to $m$.</p>

<p>Help Vanya to find a way to visit every cell exactly once and satisfy the condition or report if it&#39;s impossible.</p>

### 입력

<p>Single line contains two integers $n$ and $m$  --- amount of columns and rows ($1 \le n, m \le 100$).</p>

### 출력

<p>In first line output &lt;&lt;<code>Yes</code>&gt;&gt; if it is possible to visit every cell as described, output &lt;&lt;<code>No</code>&gt;&gt; otherwise.</p>

<p>If solution exists output $n \cdot m$ more lines, $i$-th of them contains two integers $x_i$ and $y_i$  --- numbers of column and row which contains a cell Vanya should visit on $i$-th step ($1 \le x_i \le n$, $1 \le y_i \le m$).</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7f94469d-fa77-434f-86a6-33f88b92a98f/-/preview/" style="width: 93px; height: 95px;" /></p>

<p style="text-align: center;">Explanation for the first test</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2b09bce7-3c03-44a7-9ecc-2eb9fc84267c/-/preview/" style="width: 159px; height: 95px;" /></p>

<p style="text-align: center;">Explanation for the second test</p>