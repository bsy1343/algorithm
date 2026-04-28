# [Gold II] nogomet - 3194

[문제 링크](https://www.acmicpc.net/problem/3194)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 18, 맞힌 사람: 16, 정답 비율: 48.485%

### 분류

구현, 정렬

### 문제 설명

<p>We have to create a computer program that will calculate the ranking of football teams after a certain number of matches in the league have been played.&nbsp;</p>

<p>For each played match, the team gets 3 points for a win, 1 point for a draw and 0 points for a loss.&nbsp;</p>

<p>The ranking is determined by the following rules:&nbsp;</p>

<ul>
	<li>teams are sorted descendingly according to the total number of points obtained in all matches,&nbsp;</li>
	<li>if some teams (but not all) have the same number of points, we construct a new league consisting of these teams only. In this league we are take into account only points from the matches played between these teams. Then, inside this new league we apply the same rules for determining the ranking.&nbsp;</li>
	<li>if all of the teams have equal number of points, ranking is calculating in the following way: first we compare goal difference, then the number of goals scored, then the number of wins; if some teams are still equal, team with smaller number will be ranked better. Goal difference, number of goals scored and number of wins are calculated from the all matches of the initial league.&nbsp;</li>
</ul>

<p>Write a program that will determine the ranking of teams in the league.&nbsp;</p>

### 입력

<p>First line of input contains two integers N and K, 1 &le; N &le; 100, 1 &le; K &le; 1000, number of teams and number of played matches. Teams are designated with numbers from 1 to N.&nbsp;</p>

<p>Following K lines contain the description of played matches, in the format &#39;A B C:D&#39;. This means that teams A and B have played their match, and team A scored C goals while team B scored D goals, 0 &le; C, D &le; 9.&nbsp;</p>

### 출력

<p>First and only line of output should contain ranking of the league, from the best team to the worst team.&nbsp;</p>