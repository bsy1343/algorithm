# [Platinum I] The Destruction of the Crystals - 18734

[문제 링크](https://www.acmicpc.net/problem/18734)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 11, 맞힌 사람: 11, 정답 비율: 47.826%

### 분류

그래프 이론, 그래프 탐색, 트리, 포함 배제의 원리, 이분 그래프

### 문제 설명

<p>Once upon a time, Zenyk came up with a new magical game for his friends. He brought a n &times; m board and placed k crystals on it. After that, he also placed b bombs on the board.</p>

<p>Upon explosion each bomb destroys all the crystals either in its row or in its column. It also detonates all the bombs in the chosen direction. The direction of the explosion (row/column) for each bomb is chosen by friends. Different bombs may have different directions.</p>

<p>The objective of the game is to choose the first bomb and the directions to detonate in such a way that the number of destroyed crystals is the largest possible.</p>

### 입력

<p>In the first line there are four integers: n, m, k, b (1 &le; n, m &le; 3000, 0 &le; k + b &le; n &middot; m). They are the dimensions of the board, the number of the crystals on it and the number of bombs.</p>

<p>In the next n rows the board is described by m characters per row:</p>

<ul>
	<li>&ldquo;.&rdquo; &mdash; an empty cell,</li>
	<li>&ldquo;k&rdquo; &mdash; a crystal,</li>
	<li>&ldquo;b&rdquo; &mdash; a bomb.</li>
</ul>

### 출력

<p>A single integer: the maximum possible amount of destroyed crystals.</p>