# [Platinum V] Rather Perplexing Showdown (Large) - 14356

[문제 링크](https://www.acmicpc.net/problem/14356)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 34, 맞힌 사람: 34, 정답 비율: 64.151%

### 분류

애드 혹, 깊이 우선 탐색, 분할 정복, 그래프 이론, 그래프 탐색, 재귀

### 문제 설명

<p>You&#39;ve been asked to organize a Rock-Paper-Scissors tournament. The tournament will have a single-elimination format and will run for&nbsp;N&nbsp;rounds; 2<sup>N</sup>&nbsp;players will participate.</p>

<p>Initially, the players will be lined up from left to right in some order that you specify. In each round, the first and second players in the lineup (starting from the left) will play a match against each other, and the third and fourth players in the lineup (if they exist) will play a match against each other, and so on; all of these matches will occur simultaneously. The winners of these matches will remain in the lineup, in the same relative order, and the losers will leave the lineup and go home. Then a new round will begin. This will continue until only one player remains in the lineup; that player will be declared the winner.</p>

<p>In each Rock-Paper-Scissors match, each of the two players secretly chooses one of&nbsp;Rock,&nbsp;Paper, or&nbsp;Scissors, and then they compare their choices. Rock beats Scissors, Scissors beats Paper, and Paper beats Rock. If one player&#39;s choice beats the other players&#39;s choice, then that player wins and the match is over. However, if the players make the same choice, then it is a tie, and they must choose again and keep playing until there is a winner.</p>

<p>You know that the players this year are stubborn and not very strategic. Each one has a&nbsp;preferred move&nbsp;and will only play that move in every match, regardless of what the opponent does. Because of this, if two players with the same move go up against each other, they will keep tying and their match will go on forever! If this happens, the tournament will never end and you will be a laughingstock.</p>

<p>This year, there are&nbsp;R&nbsp;players who prefer Rock,&nbsp;P&nbsp;players who prefer Paper, and&nbsp;S&nbsp;players who prefer Scissors. Knowing this, you want to create a lineup that guarantees that the tournament will go to completion and produce a single winner &mdash; that is, no match will ever be a tie. Your boss has asked you to produce a list of all such lineups (written in left to right order, with&nbsp;<code>R</code>,&nbsp;<code>P</code>, and&nbsp;<code>S</code>&nbsp;standing for players who prefer Rock, Paper, and Scissors, respectively), and then put that list in alphabetical order.</p>

<p>You know that the boss will lazily pick the first lineup on the list; what will that be? Or do you have to tell your boss that it is&nbsp;<code>IMPOSSIBLE</code>&nbsp;to prevent a tie?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;lines follow; each represents one test case. Each test case consists of four integers:&nbsp;N,&nbsp;R,&nbsp;P, and&nbsp;S, as described in the statement above.</p>

<p>Limits</p>

<ul>
	<li>R&nbsp;+&nbsp;P&nbsp;+&nbsp;S&nbsp;= 2<sup>N</sup>.</li>
	<li>0 &le;&nbsp;R&nbsp;&le; 2<sup>N</sup>.</li>
	<li>0 &le;&nbsp;P&nbsp;&le; 2<sup>N</sup>.</li>
	<li>0 &le;&nbsp;S&nbsp;&le; 2<sup>N</sup>.</li>
	<li>1 &le;&nbsp;T&nbsp;&le; 75.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 12.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is either&nbsp;<code>IMPOSSIBLE</code>&nbsp;or a string of length 2<sup>N</sup>&nbsp;representing the alphabetically earliest starting lineup that solves the problem. Every character in a lineup must be&nbsp;<code>R</code>,&nbsp;<code>P</code>, or&nbsp;<code>S</code>, and there must be&nbsp;R&nbsp;<code>R</code>s,&nbsp;P&nbsp;<code>P</code>s, and&nbsp;S&nbsp;<code>S</code>s.</p>

### 힌트

<p>In sample case #1, there are only two players and the tournament will consist of one round. It doesn&#39;t matter what order the two line up in; the Paper-using player will defeat the Rock-using player. You will give your boss the alphabetically ordered list&nbsp;<code>PR</code>,&nbsp;<code>RP</code>, and the first element is&nbsp;<code>PR</code>.</p>

<p>In sample case #2, the only two players both play Rock, so a tie is unavoidable.</p>

<p>In sample case #3, there are four players and the tournament will go on for two rounds. In the first round, the first player (Paper) will lose to the second player (Scissors), and the third player (Rock) will defeat the fourth player (Scissors). The second round lineup will be&nbsp;<code>PR</code>, and the first remaining player (Paper) will defeat the other remaining player (Rock), so the tournament will end with a winner and no ties.</p>

<p>Here is an illustration of the tournament for sample case #3:</p>

<p><img src="https://onlinejudgeimages.s3.amazonaws.com/problem/14355/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%20(2).png" /></p>

<p>Other lineups such as&nbsp;<code>PSSR</code>&nbsp;will appear on the list you give to your boss, but&nbsp;<code>PSRS</code>&nbsp;is alphabetically first.</p>

<p>In sample case #4, the only way to organize the first round such that there are no ties is to create two matches with one Rock player and one Scissors player. But both of those matches will have a Rock winner, and when these two winners go on to face each other, there will be a tie.</p>