# [Gold III] TELEPORT - 3236

[문제 링크](https://www.acmicpc.net/problem/3236)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 43, 맞힌 사람: 21, 정답 비율: 52.500%

### 분류

브루트포스 알고리즘, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>One morning Lucy and Jimmi woke up in an unknown spaceship. They looked around the ship, walked and walked, went through every room and corridor, but they haven&#39;t found anybody.</p>

<p>One day, Lucy said between two mouthfuls of cooked weed:</p>

<p>Lucy: &quot;Hey Jimmi, did you see the two rooms with the teleport?&quot;</p>

<p>Jimmi: &quot;Teleport? What is a teleport? Lucy, lay down on the weed, it looks like it&#39;s hallucinogenic.&quot;</p>

<p>Lucy: &quot;You know good and well who&#39;s hallucinogenic. The teleport is the thing that transports you between rooms so you don&#39;t need to walk.&quot;</p>

<p>Jimmi: &quot;I call that the room-to-room-transporter. And you&#39;r going on my nerves with that latin.&quot;</p>

<p>Lucy: &quot;OK, teleport, transporter, what&#39;s the difference. So have you seen it?</p>

<p>Jimmi: &quot;No.&quot;</p>

<p>Lucy: &quot;That&#39;s what i thaught, because I had trouble finding it. Let&#39;s play a game, I&#39;ll walk between some two rooms using the shortest path, and I&#39;ll be using the teleport if it is shorter that way, and you have to find out where it is located.&quot;</p>

<p>Jimmi: &quot;I think it&#39;s too hard. You know I&#39;m not that smart.&quot;</p>

<p>Lucy: &quot;Trust me, it&#39;s not too hard, I&#39;ll go a couple of times between different rooms, so it will be easier for you.&quot;</p>

<p>Jimmi: &quot;OK, but if I guess it right, promise me that you&#39;ll lay down on that stinking weed&quot;</p>

<p>Lucy: &quot;OK, I&#39;ll cut it down to five meals per day.&quot;</p>

<p>The spaceship consists of rooms and corridors connecting them. We know for every corridor the time needed to pass it, ans we don&#39;t need time to pass through rooms. Lucy walked K times between different pairs of rooms (and used the teleport when needed) and every time wrote down how many seconds it took him.</p>

<p>Write a program that will find out where the teleports are located.&nbsp;</p>

### 입력

<p>The first line of the input file consists of two integers N and M, 1 &le; N &le; 200, 1 &le; M &le; 20000, the number of the rooms and the number of corridors.</p>

<p>The next M lines consit of three integers A, B and T, divided by a single space. That means that the rooms A and B are connected by a corridor, and that we need T seconds to pass that corridor.</p>

<p>The next line consists of an integer K, 1 &le; K &le; 5000.</p>

<p>The next K lines consist of three integers A, B and T divided by a single space. That means that that it took Lucy T seconds to get from room A to room B.</p>

<p>Note: the sollution is always possible and unique.&nbsp;</p>

### 출력

<p>The first and the only line of the output file should consist of the room numbers of the two rooms where the teleport is situated. The first number sould be smaller than the second, and they should be divided by a single space.</p>