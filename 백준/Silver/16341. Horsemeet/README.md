# [Silver III] Horsemeet - 16341

[문제 링크](https://www.acmicpc.net/problem/16341)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 205, 정답: 167, 맞힌 사람: 131, 정답 비율: 82.390%

### 분류

애드 혹, 홀짝성

### 문제 설명

<p>Traditional games such as chess or checkers, with slight modifications are also played in Binary Casino. However, not many people play them, as these games are often referred as boring. The visitors are more attracted to more dynamic games which cause adrenaline rushes. To attract players to traditional games, your boss wants to introduce a chess-based game called Horsemeet. The rules of the game are:</p>

<p>The game is played by two players on a 8 &times; 8 chessboard. One player plays a white knight and the other player plays a black knight. The players alternate in moves, the white knight moves first. In each move a knight is moved from its current position to a random valid position. Valid position within the chessboard is a position, which is two tiles away in one coordinate and one tile away in other coordinate from the original position. All moves to a valid position are equally probable. The first knight to move to a tile already occupied by the other knight wins.</p>

<p>In order to check whether this game could be at least partially interesting to visitors you have to determine the probability of victory for knights at given start positions. If the probabilities of victory for both knights differ by less than 10<sup>&minus;6</sup> the outcome of such configuration is a draw.</p>

### 입력

<p>The first line of input contains two integers A and B (1 &le; A, B &le; 8), the start position of the white knight. The second line of each input consists of two integers C and D (1 &le; C, D &le; 8), the start position of the black knight. You can assume both positions are distinct.</p>

### 출력

<p>Output the knight with a higher probability of victory: &ldquo;white&rdquo; or &ldquo;black&rdquo;. In case of equal probabilities output &ldquo;draw&rdquo;.</p>