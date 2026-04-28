# [Silver I] Knight - 15242

[문제 링크](https://www.acmicpc.net/problem/15242)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 225, 정답: 185, 맞힌 사람: 173, 정답 비율: 86.935%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 문자열

### 문제 설명

<p>In Chess, the knight is the weirdest of all the pieces. To begin with, the piece is actually a horse without any human riding it. The second reason is its movement pattern. It can move 2 cells forward and one to the side. Below you can see all the possible destinations of a knight.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15242.%E2%80%85Knight/1b8432a3.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15242/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:126px; width:126px" /></p>

<p>With a movement pattern so weird, it is complicated to know what&rsquo;s the shortest path between two board squares. Can you write a program that computes the minimum number of movements needed to move a knight from one square to another? Remember that a chessboard has 8 rows and 8 columns. Also in the standard notation, the columns are represented by letters from a to h.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15242.%E2%80%85Knight/7322e52a.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15242/2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:186px; width:186px" /></p>

### 입력

<p>The input will contain 2 lines. The first line will be the starting position of the knight and the second line will specify its final position.</p>

### 출력

<p>Output a single integer specifying the minimum number of moves for the knight to get from it&rsquo;s starting position to it&rsquo;s final position on the board.</p>