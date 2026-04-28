# [Gold III] Tight-Fit Sudoku - 13882

[문제 링크](https://www.acmicpc.net/problem/13882)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 20, 맞힌 사람: 18, 정답 비율: 42.857%

### 분류

백트래킹

### 문제 설명

<p>At some point or another, most computer science students have written a standard Sudoku solving program. A slight twist has been added to standard Sudoku to make it a bit more challenging.</p>

<p>Digits from 1 to 9 are entered in a 6x6 grid so that no number is repeated in any row, column or 3x2 outlined region as shown below. Some squares in the grid are split by a slash and need 2 digits entered in them. The smaller number always goes above the slash.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13882.%E2%80%85Tight-Fit%E2%80%85Sudoku/7f14feaa.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13882.%E2%80%85Tight-Fit%E2%80%85Sudoku/7f14feaa.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13882/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%204.13.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:277px; width:250px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13882.%E2%80%85Tight-Fit%E2%80%85Sudoku/3c50266c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13882.%E2%80%85Tight-Fit%E2%80%85Sudoku/3c50266c.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13882/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%204.13.26.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:274px; width:250px" /></p>

<p>For this problem, you will write a program that takes as input an incomplete puzzle grid and outputs the puzzle solution grid.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 100), which is the number of data sets that follow.</p>

<p>Each data set should be processed identically and independently. Each data set consists of 7 lines of input. The first line of the data set contains the data set number, K. The remaining 6 lines represent an incomplete Tight-Fit Sudoku grid, each line has 6 data elements, separated by spaces. A data element can be a digit (1-9), a dash (&lsquo;-&lsquo;) for a blank square or two of these separated by a slash (&lsquo;/&rsquo;).&nbsp;</p>

### 출력

<p>For each data set there are 7 lines of output. The first output line consists of the data set number, K. The following 6 lines of output show the solution grid for the corresponding input data set. Each line will have 6 data elements, separated by spaces. A data element can be a digit (1-9), or 2 digits separated by a slash (&lsquo;/&rsquo;).</p>