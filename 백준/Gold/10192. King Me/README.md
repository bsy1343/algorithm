# [Gold V] King Me - 10192

[문제 링크](https://www.acmicpc.net/problem/10192)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 20, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

백트래킹, 브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>In addition to Rummikub and other board games, my daughters and I play checkers. First I am teaching them the rules. Then I teach them some strategy and thinking skills. I let them win more than I do to keep it fun, but I show them how they could do better in the next game.</p>

<p>In the game of checkers, you can jump over the opponent checkers diagonally if the next diagonal space is empty. Once you reach the other side of the board, you get &ldquo;kinged&rdquo; and the checker can now move backwards. You can also do multiple jumps going forward or backward. Let&rsquo;s write a program to determine which move you should make &mdash; which move would have the highest number of jumps!</p>

<p>You will be given a checkerboard in the middle of a game. You will be the red player (at the bottom of the board) playing against black (at the top). Find the position of the red Kinged checker (row and column in the matrix) that would have the maximum number of jumps. There will always be at least one jump. No two red kings will tie for equal maximum jumps, but there may be two identical jumps for the same king. Since there are 12 checkers, it is theoretically possible to have a maximum of 12 jumps. However, to get across to the other side of the board, you usually jump several checkers to get &ldquo;kinged.&rdquo; Therefore you might get 3-4 checkers on a really good jump, or maybe 6 checkers on an exceptional move playing against a sub-par opponent!</p>

<p>For example, on the following checkerboard, the K at row 1 and column 3 can jump once down and right, but twice down and left.</p>

<p><img alt="" src="https://upload.acmicpc.net/9863059e-a2ca-439d-8085-437a2dc8e8b7/-/preview/" style="width: 211px; height: 163px; float: right;" /></p>

<pre>
B B
   K
B B B R
       R
  B
 R     R
R B R
 R R R R</pre>

### 입력

<p>The first line contains the number of data set (checkerboards). Each checkerboard has 8 lines of 8 characters each (one of four letters, R, B, K or space)</p>

### 출력

<p>For each board, print out the position of the K checker with the maximum number of jumps.</p>