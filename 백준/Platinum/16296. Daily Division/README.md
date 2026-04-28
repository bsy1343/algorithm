# [Platinum IV] Daily Division - 16296

[문제 링크](https://www.acmicpc.net/problem/16296)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 128, 정답: 51, 맞힌 사람: 41, 정답 비율: 43.158%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 삼분 탐색

### 문제 설명

<p>Oostende Beach is a very long beach located in the north of Belgium. On this beach, there are n huts located along a straight line. People can rent a room in one of those huts to spend their beach vacations together with the other tenants.</p>

<p>Every day at lunch time, a food truck rides by to serve fries to the guests. The truck will park in front of one of the huts and people will form two queues. The people staying in huts to the left of the food truck will queue on the left, and the people to the right of the food truck will queue together on the right. The people staying in the hut in front of the food truck will split their group in half, one half going to the left queue and the other half going to the right queue. If this is an odd number of people, the remaining person will go to the queue with fewer people, or choose one randomly if the queues have the same length. The food truck will always position itself so that the difference between the number of people in the left queue and the number of people in the right queue is as small as possible.</p>

<p>Each night the number of guests in exactly one of the huts changes. Can you help the food truck find the best position for each day?</p>

### 입력

<ul>
	<li>The first line of the input consists of two integers 1 &le; n &le; 10<sup>5</sup>, the number of huts, and 1 &le; q &le; 10<sup>5</sup>, the number of days.</li>
	<li>The second line has n integers a<sub>0</sub>, . . . , a<sub>n&minus;1</sub> satisfying 1 &le; a<sub>i</sub> &le; 10<sup>6</sup> for 0 &le; i &lt; n, where a<sub>i</sub> is the current number of people in hut i.</li>
	<li>Then follow q lines with two integers 0 &le; i &lt; n and 1 &le; x &le; 10<sup>6</sup>. The j th of these lines indicates that at day j the number of people in hut i changes to x.</li>
</ul>

### 출력

<ul>
	<li>Print q lines: the optimal position of the foodtruck after each of the q nights. If there are multiple optimal positions, print the smallest one.</li>
</ul>