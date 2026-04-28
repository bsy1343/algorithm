# [Platinum II] Three Squares - 13855

[문제 링크](https://www.acmicpc.net/problem/13855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 146, 정답: 49, 맞힌 사람: 41, 정답 비율: 36.283%

### 분류

이분 탐색, 백트래킹, 매개 변수 탐색

### 문제 설명

<p>There are N distinct points located at integer coordinates in the plane. We want to place three identical axis-parallel squares on the plane, such that each of the N points is located inside (or on the borders of) at least one of the squares. What is the minimum possible side length of the squares?</p>

### 입력

<p>The first line contains the integer number N (1 &le; N &le; 100000). The next N lines contain two space-separated integers each, the x and y coordinates of one of the points (0 &le; x, y &le; 10<sup>9</sup> ).</p>

### 출력

<p>Print the minimum possible side length of the 3 squares, such that all the N points are covered by them.</p>

### 힌트

<p>You can place the 3 squares with their bottom-left corners at the following coordinates: (0,0), (8,0), (7,1).</p>