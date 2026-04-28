# [Gold IV] Sumdoku - 15303

[문제 링크](https://www.acmicpc.net/problem/15303)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 11, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

백트래킹

### 문제 설명

<p>Sumdoku is a variant of the game Sudoku. As in Sudoku, the aim is to fill in a 9-by-9 grid with the digits 1 through 9 so that each digit 1 through 9 occurs exactly once in each row, exactly once in each column and exactly once in each of the 9 3-by-3 sub-squares subject to constraints on the choices. In Sudoku, the constraints are that certain squares must contain fixed values. In Sumdoku, the constraints are on the sum of adjacent squares within each 3-by-3 sub-square. In the illustration below, the symbols &lt;. = and &gt; indicate that the sum of the values on either side (or above and below) the symbol must have sum less than 10, equal to 10 or greater than 10, respectively.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15303.%E2%80%85Sumdoku/05295a6e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15303.%E2%80%85Sumdoku/05295a6e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15303/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:458px; width:457px" /></p>

<p>Write a program to solve Sumdoku problems.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a 16 lines of input. The first line contains the data set number, K. The following 15 lines consist of the characters &lt;, = or &gt;. Rows 1, 3, 5, 6, 8, 10, 11, 13 and 15 contain 6 characters corresponding to constraints on the sum of values to the left and right of the symbol. Rows 2, 4, 7, 9, 12 and 14 contain 9 characters corresponding to constraints on the sum of values above and below the symbol. Note: Solutions of some problems may not be unique. The judging program will just check whether your solution satisfies the constraints of the problem (row, column, 3- by-3 box and inequality constraints.</p>

### 출력

<p>For each data set there are 10 lines of output. The first output line consists of the data set number, K. The following 9 lines of output consist of 9 decimal digits separated by a single space. The value in the jth position in the ith line of the 9 output lines is the solution value in column j of row i.</p>

<p>If there are multiple solutions, print the lexicographically smallest one if the answer is read by row-major order.</p>