# [Platinum I] Tris - 19053

[문제 링크](https://www.acmicpc.net/problem/19053)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

많은 조건 분기, 해 구성하기

### 문제 설명

<p>You are given some domino-like pieces. The following types of pieces are possible:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19053.%E2%80%85Tris/be09d647.png" data-original-src="https://upload.acmicpc.net/80b9dc5b-e67b-4ffc-abcf-ad43eb963daa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 314px; height: 79px;" /></p>

<p>Note that there are only four types, and you may rotate and reflect any piece for further use. You want to place all the pieces in a matrix of size at most $800 \times 800$ so that you get a single non-self-touching cycle. Formally, this means:</p>

<ul>
	<li>All pieces must fully fit in the matrix and be aligned with the grid.</li>
	<li>No two pieces may overlap.</li>
	<li>If a certain matrix cell is occupied by a piece, then exactly two&nbsp;of its four neighbours must also be occupied.</li>
	<li>All occupied cells are connected.&nbsp;In other words, you can travel from any occupied cell&nbsp;to any other occupied cell by only moving to adjacent occupied cells.</li>
	<li>The &quot;interior&quot; of the cycle must be a single 4-connected area.</li>
</ul>

### 입력

<p>The input consists of a single line containing four integers: the number of pieces of each type (in the order they are shown in the image). It is guaranteed that each number is at least 2 and at most 100, and that at least one valid answer exists.</p>

### 출력

<p>The first line of output must contain two integers $N$ and $M$ ($N, M \le 800$) denoting the number of rows and columns in your matrix. The next lines must describe the matrix in the following format:</p>

<ul>
	<li>The matrix must contain integers between 0 and the total number&nbsp;of pieces, inclusive.</li>
	<li>Cells occupied by the same piece must have the same value.</li>
	<li>Cells occupied by different pieces must have different values.</li>
	<li>Cells that are not occupied by any piece must have the value 0.</li>
</ul>

<p>If there are several valid answers, print any one of them.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19053.%E2%80%85Tris/7fb80b9f.png" data-original-src="https://upload.acmicpc.net/52bec420-2780-40ae-b23b-c83cd667b576/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 82px; height: 147px;" /></p>