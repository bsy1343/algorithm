# [Silver V] Reverse Nonogram - 14760

[문제 링크](https://www.acmicpc.net/problem/14760)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 144, 정답: 99, 맞힌 사람: 87, 정답 비율: 66.412%

### 분류

구현, 문자열

### 문제 설명

<p>A Nonogram is a pencil puzzle played on a grid. The grid is initially blank. There are numbers on the side and top of the grid, which indicate how the grid squares should be filled in. The numbers measure how many unbroken lines of filled-in squares there are in any given row or column. For example, a clue of &quot;4 8 3&quot; would mean there are sets of four, eight, and three filled squares, in that order, with at least one blank square between successive groups. Here is a small example, with its solution.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14760.%E2%80%85Reverse%E2%80%85Nonogram/05c880e8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14760/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:168px; width:443px" /></p>

<p>You are going to work backwards. Given a Nonogram solution, produce the numbers which should be at the side and top of the grid.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with an integer n (2&le;n&le;100) indicating the size of the grid. Each of the next n lines will have exactly n characters, consisting of either &#39;.&#39; for a blank square, or &#39;X&#39; for a square which has been filled in. The input will end with a line with a single 0.</p>

### 출력

<p>For each test case, print 2n lines of output. The first n lines represent the numbers for the rows, from top to bottom. The next n lines represent the numbers across the top, from left to right. If any row or column has no squares filled in, output a 0. Put a single space between numbers on the same line. Do not output any lines with leading or trailing blanks. Do not output blank lines between any lines of output.</p>