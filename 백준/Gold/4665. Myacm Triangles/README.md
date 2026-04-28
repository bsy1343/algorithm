# [Gold III] Myacm Triangles - 4665

[문제 링크](https://www.acmicpc.net/problem/4665)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 21, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

브루트포스 알고리즘, 기하학, 볼록 다각형 내부의 점 판정, 다각형의 넓이

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4665/fig1trans.gif" /></p>

<p>There has been considerable archeological work on the ancient Myacm culture. Many artifacts have been found in what have been called power fields: a fairly small area, less than 100 meters square where there are from four to fifteen tall monuments with crystals on top. Such an area is mapped out above. Most of the artifacts discovered have come from inside a triangular area between just three of the monuments, now called the power triangle. After considerable analysis archeologists agree how this triangle is selected from all the triangles with three monuments as vertices: it is the triangle with the largest possible area that does not contain any other monuments inside the triangle or on an edge of the triangle. Each field contains only one such triangle.</p>

<p>Archeological teams are continuing to find more power fields. They would like to automate the task of locating the power triangles in power fields. Write a program that takes the positions of the monuments in any number of power fields as input and determines the power triangle for each power field.</p>

<p>A useful formula: the area of a triangle with vertices (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), and (x<sub>3</sub>, y<sub>3</sub>) is the absolute value of</p>

<p>0.5 &times; [(y<sub>3</sub> - y<sub>1</sub>)(x<sub>2</sub> - x<sub>1</sub>) - (y<sub>2</sub> - y<sub>1</sub>)(x<sub>3</sub> - x<sub>1</sub>)].</p>

### 입력

<p>For each power field there are several lines of data. The first line is the number of monuments: at least 4, and at most 15. For each monument there is a data line that starts with a one character label for the monument and is followed by the coordinates of the monument, which are nonnegative integers less than 100. The first label is A, and the next is B, and so on.</p>

<p>There is at least one such power field described. The end of input is indicated by a 0 for the number of monuments. The first sample data below corresponds to the diagram in the problem.</p>

### 출력

<p>For each power field there is one line of output. It contains the three labels of the vertices of the power triangle, listed in increasing alphabetical order, with no spaces.</p>

<p>&nbsp;</p>