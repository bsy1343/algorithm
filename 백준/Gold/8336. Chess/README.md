# [Gold II] Chess - 8336

[문제 링크](https://www.acmicpc.net/problem/8336)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 23, 맞힌 사람: 18, 정답 비율: 33.333%

### 분류

임의 정밀도 / 큰 수 연산, 조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Byteman knocked at Byteguy&#39;s door at exactly 5 pm. This was not necessary, though, as Byteguy had known his punctuality well and was about to open the door.</p>

<p>After drinking a cup of warm tea, Byteguy brought a chessboard to play a chess game, as they had planned, but Byteman said that perfect information games are not challenging enough and it might be a good idea to do something else. Being unable to come up with sufficient arguments, Byteguy had to agree. Finding an intellectual challenge, which they had never tried, took them some time, but after a while friends decided to solve the following problem.</p>

<p>You are given a n&nbsp;&times; n&nbsp;chessboard. Compute the number of ways in which you can put n&nbsp;rooks on it in such a way, that in each column and in each row there is at most one rook. Moreover, the arrangement of rooks should look exactly the same after rotating the chessboard by 90&deg;&nbsp;(in horizontal plane).</p>

<p>The colouring of chessboard fields can change after the rotation, but it does not matter here.</p>

### 입력

<p>The first and only line of the standard input contains a single integer n&nbsp;(1 &le; n &le; 50,000).</p>

### 출력

<p>Your program should write to the standard output a single line containing one integer - the number of different arrangements of n&nbsp;rooks on a n&nbsp;&times; n&nbsp;chessboard, in which there is at most one rook in every row and every column and the arrangement does not change after rotating the chessboard by&nbsp;90&deg;.</p>