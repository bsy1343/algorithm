# [Gold I] Edgar Mine - 34393

[문제 링크](https://www.acmicpc.net/problem/34393)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 기하학, 수학, 스위핑, 정렬, 피타고라스 정리

### 문제 설명

<p>The year is 1894. Mines has just acquired the Edgar Mine in Idaho Springs, Colorado and it's your job as the mine foreman to see what Mines has just purchased.</p>

<p>While exploring the mine, you notice that there are a few different strands of light bulbs all hanging at different heights from the ceiling of the mine shaft, and all of the lights are on, which is rather blinding (and wasteful). Electricity prices at the mine are extremely high due to the remote location.</p>

<p>The previous electrical engineer for the mine has diagrams that provide the exact height from the floor (in meters) and luminosity of each light bulb (in lumens). The brightness of a light bulb $B$ can be calculated using the inverse-square law: \[ B = \frac{L}{4 \pi D^2} \] where,</p>

<ul>
	<li>$L=\text{the luminosity (in lumens)}$, and</li>
	<li>$D = \text{the distance from the bulb (in meters)}$.</li>
</ul>

<p>One lumen per square meter is known as a lux.</p>

<p>Safety regulations require that each point along the mine is lit to a minimum of $W$ lux by a single light bulb. If a point is lit to a total of $W$ lux by two separate light bulbs, but neither light bulb would light that point to at least $W$ lux by itself, the regulation has not been met. Can you determine the minimum number of light bulbs that must be turned on to follow the regulation?</p>

<p>If a light bulb lights up the floor of the shaft directly below it with $X$ lux, you can assume that it lights up the entire width of the shaft floor with $X$ lux (i.e. no need to consider the width of the shaft). You are guaranteed that you will be able to fulfill the safety regulation with some combination of bulbs.</p>

### 입력

<p>The first line of input contains three space-separated integers: the length of the shaft (in meters), $1 \leq S \leq 10^6$, the number of light bulbs $1 \leq N \leq 10^6$ and the required minimum brightness (in lux) $1 \leq W \leq 1\,000$. Each of the next $N$ lines contains three space-separated values containing information pertaining to the $N^{th}$ bulb: the distance (an integer in meters) of the bulb from the shaft entrance $0 \leq E \leq S$, the height (a float in meters) of the bulb from the floor of the shaft $0 \leq H \leq 100$, and the luminosity (an integer in lumens) $0 \leq L \leq 10^6$.</p>

### 출력

<p>The first (and only) line of output is the minimum number of light bulbs you can turn on to fulfill the safety regulation.</p>