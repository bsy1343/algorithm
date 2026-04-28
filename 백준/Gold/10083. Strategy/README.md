# [Gold I] Strategy - 10083

[문제 링크](https://www.acmicpc.net/problem/10083)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 16 MB

### 통계

제출: 37, 정답: 14, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>During the World Cup 2014 qualifications, Serbia national football team had an interesting strategy. They were starting each attack by passing the ball from the player with the number N<sub>1</sub> to the player with the number N<sub>2</sub>. Each following pass was to the player whose number equals the absolute value of the difference between the numbers of the two players previously having the ball. More formally, after the player N<sub>i-2</sub> passes the ball to the player N<sub>i-1</sub>, the next player to receive the ball is the player N<sub>i</sub> = |N<sub>i-2</sub> &ndash; N<sub>i-1</sub>|.</p>

<p>This strategy, surprisingly, did not prove itself to be a useful one. Nevertheless, it made fans ponder who will be the K-th player to get the ball, given that the attack actually lasts long enough.</p>

### 입력

<p>The single line of input contains three non-negative integers, N<sub>1</sub>, N<sub>2</sub>, and K.</p>

### 출력

<p>The single line of output should contain the number N<sub>k</sub>.</p>

### 제한

<ul>
	<li>0 &le; N<sub>1</sub>, N<sub>2</sub> &lt; 2<sup>63</sup></li>
	<li>1 &le; K &lt; 2<sup>63</sup></li>
</ul>

### 힌트

<p>The players received the ball in the following order:</p>

<p>37, 16, 21, 5, 16, 11, 5, 6, 1, 5, 4, 1, 3, 2, 1, 1, 0, 1, 1, 0, &hellip;</p>

<p>The eight player to receive the ball is the player with the number 6.</p>