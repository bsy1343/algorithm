# [Gold III] Firehose - 6801

[문제 링크](https://www.acmicpc.net/problem/6801)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 25, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>There is a very unusual street in your neighbourhood. This street forms a perfect circle, and the circumference of the circle is 1,000,000. There are H (1 &le; H &le; 1000) houses on the street. The address of each house is the clockwise arc-length from the northern-most point of the circle. The address of the house at the northern-most point of the circle is 0.</p>

<p>You also have special firehoses which follow the curve of the street. However, you wish to keep the length of the longest hose you require to a minimum.</p>

<p>Your task is to place k (1 &le; k &le; 1000) fire hydrants on this street so that the maximum length of hose required to connect a house to a fire hydrant is as small as possible.</p>

### 입력

<p>The first line of input will be an integer H, the number of houses. The next H lines each contain one integer, which is the address of that particular house, and each house address is at least 0 and less than 1,000,000. On the H + 2nd line is the number k, which is the number of fire hydrants that can be placed around the circle. Note that a fire hydrant can be placed at the same position as a house. You may assume that no two houses are at the same address.</p>

### 출력

<p>On one line, output the length of hose required so that every house can connect to its nearest fire hydrant with that length of hose.</p>