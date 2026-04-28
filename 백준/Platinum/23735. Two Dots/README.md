# [Platinum III] Two Dots - 23735

[문제 링크](https://www.acmicpc.net/problem/23735)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 319, 정답: 115, 맞힌 사람: 83, 정답 비율: 36.726%

### 분류

자료 구조, 기하학, 스택

### 문제 설명

<p><strong><em>&quot;Only 1% can solve this problem!!!&quot;</em></strong></p>

<p>One day, Yunee saw an advertisement for the game named &quot;Two Dots&quot;. The goal of this game was to connect all pairs of points with the same colors.</p>

<p>The rules are as follows. The game area is a square of size $L\times L$. $N$ points are on the square, some completely inside and others on the boundary. They are divided into $N/2$ pairs by their colors. You can connect a pair of points by drawing a curved line connecting them. The lines must lie completely inside the square and never cross each other.</p>

<p>Yunee found that the problem in the advertisement could never be solved. Mad at this, Yunee is going to report this ad as a false advertisement by proving that the problem cannot be solved. If the problem can&#39;t be solved, then only 0% can solve this problem!!!</p>

<p>Help Yunee write a program to determine whether it is possible to solve a given problem.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23735.%E2%80%85Two%E2%80%85Dots/881c0f5a.png" data-original-src="https://upload.acmicpc.net/242d1a31-dc0a-4604-9d3a-7f12afc19037/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 600px;" /></p>

### 입력

<p>The first line contains an integer $L$ $(1\leq L \leq 100,000)$ and an even integer $N$ $(2\leq N\leq \min[300,000, (L+1)^2])$. $L$ is the side length of the game area and $N$ is the number of points. The four vertices of the game area are $(0, 0), (L, 0), (L, L)$ and $(0, L)$.</p>

<p>The next $N$ lines describe the points. The $i$-th line contains the coordinate $x, y$ and the color $c$ of the $i$-th point $(0 \leq x, y \leq L, 1 \leq c \leq N/2)$. The coordinates of the $N$ points are distinct. There are exactly two points with each color $c=1,\cdots,N/2$.</p>

### 출력

<p>Output <code>1%</code>&nbsp;if it is possible to solve the problem, and <code>0%</code>&nbsp;otherwise.</p>