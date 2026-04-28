# [Platinum V] Triangle War - 9189

[문제 링크](https://www.acmicpc.net/problem/9189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 19, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍, 게임 이론, 구현

### 문제 설명

<p>Triangle War is a two-player game played on the following triangular grid:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9189.%E2%80%85Triangle%E2%80%85War/5356b342.jpg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9189/1085_1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:227px" /></p>

<p>Two players, A and B, take turns filling in any dotted line connecting two dots, with A starting first. Once a line is filled, it cannot be filled again. If the line filled by a player completes one or more triangles, she owns the completed triangles and she is awarded another turn (i.e. the opponent skips a turn). For example, if A fills in the line between 2 and 5 in the partial game on the left below:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9189.%E2%80%85Triangle%E2%80%85War/f7ed7590.jpg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9189/1085_2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:597px" /></p>

<p>Then, she owns the triangle labelled A and takes another turn to fill in the line between 3 and 5. B can now own 3 triangles (if he wishes) by filling in the line between 2 and 3, then the one between 5 and 6, and finally the one between 6 and 9. B would then make one more move before it is A&#39;s turn again.</p>

<p>The game ends after all dotted lines are filled in, and the player with the most triangles wins the game. The difference in the number of triangles owned by the two players is not important.</p>

<p>In this problem, you are given a number of moves that have already been made. From the partial game, you should determine which player will win assuming that each player plays a perfect game from that point on. That is, assume that each player always chooses the play that leads to the best possible outcome for himself/herself.</p>

### 입력

<p>You will be given a number of games in the input. The first line of input is a positive integer indicating the number of games to follow. Each game starts with an integer 6 &le; m &le; 18 indicating the number of moves that have been made in the game. The next m lines indicate the moves made by the two players in order, each of the form i j indicating that the line between i and j is filled in that move (with i &lt; j) You may assume that all given moves are legal.</p>

### 출력

<p>For each game, print the game number and the result on one line as shown below. If A wins, print the sentence &quot;A wins.&quot; If B wins, print &quot;B wins.&quot;</p>