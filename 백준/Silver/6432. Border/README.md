# [Silver IV] Border - 6432

[문제 링크](https://www.acmicpc.net/problem/6432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You are to write a program that draws a border around a closed path into a bitmap, as displayed in the following figure:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6432.%E2%80%85Border/bbd5be17.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6432/border.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:203px; width:202px" /></p>

<p>The path is closed and runs along the grid lines, i.e. between the squares of the grid. The path runs counter-clockwise, so if following the path is considered as going ``forward&#39;&#39;, the border pixels are always to the ``right&#39;&#39; of the path. The bitmap always covers 32 by 32 squares and has its lower left corner at (0, 0). You can safely assume that the path never touches the bounding rectangle of the bitmap and never touches or crosses itself. Note that a bit gets set if it is on the outside of the area surrounded by the path and if at least one of its edges belongs to the path, but not if only one of its corners is in the path. (A look at the convex corners in the figure should clarify that statement.)</p>

### 입력

<p>The first line of the input file contains the number of test cases in the file. Each test case that follows consists of two lines. The first line of each case contains two integer numbers x and y specifying the starting point of the path. The second line contains a string of variable length. Every letter in the string symbolizes a move of length one along the grid. Only the letters `W&#39; (``west&#39;&#39;), `E&#39; (``east&#39;&#39;), `N&#39; (``north&#39;&#39;), `S&#39; (``south&#39;&#39;), and `.&#39; (``end of path&#39;&#39;, no move) appear in the string. The end-of-path character ( `.&#39;) is immediately followed by the end of the line.</p>

### 출력

<p>For each test case, output a line with the number of the case (`Bitmap #1&#39;, `Bitmap #2&#39;, etc.). For each row of the bitmap from top to bottom, print a line where you print a character for every bit in that row from left to right. Print an uppercase `X&#39; for set bits and a period `.&#39; for unset bits. Output a blank line after each bitmap.</p>