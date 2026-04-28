# [Bronze V] Football Scoring - 24736

[문제 링크](https://www.acmicpc.net/problem/24736)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6166, 정답: 5045, 맞힌 사람: 4818, 정답 비율: 82.303%

### 분류

수학, 사칙연산

### 문제 설명

<p>There are five ways to score points in american professional football:</p>

<ol>
	<li>Touchdown - 6 points</li>
	<li>Field Goal - 3 points</li>
	<li>Safety - 2 points</li>
	<li>After touchdown
	<ol style="list-style-type:lower-alpha;">
		<li>1 point (Field Goal or Safety) - Typically called the &ldquo;Point after&rdquo;</li>
		<li>2 points (touchdown) - Typically called the &ldquo;Two-point conversion&rdquo;</li>
	</ol>
	</li>
</ol>

<p>(<a href="https://operations.nfl.com/the-rules/nfl-video-rulebook/scoring-plays/">https://operations.nfl.com/the-rules/nfl-video-rulebook/scoring-plays/</a>)</p>

<p>Given the box score values for two competing teams, calculate the point total for each team.</p>

### 입력

<p>There are two lines of input each containing five space-separated non-negative integers, T, F, S, P and C representing the number of Touchdowns, Field goals, Safeties, Points-after-touchdown and two-point Conversions after touchdown respectively. (0 &le; T &le; 10), (0 &le; F &le; 10), (0 &le; S &le; 10), (0 &le; (P+C) &le; T). The first line represents the box score for the visiting team, and the second line represents the box score for the home team.</p>

### 출력

<p>The single output line consists of two space-separated integers showing the visiting score and the home score respectively.</p>