# [Gold I] Subway planning - 6711

[문제 링크](https://www.acmicpc.net/problem/6711)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 5, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

기하학, 두 포인터

### 문제 설명

<p>The government in a foreign country is looking into the possibility of establishing a subway system in its capital. Because of practical reasons, they would like each subway line to start at the central station and then go in a straight line in some angle as far as necessary. You have been hired to investigate whether such an approach is feasible. Given the coordinates of important places in the city as well as the maximum distance these places can be from a subway station (possibly the central station, which is already built), your job is to calculate the minimum number of subway lines needed. You may assume that any number of subway stations can be built along a subway line.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/6711/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.38.19.png" style="height:313px; width:445px" /></p>

<p>Figure 1: The figure above corresponds to the first data set in the example input.</p>

### 입력

<p>The first line in the input file contains an integer N, the number of data sets to follow. Each set starts with two integers, n and d (1 &le; n &le; 500, 0 &le; d &le; 150). n is the number of important places in the city that must have a subway station nearby, and d is the maximum distance allowed between an important place and a subway station. Then comes n lines, each line containing two integers x and y (-100 &le; x, y &le; 100), the coordinates of an important place in the capital. The central station will always have coordinates 0, 0. All pairs of coordinates within a data set will be distinct (and none will be 0, 0).</p>

### 출력

<p>For each data set, output a single integer on a line by itself: the minimum number of subway lines needed to make sure all important places in the city is at a distance of at most d from a subway station.</p>