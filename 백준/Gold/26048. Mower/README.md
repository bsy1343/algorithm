# [Gold I] Mower - 26048

[문제 링크](https://www.acmicpc.net/problem/26048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 26, 맞힌 사람: 24, 정답 비율: 57.143%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>Cimrman&rsquo;s newest lawn mower can juggle 17 ping-pong paddles and it can also play 2 electric glass violins simultaneously.</p>

<p>To get his invention approved internationally, Cimrman has to play a game against the ViceChair of the Patent Office and Cimrman has to win.</p>

<p>The rectangular lawn on the Patent Office field is divided into squares. The lawn is completely unmown. The mower starts at a square selected by the Patent Office and this square is considered to be already mown.</p>

<p>Then players take turns, the first player is Cimrman, the next player is the Vice-Chair. In each turn, the player sends a remote control command to the mower which then moves itself to one of the squares sharing an edge with the last mown square. The mower immediately mows the entire square to which it had been moved and then it awaits a command of the next player&rsquo;s move. In a legal move, a player can send the mower only to one of yet unmown squares. They cannot send the mower either outside the lawn or to any already mown square. The player who cannot make a legal move loses and the other player wins.</p>

### 입력

<p>The input consists of a single line with four space separated numbers W, H, X, Y (1 &le; W, H &le; 10<sup>9</sup>, 1 &le; X &le; W, 1 &le; Y &le; H). These values describe the width and the height of the Patent Office lawn expressed in the number of squares, and the coordinates of the square where the mower starts.</p>

### 출력

<p>Output a single line with either Win if Cimrman can win the game no matter how well it is played by his opponent, or Lose otherwise.</p>