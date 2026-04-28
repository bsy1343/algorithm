# [Gold IV] Game - 3731

[문제 링크](https://www.acmicpc.net/problem/3731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 91, 정답: 17, 맞힌 사람: 15, 정답 비율: 19.737%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Bill is fond of computer games. He likes to analyze games and to provide efficient solutions. Now, he is studying the following game. The game starts with a n x n matrix filled with positive integers. When it is her/his turn, a player can delete the last row or the last column of the matrix, if the sum of the numbers in that row/column is even. If a player cannot delete the last row or the last column on his turn, then he loses the game. Bill thinks that this game can be classified as first player wins (W) or first player loses (L). First player wins means that the first player has a strategy to win, no matter how the second player plays the game. First player loses means that no matter what the first player does the second player has a strategy to win.</p>

<p>Bill is also a skilled programmer. He wants to write a program to classify the game quickly. Can you help him?</p>

### 입력

<p>The program input is from a text file. Each data set in the file stands for a particular game. A data set starts with the number n (n &le; 1000), the matrix dimension, followed by the positive integers in the matrix. The program has to print W if the first player wins the game, or L if the first player loses the game.</p>

<p>White spaces can occur freely in the input. The input data are correct and terminate with an end of file.</p>

### 출력

<p>For each set of data the program prints the result to the standard output from the beginning of the line.</p>