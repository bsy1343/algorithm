# [Platinum III] Rush Hour Puzzle - 18139

[문제 링크](https://www.acmicpc.net/problem/18139)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 431, 정답: 172, 맞힌 사람: 74, 정답 비율: 38.947%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p><strong>Rush Hour</strong> is a puzzle game invented by Nob Yoshigahara in the 1970s. It is now being manufactured by <strong>ThinkFun</strong>. The board is a 6 &times; 6 grid with grooves in the tiles to allow vehicles to slide. Cars and trucks are both one square wide, but cars are two squares long and trucks are three squares long. Vehicles can only be moved forward or backward along a straight line on the grid. The goal of the game is to get the only red car totally out through the exit of the board by moving the other vehicles out of its way. Figure 1 gives an example of Rush Hour puzzle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18139.%E2%80%85Rush%E2%80%85Hour%E2%80%85Puzzle/f6add0cf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18139.%E2%80%85Rush%E2%80%85Hour%E2%80%85Puzzle/f6add0cf.png" data-original-src="https://upload.acmicpc.net/36b0f821-a26e-4cac-9840-f18bd73540da/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 291px;" /></p>

<p style="text-align: center;">Figure 1: An example of Rush Hour puzzle.</p>

<p>We give each vehicle of a puzzle a unique id, numbered from 1 to the number of vehicles, in which the red car&rsquo;s id is 1. The board information of a puzzle is represented by a 6 &times; 6 matrix, named board matrix. Each entry of a board matrix is the id of the vehicle placed on that groove, and the entries are filled with 0 if there exists no vehicle on those grooves. The exit of the board is located at the right end side of the 3rd row. Figure 2 shows the board matrix corresponding to the puzzle in Figure 1.</p>

<p>Moving a piece (car or truck) by one unit (a groove) is called a step. A puzzle is easy if it can be solved (the red car totally out through the exit of the board) in no more than 10 steps. Please write a program to judge whether a puzzle is easy or not.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18139.%E2%80%85Rush%E2%80%85Hour%E2%80%85Puzzle/f81e482c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18139.%E2%80%85Rush%E2%80%85Hour%E2%80%85Puzzle/f81e482c.png" data-original-src="https://upload.acmicpc.net/31f61fa7-662d-4939-909c-31e344616479/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 203px;" /></p>

<p style="text-align: center;">Figure 2: The board matrix corresponding to the puzzle in Figure 1.</p>

### 입력

<p>The input contains 6 lines, each line indicates the content (6 integers separated by a blank) of each row of a board matrix.</p>

### 출력

<p>Output the minimum number of steps for solving the input puzzle if the puzzle is easy, otherwise output -1.</p>

### 제한

<ul>
	<li>There are at most 10 vehicles on the board for each puzzle.</li>
	<li>Only the red car can be moved out of the board for each puzzle.</li>
</ul>