# [Platinum I] Painting patter - 7728

[문제 링크](https://www.acmicpc.net/problem/7728)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 6, 정답 비율: 33.333%

### 분류

자료 구조, 구현, 세그먼트 트리, 스위핑

### 문제 설명

<p>Lukas has a large grid. Initially, all squares of the grid are of white colour. Lukas has three patterns (numbered from one to three, starting with the left one):</p>

<pre>
XXXX &nbsp; &nbsp;X.X. &nbsp; &nbsp;X.X.
.... &nbsp; &nbsp;X.X. &nbsp; &nbsp;.X.X
XXXX &nbsp; &nbsp;X.X. &nbsp; &nbsp;X.X.
.... &nbsp; &nbsp;X.X. &nbsp; &nbsp;.X.X</pre>

<p>He applies patterns on the grid. He chooses a rectangle, chooses a pattern and paints some squares with black colour according to the pattern. He repeats this N times. When painted areas overlap, he obeys the OR rule. For example, if he chooses pattern 1 and then pattern 3 on a square 4 &times; 4, he gets</p>

<pre>
XXXX
.X.X
XXXX
.X.X</pre>

<p>Your task is to compute number of black squares after Lukas has painted all rectangles. The pattern begins in the top left corner of a rectangle (the lowest x and the highest y coordinate).</p>

### 입력

<p>In the first line of input, there is number N(0 &le; N &le; 100, 000). N lines follow. In each of these lines, there are five integers x1, y1, x2, y2, p, where x1, y1 and x2, y2 are the coordinates of grid points in two opposite corners of the rectangle, in which a pattern is applied, and p(1 &le; p &le; 3) is the number of the used pattern. Coordinates of rectangles do not exceed 10<sup>9</sup> in their absolute value and each rectangle is at least one unit high and wide.</p>

### 출력

<p>The first and only line of output should contain number of black squares.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="/upload/images2/pp.png" style="height:164px; width:216px" /></p>