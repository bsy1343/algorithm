# [Gold II] Pushing Boxes - 6316

[문제 링크](https://www.acmicpc.net/problem/6316)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 29, 맞힌 사람: 28, 정답 비율: 38.889%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Imagine you are standing inside a two-dimensional maze composed of square cells which may or may not be filled with rock. You can move north, south, east or west one cell at a step. These moves are called walks.</p>

<p>One of the empty cells contains a box which can be moved to an adjacent free cell by standing next to the box and then moving in the direction of the box. Such a move is called a push. The box cannot be moved in any other way than by pushing, which means that if you push it into a corner you can never get it out of the corner again.</p>

<p>One of the empty cells is marked as the target cell. Your job is to bring the box to the target cell by a sequence of walks and pushes. As the box is very heavy, you would like to minimize the number of pushes. Can you write a program that will work out the best such sequence?</p>

<p style="text-align:center"><img alt="" src="/upload/images2/push.png" style="height:214px; width:448px" /></p>

### 입력

<p>The input file contains the descriptions of several mazes. Each maze description starts with a line containing two integers r and c (both &le; 20) representing the number of rows and columns of the maze.</p>

<p>Following this are r lines each containing c characters. Each character describes one cell of the maze. A cell full of rock is indicated by a &lsquo;#&rsquo; and an empty cell is represented by a &lsquo;.&rsquo;. Your starting position is symbolized by &lsquo;S&rsquo;, the starting position of the box by &lsquo;B&rsquo; and the target cell by &lsquo;T&rsquo;.</p>

<p>Input is terminated by two zeroes for r and c.</p>

### 출력

<p>For each maze in the input, first print the number of the maze, as shown in the sample output. Then, if it is impossible to bring the box to the target cell, print &ldquo;Impossible.&rdquo;.</p>

<p>Otherwise, output a sequence that minimizes the number of pushes. If there is more than one such sequence, choose the one that minimizes the number of total moves (walks and pushes). If there is still more than one such sequence, any one is acceptable.</p>

<p>Print the sequence as a string of the characters N, S, E, W, n, s, e and w where uppercase letters stand for pushes, lowercase letters stand for walks and the different letters stand for the directions north, south, east and west.</p>

<p>Output a single blank line after each test case.</p>