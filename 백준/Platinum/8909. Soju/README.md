# [Platinum IV] Soju - 8909

[문제 링크](https://www.acmicpc.net/problem/8909)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 263, 정답: 67, 맞힌 사람: 39, 정답 비율: 36.792%

### 분류

자료 구조, 우선순위 큐, 스위핑

### 문제 설명

<p>Two rival companies, named IC and PC, share the Soju market in Korea. Soju is well-known Korean distilled liquor, going well with Korean cuisine. Currently they have an agreement on the location of their selling branches; the branches of IC should be located in the west of those of PC, that is, all the IC branches have smaller x-coordinates than any PC branch. At the beginning of every month, they observe any change in the location condition of the agreement. For this, they want to compute the distance of the closest pair of two branches, one from each company. The distance of two points (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) is defined as |x<sub>1</sub>-x<sub>2</sub>| + |y<sub>1</sub>-y<sub>2</sub>|.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8909/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%204.58.42.png" style="height:238px; width:331px" /><br />
Figure 1. Blue disks are the IC branches and red squares are the PC branches. The distance of a closest pair between them is 5.</p>

<p>You are given two sets of points, I and P, which represent branches of IC and PC companies, respectively. All points in I have smaller x-coordinates than any point in P. You write a program to compute the minimum distance of pairs (i, p) for i &isin; I and p &isin; P.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. T is given in the first line of the input. The first line of each test case contains an integer n, the number of points of I, 1 &le; n &le; 100, 000. Each of the following n lines contains two integers, the x-coordinate and y-coordinate of each point of I. The next line contains an integer m, the number of points of P, 1 &le; m &le; 100, 000. Each of the next m lines contains two integers, the x-coordinate and y-coordinate of each point of P. Coordinates of the points are between &minus;10<sup>6</sup> and 10<sup>6</sup> inclusive. Note that all points of I have smaller x-coordinates than any point of P.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain an integer value, the distance of a closest pair of points from I and P.</p>