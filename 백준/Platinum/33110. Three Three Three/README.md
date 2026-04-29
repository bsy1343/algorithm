# [Platinum IV] Three Three Three - 33110

[문제 링크](https://www.acmicpc.net/problem/33110)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

게임 이론, 수학, 정수론

### 문제 설명

<p>Two players, <em>Anda</em> and <em>Kamu</em>, want to play a game. Initially, there is an integer $N$ that consists of only <strong>non-zero</strong> digits. Anda and Kamu will take turns alternatingly starting with Anda.</p>

<p>During one turn, the player of that turn must do the following procedure: First, choose three consecutive digits in $N$ such that if the digits are considered as a three-digit integer, it must be divisible by $3$. Then, erase the middle digit of the chosen digits and concatenate the rest, so the number of digits in $N$ decreases by one.</p>

<p>If there is no valid move for the player of that turn, then the player loses. Assuming both players are playing optimally, determine the winner of the game.</p>

### 입력

<p>This problem is a multi-case problem. The first line consists of an integer $T$ ($1 ≤ T ≤ 100$) which represents the number of test cases.</p>

<p>Each test case consists of an integer $N$ ($1 ≤ N &lt; 10^{100\, 000}$) in a single line. The integer $N$ consists of only non-zero digits.</p>

<p>The sum of the number of digits of $N$ across all test cases does not exceed $100\, 000$.</p>

### 출력

<p>For each test case, output a single string in a single line representing the winner of the game if both players play optimally. If Anda, the first player, wins the game, output <code>Anda</code>. Otherwise, output <code>Kamu</code>.</p>