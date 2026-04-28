# [Platinum IV] Triangle War - 4133

[문제 링크](https://www.acmicpc.net/problem/4133)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 22, 맞힌 사람: 19, 정답 비율: 54.286%

### 분류

비트마스킹, 다이나믹 프로그래밍, 게임 이론, 구현, 수학

### 문제 설명

<p>Triangle War is a two-player game played on the following triangular grid:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4133.%E2%80%85Triangle%E2%80%85War/57ed62ff.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4133.%E2%80%85Triangle%E2%80%85War/57ed62ff.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4133/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:140px; width:170px" /></p>

<p>Two players, A and B, take turns filling in any dotted line connecting two dots, with A starting first. Once a line is filled, it cannot be filled again. If the line filled by a player completes one or more triangles, she owns the completed triangles and she is awarded another turn (i.e. the opponent skips a turn). The game ends after all dotted lines are filled in, and the player with the most triangles wins the game. The difference in the number of triangles owned by the two players is not important.</p>

<p>For example, if A fills in the line between 2 and 5 in the partial game on the left below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4133.%E2%80%85Triangle%E2%80%85War/3dbe6287.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4133.%E2%80%85Triangle%E2%80%85War/3dbe6287.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4133/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:144px; width:398px" /></p>

<p>Then, she owns the triangle labelled A and takes another turn to fill in the line between 3 and 5. B can now own 3 triangles (if he wishes) by filling in the line between 2 and 3, then the one between 5 and 6, and finally the one between 6 and 9. B would then make one more move before it is A&#39;s turn again. In this problem, you are given a number of moves that have already been made. From the partial game, you should determine which player will win assuming that each player plays a perfect game from that point on. That is, assume that each player always chooses the play that leads to the best possible outcome for himself/herself.</p>

### 입력

<p>You will be given a number of games in the input. The first line of input is a positive integer indicating the number of games to follow. Each game starts with an integer 6 &le; m &le; 18 indicating the number of moves that have been made in the game. The next m lines indicate the moves made by the two players in order, each of the form i j (with i &lt; j) indicating that the line between i and j is filled in that move. You may assume that all given moves are legal.</p>

### 출력

<p>For each game, print the game number and the result on one line as shown below. If A wins, print the sentence &quot;A wins.&quot; If B wins, print &quot;B wins.&quot;</p>