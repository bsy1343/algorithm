# [Platinum II] Cursed Game - 32078

[문제 링크](https://www.acmicpc.net/problem/32078)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 159, 정답: 26, 맞힌 사람: 23, 정답 비율: 23.711%

### 분류

애드 혹, 해 구성하기, 무작위화

### 문제 설명

<p>You found an antique box in your warehouse and decided to open it. The moment you open the box, it traps you into a cursed game where you are playing against a demon. The game consists of $333$ rounds and you have to win all rounds in order to escape. The demon also gives you $999$ coins that you can use throughout all rounds.</p>

<p>Note that in this problem, denote cell $(r, c)$ of a grid as the cell in row $r$ and column $c$ of the grid.</p>

<p>Before the start of each round, the demon will prepare a <em>secret paper</em>, which can be represented as a grid with $3$ rows and $3$ columns, both numbered from $1$ to $3$. The demon will secretly put a hole in <strong>one or more cells</strong>, and you are not aware which cells have a hole in it. Then, the round starts with the demon giving you an <strong>odd</strong> integer $N$ ($3 &le; N &le; 33$).</p>

<p>Within each round, you can ask the demon several queries, each costing you one coin. For each query, you are allowed to give the demon <em>your paper</em>, which can be represented as a grid with $N$ rows and $N$ columns, both numbered from $1$ to $N$. Each cell is coloured either black or white by you.</p>

<p>For each of your query, the demon will calculate a binary <em>result grid</em> with $N - 2$ rows and $N - 2$ columns, both numbered from $1$ to $N - 2$. The value on cell $(r, c)$ of the result grid is filled as follows.</p>

<ul>
	<li>The demon will put the secret paper on top of your paper such that the cell $(r + i - 1, c + j - 1)$ of your paper aligns with the cell $(i, j)$ of the secret paper, for $1 &le; i, j &le; 3$.</li>
	<li>The demon can only see the colour of the cell in your paper if the corresponding cell in the secret paper has a hole in it.</li>
	<li>The value on cell $(r, c)$ of the result grid is $1$ if there is an odd number of black cells that it can see through the holes, or $0$ otherwise.</li>
</ul>

<p>You win the round if the result grid consists of only the values $1$. Otherwise, the demon will give you the result grid as a feedback, and the round continues.</p>

<p>If you have spent all the coins and still did not win all the rounds, then you will be trapped forever. Escape the cursed game!</p>

### 입력



### 출력

