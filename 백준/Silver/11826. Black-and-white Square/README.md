# [Silver III] Black-and-white Square - 11826

[문제 링크](https://www.acmicpc.net/problem/11826)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 84, 정답: 34, 맞힌 사람: 33, 정답 비율: 50.769%

### 분류

구현

### 문제 설명

<p>Famous painter Quasimir Malevich painted a picture called &ldquo;Black-and-white square&rdquo;. The picture looks like a rectangle ﬁlled with black and white cells.&nbsp;</p>

<p>Art historian Erik Stripeson put forward a hypothesis that Quasimir painted the picture in the following way: he took a canvas that was initially white, and drew horizontal and vertical black stripes, one cell wide, from the edge to the edge of the canvas.&nbsp;</p>

<p>Association of Computational Art Studies wants to ﬁnd out whether this hypothesis can be correct. If it can be correct, they also want to know the minimal number of stripes that the painter had to draw in order to paint this picture. Moreover, they need to ﬁnd a way to draw this picture using this number of stripes.&nbsp;</p>

### 입력

<p>The ﬁrst line of the input ﬁle contains two integers h and w (1 &le; h,w &le; 50) &mdash; the height and the width of the picture.&nbsp;</p>

<p>Each of the next h lines contains w space-separated numbers. Number 0 denotes a white cell, number 1 denotes a black cell.&nbsp;</p>

### 출력

<p>If Stripeson&rsquo;s hypothesis can&rsquo;t be correct, output only the number -1.&nbsp;</p>

<p>If the hypothesis can be correct, the ﬁrst line of the output ﬁle should contain number n &mdash; the minimal possible number of stripes needed to draw the picture.&nbsp;</p>

<p>The second line should contain n numbers that describe a way to draw the picture using n stripes. A positive number x stands for drawing a vertical black stripe in x-th column (columns are numbered from left to right, starting with 1). A negative number -x stands for drawing a horizontal black stripe in x-th row (rows are numbered from top to bottom, starting with 1).&nbsp;</p>

<p>If there are several ways to draw the picture using n stripes, output any one of these ways.&nbsp;</p>

### 힌트

<p>Tests with answer -1 (with numbers from 23 to 27) will be scored only if your solution passes at least one test with number from 12 to 22.&nbsp;</p>