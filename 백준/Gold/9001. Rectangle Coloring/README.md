# [Gold V] Rectangle Coloring - 9001

[문제 링크](https://www.acmicpc.net/problem/9001)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 181, 정답: 83, 맞힌 사람: 73, 정답 비율: 55.725%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 기하학, 분리 집합

### 문제 설명

<p>You are given n axis-parallel rectangles on a plane. Here, an axis -parallel rectangle is a rectangle whose&nbsp;edges are parallel to either x -axis or y -axis. You are to find the number of colors to paint the given n&nbsp;rectangles according to the following rules:</p>

<ol>
	<li>1. Each rectangle has to be painted with one color.</li>
	<li>2. A pair of intersecting rectangles must have the same color. Two rectangles are intersecting if their&nbsp;intersection is not empty when we regard a rectangle as a set of points including the boundary.</li>
	<li>3. A rectangle R<sub>a</sub> must have the same color as R<sub>b</sub>&nbsp;if there is a sequence of rectangles R<sub>a&nbsp;</sub>=&nbsp;R<sub>i1</sub>,&nbsp;R<sub>i2</sub>, &hellip;,R<sub>ik&nbsp;</sub>= R<sub>b </sub>such that&nbsp;R<sub>ij&nbsp;</sub>and R<sub>ij+1&nbsp;</sub>are intersecting for all 1&le; j &lt; k ; otherwise, they must have different&nbsp;colors. For instance, rectangle R<sub>9</sub>&nbsp;in the following figure must have the same color as R<sub>4, </sub>R<sub>5, </sub>R<sub>8</sub>,&nbsp;and have a different color from R<sub>1, </sub>R<sub>2</sub>, R<sub>3</sub>, R<sub>6</sub>, R<sub>7</sub>.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9001.%E2%80%85Rectangle%E2%80%85Coloring/a18d4359.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9001/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-15%20%EC%98%A4%ED%9B%84%205.08.12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:250px; width:275px" /></p>

### 입력

<p>The input consists of T test cases. The number of test cases (T) is given in the first line of the input file. Each&nbsp;test case begins with a line containing an integer N , 1&le; N &le; 200 , that represents the number of rectangles in&nbsp;the test case. Each of the following N lines contains four positive integers&nbsp;x<sub>1</sub> ,&nbsp;y<sub>1</sub> ,&nbsp;x<sub>2</sub> , and&nbsp;y<sub>2</sub>, 1&nbsp;&le; x<sub>1</sub>,y<sub>1</sub>,x<sub>2</sub>,y<sub>2</sub> &le; 10000 , representing a rectangle. (x<sub>1</sub> ,y<sub>1</sub>)&nbsp;and (x<sub>2</sub> , y<sub>2</sub>)&nbsp;are the (x, y) -coordinates of the lower -&nbsp;left and upper -right corners of the rectangle, respectively. The four integers are delimited by one or more&nbsp;spaces. From the N +3 -th line, the remaining test cases are listed in the same manner as above.</p>

### 출력

<p>The output should contain the number of colors, one per line.</p>