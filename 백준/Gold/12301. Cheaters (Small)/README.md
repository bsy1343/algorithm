# [Gold III] Cheaters (Small) - 12301

[문제 링크](https://www.acmicpc.net/problem/12301)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 9, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 수학, 확률론

### 문제 설명

<p>You&#39;ve been playing roulette for a while in a local casino. Roulette is a simple casino game in which multiple players place bets on one or more numbers between 0 and 36 (inclusive). Next, a wheel is spun in one direction with a ball spinning in the other direction. The roulette wheel contains the same numbers 0 to 36. Some real roulette wheels also have a space labeled 00, but ours does not. Eventually, the ball falls on one of the numbers. If a player placed a bet on that particular number, he receives 36 times his bet (so the profit of that bet is 35 times the bet). All bets placed on other numbers lose.</p>

<p>Unfortunately, luck hasn&#39;t been on your side, and you have been losing all night long. At one point, you started to wonder whether the roulette game was fair or not, and after observing the game some more, you noticed a pattern that must be profitable for the casino: the ball always lands on one of the numbers that has the least total money bet on it! If multiple numbers tie for the least total money bet, the ball lands on one of those uniformly at random.</p>

<p>Of course, you&#39;ll be notifying the authorities about this foul play, but first you want to win your money back by exploiting your new-found knowledge. To do so, you wait until all other players have placed their bets and then place bets of your own. Unfortunately, you have a limited budget left, so you cannot bet more than that. You are allowed to bet on zero or more different numbers, and each of those bets can be any positive integer amount (perhaps with different amounts for different numbers), so as long as the sum of your bets does not exceed your budget. What is the maximum expected profit you can make?</p>

### 입력

<p>The first line of input gives the number of cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case consists of two lines. The first line contains two integers: the budget you still have, <strong>B</strong>, and the number of numbers other players have placed bets on, <strong>N</strong>. The second line contains <strong>N</strong> integers <strong>X</strong><strong><sub>i</sub></strong>, the total amounts of money bet by other players on each of those different numbers.</p>

<p>Limits</p>

<ul>
	<li>1 &lt;= <strong>T</strong> &lt;= 100.</li>
	<li>1 &lt;= <strong>N</strong> &lt;= 37.</li>
	<li>1 &lt;= <strong>B, X</strong><strong><sub>i</sub></strong> &lt;= 1,000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot; followed by the maximum expected profit that you make if you place your bets optimally. A profit will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup> of the correct answer.</p>

### 힌트

<p>In example 2, bet 1 on each of the 34 empty numbers for a guaranteed payback of 36, and a profit of 36 - 34 = 2. In example 3, bet 1 on each of the 33 empty numbers, so that you win 36 with probability 33/35. The gives an expected profit of 33/35 * 36 - 33.</p>