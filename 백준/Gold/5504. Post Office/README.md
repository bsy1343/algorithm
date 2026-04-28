# [Gold II] Post Office - 5504

[문제 링크](https://www.acmicpc.net/problem/5504)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 29, 맞힌 사람: 26, 정답 비율: 49.057%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There is a straight highway with villages alongside the highway. The highway is represented as an integer axis, and the position of each village is identified with a single integer coordinate. There are no two villages in the same position. The distance between two positions is the absolute value of the difference of their integer coordinates.</p>

<p>Post offices will be built in some, but not necessarily all of the villages. A village and the post office in it have the same position. For building the post offices, their positions should be chosen so that the total sum of all distances between each village and its nearest post office is minimum.</p>

<p>You are to write a program which, given the positions of the villages and the number of post offices, computes the least possible sum of all distances between each village and its nearest post office, and the respective desired positions of the post offices.</p>

### 입력

<p>The first line contains two integers: the first is the number of villages V, 1 &le; V &le; 300, and the second is the number of post offices P, 1 &le; P &le; 30, P &le; V. The second line contains V integers in increasing order. These V integers are the positions of the villages. For each position X it holds that 1 &le; X &le; 10000.</p>

### 출력

<p>The first line contains one integer S, which is the sum of all distances between each village and its nearest post office as reported in the second line. The second line contains P integers in increasing order. These integers are the locations of the distinct villages in which the post offices will be built. There may be several different solutions for the locations, and your program needs to output only one of them.</p>