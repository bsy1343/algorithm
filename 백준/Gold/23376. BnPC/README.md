# [Gold I] BnPC - 23376

[문제 링크](https://www.acmicpc.net/problem/23376)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 381, 정답: 78, 맞힌 사람: 70, 정답 비율: 25.547%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>You are playing your favorite game, Basements and Pigeonlike Creatures, for the umpteenth time. You know the game pretty well, but you have never spent enough time on it to figure out the best strategy. That is, until now. The game consists of a certain sequence of events, such as battling a monster or saving a cat from a tree, and you need to complete all events to win. Attached to each event is an attribute, such as strength, and a threshold, some positive integer. If your attribute score matches or exceeds the threshold, you successfully complete the event! If not, it is unfortunately game over and your total score will be zero.</p>

<p>If you complete all the events successfully, your score depends on how well you did during these events. If your attribute score matches the threshold of an event exactly, you get 0 points, barely scraping by that event. If you exceed the threshold, you get points equal to your attribute score that was used for that event.</p>

<p>You are now at the final part of the game, but first you have some attribute points to spend to increase your attribute scores. You know what events will happen during the final part of the game, so all that is left is to figure out what attributes to increase.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing an integer $n$ ($1 \leq n \leq 10^5$) and an integer $k$ ($1 \leq k \leq 10^9$), the number of attributes and the number of attribute points you can still spend.</li>
	<li>$n$ lines, each containing a distinct attribute name, and an integer $s$ ($0 \leq s \leq 10^9$), the current score you have in that attribute.</li>
	<li>One line containing an integer $l$ ($1 \leq l \leq 10^5$), the number of events.</li>
	<li>$l$ lines each describing one event, containing the name of the attribute that is used, and an integer $t$ ($0 \leq t \leq 10^9$), the threshold for this event.</li>
</ul>

<p>Attribute names consist of upper case English letters (<code>A-Z</code>), and have a length between $1$ and $20$ characters inclusive.</p>

### 출력

<p>Output the maximum score you can get from the events.</p>