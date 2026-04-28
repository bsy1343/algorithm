# [Platinum III] City Attractions - 14875

[문제 링크](https://www.acmicpc.net/problem/14875)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 2289, 정답: 310, 맞힌 사람: 201, 정답 비율: 13.137%

### 분류

다이나믹 프로그래밍, 자료 구조, 그래프 이론, 트리, 최단 경로, 데이크스트라, 트리에서의 다이나믹 프로그래밍, 희소 배열, 함수형 그래프, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>In the beautiful country of Moldova there are N cities, indexed from 1 to N, with bidirectional roads connecting some of them. In order to be more economical, the government built exactly N - 1 roads connecting these cities, such that you can go between any two cities by walking through some of the roads.</p>

<p>By a national decree, each of the N cities in Moldova has been assigned a non-negative beauty factor. For city i this beauty factor is equal to a<sub>i</sub>. Different cities could have equal beauty factors.</p>

<p>Our hero Gigel has arrived to Moldova and he&rsquo;s currently in city number 1. He&rsquo;s really eager to visit all the beautiful cities, but he&rsquo;s quite indecisive and can&rsquo;t decide which ones to visit, mainly because he has limited time. He will be staying in Moldova for K more days, and on each day he&rsquo;ll visit some city. On the i<sup>th</sup> day, he will start from city x in which he ended up the previous day (x = 1 if it&rsquo;s his first day), and he&rsquo;ll find another city y &ne; x such that a<sub>y</sub> - d(x, y) is maximal. Here d(x, y) denotes the minimum number of roads you need to travel starting from city x in order to reach city y. If there are multiple such cities, he&rsquo;ll choose the one with the minimal index. After this he&rsquo;ll go to city y and will stay there to admire the local attractions for the remaining time of day i. The next day he&rsquo;ll repeat this process again.</p>

<p>Gigel is wondering in which city will he end up at the end of the K<sup>th</sup> day, and he&rsquo;s asking for your help!</p>

<p>Write a program that will calculate in which city Gigel will end up after K days.</p>

### 입력

<p>The first line of the standard input contains two integers N and K the number of cities and the number of days Gigel will be visiting. The next line of the standard input will contain N integers a<sub>i</sub> where a<sub>i</sub> denotes the beauty of the i<sup>th</sup> city. The next N - 1 lines of the standard input contain two integers u<sub>i</sub> and v<sub>i</sub>, with the meaning that there is a bidirectional road between cities u<sub>i</sub> and v<sub>i</sub>.</p>

### 출력

<p>Write in the standard output one integer - the index of the city Gigel will end up at the end of the K<sup>th</sup> day.</p>

### 제한

<ul>
	<li>1 &le; N &le; 3&middot;10<sup>5</sup>.</li>
	<li>1 &le; K &le; 10<sup>18</sup>.</li>
	<li>0 &le; a<sub>i</sub> &le; 10<sup>9</sup>.</li>
	<li>It is guaranteed that the city network is connected.</li>
</ul>

### 힌트

<p>On the 1<sup>st</sup> day Gigel will leave city 1 to visit city 3, on the 2<sup>nd</sup> day he will leave city 3 to visit city 5, on the 3<sup>rd</sup> day he will leave city 5 to visit city 2 and on the 4<sup>th</sup> and last day he will leave city 2 to visit city 5 again.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14875.%E2%80%85City%E2%80%85Attractions/0f5cf415.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14875/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:232px; width:279px" /></p>