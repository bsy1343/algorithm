# [Gold I] Pegs - 34375

[문제 링크](https://www.acmicpc.net/problem/34375)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

구현, 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 브루트포스 알고리즘, 비트마스킹, 시뮬레이션

### 문제 설명

<p>The Peg Game is a puzzle game that can be found at Cracker Barrel locations around the country. The board consists of fifteen holes arranged in a triangle shape. Each of the holes can be occupied by a peg shaped like a golf tee.</p>

<p>The goal of the Peg Game is to remove as many pegs as possible from the board. To remove a peg, $p$, you must jump over $p$ with a peg from one of $p$'s hexagonally adjacent holes. A peg $a$ can only jump over another peg $p$ if the hole on the hexagonally opposite side of $p$ from $a$ exists on the board and is not occupied by another peg. You cannot jump over an empty hole.</p>

<p>Consider the board state on the left (which corresponds to Sample Input $1$). All holes except the white one are occupied by pegs. There are two pegs that can jump into the white hole, labeled in green. If the leftmost peg jumps into the white, then the red peg is removed. This results in the board state on the right. The pegs that can jump on the next move are once again labeled in green.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34375.%E2%80%85Pegs/ccc54bdd.png" data-original-src="https://boja.mercury.kr/assets/problem/34375-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 377px; height: 150px;"></p>

<p>The game continues until there are no more possible jumps. <strong>After removing as many pegs as you can, how many pegs would remain on the board?</strong></p>

### 입력

<p>The input consists of five lines each representing a line of the peg board. The $n^{\text{th}}$ line of input contains the $n$ space-separated values: either an "X" or a "-" (dash) representing a peg being present, or an empty hole, respectively.</p>

<p>You are guaranteed that there will be at least $1$ peg and at most $14$ pegs on the board.</p>

### 출력

<p>The output should be a single integer: the minimum number of pegs that would be left on the board after removing as many as you can using the rules of the game.</p>