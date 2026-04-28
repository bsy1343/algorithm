# [Gold V] Rectangles - 9927

[문제 링크](https://www.acmicpc.net/problem/9927)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 100, 정답: 50, 맞힌 사람: 25, 정답 비율: 35.714%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 정렬, 스위핑, 집합과 맵

### 문제 설명

<p>A rectangle whose edges are parallel to the axes can always be defined by the two ends of one of its diagonals. For example, a rectangle can be drawn when the top left $(x_1, y_1)$ and the bottom right $(x_2, y_2)$ coordinates are given.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c8cfb5cc-769b-41ef-b0bd-bd7ae44fdf76/-/preview/" style="width: 277px; height: 170px;" /></p>

<p>Given a set of rectangles, we are interested in finding the total area covered by them.  For instance, the total area covered by the rectangles below is the area covered within the solid lines.  Notice that there is no double counting for overlapping regions.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e3f8f8b3-0b0b-4e02-97d4-e1948e638989/-/preview/" style="width: 474px; height: 234px;" /></p>

<p>Write a program that, given a set of rectangles, computes the total area covered by all the rectangles.</p>

### 입력

<p>The input describes a set of $N$ rectangles where $N$ ranges between 0 to 1000.  On the first line is the integer $N$.  The remaining lines are the coordinates of the rectangle.  In each of these line, the two points $(x_1, y_1)$ and $(x_2, y_2)$ are given as 4 integers $x_1, y_1, x_2, y_2$ separated by one or more blanks. Note that they are NOT necessarily the top-left and bottom-right coordinates. In addition, $x_i$ and $y_i$ take the value between 0 to $32767$.</p>

### 출력

<p>On the first line of output, your program must write the total area covered by the rectangles. You may assume that the area is at most 32767.</p>