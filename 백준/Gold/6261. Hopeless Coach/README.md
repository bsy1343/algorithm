# [Gold V] Hopeless Coach - 6261

[문제 링크](https://www.acmicpc.net/problem/6261)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>One of the Premier League (Persian Gulf Cup) teams had very bad results this year. The board is under pressure to fire the coach, but the coach is considered hero by some fans and it is not easy to fire him. The board decides to give him a last chance; they talked to media that they can only support the coach if the team gets at least 11 points in the next 5 matches. The coach wants to know the probability of passing their condition and ask you to help him. You can assume that the probability of having a win/draw/loss in a future match can be determined from the results of the matches the team currently has played. For example, if the team has already played 10 matches and has won three of them, the probability of having a win in any of the next five matches is 30%. The same rule applies to draws or losses.</p>

<p>You also know the team results (a win earns 3 points and a draw earns 1). There are 18 teams in the league and each team play against each of the other teams twice.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two numbers N and P. N is the number of matches and P is the points that are required in the next N games. This is followed by three numbers W, D and L (the number of wins, draws and losses in the previous games). The last line of the input contains two zero numbers.</p>

### 출력

<p>For each test case, you should print the percentage probability of getting at least P points in the next N matches with exactly one digit after decimal point.</p>