# [Platinum V] Football league - 7050

[문제 링크](https://www.acmicpc.net/problem/7050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>There are n teams in a football league (we assume that n is even). During a season each team plays with every other team exactly once. The season consists of n &minus; 1 turns. Every team plays exactly once during a turn. It is desired for a team to play consecutive matches on different stadia: one at home stadium, and one away, etc. Unfortunately it is not always possible to construct such a game schedule that no team plays twice in a row at home stadium, or twice in a row away. When constructing the schedule the number of such situations should be minimized. (For example, if a team plays once away, then four times at home stadium and then once away, it counts as three such situations.)</p>

<p>Your task is to minimize the number of situations in which a team plays twice in a row at home or away and to construct such game schedule for the whole season. The schedule should consist of n &minus; 1 turns. Each turn consists of n - 1 turns. Each turns consists of n/2 matches - each team plays exactly one match. There are n(n-1)/2 matches in the whole season, and every two teams should play exactly one match against each other. Each match is played at one of the opponents&#39; stadium - one team plays at home stadium and the other one plays away. The total number of situations in which a team plays two consecutive matches at home or away should be minimal.</p>

<p>Write a program, that:</p>

<ul>
	<li>reads the number of teams from the standard input,</li>
	<li>computes the minimum total number of situations in which a team plays twice in a row at home or away and constructs the game schedule,</li>
	<li>writes the result to standard output.</li>
</ul>

### 입력

<p>The first and only line of the standard input contains one even integer n (2 &le; n &le; 1000) the number of teams.</p>

### 출력

<p>The first line of the standard output should contain a single integer - the minimum total number of situations in which a team plays twice in a row at home or away. The following n &minus; 1 lines should contain a game schedule: the line k + 1 should contain the description of the k-th turn.</p>

<p>The description of a turn consists of n different numbers d<sub>1</sub>, d<sub>2</sub>, ..., d<sub>n</sub> from {1, 2, ..., n} separated by single spaces. For i = 1, 2, ..., n/2 the pair d<sub>2i-1</sub>, d<sub>2i</sub> denotes a match between teams d<sub>2i-1</sub> and d<sub>2i</sub>. Team d<sub>2i-1</sub> plays at home and team d<sub>2i</sub> plays away.</p>