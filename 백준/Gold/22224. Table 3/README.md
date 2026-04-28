# [Gold IV] Table 3 - 22224

[문제 링크](https://www.acmicpc.net/problem/22224)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 62, 맞힌 사람: 58, 정답 비율: 71.605%

### 분류

수학, 브루트포스 알고리즘, 정수론, 해 구성하기, 무작위화

### 문제 설명

<p>For the given integer&nbsp;M, build a square table with&nbsp;N&nbsp;rows and&nbsp;N&nbsp;columns (2&nbsp;&le;&nbsp;N&nbsp;&le;&nbsp;10), filled with decimal digits, with the following restriction: the&nbsp;N-digit numbers formed by the digits in each table row (from left to right), each table column (from top to bottom) and each main diagonal (from top to bottom) must be multiples of&nbsp;M, must not start with the digit&nbsp;0&nbsp;and must be unique within the table.</p>

<p>For example, a valid table for&nbsp;M = 2&nbsp;is</p>

<pre>
2 3 4
5 6 6
8 2 0
</pre>

<p>The following tables are not valid for&nbsp;M = 2:</p>

<pre>
4
</pre>

<p>because&nbsp;N &lt; 2;</p>

<pre>
2 0
4 8
</pre>

<p>because the numbers in the last column and on one of the main diagonals start with the digit&nbsp;0;</p>

<pre>
2 3 4
5 8 8
2 0 2
</pre>

<p>because the number&nbsp;482&nbsp;is present twice in the table.</p>

<p>It is not always possible to solve this task. For example, the task is unsolvable for&nbsp;M = 10.</p>

### 입력

<p>The first line contain one value of&nbsp;M.</p>

### 출력

<p>The first line of a file must contain&nbsp;N, the number of rows and columns in the table. The&nbsp;i+1-st line of the file (1&nbsp;&le;&nbsp;i&nbsp;&le;&nbsp;N) must contain the elements of the&nbsp;i-th row of the table as&nbsp;N&nbsp;digits, separated by spaces.</p>

### 제한

<p>M = 36</p>

### 힌트

<p>It is known that there will be at least one solution for each given test input.</p>