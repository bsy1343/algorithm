# [Platinum IV] Spoiler - 27410

[문제 링크](https://www.acmicpc.net/problem/27410)

### 성능 요약

시간 제한: 0.6 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 10, 맞힌 사람: 6, 정답 비율: 17.143%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍, 기댓값의 선형성, 수학, 확률론

### 문제 설명

<p>John and Charlie are avid Starcraft fans and they love watching match replays. Tonight they are watching a replay of a match between two top players, HerO and Maru. The match is a best-of-N, meaning that the players play game after game until one wins the majority of N games (N is an odd number). If one player reaches a majority before N games, he wins the match immediately (remaining games are not played). For example, a best-of-7 match ends when a player reaches 4 wins, so it may last between 4 games (ending in a 4-0) and 7 games (ending in a 4-3). There are no draws in Starcraft and HerO and Maru have equal chances of winning any given game.</p>

<p>John accidentally peeked at the game list and saw that the match lasted K games. Charlie does not know K. This spoils John&#39;s fun, because he only enjoys watching interesting games, games whose winner he does not know in advance. Furthermore, as soon as John can predict the outcome of an upcoming game, he blurts out &quot;I know who wins the next game&quot; and tells Charlie the value of K.</p>

<p>Given N and K, what is the expected number of interesting games to be watched tonight, from Charlie&#39;s perspective?</p>

### 입력

<p>The input contains a single line with two numbers N and K.</p>

### 출력

<p>The output must contain the answer as an irreducible fraction. Write the numerator on the first line and the denominator on the second line.</p>

### 제한

<ul>
	<li>1 &le; N &lt; 2,000</li>
	<li>N is odd</li>
	<li>(N + 1) / 2 &le; K &le; N</li>
</ul>