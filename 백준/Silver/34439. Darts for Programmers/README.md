# [Silver V] Darts for Programmers - 34439

[문제 링크](https://www.acmicpc.net/problem/34439)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 71, 정답: 38, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>After a long day of programming challenges, you decide to relax with your friends by playing darts. The only problem is that none of your friends (nor the author) have any clue how scoring works! Rather than try to learn, you simply devise your own rules. The rules you come up with are as follows:</p>

<ul>
	<li>Each player throws $3$ darts at the board on their turn.</li>
	<li>The score for that player's turn is the largest sum of the wedge numbers around the dart board between two circularly adjacent darts, including the wedges the darts land in.</li>
	<li>If two darts land in the same wedge, $x$, the sum around the dartboard from $x$ to $x$ is $x$.</li>
	<li>If all three darts land in the same wedge, the score for that turn is the number of the wedge they all land in.</li>
	<li>Nobody is accurate enough to hit the bullseye, so we can safely ignore it.</li>
</ul>

<p>For example, if your darts land in wedges $1$, $10$, and $7$ on your turn, you would calculate the sum around the dart board from wedge $1$ through wedge $10$ ($1 + 18 + 4 + 13 + 6 + 10 = 52$), the sum around the dart board from wedge $10$ through wedge $7$ ($10 + 15 + 2 + 17 + 3 + 19 + 7 = 73$) and the sum around the dart board from wedge $7$ through wedge $1$ ($7 + 16 + 8 + 11 + 14 + 9 + 12 + 5 + 20 + 1 = 103$). The sum around the dart board from wedge $7$ through wedge $1$ is the largest sum, so your score would be $103$ points.</p>

<p>The order of the wedges on the dartboard, starting from the top and going clockwise, is $20$, $1$, $18$, $4$, $13$, $6$, $10$, $15$, $2$, $17$, $3$, $19$, $7$, $16$, $8$, $11$, $14$, $9$, $12$, $5$.</p>

### 입력

<p>The first line contains a single integer $N$, representing the number of players.</p>

<p>The subsequent $N$ lines each contain three ($3$) space-separated integers $w_1$, $w_2$, and $w_3$ (in that order). Each $w_i$ represents the wedge number that the $i^\text{th}$ dart for that player landed in.</p>

### 출력

<p>The output should contain $N$ lines. Each line should contain the score for the corresponding player, in the same order in which they appear in the input.</p>

### 제한

<ul>
	<li>$0 &lt; N \leq 100\ 000$.</li>
	<li>All $w_i$ is guaranteed to be between $1$ and $20$, inclusive.</li>
</ul>