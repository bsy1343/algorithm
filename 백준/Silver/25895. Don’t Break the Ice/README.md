# [Silver V] Don’t Break the Ice - 25895

[문제 링크](https://www.acmicpc.net/problem/25895)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 63, 맞힌 사람: 47, 정답 비율: 77.049%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Mr. Pennybags is enthralled with his new board game which involves knocking out tiny plastic ice blocks from a square grid. Pennybags was never very good at games and would like to practice his breaking strategies without having to reset the board. He has asked Unified Coders For Games (UCF Games) to develop such a tool. Pennybags wants a program to take in the description of a board and a sequence of moves and determine the number of invalid moves.</p>

<p>Given the dimensions (number of rows and columns) of a square game board and a list of moves, determine the number of attempted moves that would knock out an ice block that is no longer in the board. Note that when an ice block is knocked out, other blocks may fall out of the board as well. More specifically, an ice block will fall unless it is in a complete row (the row contains all its ice blocks) or it is in a complete column (the column contains all its ice blocks). Note also that if the fall of block B<sub>1</sub> results in the fall of block B<sub>2</sub>, then other blocks may fall as a result of block B<sub>2</sub> falling.</p>

### 입력

<p>The first input line contains a positive integer, t, indicating the number of game boards. This is followed by the data for each game. The first input line for each game contains two integers (separated by a space): the dimensions (length and width) of a square game board (between 1 and 50 inclusive) and the number of attempted moves in Pennybags&rsquo; strategy (between 1 and 100 inclusive). This is followed by the row and column (separated by a space) for each attempted move, one move per line. Assume that the input values are valid, e.g., the row/column for an attempted move will always be a cell of the game board.</p>

### 출력

<p>For each game board, output &ldquo;Strategy #b: i&rdquo; where b is the game board number (starting with 1), and i is the number of invalid moves. Leave a blank line after the output for each game board.</p>

### 힌트

<p>In Game #1, &ldquo;4 2&rdquo; and the second &ldquo;1 1&rdquo; are invalid. In Game #2, &ldquo;1 4&rdquo; is invalid.</p>