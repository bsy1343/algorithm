# [Platinum IV] The King’s Walk - 11629

[문제 링크](https://www.acmicpc.net/problem/11629)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 114, 정답: 32, 맞힌 사람: 25, 정답 비율: 39.683%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Chess is a game in which two sides control pieces in an attempt to capture each other&rsquo;s king. The pieces vary in mobility. At the beginning of a game the kings are rather vulnerable. They are less mobile than most other pieces and they tend to hide behind their pawns. Like in real life, as soon as both queens have left the game it is time for the kings to come into action. Because there is little threat left for the king, he can now move safely around the board. Indeed his mobility seems to be quite strong at this stage making him one of the more dangerous pieces. Your task is to measure the mobility of the king in the endgame.</p>

<p>Consider a chess board of N &times; N squares. The king is the only piece on the board. He starts at a given position and wants to go to another given position in the minimum number of moves. The king can move to any adjacent square in any orthogonal or diagonal direction.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with a single integer N, the size of the board, where 2 &le; N &le; 5,000.</li>
	<li>One line with four space-separated integers X1, Y1, X2, Y2, such that 1 &le; X1, Y1, X2, Y2 &le; N, where (X1, Y1) is the square on which the king starts and (X2, Y2) is the square the king wants to go to (different from his starting position).</li>
</ul>

### 출력

<p>For each test case, output one line with a single integer: the number of ways by which the king can reach the destination square in the minimum number of moves. As this number can be very large, you must reduce your answer modulo 5,318,008.</p>