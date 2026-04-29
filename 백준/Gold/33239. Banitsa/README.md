# [Gold I] Banitsa - 33239

[문제 링크](https://www.acmicpc.net/problem/33239)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 너비 우선 탐색, 이분 그래프, 평면 그래프

### 문제 설명

<p>The Yellow Duckling's favourite dish is banitsa (a traditional Bulgarian dish that is similar to a cheese pie)! That is why his mother made him one last week and since he is really greedy, he ate almost all of it and there were only a few pieces left. The Duckling chose to eat them for breakfast and thus went to buy his favourite yoghurt to put as a topping in the morning. Then he put the pieces in a circle, enumerated them in a clock-wise direction and just before putting a spoon of yoghurt on the first one, his mother interrupted him and said that his father should also try the banitsa (and his father really hates yoghurt for some reason?!). Thus, she indicated some pairs of pieces that were supposed to have different toppings. The interesting part of those pairs was that if you connected all pairs of pieces with a line, there were not any two lines that were ever crossing.</p>

<p>Since the Yellow Duckling is really concerned about the family budget (which isn't really high after the COVID-19 crisis anyway...), he wants to show empathy for his parents and to buy as few toppings for the banitsa as possible with which he would be able to satisfy his mom's conditions. But it is still only 3 years old and does not find algorithms such an interesting topic as we do (let's hope it understands how cool they are when it grows up) and asks you to help him with this task.</p>

### 입력

<ul>
	<li>One line with two integers: $2 \leq n \leq 10^6$, the pieces of banitsa left. $2 \leq m \leq 10^5$, the number of pairs.</li>
	<li>$m$ lines (one for each pair of pieces), containing the indices of the pieces which should be topped with different toppings.</li>
</ul>

### 출력

<p>The minimum number of different toppings the Yellow Duckling needs to buy.</p>