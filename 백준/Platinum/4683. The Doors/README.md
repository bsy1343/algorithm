# [Platinum V] The Doors - 4683

[문제 링크](https://www.acmicpc.net/problem/4683)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 18, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 데이크스트라, 다이나믹 프로그래밍, 기하학, 그래프 이론, 선분 교차 판정, 최단 경로

### 문제 설명

<p>You are to&nbsp;find the length of the shortest path through a chamber containing obstructing walls. The chamber will always have sides at x = 0, x = 10, y = 0, and y = 10. The initial and final points of the path are always (0,5) and (10,5). There will also be from 0 to 18 vertical walls inside the chamber, each with two doorways. The finger below illustrates such a chamber and also shows the path of minimal length.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4683.%E2%80%85The%E2%80%85Doors/5b7fc248.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4683.%E2%80%85The%E2%80%85Doors/5b7fc248.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/4683/1556_1.jpg.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The input data for the illustrated chamber would appear as follows.</p>

<pre>
2
4 2 7 8 9
7 3 4 5 6 7</pre>

<p>The&nbsp;first line contains the number of interior walls. Then there is a line for each such wall, containing five real numbers, The first number is the x coordinate of the wall (0 &lt; x &lt; 10), and the remaining four are the y coordinates of the ends if the doorways in that wall. The x coordinates of the walls are in increasing order and within each line the y coordinates are in increasing order. The input file will contain at least one such set of data. The end of the data comes when the number of walls is -1.</p>

### 출력

<p>The output file should contain one line of output for each chamber. The line should contain the minimal path length rounded to two decimal places past the decimal point, and always showing the two decimal places past the decimal point. The line should contain no blanks.,</p>