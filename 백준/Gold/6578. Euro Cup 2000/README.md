# [Gold III] Euro Cup 2000 - 6578

[문제 링크](https://www.acmicpc.net/problem/6578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>As you maybe know, the qualification for the European Soccer Championship 2000 is a tournament where in each group each team plays against each other team twice. Germany is in group 3 together with Turkey, Finland, Moldova and Northern Ireland. 14 games have been played and 6 are still to come. (See <a href="http://www.net-clip.com/soccer/em2000/euro-3.htm">attachment</a>.)</p>

<p>A quick look at the current standings might make you think that Northern Ireland is already out of the race. But that&#39;s wrong! Imagine Northern Ireland wins their three remaining games, Germany plays remis against Turkey and loses against Finland, and Moldova defeats Turkey. Then Northern Ireland is number one!</p>

<p>For those who are not familiar with the scoring model: In each game a team gains 3 points for a victory, 1 point for a remis or 0 points for a loss. After all games have been played, teams are ranked according to points. In case of a tie, the additional tie breakers are: goal difference (i.e. goals scored - goals against), goals scored, and random choice, in that order.</p>

<p>The question your program should answer is:</p>

<p>Regarding all possibilities of how the remaining games could end, what is the highest and lowest possible rank of each team in the group after the tournament is over?</p>

### 입력

<p>The input will consist of one or more test cases. Each test case adheres to the following format:</p>

<ul>
	<li>On the first line there will be one integer <em>n (1 &lt;= n &lt;= 20)</em>, representing the number of teams in the group.</li>
	<li>On the next <em>n</em> lines, the names of the teams will follow. Names are always shorter than 30 characters and do not contain whitespace.</li>
	<li>On the next line, there will be an integer <em>g</em>, representing the number of completed games.</li>
	<li>Finally, <em>g</em> lines will follow, each one describing one completed game in the form <em>team1 team2 goals1 goals2</em>.</li>
	<li>You may further assume that at most 10 games will be remaining and each team has at least one remaining game to play. (This simplifies the problem a little.)</li>
</ul>

<p>Input will be terminated by a value of zero (0) for <em>n</em>.</p>

### 출력

<p>For each test case, first print a line saying &quot;Group #<em>x</em>&quot; where <em>x</em> is the number of the test case (counting from 1).</p>

<p>Then, print one line per team in the order they appear in the input. On each line, print the team&#39;s name, a blank character, its best possible rank, a minus sign and its worst possible rank.</p>

<p>Print a blank line after each test case, even after the last one.</p>