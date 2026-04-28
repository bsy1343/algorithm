# [Platinum IV] Move One Coin - 27419

[문제 링크](https://www.acmicpc.net/problem/27419)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 153, 정답: 55, 맞힌 사람: 50, 정답 비율: 35.461%

### 분류

구현, 정렬, 애드 혹

### 문제 설명

<p>Some coins are placed on grid points on a two-dimensional plane. No two coins are stacked on the same point. Let&rsquo;s call this placement of coins the <em>source pattern</em>. Another placement of the same number of coins, called the <em>target pattern</em>, is also given.</p>

<p>The source pattern does not match the target pattern, but by moving exactly one coin in the source pattern to an empty grid point, the resulting new pattern matches the target pattern. Your task is to find out such a coin move.</p>

<p>Here, two patterns are said to <em>match</em> if one pattern is obtained from the other by applying some number of 90-degree rotations on the plane and a parallel displacement if necessary, but without mirroring. For example, in the source pattern on the left of Figure D.1, by moving the coin at $(1, 0)$ to $(3, 1)$, we obtain the pattern on the right that matches the target pattern shown in Figure D.2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27419.%E2%80%85Move%E2%80%85One%E2%80%85Coin/ca23888d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27419.%E2%80%85Move%E2%80%85One%E2%80%85Coin/ca23888d.png" data-original-src="https://upload.acmicpc.net/191a62a8-30f1-48c0-a0c0-2c8cec77e8aa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 345px; height: 112px;" /></p>

<p style="text-align: center;">Figure D.1. Source pattern and a move</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27419.%E2%80%85Move%E2%80%85One%E2%80%85Coin/98e89bd9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27419.%E2%80%85Move%E2%80%85One%E2%80%85Coin/98e89bd9.png" data-original-src="https://upload.acmicpc.net/821731ae-b08a-4599-b7e7-5cbfc06c2a58/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 96px; height: 173px;" /></p>

<p style="text-align: center;">Figure D.2. Target Pattern</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$h$ $w$</p>

<p>$p_{0,0}$ $\cdots$ $p_{0,w-1}$</p>

<p>$\vdots$</p>

<p>$p_{h-1,0}$ $\cdots$ $p_{h-1,w-1}$</p>

<p>$H$ $W$</p>

<p>$P_{0,0}$ $\cdots$ $P_{0,W-1}$</p>

<p>$\vdots$</p>

<p>$P_{H-1,0}$ $\cdots$ $P_{H-1,W-1}$</p>
</blockquote>

<p>The first line consists of two integers $h$ and $w$, both between $1$ and $500$, inclusive. $h$ is the height and $w$ is the width of the source pattern description. The next $h$ lines each consisting of $w$ characters describe the source pattern. The character $p_{y,x}$ being <code>&lsquo;o&rsquo;</code> means that a coin is placed at $(x, y)$, while <code>&lsquo;x&rsquo;</code> means no coin is there.</p>

<p>The following lines with integers $H$ and $W$, and characters $P_{y,x}$ describe the target pattern in the same way.</p>

### 출력

<p>If the answer is to move the coin at $(x_0, y_0)$ to $(x_1, y_1)$, print $x_0$ and $y_0$ in this order separated by a space character in the first line, and print $x_1$ and $y_1$ in this order separated by a space character in the second line.</p>

<p>It is ensured there is at least one move that satisfies the requirement. When multiple solutions exist, print any one of them.</p>

<p>Note that $0 &le; x_0 &lt; w$ and $0 &le; y_0 &lt; h$ always hold but $x_1$ and/or $y_1$ can be out of these ranges.</p>