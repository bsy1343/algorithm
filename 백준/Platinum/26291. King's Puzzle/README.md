# [Platinum V] King's Puzzle - 26291

[문제 링크](https://www.acmicpc.net/problem/26291)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 17, 정답 비율: 65.385%

### 분류

그래프 이론, 해 구성하기

### 문제 설명

<p>King Kendrick is a sovereign ruler of Kotlin Kingdom. He is getting ready for the next session of the government. Kotlin Kingdom consists of $n$ cities. These cities need to be connected by several bidirectional roads. Since ministries are responsible for aspects of safety and comfort of the kingdom&#39;s residents, some of them have made the following requirements:</p>

<ul>
	<li>&quot;All the cities should be connected by new roads, i.e. there should be a path from any city to any other city via the roads&quot; --- Ministry of Transport and Digital Infrastructure.</li>
	<li>&quot;There may not be a loop road --- a road that connects a city with itself&quot; --- Ministry of Environment.</li>
	<li>&quot;There should be at most one road between a pair of cities&quot; --- Treasury Department.</li>
	<li>&quot;If $a_i$ is the number of roads connected to $i$-th city, then the set $\{a_1, \ldots, a_n\}$ should consist of exactly $k$ distinct numbers&quot; --- Ministry of ICPC.</li>
</ul>

<p>King Kendrick has issues with the requirements from the Ministry of ICPC. He asks you to help him. Find any set of roads that suits all the requirements above or say that it is impossible.</p>

### 입력

<p>The only line of the input consists of two integers $n$ and $k$ ($1 \le k \le n \le 500$).</p>

### 출력

<p>If it is impossible to satisfy all the requirements, output &quot;<code>NO</code>&quot; in the only line.</p>

<p>Otherwise, output &quot;<code>YES</code>&quot; in the first line.</p>

<p>Output $m$ --- the number of roads ($0 \le m \le \frac{n \cdot (n - 1)}{2}$) in the second line.</p>

<p>Next $m$ lines should contain pairs of integers $a$ and $b$ --- the cities to connect by a road ($1 \le a, b \le n$).</p>