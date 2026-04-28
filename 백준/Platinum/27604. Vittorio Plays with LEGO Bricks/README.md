# [Platinum III] Vittorio Plays with LEGO Bricks - 27604

[문제 링크](https://www.acmicpc.net/problem/27604)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 37, 맞힌 사람: 31, 정답 비율: 86.111%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Vittorio is playing with his new LEGO Duplo bricks. All the bricks have the shape of a square cuboid with a $2 \times 2$ square base and a height of $1$. They can be arranged in the 3D space to build structures, provided that the following rules are met:</p>

<ol>
	<li>No two bricks can intersect, but they can touch on their faces.</li>
	<li>The corners of every brick must have integer coordinates (so bricks are axis-aligned) and the $z$ coordinates of all corners must be non-negative.</li>
	<li>The square bases of every brick must be parallel to the ground (i.e. the plane $z = 0$).</li>
	<li>The lower base of any brick that is not touching the ground must touch the upper base of some other brick in a region of positive area (when this happens, the two bricks stay attached to each other thanks to small studs).</li>
</ol>

<p>For example, this is a valid structure:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27604.%E2%80%85Vittorio%E2%80%85Plays%E2%80%85with%E2%80%85LEGO%E2%80%85Bricks/f7841930.png" data-original-src="https://upload.acmicpc.net/9ae13c5c-1d7a-47f0-b76c-cb6465f03bab/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 531px; height: 297px;" /></p>

<p>Vittorio wants to build a structure that includes purple bricks in the following $n$ positions: $(x_1, 0, h), (x_2, 0, h), \dots , (x_n, 0, h)$ &mdash; these are the coordinates of the centers of their lower bases; note that all of these bricks have $y$ coordinate equal to $0$ and $z$ coordinate equal to $h$. Vittorio will use additional bricks of other colors to support the purple bricks. He is willing to place bricks only in positions where the center of the lower base has $y$ coordinate equal to $0$. What is the minimum number of additional bricks needed?</p>

<p>It can be shown that a valid construction always exists.</p>

### 입력

<p>The first line contains two integers $n$ and $h$ ($1 &le; n &le; 300$, $0 &le; h &le; 10^9$) &mdash; the number of purple bricks and their common $z$ coordinate.</p>

<p>The second line contains $n$ integers $x_1, x_2, \dots , x_n$ ($1 &le; x_i &le; 10^9$, $x_i+1 &lt; x_{i+1}$) &mdash; the $x$ coordinates of the purple bricks (centers of the bases), given in increasing order.</p>

### 출력

<p>Print the minimum number of additional bricks needed.</p>