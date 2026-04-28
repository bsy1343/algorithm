# [Platinum V] Xortris - 11215

[문제 링크](https://www.acmicpc.net/problem/11215)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 41, 정답: 13, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

애드 혹, 많은 조건 분기, 해 구성하기, 그리디 알고리즘

### 문제 설명

<p>It is 1990 and you are in the development team of a video game that is going to revolutionize the future of arcades. The player is given a rectangular board with some white and black squares. The goal is to turn the whole board white. At each turn, the player may choose a tetromino from an infinite supply, move and rotate it within the limits of the board, and toggle the colour of the four squares covered by the tetromino. A tetromino is a connected set of 4 squares (see Figure D.1).</p>

<p>Unfortunately, the testing team has been complaining about some levels being impossible to solve. You know that testers are skilled enough to place a piece in any position and rotation needed, so the problem may be somewhere else. Your next debugging step is to write a program that checks whether a level is solvable.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11215/1.png" style="height:107px; width:320px" /></p>

<p style="text-align:center">Figure D.1: All tetrominoes. <a href="https://commons.wikimedia.org/wiki/File:Tetrominoes_IJLO_STZ_Worlds.svg">From Wikimedia</a>.</p>

### 입력

<p>The first line contains two integers m and n (1 &le; m, n &le; 100), the dimensions of the board. m lines with n characters each follow. The character &lsquo;.&rsquo; represents a white square, and the character &lsquo;X&rsquo; represents a black square.</p>

### 출력

<p>One line with the word &ldquo;possible&rdquo; if the level is solvable and &ldquo;impossible&rdquo; if it is not.</p>