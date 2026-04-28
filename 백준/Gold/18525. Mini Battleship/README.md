# [Gold IV] Mini Battleship - 18525

[문제 링크](https://www.acmicpc.net/problem/18525)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 30, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>Battleship is a game played by two players. Each player has their own grid, which is hidden from their opponent. Each player secretly places some ships on their grid. Each ship covers a horizontal or vertical straight line of one or more continguous squares. Ships cannot overlap. All ships are considered distinct, even if they have the same size.</p>

<p>After placing their ships, the players then take turns taking shots at their opponent&rsquo;s ships by calling out a coordinate of their opponent&rsquo;s grid. The opponent must honestly say whether the shot was a hit or a miss. When all of a ship&rsquo;s squares are hit, that ship sinks (&ldquo;You sunk my battleship!!&rdquo;). A player loses when all of their ships are sunk.</p>

<p>Bob is playing a game of Mini Battleship against Alice. Regular Battleship is played on a 10&times;10 grid with 5 ships. Mini Battleship is much smaller, with a grid no larger than 5&times;5 and possibly fewer than 5 ships.</p>

<p>Bob wonders how many ship placements are possible on Alice&rsquo;s board given what he knows so far. The answer will be 0 if Alice is cheating! (Or, if the game setup isn&rsquo;t possible.)</p>

### 입력

<p>The first line of input contains two space-separated integers n (1 &le; n &le; 5) and k (1 &le; k &le; 5), which represent a game of Mini Battleship played on an n&times;n grid with k ships.</p>

<p>Each of the next n lines contains a string s (|s| = n). This is what Bob sees of Alice&rsquo;s grid so far.</p>

<ul>
	<li>A character &lsquo;X&rsquo; represents one of Bob&rsquo;s shots that missed.</li>
	<li>A character &lsquo;O&rsquo; (Letter O, not zero) represents one of Bob&rsquo;s shots that hit.</li>
	<li>A Dot (&lsquo;.&rsquo;) represents a square where Bob has not yet taken a shot.</li>
</ul>

<p>Each of the next k lines contains a single integer x (1 &le; x &le; n). These are the sizes of the ships.</p>

### 출력

<p>Output a single integer, which is the number of ways the k distinct ships could be placed on Alice&rsquo;s grid and be consistent with what Bob sees.</p>