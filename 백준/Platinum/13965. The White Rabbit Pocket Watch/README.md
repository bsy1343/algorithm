# [Platinum II] The White Rabbit Pocket Watch - 13965

[문제 링크](https://www.acmicpc.net/problem/13965)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 32, 맞힌 사람: 26, 정답 비율: 65.000%

### 분류

가우스 소거법, 그래프 이론, 선형대수학, 수학, 최단 경로

### 문제 설명

<p>Alice: How can it be?</p>

<p>Rabbit: Trust me Alice. It always takes the same time. When I go from my home up the road to Queen of Hearts&#39; Castle, my watch counts nine hours. However, if I continue cown to Mad Hatter&#39;s house, my watch counts just two hours in total. Isn&#39;t that great?</p>

<p>Alice: How can it be Rabbit? The path is longer and you take a shorter time to do it? How can it be?</p>

<p>Rabbit: Trust me Alice! It is all recorded in my logbook. You can check it. All my trips are there...</p>

<p>Alice: Rabbit, I do not think it can help me...</p>

<p>Rabbit: Alice, no matter where you are, or where you want to go, or the track you choose, you&#39;ll be able to find how long it takes you.</p>

<p>Alice: Really?</p>

<p>Rabbit: For sure!</p>

<p>Poor Rabbit, poor Alice.</p>

<p>White Rabbit is helping Alice finding a quick way home through the Rabbit&#39;s hole with his holy logbook of trips. The problem lied in the chronometer of its bizarre pocket watch (it displays the hours from zero to 12), and the way the Rabbit counts the time with it: If a journey takes 14 hours (real time), seeing the pointer resting above number one, he assumes it took one hour long.</p>

<p>Given that the White Rabbit is telling the truth, can you help Alice finding how long the shortest path home takes, using the Rabbit&#39;s logbook of trips?</p>

<p>Your task is to find the shortest real time it takes for Alice to go from her present location to the Rabbit&#39;s hole. For each trip, the White Rabbit wrote down the trip time, the number of visited locations (not necessarily distinct) and the sequence in which they were visited. That sequence defines the trip because there is at most one direct track between any two locations in the Wonderland and it takes the same time both ways.</p>

### 입력

<p>The first line contains four integers N, A, R and T, where: N is the number of distinct lacaions; A identifies the place where Alice is lacated; R corresponds to the Rabbit&#39;s hole location; and T is the number of trips recorded in White Rabbit&#39;s logbook. All locations are identified by numbers from 1 to N. Each of the next T lines describes a trip logged with format d p a<sub>1</sub> a<sub>2</sub> ... a<sub>p</sub>, where d is the trip duration (according to White Rabbit), p is the number of locations and a<sub>1 </sub>a<sub>2</sub> ... a<sub>p</sub> is the sequence of visited locations.</p>

<ul>
</ul>

### 출력

<p>An integer representing the shortest (real) time it takes for Alice to get home.</p>

### 제한

<ul>
	<li>2 &le; N &le; 200 Number of locations</li>
	<li>1 &le; T &le; 500 Number of trips in the logbook</li>
	<li>2 &le; p &le; 800 Number of (possibly repeated) locations in a trip</li>
	<li>1 &le; d<sub>ij</sub> &le; 12 Real time of the direct track between a<sub>i</sub> and a<sub>j</sub> (if it exists)</li>
	<li>There are at most 200 direct tracks</li>
</ul>