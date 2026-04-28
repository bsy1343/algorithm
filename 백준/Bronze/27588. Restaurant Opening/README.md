# [Bronze II] Restaurant Opening - 27588

[문제 링크](https://www.acmicpc.net/problem/27588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 145, 정답: 130, 맞힌 사람: 114, 정답 비율: 91.935%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<figure style="float: right;"><img alt="" src="https://upload.acmicpc.net/5af31fcd-2897-4b8a-9ef6-715b7c760a39/-/resize/600x/" style="width: 200px; height: 300px;" />
<figcaption>Image by <a href="https://www.freepik.com/free-photo/vertical-shot-orange-blue-neon-sign-that-says-open-bar_17247073.htm">wirestock on Freepik</a></figcaption>
</figure>

<p>It is said that the three most important factors for determining whether or not a business will be successful are location, location, and location.  The Incredible Cooks Preparing Cuisine are opening a new restaurant in the International City Promoting Cooking, and they have hired you to find the optimal location for their restaurant.</p>

<p>You decide to model the city as a grid, with each grid square having a specified number of people living in it.  The distance between two grid squares $(r_1,c_1)$ and $(r_2,c_2)$ is $|r_1-r_2|+|c_1-c_2|.$ In order to visit the restaurant, each potential customer would incur a cost equal to the minimum distance from the grid square in which they live to the grid square containing the proposed location of the restaurant.  The total cost for a given restaurant location is defined as the sum of the costs of everyone living in the city to visit the restaurant.</p>

<p>Given the current city layout, compute the minimum total cost if the Incredible Cooks Preparing Cuisine select their next restaurant location optimally.</p>

### 입력

<p>The first line of input contains two integers, $n$ and $m$ ($1 &lt; n,m \le 50$), where $n$ is the number of rows in the city grid and $m$ is the number of columns.</p>

<p>Each of the next $n$ lines contains $m$ integers $g_{ij}$ ($0\le g_{ij}\le 50$), which specifies the number of people living in the grid square at row $i$, column $j$.</p>

### 출력

<p>Output a single integer, which is the total cost if the restaurant is selected optimally.</p>