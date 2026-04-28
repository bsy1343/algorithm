# [Gold IV] Rectangle Cutting - 6743

[문제 링크](https://www.acmicpc.net/problem/6743)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

자료 구조, 깊이 우선 탐색, 분리 집합, 플러드 필, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>In the small historical village of Basinia, there is a popular activity in wedding ceremonies called <em>rectangle cutting</em>. During this activity, each close relative of the bride comes and cuts a rectangle in the wedding cake (but does not take a piece). The cake has a rectangular shape. The problem is to count how many pieces are in the cake after rectangle-cutting.</p>

<p>&nbsp;</p>

<p>For example, in the following figure, the cake size is 3&times;5, and three people have made rectangular cuts in it. As a result, the cake is cut into six pieces.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/6743/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-09%20%EC%98%A4%ED%9B%84%204.59.17.png" style="height:144px; width:240px" /></p>

<p>Each rectangular cut is specified by the (<em>x</em>,<em>y</em>) coordinates of its two opposite corners. The input for the above figure can be found in the first sample input. As there are large families in Basinia, the number of pieces may be large and we need a computer program to compute it.</p>

### 입력

<p>The input contains several test cases. Each test has several lines. The first line has two integers <em>w</em> (1 &le; <em>w</em> &le; 20) and <em>h</em> (1 &le; <em>h</em> &le; 20) which are the width and height of the cake. The second line contains a single integer n (0 &le; <em>n</em> &le; 50) which is the number of people who cut rectangles in the cake. After this, there are <em>n</em> lines each containing the integers <em>x</em><sub>1</sub>, <em>y</em><sub>1</sub>, <em>x</em><sub>2</sub>, <em>y</em><sub>2</sub> which are the coordinates of two opposite corners of the cut. You may assume 0 &le; <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub> &le; <em>w</em> and 0 &le; <em>y</em><sub>1</sub>, <em>y</em><sub>2</sub> &le; <em>h</em>. The last line of the input is a line containing two zeros.</p>

### 출력

<p>For each test case, write the number of pieces the cake is cut into.</p>