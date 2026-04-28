# [Gold III] Editor Distance - 6775

[문제 링크](https://www.acmicpc.net/problem/6775)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are using an editor to type in a program that you hope solves another problem on this contest. Instead of thinking about solving this problem, you look at your editor and start to think of how to edit your program more quickly.</p>

<p>Your editor has the following characteristics:</p>

<ul>
	<li>you can move your cursor using the direction keys: up (&uarr;), down (&darr;) , left (&larr;) or right (&rarr;)</li>
	<li>pressing &rarr; will move the cursor one character to the right; if the cursor is on the rightmost character of a line, the cursor will move to the first character of the next line below the current line; (the cursor will not move if it is in the bottom-right position)</li>
	<li>pressing &larr; will move the cursor one character to the left; if the cursor is on the leftmost character of a line, the cursor will move to the last character of the previous line above the current line; (the cursor will not move if it is in the top-left position) &bull; pressing &uarr; will move the cursor to the character immediately above it; if there is no character immediately above the cursor, it will move to the last character of the previous line above the current line; (the cursor will not move if it is on the first line)</li>
	<li>pressing &darr; will move the cursor to the character immediately below it; if there is no character immediately below the cursor, it will move to the last character of the next line below the current line; (the cursor will not move if it is on the last line)</li>
</ul>

<p>You would like to find the least number of key presses that will cause you to move between positions in your editor in a given program which you are editing.</p>

### 입력

<p>The first line of input is N, the number of lines of your program (1 &le; N &le; 100000). The next N lines contain the number of characters on each line: you can assume there is at least one character per line, and at most 80 characters per line. The next line contains two integers R<sub>S</sub> C<sub>S</sub>, indicating the starting row and column of the cursor (1 &le; R<sub>S</sub> &le; N, 1 &le; C<sub>S</sub>, and C<sub>S</sub> is at most the number of characters in row R<sub>S</sub>). The last line contains two integers R<sub>F</sub> C<sub>F</sub> , indicating the finishing row and column of the cursor (1 &le; R<sub>F</sub> &le; N, 1 &le; C<sub>F</sub> , and C<sub>F</sub> is at most the number of characters in row R<sub>F</sub>).</p>

### 출력

<p>Output the minimum number of key presses that are required to move the cursor from row R<sub>S </sub>and column C<sub>S</sub> to row R<sub>F</sub> and column C<sub>F</sub> .</p>