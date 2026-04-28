# [Gold I] Just Terraffic! - 15176

[문제 링크](https://www.acmicpc.net/problem/15176)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 18, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The local council is recording traffic flow using a pressure pad laid across the road. The pressure pad tracks whenever the wheels on an axle of a vehicle cross the pressure pad. The only vehicles using the road are cars with two axles. Each vehicle may or may not have a single-axle trailer attached to it. When a car crosses the pressure pad, two times are recorded: one when the front wheels cross and another when the rear wheels cross. If the car is towing a trailer an additional time is recorded when the trailer wheels cross. Given a sequence of times from the recorder, the council wishes to know how many cars without trailers crossed the pad and how many cars with trailers crossed it.</p>

<p>Obviously, there is some ambiguity. For example, a sequence of 6 recordings could be three cars without trailers or two cars with trailers. To reduce such ambiguity, we will make the following two assumptions:</p>

<ol>
	<li>Any two successive times with a difference less than or equal to 1000 ms must belong to the same vehicle.</li>
	<li>Any two successive times with a difference greater than or equal to 2000 ms must be from different vehicles.</li>
</ol>

<p>Given a sequence of times, determine the number of cars with and without a trailer.</p>

### 입력

<p>The first line of the input contains a single integer n (1 &le; n &le; 300 000), which is the number of times the pressure pad was triggered. The second line contains n distinct integers t<sub>1</sub>, . . . , t<sub>n</sub> (0 &le; t<sub>i</sub> &lt; 2<sup>30</sup>) in increasing order, the times that the pressure pad was triggered. The times are in milliseconds.</p>

### 출력

<p>Display the number of cars with and without trailers. If the number of cars of each type can be uniquely determined, then display two lines of the form</p>

<pre>
Cars without trailers: X
Cars with trailers: Y</pre>

<p>If there is no interpretation of the times that is consistent with the assumptions, then display Impossible.If there are multiple interpretations of the times that give different numbers of cars with and without trailers, then display Ambiguous.</p>