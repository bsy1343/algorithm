# [Bronze I] Solitaire - 11323

[문제 링크](https://www.acmicpc.net/problem/11323)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 173, 정답: 112, 맞힌 사람: 101, 정답 비율: 63.522%

### 분류

구현

### 문제 설명

<p>You are playing a game of solitaire on an array of N +1 cells, where each I th cell contains value I. You start with the sum S = 0 at the cell 0 and keep throwing a regular 6-sided die and making the moves to the &quot;right&quot; (towards the Nth cell), adding the value of the cell to S. The game is over when you land on the last (Nth) cell. If you are to land past the last cell, you have to disregard that die throw. For example, if you are on second-to-the-last cell, you have to wait until the die shows 1 to make your last move.</p>

<p>Instead of throwing the die, we provide you with our Almost Random Die Throw Generator<sup>TM</sup>, which is a permutation of the sequence 1,2,3,4,5,6. Concatenate this sequence as many times as you need in order to find out what the next throw is. For example, if the Almost Randomly Die Throw Generated Sequence TM is 2,4,6,1,3,5, after the 6 th throw yields 5, the 7 th will yield 2 again, then 4, then 6 and so on . . .</p>

<p>Your score for the game is the sum at the end of the game. Given N and the Almost Randomly Die Throw Generated Sequence TM, what is your score for this game?</p>

### 입력

<p>The first line of the input file starts with the integer T, the number of games to process (1 &le; T &le; 100). Each case consists of two lines. First one contains the integer N(1 &le; N &le; 1000), as described in the statement. The second line contains the Almost Randomly Die Throw Generated Sequence<sup>TM</sup></p>

### 출력

<p>For each game, output its final score on a line. Again, you must end the game at the last cell.</p>