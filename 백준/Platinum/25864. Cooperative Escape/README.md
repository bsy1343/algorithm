# [Platinum III] Cooperative Escape - 25864

[문제 링크](https://www.acmicpc.net/problem/25864)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p>Bonnie and Clyde have noticed that parallel processing improves throughput so, instead of robbing one bank together, they&rsquo;ve decided to rob two different banks simultaneously (each robbing one). They both succeeded and now they need to run to their get-away 1934 Ford Model (730 Deluxe Sedan). There are complications, of course, or the movie won&rsquo;t be exciting!</p>

<p>The city is in the shape of a matrix with cells. Bonnie and Clyde are in two different cells, and the get-away car is in a different cell as well. Bonnie and Clyde can move in four directions: north, south, east, and west (the border cells of course have fewer move options since they cannot move across the outer walls of the city). Some cells are also blocked, i.e., neither one can move into it. To put more adventure in the movie, it is also the case that once Bonnie or Clyde moves into a cell, then neither one can move into that cell anymore, i.e., a cell is used at most once. Bonnie and Clyde cannot move into each other&rsquo;s starting position either.</p>

<p>Given the city map (in the form of a matrix), the location for Bonnie, Clyde, and car, you are to compute the minimum total number of moves needed for both Bonnie and Clyde to get to the car, i.e., the total number of moves made by Bonnie plus the total number of moves made by Clyde.</p>

### 입력

<p>The first input line contains two integers, r and c (2 &le; r, c &le; 30), providing the number of rows and columns for the matrix. Each of the next r lines contains c characters, starting in column 1; this is the input matrix. There will be exactly one &ldquo;B&rdquo; (Bonnie&rsquo;s starting location), one &ldquo;C&rdquo; (Clyde&rsquo;s starting location), and one &ldquo;F&rdquo; (where the get-away Ford car is) in the input maze. The remaining cells will be &ldquo;.&rdquo; (empty cell &ndash; one can move into) or &ldquo;x&rdquo; (blocked &ndash; one cannot move into).</p>

### 출력

<p>Print the minimum total number of moves needed for both Bonnie and Clyde to get to the car. If they cannot get to the car, print -1. Note that when one reaches the car, he/she stops moving.</p>

### 힌트

<p>Sample Explanation: In the first sample case, Bonnie can reach the car with 4 moves and Clyde can reach the car with 5 moves, for a total of 9 moves.</p>