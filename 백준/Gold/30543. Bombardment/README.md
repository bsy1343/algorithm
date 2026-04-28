# [Gold II] Bombardment - 30543

[문제 링크](https://www.acmicpc.net/problem/30543)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 16, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

구현, 자료 구조, 집합과 맵, 시뮬레이션, 슬라이딩 윈도우

### 문제 설명

<p>You are designing an old-school game you call <em>Bombardment</em> where the goal is to destroy a number of points by bombarding them. You do not yet know the theme of your game, just that the core mechanics should involve a bombardment.</p>

<p>The points to be destroyed are located on the real number line, that is each point is simply an $x$-coordinate. A bombardment is an attack that will destroy all points within some fixed distance $R$ from the center of the bombardment. More specifically, a single bombardment is specified by picking an integer point $X$ (the center). All points lying in the interval $[X-R, X+R]$ will be destroyed.</p>

<p>You decide to playtest a basic version of this game before you go through the effort of designing a theme, adding nice graphics, etc. Interestingly, most testers seemed to employ a greedy strategy: each bombardment is chosen to destroy the maximum number of points in that single bombardment. Sometimes, this causes players to use more bombardments than the minimum possible number of bombardments. You want to design a program that will simulate this strategy, this will help you design interesting levels. </p>

<p>That is, your job is to write a program that will simulate the following process. While there are still points remaining, choose a value $X$ for a bombardment that will destroy the maximum number of remaining points. If there are multiple values $X$ for the center of such a bombardment, you will choose the least such $X$ each time.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1 \leq N \leq 5 \times 10^5)$ and $R$ ($1 \leq R \leq 10^8$). The next line contains $N$ integers describing the $x$-coordinates of the points, each lying in the range $[-10^8, 10^8]$. Multiple points may share the same $x$-coordinate. You are also guaranteed that the difference between the maximum $x$-coordinate and the minimum $x$-coordinate is at most $40 \cdot R$.</p>

### 출력

<p>The first line of output contains a single integer $B$ indicating the number of bombardments that were performed. The second line consists of $B$ integers describing the $x$-coordinates of each bombardment in the order they were performed.</p>