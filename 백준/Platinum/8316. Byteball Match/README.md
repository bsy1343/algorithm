# [Platinum I] Byteball Match - 8316

[문제 링크](https://www.acmicpc.net/problem/8316)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 15, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>The Bytean national team is taking part in Byteball World Cup. A byteball match lasts 64 minutes; the winner is the team which scores more goals. If both teams score the same number of goals, the match ends in a draw. In a single match each team can score an arbitrary number of goals.</p>

<p>All teams participating in the Cup are divided into two groups. In each group the teams play a round-robin tournament (i.e., each team meets all other teams in turn). The winner in a match receives 2 points, the loser does not receive any points. In case of a draw each of the teams receives 1 point. The winner of the group is the team which scores the highest number of points. If there is more than one team with the maximal number of points in the group, the team with the best goal balance among the drawing teams is placed first (goal balance is the difference between the number of goals scored and goals conceded). If this criterion fails and there is still a draw, the winner of the group is chosen randomly (among the teams with the maximum number of points and best goal balance). The winners of both groups play against each other in the World Cup final.</p>

<p>The Bytean team is the favorite of the World Cup. It has won all of its matches in the group as expected and is sure to qualify for the grand final. Meanwhile the matches in the second group have not finished yet, none of the teams has played all of its matches. The coach of the Bytean team would like to start preparing his team for the final match. Obviously, the tactics will depend on who will be the opponent, therefore the coach would like to know which teams from the second group still have any chances of advancing to the final. As he does not know how to check that, he asked you for help.</p>

### 입력

<p>The first line of the standard input contains two integers n&nbsp;and m&nbsp;(2 &le; n &le; 100, 0 &le; m &le; n(n-2)/2) denoting the number of teams in the second group and the number of matches that have already been played. Each of the following m&nbsp;lines contains four integers a<sub>i</sub>, b<sub>i</sub>, p<sub>i</sub>, q<sub>i</sub>&nbsp;(1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>, 0 &le; p<sub>i</sub>, q<sub>i</sub> &le; 2048), meaning that team a<sub>i</sub>&nbsp;played a match against team b<sub>i</sub>, in which team a<sub>i</sub>&nbsp;scored p<sub>i</sub>&nbsp;goals and team b<sub>i</sub>&nbsp;scored q<sub>i</sub>&nbsp;goals.</p>

### 출력

<p>The first and only line of the standard output should contain an increasing sequence of numbers of teams that still have a chance of winning the second group.</p>