# [Platinum I] Gas Stations - 27197

[문제 링크](https://www.acmicpc.net/problem/27197)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 12, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>Michelle and Marie went to a journey by their car. During the journey they are going to drive along the long straight road. There are $n$ gas stations on the road. Gas stations are numbered from $1$ to $n$ along the road. Initially the car is located in the city at the beginning of the road, at the same place there is a gas station number $1$.</p>

<p>Gas station number $i$ is located at the distance of $x_i$ kilometers from the beginning of the road and sells gas for the price of $p_i$ dollars per liter. It is only allowed to purchase an integer number of liters of gas at each station. One liter of gas is enough to drive $1$ unit of distance along the road. The gas tank of the car has the capacity of $C$ liters. Initially the tank is empty.</p>

<p>Michelle and Marie have $B$ dollars in total to be spent on gas. How far along the road are they able to go if they don&#39;t bother about the way back yet?</p>

### 입력

<p>The first line of input contains three integers $n$, $B$ and $C$ --- the number of gas stations, total budget in dollars and the capacity of the gas tank in liters correspondingly ($1 \le n \le 10^5$; $1 \le B \le 10^9$; $1 \le C \le 10^9$).</p>

<p>Each of the next $n$ lines contains two integers $x_i$ and $p_i$ --- the coordinate of $i$-th gas station and the gas price there correspondingly ($0 = x_1 &lt; x_2 &lt; \ldots &lt; x_n \le 10^9$; $1 \le p_i \le 10^9$).</p>

### 출력

<p>Output one integer --- maximal possible distance that may be driven along the road.</p>

### 힌트

<p>In the sample test it is possible to buy $1$ liter of gas at the first station, drive $1$ unit of distance, buy $5$ liters of gas at the second station, drive another $3$ units of distance to get to the third station. At this moment there are $2$ liters of gas in the tank, the friends can buy another $1$ liter of gas and drive another $3$ units of distance, finishing their trip at a distance of $7$ from the beginning.</p>