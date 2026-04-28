# [Gold V] Pawn’s Revenge - 18583

[문제 링크](https://www.acmicpc.net/problem/18583)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 31, 맞힌 사람: 27, 정답 비율: 57.447%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are playing a special chess game against a professor and you&rsquo;ve almost lost: the only piece you have left is a king. The professor just left the room to take a call, so you decided to cheat a little bit and put some extra pawns on the board so that each of opponent&rsquo;s pieces is under attack. As a reminder, a pawn attacks the two diagonally adjacent squares to the upper-left and upper-right of itself and a king attacks the eight adjacent squares (including the diagonally adjacent ones). You cannot put one piece on top of another piece. What is the smallest number of pawns you need to accomplish this task?</p>

### 입력

<p>The first row contains N, the dimension of the board, with 8 &le; N &le; 1000. The game is played on an N by N chessboard. The next N lines have N symbols each describing the board. The symbol - means that the square is empty, * denotes a professor&rsquo;s piece and K denotes your king. Your pawns move upward (i.e. towards rows that appear earlier in the input).</p>

### 출력

<p>Output a line containing one number, the smallest number of pawns needed to attack all of the professor&rsquo;s chess pieces, or &minus;1 if it is impossible to do so.</p>