# [Gold IV] Rooks - 31082

[문제 링크](https://www.acmicpc.net/problem/31082)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

자료 구조, 정렬, 집합과 맵, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>Prof. Pang plays chess against his rival Prof. Shou. They are the only two players in the game. The chessboard is very large and can be viewed as a 2D plane. Prof. Pang placed $n_1$ rooks and Prof. Shou placed $n_2$ rooks. Each rook is a point with integer coordinates on the chessboard. One rook is <em>attacked</em> by another rook if they satisfy all of the following conditions:</p>

<ul>
	<li>They are placed by different players.</li>
	<li>They have the same $x$-coordinate or $y$-coordinate.</li>
	<li>There is no other rook on the line segment between them.</li>
</ul>

<p>Help Prof. Pang and Prof. Shou to decide which rooks are attacked.</p>

### 입력

<p>The first line contains two integers $n_1, n_2$ ($1\le n_1, n_2\le 200000$) separated by a single space denoting the number of rooks placed by Prof. Pang and the number of rooks placed by Prof. Shou.</p>

<p>The $i$-th ($1\le i\le n_1$) line of the next $n_1$ lines contains two integers $x, y$ ($-10^9\le x, y\le 10^9$) separated by a single space denoting the location $(x, y)$ of the $i$-th rook placed by Prof. Pang.</p>

<p>The $i$-th ($1\le i\le n_2$) line of the next $n_2$ lines contains two integers $x, y$ ($-10^9\le x, y\le 10^9$) separated by a single space denoting the location $(x, y)$ of the $i$-th rook placed by Prof. Shou.</p>

<p>It is guaranteed that the $n_1+n_2$ rooks placed by the players are distinct (i.e., no two rooks can have the same location).</p>

### 출력

<p>Output a string with length $n_1$ on the first line. The $i$-th ($1\le i\le n_1$) character should be $1$ if the $i$-th rook placed by Prof. Pang is attacked and $0$ otherwise.</p>

<p>Output a string with length $n_2$ on the second line. The $i$-th ($1\le i\le n_2$) character should be $1$ if the $i$-th rook placed by Prof. Shou is attacked and $0$ otherwise.</p>