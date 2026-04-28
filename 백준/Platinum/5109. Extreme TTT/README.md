# [Platinum IV] Extreme TTT - 5109

[문제 링크](https://www.acmicpc.net/problem/5109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Tic Tac Toe, (Naughts and Crosses) is a simple pencil and paper game played by children. The idea is that players take turns at drawing their symbol (O or X) in squares on a 3 by 3 grid. The first to get three of their symbols in a row (horizontal, vertical or diagonal) wins the game. If the grid is filled without either player making a line, the game is a draw. Here is a game that the X player has just won.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5109/1.png" style="height:110px; width:140px" /></p>

<p>Unfortunately the game is rather limited. An interesting extension is to make it three dimensional &ndash; using 3 layers of 3 by 3. Real 3D requires some construction &ndash; plastic sets are available commercially. However it is possible to play a 3D game on paper, drawing three 2D grids and imagining them piled above each other. X wins again:</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5109/2.png" style="height:117px; width:402px" /></p>

<p>What about playing in 4, 5 or 6 dimensions? This is the basic idea of the game of Extreme Tic Tac Toe (ETTT), a game played by AI computers. ETTT scoring differs from normal Tic Tac Toe. Rather than stop as soon as one player achieves a line of their symbols, ETTT players play until the grid is full, or until they agree to stop. The winner is the one with the greatest number of lines of symbols. By ETTT rules, X would score 4 and O would score 1 in the following 3D game:</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5109/3.png" style="height:113px; width:388px" /></p>

<p>Your task is to write a program to read N-Dimensional ETTT game grids and work out the scores.</p>

### 입력

<p>The input consists of a series of input ETTT board configurations. Each board configuration starts with a line holding N, the dimension of this game (1 &lt;= N &lt;= 10). End of input is signaled by an N value of zero. That is followed by lines of X&rsquo;s, O&rsquo;x and ~&rsquo;s for the cells of the game (~ represents an empty cell). Each line holds at least one, and no more than 40 symbols. To understand the order in which data is input, imagine the board being held in an N dimensional array. With N = 5, for example, the board could accessed as cell[a,b,c,d,e] or (cell[a][b][c][d][e] if your language doesn&rsquo;t support the nicer syntax). The following pseudo-code would read the data in the correct order (ignoring line breaks).</p>

<pre>
for a = 1 to 3
   for b = 1 to 3
      for c = 1 to 3
         for d = 1 to 3
            for e = 1 to 3
               read cell[a,b,c,d,e]</pre>

### 출력

<p>For each board configuration, output the scores for X and for O as shown in the sample data.</p>