# [Silver V] Treasure Hunt - 15437

[문제 링크](https://www.acmicpc.net/problem/15437)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 60, 맞힌 사람: 48, 정답 비율: 53.933%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Jill has created a new smartphone game that leads players to find a treasure. The app uses the phone&#39;s GPS to determine the player&#39;s location. The app then tells the player the direction in which to go on a route to find the treasure. When the player reaches some specific location, the app rewards the player with a (virtual) treasure.</p>

<p>Can you help the player determine how long it will take to find the treasure?</p>

### 입력

<p>The first line of input contains two integers&nbsp;<em>R</em>&nbsp;and&nbsp;<em>C</em>, each between 1 and 200, inclusive. These integers define the number of rows and columns in the playing area, respectively. The next&nbsp;<em>R</em>&nbsp;lines of input describe the playing area. Each line contains exactly&nbsp;<em>C</em>&nbsp;letters, and each letter defines the action to take in each location in the playing area. There are five possible letters:&nbsp;<code>N</code>&nbsp;indicates a move to the previous row,&nbsp;<code>S</code>&nbsp;indicates a move to the next row,&nbsp;<code>W</code>&nbsp;indicates a move to the previous column,&nbsp;<code>E</code>indicates a move to the next column, and&nbsp;<code>T</code>&nbsp;indicates the location of the treasure. Exactly one location contains the treasure.</p>

### 출력

<p>The player begins playing at the location in the first column of the first row. The player follows the directions at each location. If the player eventually reaches the treasure by following the directions, output a line containing an integer, the number of moves required to reach the treasure. If the directions cause the player to leave the playing area, output a line containing the word&nbsp;<code>Out</code>. If the directions cause the player to stay in the playing area but never reach the treasure, output a line containing the word&nbsp;<code>Lost</code>.</p>