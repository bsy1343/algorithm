# [Silver III] Premier League Table - 34390

[문제 링크](https://www.acmicpc.net/problem/34390)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

구현, 문자열, 자료 구조, 정렬, 집합과 맵, 파싱, 해시를 사용한 집합과 맵

### 문제 설명

<p>The Premier League is the highest level of football (soccer, if you must!) in England and is widely considered the best football league in the world. Most football leagues around the world, including the Premier League, use a point system to determine who wins the league trophy.</p>

<p>Each team receives $3$ points for winning a game, $1$ point for drawing (tie), and $0$ for losing. After $38$ games (also called "fixtures") in a season spanning from August to May, the winner of the league is the team with the most points.</p>

<p>However, if points are tied, it goes to whichever team has the best goal differential (GD) calculated by taking the goals scored (called GF, goals for) minus goals let in (called GA, goals against). Note that goal differential can be a negative number. If neither points nor GD can break the tie, the teams are sorted alphabetically.<sup>1</sup></p>

<p>The Premier League needs your help! The company they hired couldn't figure out how to make the table, so they hired you to create a sorted Premier League table based off of the results of all matches from a season.</p>

<hr>
<p><sup>1</sup>No, they don't use this as the actual tie-breaker</p>

### 입력

<p>The first line of input will be $N$, the number of fixtures to follow. The next $N$ lines will be the scores of each fixture throughout a season in the following format:</p>

<pre>Team_One X-Y Team_Two</pre>

<p>where <code>Team_One</code> is the first team and <code>X</code> is their score for that fixture and <code>Team_Two</code> is the second team and <code>Y</code> is their score for that fixture. Both <code>X</code> and <code>Y</code> are guaranteed to be non-negative numbers.</p>

<p>Input Restrictions</p>

<ul>
	<li>Team names will only have upper- and lower-case letters or underscores. No team names will have any whitespace.</li>
	<li>The minimum amount of goals scored by either team is $0$, while the maximum is $1\,000\,000$.<sup>2</sup></li>
	<li>The minimum number of unique teams given is $2$, while the maximum is $20$ unique teams.</li>
	<li>While a traditional season has $38$ games, the number of games provided in the inputs can be anywhere from $1$ to $10\,000$.</li>
</ul>

<hr>
<p><sup>2</sup>Yes, a million goals scored in one game is physically impossible.</p>

### 출력

<p>The output is a sorted league table with each line representing data from a single team. The data on each line should be space-separated, and should be as follows:</p>

<p>Team name, how many games the team has played (MP), number of wins, number of draws, number of losses, goals for (GF), goals against (GA), goal differential (GD), and points (PTS).</p>

<p>Each team is uniquely identified by their name in the input; there will be no duplicate team names.</p>

<p>Sorting priority (from highest to lowest) is points $\rightarrow$ GD $\rightarrow$ alphabetical. For instance, if two teams both have $70$ points, then the team with the higher GD will appear earlier in the table. If two teams have both the same number of points and the same GD, then the team whose name comes first alphabetically will appear earlier in the table.</p>