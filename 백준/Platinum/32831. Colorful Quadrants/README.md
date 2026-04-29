# [Platinum III] Colorful Quadrants - 32831

[문제 링크](https://www.acmicpc.net/problem/32831)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 480, 정답: 138, 맞힌 사람: 53, 정답 비율: 17.667%

### 분류

누적 합, 다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>You are given an $n \times n$ grid, and some of the grid points are colored by one of the $k$ colors. The color of a point is represented by an integer from $0$ to $k$, where $0$ represents the uncolored case. Note that multiple points may be colored the same. The rows and columns of the grid are denoted by integers from $1$ to $n$, and a point located at row $i$ and column $j$ is denoted by $(i,j)$. For an uncolored point $(i,j)$ that satisfies $1 &lt; i &lt; n$ and $1 &lt; j &lt; n$, we define four sub-grids by removing row $i$ and column $j$ from the grid. Each of the four sub-grids is called NW (northwest), NE (northeast), SW (southwest), and SE (southeast) based on the position relative to $(i,j)$. We say that $(i,j)$ has <em>colorful quadrants</em> if, when selecting one point from each of the four sub-grids, the chosen four points are all of different colors.</p>

<p>See Figure C.1(a) as a $5 \times 5$ grid example. The point $(2,3)$ has colorful quadrants because NW has color $1$, NE has color $4$, SW has color $3$, and SE has color $2$, as shown in Figure C.1(b). However, the point $(4,3)$ does not have colorful quadrants because both SW and SE have color $2$ only, as shown in Figure C.1(c).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32831.%E2%80%85Colorful%E2%80%85Quadrants/a9feceea.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32831-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 734px; height: 250px;"></p>

<p style="text-align: center;">Figure C.1</p>

<p>Given an $n \times n$ grid containing at least four grid points colored in different colors, write a program to count the number of uncolored points that have colorful quadrants.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers, $n$ and $k$ ($3 ≤ n ≤ 2\,000$, $4 ≤ k ≤ 1\,000$), where $n$ is the number of rows and columns of the grid and $k$ is the number of colors. In the following $n$ lines, the $i$-th line contains $n$ integers that represent the colors of the points $(i,j)$ for $1 ≤ j ≤ n$. The integer $c$ that represents the color of a point is in range $0 ≤ c ≤ k$.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the number of uncolored points that have colorful quadrants.</p>