# [Platinum IV] Connecting islands - 6725

[문제 링크](https://www.acmicpc.net/problem/6725)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 11, 맞힌 사람: 10, 정답 비율: 24.390%

### 분류

브루트포스 알고리즘, 기하학, 그래프 이론, 선분 교차 판정, 최소 스패닝 트리

### 문제 설명

<p>In order to win the last election the politicians promised the inhabitants of the Skofoten islands that they would connect all the islands by building bridges between them so that any island is reachable from any other island. After the election it occurred to them that this could get very costly, so in order to keep the cost down they have asked you to write a program that will determine the minimum cost needed to fulfill their promise. You can assume that the cost of a bridge is proportional to its length, thus we wish to calculate the minimum total length of the bridges needed to connect all the islands. Each island is represented by a polygon and to make things easier you can assume that bridges only run between corners of two polygons. Note that a bridge can only run over water, however, bridges can cross each other. Also note that the shape of islands can be non-convex.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of input contains the number of test cases. A test case consists of one line holding the number of islands (2 &le; N &le; 15), followed by N lines that describe the islands. An island is a polygon, which is described as a number (1 &le; P &le; 25) that gives the number of points followed by P pairs of coordinates. Each coordinate is an integer in the range [-1000. . . 1000]. The points are listed in order such that by connecting consecutive points, and the last point to the first, the perimeter of the island is given. It is guaranteed that islands do not touch or intersect.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case output two lines reporting the minimal interconnect as follows:</p>

<p>&nbsp;&nbsp; &nbsp;The minimal interconnect consists of N bridges with a total length of L.</p>

<p>where N is the number of bridges, and L is the total length, which should be printed as a floating point number with an accuracy of three digits.</p>