# [Gold III] Minimal Backgammon - 3897

[문제 링크](https://www.acmicpc.net/problem/3897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 17, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍, 구현, 수학, 확률론

### 문제 설명

<p>Here is a very simple variation of the game backgammon, named &ldquo;Minimal Backgammon&rdquo;. The game is played by only one player, using only one of the dice and only one checker (the token used by the player).</p>

<p>The game board is a line of (N + 1) squares labeled as 0 (the start) to N (the goal). At the beginning, the checker is placed on the start (square 0). The aim of the game is to bring the checker to the goal (square N). The checker proceeds as many squares as the roll of the dice. The dice generates six integers from 1 to 6 with equal probability.</p>

<p>The checker should not go beyond the goal. If the roll of the dice would bring the checker be- yond the goal, the checker retreats from the goal as many squares as the excess. For example, if the checker is placed at the square (N &minus; 3), the roll &ldquo;5&rdquo; brings the checker to the square (N &minus;2), because the excess beyond the goal is 2. At the next turn, the checker proceeds toward the goal as usual.</p>

<p>Each square, except the start and the goal, may be given one of the following two special instruc- tions.</p>

<ul>
	<li>Lose one turn (labeled &ldquo;L&rdquo; in Figure 2) If the checker stops here, you cannot move the checker in the next turn.</li>
	<li>Go back to the start (labeled &ldquo;B&rdquo; in Fig- ure 2) If the checker stops here, the checker is brought back to the start.</li>
</ul>

<p>Given a game board configuration (the size N, and the placement of the special instructions), you are requested to compute the probability with which the game succeeds within a given number of turns.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3897.%E2%80%85Minimal%E2%80%85Backgammon/82b29f0a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3897.%E2%80%85Minimal%E2%80%85Backgammon/82b29f0a.png" data-original-src="https://www.acmicpc.net/upload/imagesa/figurec1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:502px; opacity:0.9; width:321px" /></p>

<p style="text-align:center">Figure 1: An example game</p>

### 입력

<p>The input consists of multiple datasets, each containing integers in the following format.</p>

<pre>
N T L B
Lose<sub>1</sub>
&middot;&middot;&middot;
Lose<sub>L</sub>
Back<sub>1</sub>
&middot;&middot;&middot;
Back<sub>B</sub>
</pre>

<p>N is the index of the goal, which satisfies 5 &le; N &le; 100. T is the number of turns. You are requested to compute the probability of success within T turns. T satisfies 1 &le; T &le; 100. L is the number of squares marked &quot;Lose one turn&quot;, which satisfies 0 &le; L &le; N &minus; 1. B is the number of squares marked &quot;Go back to the start&quot;, which satisfies 0 &le; B &le; N &minus; 1. They are separated by a space.</p>

<p>Lose<sub>i</sub>&#39;s are the indexes of the squares marked &quot;Lose one turn&quot;, which satisfy 1 &le; Lose<sub>i</sub> &le; N &minus; 1. All Lose<sub>i</sub>&#39;s are distinct, and sorted in ascending order. Back<sub>i</sub>&#39;s are the indexes of the squares marked &quot;Go back to the start&quot;, which satisfy 1 &le; Back<sub>i</sub> &le; N &minus; 1. All Back<sub>i</sub>&#39;s are distinct, and sorted in ascending order. No numbers occur both in Lose<sub>i</sub>&#39;s and Back<sub>i</sub>&#39;s.</p>

<p>The end of the input is indicated by a line containing four zeros separated by a space.</p>

### 출력

<p>For each dataset, you should answer the probability with which the game succeeds within the given number of turns. The output should not contain an error greater than 0.00001.</p>