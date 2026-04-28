# [Gold II] Kinking Cables - 23385

[문제 링크](https://www.acmicpc.net/problem/23385)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 41, 맞힌 사람: 37, 정답 비율: 41.111%

### 분류

많은 조건 분기, 해 구성하기, 기하학

### 문제 설명

<p>You need to lay a cable to connect two computers with each other. This cable however has a very specific length and you need to use exactly the full length of the cable. Moreover, the cable cannot intersect itself and one part of the cable cannot be too close to another part. Can you connect the two computers with each other using the full length of the cable?</p>

<p>The two computers are standing in an $n \times m$ rectangular two-dimensional room. Computer 1 is always positioned at $(0,0)$ (the upper left corner) and Computer 2 at $(n,m)$ (the lower right corner). The cable is specified by a sequence of marked points $p_1, p_2, \dots, p_s$. The path of the cable is then obtained by connecting the consecutive points of this sequence with (straight) line segments. The cable path should satisfy the following constraints:</p>

<ul>
	<li>None of the line segments within the cable path should intersect.</li>
	<li>The marked points of the path should not be too close to each other: given a point $p_{i}$ there should be no other marked points strictly within a radius of 1 of $p_{i}$, except possibly $p_{i-1}$ and $p_{i+1}$ (the two consecutive points).</li>
	<li>The path should always start at $(0,0)$ and end at $(n,m)$.</li>
	<li>All points should lie somewhere in the $n \times m$ room.</li>
</ul>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $m$ ($2\leq n,m \leq 100$), the width and height of the room.</li>
	<li>One line with a floating-point number $\ell$ ($\sqrt{n^2 + m^2} \le \ell \le n\cdot m$), the length that the cable should have.</li>
</ul>

### 출력

<p>Output the number of points $k$ ($2 \le k \le 500$) that the cable path contains, followed by the $k$ points of the path, in their respective order. Each point consists of two floating-point numbers $x$ and $y$ $(0 \le x, y \le 100)$, the $x$- and $y$-coordinates of this point in the path.</p>

<p>The total length of the path should be exactly $\ell$, up to a relative or absolute error of $10^{-6}$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>