# [Platinum V] Alicia’s Afternoon Amble - 11291

[문제 링크](https://www.acmicpc.net/problem/11291)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 18, 맞힌 사람: 16, 정답 비율: 94.118%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Alicia is staying in a hotel on the edge of town. She sets out in the morning with a list of landmarks to visit all across the city. This day of sightseeing will take her through the city, visiting a number of locations, all the way to the far-side of city where she will pause for lunch at the prestigious Pete&rsquo;s Polygon Pizza Parlour. Anything she misses must be visited on the return trip to the hotel in the evening.</p>

<p>Given the set of locations that Alicia would like to visit, find the length of the shortest tour which starts at her hotel, visits each of the locations, and returns back to the hotel. Beside the starting location, each location should be visited exactly once.</p>

<p>The starting hotel will be located at the leftmost x-coordinate. From there, the optimal path should visit locations at strictly increasing x-coordinates until Pete&rsquo;s Parlour is reached at the rightmost x-coordinate. From here, the optimal return path should visit any and all unseen locations in strictly decreasing x-coordinates. Note that the x-coordinate of each location will be unique.</p>

### 입력

<p>The (x, y) coordinates of all locations are given as integers on a Euclidean plane. The first line of input contains a single integer n, 1 &le; n &le; 1000, representing the number of locations. Each of the next n lines contains two integers x and y, 0 &le; x, y &le; 100000, representing the coordinates of the n locations.</p>

### 출력

<p>The output should consist of a single decimal containing the the total length of the tour rounded to two decimal places. This should immediately be followed by a newline.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11291/1.png" style="height:187px; width:213px" /></p>

<p style="text-align: center;">The locations and optimal solution for sample input 1.</p>