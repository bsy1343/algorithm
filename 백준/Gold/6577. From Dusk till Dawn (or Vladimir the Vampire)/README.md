# [Gold III] From Dusk till Dawn (or Vladimir the Vampire) - 6577

[문제 링크](https://www.acmicpc.net/problem/6577)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 20, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

자료 구조, 그래프 이론, 집합과 맵, 최단 경로, 해시를 사용한 집합과 맵, 데이크스트라

### 문제 설명

<p>Vladimir has white skin, very long teeth and is 600 years old, but this is no problem because Vladimir is a vampire.</p>

<p>Vladimir has never had any problems with being a vampire. In fact, he is a very successful doctor who always takes the night shift and so has made many friends among his colleagues. He has a very impressive trick which he shows at dinner partys: He can tell tell blood group by taste.</p>

<p>Vladimir loves to travel, but being a vampire he has to overcome three problems.</p>

<ul>
	<li>First, he can only travel by train because he has to take his coffin with him. (On the up side he can always travel first class because he has invested a lot of money in long term stocks.)</li>
	<li>Second, he can only travel from dusk till dawn, namely from 6 pm to 6 am. During the day he has to stay inside a train station.</li>
	<li>Third, he has to take something to eat with him. He needs one litre of blood per day, which he drinks at noon (12:00) inside his coffin.</li>
</ul>

<p>You should help Vladimir to find the shortest route between two given cities, so that he can travel with the minimum amount of blood. (If he takes too much with him, people will ask funny questions like &quot;What do you do with all that blood?&quot;)</p>

### 입력

<p>The first line of the input will contain a single number telling you the number of test cases.</p>

<p>Each test case specification begins with a single number telling you how many route specifications follow.</p>

<p>Each route specification consists of the names of two cities, the departure time from city one and the total travelling time. The times are in hours. Note that Vladimir can&#39;t use routes departing earlier than 18:00 or arriving later than 6:00.</p>

<p>There will be at most 100 cities and less than 1000 connections. No route takes less than one hour and more than 24 hours. (Note that Vladimir can use only routes with a maximum of 12 hours travel time (from dusk till dawn).) All city names are shorter than 32 characters.</p>

<p>The last line contains two city names. The first is Vladimir&#39;s start city, the second is Vladimir&#39;s destination.</p>

### 출력

<p>For each test case you should output the number of the test case followed by &quot;<code>Vladimir needs # litre(s) of blood.</code>&quot; or &quot;<code>There is no route Vladimir can take.</code>&quot;</p>