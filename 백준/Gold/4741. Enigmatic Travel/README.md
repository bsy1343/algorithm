# [Gold V] Enigmatic Travel - 4741

[문제 링크](https://www.acmicpc.net/problem/4741)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

수학, 조합론

### 문제 설명

<p>Suhan and Laina live in an n-dimensional city where there are (n+1) locations. Any two locations (consider these locations as points) are equidistant from each other and connected by only one bi-directional road. They love to roam together around the city on their favourite bi-verbal (A kind of vehicle). Kiri, a tenth generation robot also lives in the same city and wants to kill Suhan out of jealousy. That is why Suhan and Laina are very careful about keeping their thoughts and plans secret. Therefore nobody knows a) Where Suhan and Laina lives. b) What their destination location is. c) Which roads will they use?&nbsp;</p>

<p>So their journey can start from any location, ends in another location and they may use any road sequence they like. Their destination location may be same or different than the source location. For example when their tour is guaranteed to be a simple cycle their source and destination location are same.&nbsp;</p>

<p>Given the number of locations in the city (L) you will have to find the expected cost (often considered as average) of one of their single travelling. You can assume that the cost of travelling from one location to another through the direct (also shortest) path is 1 universal joule.</p>

### 입력

<p>The input file contains several lines of input. Each line contains a single integer L(15 &ge; L &gt; 2) that indicates the number of locations in the city. Input is terminated by a line where value of L is zero. This line should not be processed.</p>

<p>&nbsp;</p>

### 출력

<p>For each line of input produce one line of output. This line contains three floating-point numbers F1, F2, F3. Here F1 is the expected cost when they travel along a path, F2 is the expected cost when it is guaranteed that they travel along a simple path and F3 is the expected cost when it is guaranteed that they travel along a simple cycle. All the floatingpoint numbers should be rounded up to four digits after the decimal point. You must assume that their travelling cost is not greater than (L). Travelling cost is always expressed in universal joule.</p>

<p>&nbsp;</p>