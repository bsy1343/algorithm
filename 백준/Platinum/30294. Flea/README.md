# [Platinum IV] Flea - 30294

[문제 링크](https://www.acmicpc.net/problem/30294)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 435, 정답: 69, 맞힌 사람: 60, 정답 비율: 22.140%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>You have placed glues on each cells of an $N\times M$ grid to create a rectangular flea trap. Each glue has a <em>weak direction</em>; if a flea on the glue jumps towards its <em>weak direction</em>, the flea can jump out of the glue.</p>

<p>More precisely, each glue is represented by <code>U</code>, <code>D</code>, <code>L</code>, or <code>R</code>, meaning up, down, left, and right respectively.</p>

<p>Fleas can jump at most $K$ cells in one jump. If a flea jumps out of the rectangle, we say that the flea has <em>escape</em>d.</p>

<p>You became curious about how effective your trap is. If a flea that is placed on a cell of the trap can <em>escape</em> after consecutive jumps, we call the cell an <strong>escapable cell</strong>. Your task is to count the number of <strong>escapable cell</strong>s.</p>

### 입력

<p>In the first line, the trap sizes $N$, $M$ and the jump limit $K$ are given, separated by spaces.</p>

<p>For the next $N$ lines, each line contains a string of length $M$, indicating the <em>weak direction</em> of each cell.</p>

### 출력

<p>Print the number of <strong>escapable cell</strong>s.</p>

### 제한

<ul>
	<li>$N$, $M$, and $K$ are integers.</li>
	<li>$1\le N\le 2\, 000$</li>
	<li>$1\le M\le 2\, 000$</li>
	<li>$1\le K\le 2\, 000$</li>
	<li>Each string consists of <code>U</code>, <code>D</code>, <code>L</code>, or <code>R</code>.</li>
</ul>