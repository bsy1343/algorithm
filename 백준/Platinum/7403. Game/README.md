# [Platinum V] Game - 7403

[문제 링크](https://www.acmicpc.net/problem/7403)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 17, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 게임 이론

### 문제 설명

<p>There is a legend that mathematicians in the XVIII century enjoyed playing the following game.&nbsp;</p>

<p>The game was played by three mathematicians. One of them was the game master. First of all, the game master declared some positive integer number $N$. After that he chose two different integer numbers $X$ and $Y$ ranging from 1 to $N$ and told their sum to one player and their product to the other player. Each player knew whether he was told the sum or the product of the chosen numbers.</p>

<p>After that the players in turn informed the game master whether they knew the numbers he had chosen. First the player who was told the sum said whether he knew the numbers, after that the player who was told the product did, and so on.</p>

<p>For example the dialog could look like this.</p>

<p>Game master: &quot;Let $N$ be 10&quot;.</p>

<p>After that he chooses two numbers ranging from 1 to 10 and tells their sum to player $S$ and their product to player $P$.</p>

<p>Player $S$: &quot;I don&#39;t know these numbers.&quot;</p>

<p>Player $P$: &quot;I don&#39;t know these numbers.&quot;</p>

<p>Player $S$: &quot;I don&#39;t know these numbers.&quot;</p>

<p>Player $P$: &quot;I don&#39;t know these numbers.&quot;</p>

<p>Player $S$: &quot;Oh, now I know these numbers. You have chosen 3 and 6.&quot;</p>

<p>Given $N$ and $M$ --- the number of times the players have said &quot;I don&#39;t know these numbers&quot;, you have to find all possible pairs of numbers that could have been chosen by the game master.</p>

### 입력

<p>The first line of the input file contains $N$ and $M$ ($2 \le N \le 200$, $0 \le M \le 100$).</p>

### 출력

<p>First output the number of possible pairs of numbers that could have been chosen by the game master from the range 1 to $N$ if both players altogether had said &quot;I don&#39;t know these numbers&quot; $M$ times. After that output these pairs in arbitrary order, one on a line.</p>