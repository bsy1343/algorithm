# [Gold II] Painting A Board - 7336

[문제 링크](https://www.acmicpc.net/problem/7336)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>The CE digital company has built an Automatic Painting Machine (APM) to paint a flat board fully covered by adjacent non-overlapping rectangles of different sizes each with a predefined color.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/7336/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-22%20%EC%98%A4%EC%A0%84%2010.42.26.png" style="height:224px; width:225px" /><br />
To color the board, the APM has access to a set of brushes. Each brush has a distinct color C. The APM picks one brush with color C and paints all possible rectangles having predefined color C with the following restrictions:</p>

<p>To avoid leaking the paints and mixing colors, a rectangle can only be painted if all rectangles immediately above it have already been painted. For example rectangle labeled F in Figure 1 is painted only after rectangles C and D are painted. Note that each rectangle must be painted at once, i.e. partial painting of one rectangle is not allowed.</p>

<p>You are to write a program for APM to paint a given board so that the number of brush pick-ups is minimum. Notice that if one brush is picked up more than once, all pick-ups are counted.</p>

### 입력

<p>The first line of the input file contains an integer M which is the number of test cases to solve (1 &le; M &le; 10). For each test case, the first line contains an integer N, the number of rectangles, followed by N lines describing the rectangles. Each rectangle R is specified by 5 integers in one line: the y and x coordinates of the upper left corner&nbsp;of R, the y and x coordinates of the lower right corner of R, followed by the color-code of R.</p>

<p>Note that:</p>

<ol>
	<li>Color-code is an integer in the range of 1 .. 20.</li>
	<li>Upper left corner of the board coordinates is always (0,0).</li>
	<li>Coordinates are in the range of 0 .. 99.</li>
	<li>N is in the range of 1..15.</li>
</ol>

### 출력

<p>One line for each test case showing the minimum number of brush pick-ups.&nbsp;</p>