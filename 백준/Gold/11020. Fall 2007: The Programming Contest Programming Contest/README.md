# [Gold III] Fall 2007: The Programming Contest Programming Contest - 11020

[문제 링크](https://www.acmicpc.net/problem/11020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 28, 정답: 15, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Finally, in Fall of 2007, we went meta, and had a &ldquo;Programming Contest Programming Contest&rdquo;, in which the participants had to solve problems about runnning a programming contest. Clearly, the most important part of the programming contest is the pizza. The pizza has delicious soy nuggets on it, but it isn&rsquo;t cut yet. So we have to cut it into slices. There are two important constraints we have to meet: every slice must have the same size, and every slice must have the same number of soy nuggets on it. To make things worse, the pizza is circular, and we can only cut along a straight line from the center of the circle to its circumference. And we can never cut through a soy nugget, it must always be on one side of the cut or the other.</p>

<p>You are to write a program that, given the positions of the soy nuggets, determines which is the largest number of slices into which the pizza can be cut such that every piece has the same size and the same number of soy nuggets (notice that a pizza can always be cut into 1 slice &mdash; so there always is a solution.)</p>

### 입력

<p>The first line is the number K of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line contains the number N of soy nuggets on the pizza (1 &le; N &le; 200). This is followed by N lines, describing the positions of the soy nuggets. Each position is given in polar coordinates, measured from the center of the pizza. That is, a position is a pair &ldquo;&alpha; r&rdquo;, where 0 &le; &alpha; &lt; 2&pi; is the counterclockwise angle between the positive x-axis and the line from the pizza center to the soy nugget. 0 &lt; r &le; 1 is the distance of the nugget from the center (each pizza will have radius 1). We assume that nuggets are points, and no two nuggets will be lying on the same spot of the pizza.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then set, output the maximum number of slices into which it can be cut according to the above rules. Remember that no cut can go through a soy nugget.</p>

<p>Each data set should be followed by a blank line.</p>