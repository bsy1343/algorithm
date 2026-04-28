# [Platinum II] Knapsack Collection - 10528

[문제 링크](https://www.acmicpc.net/problem/10528)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 123, 정답: 45, 맞힌 사람: 40, 정답 비율: 35.714%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Gerald&rsquo;s job is to welcome the teams for this year&rsquo;s NWERC at the airport in Link&ouml;ping. One of his duties is to stand at the luggage carousel and collect all the knapsacks that the teams are bringing. Gerald is a lazy person, so he just stands at the same position of the carousel and waits for bags to pass by so he can pick them up.</p>

<p>The baggage carousel consists of s luggage slots, numbered in ascending order from 0 to s &minus; 1. Since the baggage carousel is cyclic, luggage slots s &minus; 1 and 0 also lie side by side. The carousel turns in such a way that if Gerald stands in front of slot i at some point in time, he will stand in front of slot (i + 1) mod s one time unit later.</p>

<p>In the beginning Gerald prepares a huge baggage cart at some position and stands there to wait for luggage. When a knapsack arrives in front of Gerald, he needs t time units to take it and put it on the baggage cart. After these t time units he is ready to pick up another knapsack. As long as there are remaining knapsacks on the luggage carousel, Gerald always takes the next one to arrive at his position as soon as he is ready after putting away the previous one.</p>

<p>Now Gerald wonders about the effect of his choice of position on the time it will take him to finish this task. It is up to you to help Gerald calculate the minimum, maximum, and average time to pick up all knapsacks, taken over all s possible slots, which can appear in front of Gerald after preparation. Time starts when he has prepared the baggage cart at some slot of the baggage carousel and ends after he has put the last knapsack on the cart.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with three integers n (1 &le; n &le; 2 000), s (1 &le; s &le; 10<sup>7</sup>) and t (1 &le; t &le; 10<sup>7</sup>), where n is the number of knapsacks to pick up, s is the number of slots of the carousel, and t is the number of time units Gerald needs to pick up a knapsack from the carousel and put it on the cart;</li>
	<li>one line with n integers k<sub>1</sub>, . . . , k<sub>n</sub> (0 &le; k<sub>i</sub> &le; s &minus; 1 for 1 &le; i &le; n), the slots of the knapsacks.</li>
</ul>

<p>There may be several knapsacks stacked on top of each other in the same slot, but Gerald can still only pick up one knapsack at a time.</p>

### 출력

<p>Output three lines of output containing the minimum, maximum, and average time to pick up all the luggage, over all s positions. The average time should be output as a reduced fraction in the form p/q.</p>