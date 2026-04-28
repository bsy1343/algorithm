# [Gold I] Game, Set and Match - 3839

[문제 링크](https://www.acmicpc.net/problem/3839)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>In this problem you need to assist in computing the probability of winning at tennis. Here is a brief explanation of how the scoring system works. In a tennis match, players play a certain number of consecutive sets. Each set is in turn made up of a series of games (and may include a tie-break if needed). Finally each game is made of points.</p>

<p><strong>Points.</strong> Every point is started by one of the players serving (i.e. hitting the ball into the service box in the opposite court) and the other receiving serve. The server then attempts to return the ball into the server&rsquo;s court and players alternate hitting the ball across the net. When one of the players fails to make a legal return (e.g. if the ball is knocked out of the court), he or she loses the point. The specifics of how points are won are not important to us.</p>

<p><strong>Games.</strong> The scoring system within a game is peculiar to say the least. As the player wins points in a game, his score goes from the initial value of 0 (read &ldquo;love&rdquo;) to 15, 30, or 40 (yes, just when you think you&rsquo;re starting to spot a pattern in this mess it breaks down). There is no a-priori limit to the length of a game (meaning the number of points played), but a player&rsquo;s score is always indicated by one of these numbers according to the following rules. When a player has three points (score 40) and wins the following point as well, he wins the game unless the scoreline was 40 &minus; 40 (read &ldquo;deuce&rdquo;) to start with. A player needs to win two consecutive points from deuce to win the game. Winning one gives him advantage; if followed by a second winning point the game is won by him, but if followed by a losing point the score reverts to deuce.</p>

<p>Example: at 40 &minus; 30, if the first player wins the next point he wins the game. However, if the second player wins the next three points the game is his.</p>

<p><strong>Sets.</strong> A player wins a set if he wins at least six games (in the current set) and he is two games ahead of his opponent but, as you may be starting to suspect, there is yet another exception. In case the scoreline for the number of games won reaches six-all (6 &minus; 6), a tie-break is played instead to decide the set. Example: at 5 &minus; 4, if the first player wins the next game he takes the set 6 &minus; 4. But if he loses, the set is still undecided and can eventually go to either 7 &minus; 5, 5 &minus; 7 or a tie-break.</p>

<p><strong>Tie-break.</strong> A tie-break (and the set to which it belongs) is won when a player wins at least seven points by a margin of two points or more.</p>

<p><strong>Match.</strong> The winner of a match is the first player to win 2 sets (the wins do not need to be consecutive). Hence a match may go to 2 or 3 sets depending on how the game develops.</p>

<p>Rafa has been carefully studying his past performances against his next opponent and he knows he wins each point with probability precisely p, irrespective of whether he is serving or receiving and regardless of all other points played. Can you help him assess his chances of winning the match?</p>

### 입력

<p>Each test case is described by a single floating point number p, 0 &le; p &le; 1 in its own line. A value of &minus;1 for p marks the end of the input.</p>

### 출력

<p>For each test case, print a single line with the probabilities of Rafa winning a given game, set and match, respectively. These three numbers must be separated by a space character. Your answers should be accurate to within an absolute error of 10<sup>&minus;6</sup>.</p>