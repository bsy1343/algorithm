# [Platinum II] Robotobor - 19065

[문제 링크](https://www.acmicpc.net/problem/19065)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 21, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>After the great success of Rat-O-Matic robot (see problem &quot;I&quot; if you like long stories), you have been promoted to CEO of Ural branch of Rapid City Dynamics company. Inspired by the local traditions, you have decided to create a very special robot called Robotobor!</p>

<p>Robotobor can move on a rectangular grid which consists of $n \times m$ cells. Some cells are blocked, so the robot cannot visit them. Every second, the robot moves to a cell which shares an edge with the current cell.</p>

<p>The movement of the robot is controlled by a program. The program consists of zero or more lines. Each line is a non-empty string of characters. Each character is one of the following: <code>U</code> (up), <code>D</code> (down), <code>L</code> (left) or <code>R</code> (right). Each character means that the robot must move to the neighboring cell in the respective direction. The program is executed line by line, every line is executed from left to right.</p>

<p>The program is said to be valid if and only if the following conditions hold:</p>

<ul>
	<li>During the program execution, the robot does not visit blocked cells and does not leave the grid.</li>
	<li>The length of each line is at most $100$ characters.</li>
	<li>Every line is a palindrome, that is, it reads the same right to left as left to right (Ural traditions, as wild as they are).</li>
</ul>

<p>You want to find a valid program which moves the robot from the cell $S$ to the cell $F$ and consists of the minimum possible number of lines. Note that it is <strong>not necessary</strong>&nbsp;to minimize the total length of the lines. Can you repeat your previous success?</p>

### 입력

<p>The first line contains integers $n$ and $m$, the number of rows and the number of columns of the grid ($1 \leq n, m \leq 50$).</p>

<p>The next $n$ lines describe the grid. Each of these lines contains $m$ characters. Each symbol is either <code>.</code> (empty cell), <code>#</code> (blocked cell), <code>S</code> (starting cell) or <code>F</code> (target cell). You can assume that starting and target cells are not blocked. It is guaranteed that the grid contains exactly one <code>S</code> and exactly one <code>F</code>.</p>

### 출력

<p>If there is no program which satisfies all conditions, then the only line of the output must contain the number $-1$.</p>

<p>Otherwise, output the program you found. The first line must contain the number of lines $k$ which must be the minimum possible. The next $k$ lines must contain the program itself. If there are several possible answers, output any one of them.</p>