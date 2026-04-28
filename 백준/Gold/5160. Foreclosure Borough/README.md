# [Gold I] Foreclosure Borough - 5160

[문제 링크](https://www.acmicpc.net/problem/5160)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

기하학, 볼록 다각형 내부의 점 판정, 오목 다각형 내부의 점 판정

### 문제 설명

<p>One of the causes (and consequences) of the financial crisis is the large number of home foreclosures. The fact that many derivatives were backed by mortgages, on which the homeowners then foreclosed, is part of the problem that financial institutions are facing. In turn, by losing work and other income sources, individuals cannot make their mortgage payments any more, and need to foreclose their homes. As you might expect, it&rsquo;s a bit of a vicious cycle.</p>

<p>Some areas are harder hit than others by this. There are areas where a significant percentage of homes is in foreclosure right now. You are to write a program that finds out which areas are most affected.</p>

<p>You will be given the coordinates of houses, and whether or not they are in foreclosure. Then, you will be given simple (i.e., not self-intersecting) polygons representing different boroughs or areas. These polygons might overlap. You are to compute the percentage of houses in foreclosure in each of them, and to sort the boroughs by this foreclosure rate.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two integers H,B, the number of houses (1 &le; H &le; 1000) and boroughs (1 &le; B &le; 100), respectively. This is followed by H lines, each describing a house, by giving its x and y coordinates (floating point numbers), and a character &lsquo;Y&rsquo; (in foreclosure) or &lsquo;N&rsquo; (not in foreclosure).</p>

<p>This is followed by the description of B boroughs. Each borough is described by a line. The first entry of the line is an integer c &ge; 3, the number of corner points of the polygon. This is followed by 2c floating point numbers. Each pair of floating point numbers describes one of the c corners, in the order x<sub>1</sub>,y<sub>1</sub>,x<sub>2</sub>,y<sub>2</sub>,... ,x<sub>c</sub>,y<sub>c</sub>. The points will be given in counter-clockwise order.</p>

<p>Our inputs will ensure that no house lies exactly on the border of a borough. Also, each borough will contain at least one house.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on c lines, output the foreclosure rates for all boroughs. Sort the lines by non-increasing foreclosure rates, breaking ties by lower borough number. Each line should first contain the number of the borough, and then the foreclosure rate, rounded to two decimals. Each data set should be followed by an empty line.</p>