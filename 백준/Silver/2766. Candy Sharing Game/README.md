# [Silver IV] Candy Sharing Game - 2766

[문제 링크](https://www.acmicpc.net/problem/2766)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 132, 정답: 104, 맞힌 사람: 87, 정답 비율: 79.091%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A number of students sit in a circle facing their teacher in the center. Each student initially has an even number of pieces of candy. When the teacher blows a whistle, each student simultaneously gives half of his or her candy to the neighbor on the right. Any student, who ends up with an odd number of pieces of candy, is given another piece by the teacher. The game ends when all students have the same number of pieces of candy.</p>

<p>Write a program which determines the number of times the teacher blows the whistle and the final number of pieces of candy for each student from the amount of candy each child starts with.</p>

### 입력

<p>The input may describe more than one game. For each game, the input begins with the number N of students, followed by N (even) candy counts for the children counter-clockwise around the circle. The input ends with a student count of 0. Each input number is on a line by itself.</p>

### 출력

<p>For each game, output the number of rounds of the game followed by the amount of candy each child ends up with, both on one line.</p>

### 힌트

<p>The game ends in a finite number of steps because:</p>

<ol>
	<li>The maximum candy count can never increase.</li>
	<li>The minimum candy count can never decrease.</li>
	<li>No one with more than the minimum amount will ever decrease to the minimum.</li>
	<li>If the maximum and minimum candy count are not the same, at least one student with the minimum amount must have their count increase</li>
</ol>