# [Platinum V] Combination Lock - 21020

[문제 링크](https://www.acmicpc.net/problem/21020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Gael has a padlock with a combination lock. Unlike a typical combination lock which has several rotating discs (one for each digit) from left to right, Gael&rsquo;s combination lock has R &times; C rotating discs formed in R rows (numbered from 1 to R) and C columns (numbered from 1 to C). For simplicity, the rotating disc in the i<sup>th</sup> row and j<sup>th</sup> column is denoted as rotating disc (i, j).</p>

<p>Similar to a typical combination lock, each rotating disc in Gael&rsquo;s lock has 10 symbols, numbered from 0 to 9. At any point in time, one of the symbols is visible to Gael.</p>

<p>In one operation, Gael can choose one of the R &times; C rotating discs and rotate it 1/10 turn clockwise. This causes the symbol visible to Gael to be increased by 1 if the previously visible symbol is not equal to 9, or to be changed to 0 otherwise.</p>

<p>In a typical combination lock, to open the lock, each rotating disc has to be rotated by exactly the correct amount so that the rotating disc shows a predetermined symbol. However, Gael&rsquo;s lock is mechanically magical and behaves differently.</p>

<p>Gael&rsquo;s lock will open if there exists a symbol m such that the set of rotating discs currently showing the symbol m forms the letter L. Formally, the lock will open if there exists a symbol m and integers x, y, &delta;<sub>x</sub>, &delta;<sub>y</sub> (0 &le; m &le; 9; 1 &le; x &minus; &delta;<sub>x</sub> &lt; x &le; R; 1 &le; y &lt; y + &delta;<sub>y</sub> &le; C) such that the rotating disc (i, j) is showing symbol m if and only if at least one of the following is true:</p>

<ul>
	<li>i = x and y &le; j &le; y + &delta;<sub>y</sub></li>
	<li>x &minus; &delta;<sub>x</sub> &le; i &le; x and j = y</li>
</ul>

<p>Currently, the symbol visible on the rotating disc (i, j) is S<sub>i,j</sub>. Help Gael to determine the minimum number of operations needed to open his lock.</p>

### 입력

<p>Input begins with a line containing two integers: R C (2 &le; R, C &le; 1000) representing the number of rows and columns in Gael&rsquo;s combination lock, respectively. The next R lines each contains a string S<sub>i</sub> containing C characters between 0 and 9 representing the symbol currently visible on the rotating discs. The j<sup>th</sup> integer on the i<sup>th</sup> line is the value of S<sub>i,j</sub>.</p>

### 출력

<p>Output in a line an integer representing the minimum number of operations needed to open Gael&rsquo;s lock.</p>