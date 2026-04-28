# [Platinum II] Gathering - 10524

[문제 링크](https://www.acmicpc.net/problem/10524)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 110, 정답: 23, 맞힌 사람: 21, 정답 비율: 33.333%

### 분류

미적분학, 구현, 수학, 삼분 탐색

### 문제 설명

<p>The citizens of Fictitia have had enough! The city keeps getting bigger and bigger, and all the more boring. Fictitia consists of horizontal and vertical streets only. The distance between each pair of neighboring parallel streets is always the same; we take this as the unit distance. Surely some variation could not hurt?</p>

<p>In order to draw more support and make their unhappiness known to the municipality, a group of citizens has agreed to gather at an intersection of the city to protest. The question is: which intersection? Since there is not much difference between them, the idea was raised to select an intersection (x<sup>&lowast;</sup>, y<sup>&lowast;</sup>) that minimizes the total distance everyone has to travel. Since everyone lives close to an intersection, the individual distance travelled by someone who lives at (x, y) is given by |x &minus; x<sup>&lowast;</sup>| + |y &minus; y<sup>&lowast;</sup>|.</p>

<p>However, this could present a problem for the people who live far away, since they might have trouble getting there in time. Therefore it was decided that the intersection should be at most a certain distance d away from everyone. Given that restriction, can you help them identify an intersection that minimizes the total distance everyone has to travel?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with one integer n (2 &le; n &le; 100 000), the number of citizens;</li>
	<li>n lines each with two integers x and y (0 &le; x, y &le; 10<sup>9</sup>), the coordinates of each citizen&rsquo;s house;</li>
	<li>one line with one integer d (0 &le; d &le; 2 &middot; 10<sup>9</sup>), the maximum distance that each citizen should have to travel.</li>
</ul>

<p>It is possible for multiple citizens to live at the same intersection.</p>

### 출력

<p>Output one line with a single integer: the smallest possible total distance that all citizens need to travel. If there is no intersection that everyone lives within a distance d of, output &ldquo;impossible&rdquo; instead.</p>