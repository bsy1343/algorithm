# [Platinum V] Treasure Spotting - 22284

[문제 링크](https://www.acmicpc.net/problem/22284)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 10, 맞힌 사람: 8, 정답 비율: 30.769%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>For Timmy&#39;s birthday his parents threw him a pirate themed party! A treasure is buried in the yard and now it is up to Timmy and his pirate crew to find it. Help the pirates find the treasure by letting them know who can see where the treasure is buried.</p>

<p>To make the game interesting, there are walls placed in the yard to obscure vision. Each pirate has a field of view that determines what they can see. Each pirate can see a certain distance away and can only see in a semi-circle based on the direction they are looking (see image below). A point cannot be seen in a pirate&#39;s field of view if either another pirate or some part of a wall is directly between the point that is being looked at and the pirate that is looking. &nbsp;Each pirate is a single point, and each wall is an infinitely thin line.</p>

<p>Which pirates can see where the treasure is buried?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22284.%E2%80%85Treasure%E2%80%85Spotting/417a779a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22284.%E2%80%85Treasure%E2%80%85Spotting/417a779a.png" data-original-src="https://upload.acmicpc.net/2c59c6ae-d7cf-49a3-a965-244d1df448fb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 448px; height: 152px;" /></p>

<p>Figure F.1:&nbsp;The left picture illustrates Sample Input 1 where the right-most pirate is the only one who can see the location of the buried treasure. The right picture illustrates Sample Input 2 where the middle pirate is the only one who can see the buried treasure.</p>

### 입력

<p>The first line of input contains two integers $W$ ($0 \leq W \leq 1 \, 000$), which is the number of walls and $P$ ($1 \leq P \leq 1 \, 000$), which is the number of pirates.</p>

<p>The second line contains the coordinates of the treasure.</p>

<p>The next $W$ lines describe the walls. Each of these lines contains two coordinates $(x,y)$ and $(x&#39;,y&#39;)$ which are the two (distinct) endpoints of this wall.</p>

<p>The next $P$ lines describe the pirates. The $i$th of these lines contains two (distinct) coordinates $(x_i,y_i)$, which is the position of the $i$th pirate, and $(x_i&#39;,y_i&#39;)$, which is the furthest point that this pirate can see in the direction they are looking. That is, the radius of the semi-circle for this pirate is the distance between $(x_i, y_i)$ and $(x_i&#39;,y_i&#39;)$.</p>

<p>All coordinates are an $(x,y)$ integer pair with $|x|,|y| \leq 10^9$. No two pirates will have the same coordinate position, the treasure will not share a coordinate position with any pirate and no part of any wall will touch a pirate or the treasure. Note that walls can overlap in any way with other walls.</p>

### 출력

<p>Display $P$ lines, one per pirate. The $i$th of these lines should display <code>visible</code> if the $i$th pirate can see where the treasure is buried and <code>not visible</code> otherwise.</p>