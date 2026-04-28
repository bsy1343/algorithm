# [Bronze II] Vicinity - 9611

[문제 링크](https://www.acmicpc.net/problem/9611)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 233, 정답: 212, 맞힌 사람: 188, 정답 비율: 92.157%

### 분류

브루트포스 알고리즘, 기하학, 피타고라스 정리

### 문제 설명

<p>This is one of the most basic geometry proximity problems. We are given n points in the plane and we should determine which points are in the vicinity of a particular point.&nbsp;</p>

<p>Let the set of points P = {p<sub>1</sub>, p<sub>2</sub> , &hellip;, p<sub>n</sub>} , where p<sub>i</sub> has coordinates (x<sub>i</sub>, y<sub>i</sub>). We use d(p<sub>i</sub>,p<sub>j</sub>) to denote the distance between the two points. A point p<sub>j</sub> is in the vicinity of point p<sub>i</sub> if d(p<sub>i</sub>,p<sub>j</sub>) &le; d<sub>v</sub> .We may call d<sub>v</sub> the vicinity distance. Given a set of points P, point p<sub>i</sub> and d<sub>v</sub>, your task is to write a program to calculate the number of points which are in the vicinity of point p<sub>i</sub>.&nbsp;</p>

### 입력

<p>The first line contains an integer n (2&le; n &le; 1000) which determines the number of points. The following n lines contain two integers which correspond to the coordinates (x<sub>i</sub>,y<sub>i</sub>) of each point (-10<sup>6&nbsp;</sup>&le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup>). Then, the following line includes t (1&le; t &le; 50) indicating the number of test cases, followed by t lines and each line contains 2 positive integers i (1&le; i &le; n) and d<sub>v</sub> (1 &le; d<sub>v</sub> &le; 100) which indicate the point p<sub>i</sub> and its vicinity distance, respectively.&nbsp;</p>

### 출력

<p>For each test case, print out in a line the number of points in the vicinity of the corresponding point.&nbsp;</p>