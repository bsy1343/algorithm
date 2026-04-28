# [Platinum V] Feed Store - 26586

[문제 링크](https://www.acmicpc.net/problem/26586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>You work at a feed store and want to make your delivery routes more efficient. You have a list of how much feed each nearby farm needs, a map of the roads and the total amount of feed your truck can carry. Write a program that will take in all that data and give you the shortest number of miles for completing your first delivery and the path for the route. A delivery route will always start and end with &lsquo;A&rsquo;. &lsquo;A&rsquo; will always be the store you are delivering from.</p>

<p>Note: There may be several best paths with the same distance, so you may not get the same exact path as the sample data, but your solution needs to be correct and be of the shortest distance.</p>

<p>Here is an example:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b18b0900-775f-417b-acb9-8b990dd1d1aa/-/preview/" style="width: 471px; height: 185px;" /></p>

### 입력

<p>The first line will contain a number that indicates how much feed your truck can carry.</p>

<p>The second line will contain how much feed each farm wants. A farm name will always be a single uppercase letter. Each farm will list how much feed they want as 0 to 9 units of feed. The data for each farm will be a single letter followed immediately by a single digit. Each farm&rsquo;s data will be separated by a single space.</p>

<p>Finally, there will be an unknown number of lines defining the connections between farms and the store / other farms. Connections will be in the following format:</p>

<pre>
locationA/locationB-distanceApart</pre>

### 출력

<p>Output the distance of the shortest solution and the path for that solution. The format will for the solution will be:</p>

<pre>
(distance) &ndash; path</pre>

<p>with a single space on each side of the dash.</p>