# [Platinum III] Points - 10354

[문제 링크](https://www.acmicpc.net/problem/10354)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 107, 정답: 41, 맞힌 사람: 23, 정답 비율: 29.114%

### 분류

기하학, 볼록 껍질

### 문제 설명

<p>Peter and Bob are playing a &quot;Points&quot; game on a math sheet of paper. Peter places a few points on the paper - grid nodes. Bob wants to surround them with a polygon so that all marked nodes are lying strictly within (not at the border) the polygon. All sides of the polygon are along the sides or the diagonals of the grid cells and its perimeter is as small as possible. You must determine what is the perimeter of the polygon.</p>

### 입력

<p>The first line of the input file contains integer N &ndash; the number of points placed by Peter (1 &le; N &le; 100 000). Each of following N lines contains two integers x<sub>i</sub>, y<sub>i</sub> &ndash; the point coordinates placed by Peter. The coordinates by absolute value do not exceed 10<sup>6</sup>. Some points can match.</p>

### 출력

<p>You need to print one number &ndash; the perimeter of the required polygon. The answer should be printed with accuracy not less than 0.001.</p>