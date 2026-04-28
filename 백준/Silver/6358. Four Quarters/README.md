# [Silver II] Four Quarters - 6358

[문제 링크](https://www.acmicpc.net/problem/6358)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 249, 정답: 92, 맞힌 사람: 73, 정답 비율: 42.197%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Four Quarters is a game of chance played with, well, four quarters. Two people, called A and B, each flip two quarters each round. They each gain or lose points each round based on the following tables:</p>

<p><img alt="" src="/upload/images2/4quater1.png" style="height:85px; width:267px" /></p>

<p>Player A&rsquo;s payoff</p>

<p><img alt="" src="/upload/images2/4quater2.png" style="height:84px; width:266px" /></p>

<p>Player B&rsquo;s payoff</p>

<p>There is no difference between Heads/Tails and Tails/Heads. As you can see, the odds are stacked in Player A&rsquo;s favor. At the beginning of the game, each player has 0 points, and points accumulate as the game progresses. At the end of the game, whichever player has the most points wins.</p>

<p>You must write a program that determines the probability that Player A will win, Player B will win, or they will tie, after a certain number of rounds. Assume that the coins are fair, i.e. that heads and tails are equally likely.</p>

### 입력

<p>There is no input file for this problem.</p>

### 출력

<p>Output a table that lists the probability that Player A will win, B will win, or they will tie, after each round for 1 to 20 rounds. The output for rounds 1 through 3 is given below.</p>

<p>Probabilities must be expressed as a percent, with 4 places after the decimal.</p>