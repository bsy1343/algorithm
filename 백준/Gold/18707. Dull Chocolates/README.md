# [Gold III] Dull Chocolates - 18707

[문제 링크](https://www.acmicpc.net/problem/18707)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 20, 맞힌 사람: 20, 정답 비율: 47.619%

### 분류

값 / 좌표 압축, 누적 합

### 문제 설명

<p>Fouad wants to eat a chocolate bar, so he bought a rectangular chocolate bar that has N rows and M columns of chocolate.</p>

<p>Fouad found that most of the cells in that chocolate bar are dark chocolate except for K cells which are white chocolate. Now, he wants to eat a prefix sub-grid of the bar. A prefix sub-grid is a rectangular sub-grid that starts at the first cell (1, 1) and ends at any cell (i, j). Fouad is also wondering how many perfect prefix sub-grids of the bar. A perfect prefix sub-grid is a one that contains an odd number of white chocolate cells.</p>

<p>Help Fouad find the number of perfect prefix sub-grids and non-perfect prefix sub-grids.</p>

### 입력

<p>The first line of the input containing a single integer T specifying the number of test cases.</p>

<p>Each test case begins with a line containing three integers N, M, and K (1 &le; N, M &le; 10<sup>9</sup>, 0 &le; K &le; 10<sup>3</sup>), in which N and M are the number of rows and columns in the chocolate bar, respectively, and K is the number of white chocolate cells.</p>

<p>Then K lines follow, each line containing two integers X<sub>i</sub> and Y<sub>i</sub> (1 &le; X<sub>i</sub> &le; N, 1 &le; Y<sub>i</sub> &le; M), giving the positions of the white chocolate cells. It is guaranteed that all the given positions are unique.</p>

### 출력

<p>For each test case, print a single line containing two space-separated integers representing the number of perfect prefix sub-grids and non-perfect prefix sub-grids, respectively.</p>

### 힌트

<p>In the second test case, the chocolate bar can be represented as follows:</p>

<pre>
ddd
dwd
ddd</pre>

<p>in which &lsquo;d&rsquo; represents dark chocolate cells while &lsquo;w&rsquo; represents white chocolate cells. There are four perfect prefix sub-grids that end at cells: (2, 2), (2, 3), (3, 2), and (3, 3).</p>