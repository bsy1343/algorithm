# [Silver IV] Ducks and Sharks - 33241

[문제 링크](https://www.acmicpc.net/problem/33241)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 117, 정답: 46, 맞힌 사람: 32, 정답 비율: 32.000%

### 분류

문자열, 자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The Ducks and the Sharks have had many adventures in the past year. Because the weather has been so nice lately, they want to organise a water polo tournament. After forming the teams, every team plays one match against every other team. Being caught up in the fun of playing the matches, they don't feel like figuring out who won, so they turn to you for help.</p>

<p>You receive a list of matches and the number of goals made by both teams in a match. For each match, the winner gets 3 points, the loser gets 0 points, and in case of a draw both teams get 1 point. It is your job to figure out which teams got the most points, and provide a top five of the best teams.</p>

### 입력

<ul>
	<li>One line with one integer: $2 \leq n \leq 400$, the number of teams.</li>
	<li>$\frac{n \cdot (n - 1)}2$ lines (one for each match), containing the names of the two teams and the number of goals both teams made during that match (all separated by one space).
	<ul>
		<li>The name of each team consists of at most 20 characters from the English alphabet (<code>A-Z</code> and <code>a-z</code>).</li>
		<li>The scores are between $0$ and $100$ (inclusive).</li>
	</ul>
	</li>
</ul>

<p>Note that every team plays exactly once against every other team.</p>

### 출력

<p>The names of the <em>top five teams</em> in the water polo competition, followed by their total obtained score. Each team name should be written on a separate line. Each team name and score should be separated by exactly one space. Note:</p>

<ul>
	<li>If there are less than five teams participating, simply list all participants (see example 1).</li>
	<li>If there are two teams with the same score, order them alphabetically (see example 2).</li>
</ul>