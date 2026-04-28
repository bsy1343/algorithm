# [Gold III] Adventures in Moving - Part IV - 4361

[문제 링크](https://www.acmicpc.net/problem/4361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>To help you move from Waterloo to the big city, you are considering renting a moving truck. Gas prices being so high these days, you want to know how much the gas for such a beast will set you back.</p>

<p>The truck consumes a full litre of gas for each kilometre it travels. It has a 200 litre gas tank. When you rent the truck in Waterloo, the tank is half full. When you return it in the big city, the tank must be at least half full, or you&#39;ll get gouged even more for gas by the rental company. You would like to spend as little as possible on gas, but you don&#39;t want to run out along the way.</p>

### 입력

<p>Input is all integers. The first integer is the distance in kilometres from Waterloo to the big city, at most 10000. Next comes a set of up to 100 gas station specifications, describing all the gas stations along your route, in non-decreasing order by distance. Each specification consists of the distance in kilometres of the gas station from Waterloo, and the price of a litre of gas at the gas station, in tenths of a cent, at most 2000.</p>

### 출력

<p>Output is the minimum amount of money that you can spend on gas to get you from Waterloo to the big city. If it is not possible to get from Waterloo to the big city without running out of gas along the way, output &quot;Impossible&quot;.</p>