# [Silver III] Jigsaw - 20338

[문제 링크](https://www.acmicpc.net/problem/20338)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 316, 정답: 112, 맞힌 사람: 100, 정답 비율: 35.842%

### 분류

수학, 브루트포스 알고리즘, 정수론

### 문제 설명

<p>You have found an old jigsaw puzzle in the attic of your house, left behind by the previous occupants. Because you like puzzles, you decide to put this one together. But before you start, you want to know whether this puzzle was left behind for a reason. Maybe it is incomplete? Maybe the box contains pieces from multiple puzzles?&nbsp;</p>

<p>If it looks like a complete puzzle, you also need to know how big your work surface needs to be. Nothing worse than having to start a jigsaw over because you started on a small table.</p>

<p>The box does not tell you the dimensions $w \times h$ of the puzzle, but you can quickly count the three types of pieces in the box:</p>

<p>&nbsp;</p>

<ul>
	<li>Corner pieces, which touch two of the edges of the puzzle.</li>
	<li>Edge pieces, which touch one of the edges of the puzzle.</li>
	<li>Centre pieces, which touch none of the edges of the puzzle.</li>
</ul>

<p>Do these pieces add up to a complete jigsaw puzzle? If so, what was the original size of the jigsaw puzzle?</p>

### 입력

<ul>
	<li>One line containing three integers $c$, $e$, and $m$ ($0\leq c,e,m\leq10^9$), the number of corner pieces, edge pieces, and centre pieces respectively.</li>
</ul>

### 출력

<p>If there exist numbers $w$ and $h$ satisfying $w\geq h\geq 2$ such that the original size of the jigsaw puzzle could have been $w\times h$, then output a single line containing $w$ and $h$. Otherwise, output &quot;<code>impossible</code>&quot;.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>