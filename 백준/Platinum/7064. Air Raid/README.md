# [Platinum II] Air Raid - 7064

[문제 링크](https://www.acmicpc.net/problem/7064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 31, 맞힌 사람: 30, 정답 비율: 57.692%

### 분류

그래프 이론, 방향 비순환 그래프, 이분 매칭

### 문제 설명

<p>Consider a town where all the streets are one-way and each street leads from one intersection to another. It is also known that starting from an intersection and walking through town&#39;s streets you can never reach the same intersection i.e. the town&#39;s streets form no cycles.&nbsp;</p>

<p>With these assumptions your task is to write a program that finds the minimum number of paratroopers that can descend on the town and visit all the intersections of this town in such a way that more than one paratrooper visits no intersection. Each paratrooper lands at an intersection and can visit other intersections following the town streets. There are no restrictions about the starting intersection for each paratrooper.&nbsp;</p>

### 입력

<p>Your program should read sets of data. The first line of the input file contains the number of the data sets. Each data set specifies the structure of a town and has the format:&nbsp;</p>

<pre>
no_of_intersections&nbsp;
no_of_streets&nbsp;
S1 E1&nbsp;
S2 E2&nbsp;
......&nbsp;
Sno_of_streets Eno_of_streets&nbsp;</pre>

<p>The first line of each data set contains a positive integer no_of_intersections (greater than 0 and less or equal to 120), which is the number of intersections in the town. The second line contains a positive integer no_of_streets, which is the number of streets in the town. The next no_of_streets lines, one for each street in the town, are randomly ordered and represent the town&#39;s streets. The line corresponding to street k (k &le; no_of_streets) consists of two positive integers, separated by one blank: Sk (1 &le; Sk &le; no_of_intersections) - the number of the intersection that is the start of the street, and Ek (1 &le; Ek &le;&nbsp;no_of_intersections) - the number of the intersection that is the end of the street. Intersections are represented by integers from 1 to no_of_intersections.&nbsp;</p>

<p>There are no blank lines between consecutive sets of data. Input data are correct.&nbsp;</p>

### 출력

<p>The result of the program is on standard output. For each input data set the program prints on a single line, starting from the beginning of the line, one integer: the minimum number of paratroopers required to visit all the intersections in the town.&nbsp;</p>

<p>&nbsp;</p>