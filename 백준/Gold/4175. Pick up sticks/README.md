# [Gold III] Pick up sticks - 4175

[문제 링크](https://www.acmicpc.net/problem/4175)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 100, 정답: 40, 맞힌 사람: 38, 정답 비율: 44.186%

### 분류

자료 구조, 그래프 이론, 방향 비순환 그래프, 위상 정렬, 덱

### 문제 설명

<p>Pick up sticks is a fascinating game. A collection of coloured sticks are dumped in a tangled heap on the table. Players take turns trying to pick up a single stick at a time without moving any of the other sticks. It is very difficult to pick up a stick if there is another stick lying on top of it. The players therefore try to pick up the sticks in an order such that they never have to pick up a stick from underneath another stick.</p>

### 입력

<p>The input consists of several test cases. The first line of each test case contains two integers n and m each at least one and no greater than one million. The integer n is the number of sticks, and m is the number of lines that follow. The sticks are numbered from 1 to n. Each of the following lines contains a pair of integers a, b, indicating that there is a point where stick a lies on top of stick b. The last line of input is 0 0. These zeros are not values of n and m, and should not be processed as such.</p>

### 출력

<p>For each test case, output n lines of integers, listing the sticks in the order in which they could be picked up without ever picking up a stick with another stick on top of it. If there are multiple such correct orders, any one will do. If there is no such correct order, output a single line containing the word IMPOSSIBLE.</p>