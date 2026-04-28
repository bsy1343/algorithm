# [Gold III] Chaotic Construction - 26013

[문제 링크](https://www.acmicpc.net/problem/26013)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 63, 맞힌 사람: 56, 정답 비율: 82.353%

### 분류

자료 구조, 세그먼트 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>The city Gircle has only one street, and that street is cyclic. This was very convenient in times when people didn&#39;t carry a device with compass, GPS and detailed maps around in their pockets, because you only have to walk in one direction and will certainly arrive at your destination. Since Gircle&#39;s founding a lot of time has passed. Civil engineers now know a lot more about road network design and most people have immediate access to reliable and accurate navigation systems. However, the passage of time also affected the old street surface and more and more cracks and potholes appeared.</p>

<p>The local government has finally decided to improve the situation, but preserving the city&#39;s historic appeal and building new streets are unfortunately mutually exclusive. Because tourism is vital for Gircle&#39;s economy, the government&#39;s only viable option for improving the situation is to renovate segments of the street when necessary. Gircle&#39;s street is very narrow, so a construction site at a street segment makes it impossible for citizens to pass that segment or even leave or enter it.</p>

<p>As a member of the <em>Gircle</em> <em>Construction and Planning Commission</em> (GCPC), you always know when one of the $n$ street segments is closed or reopened. Naturally, the citizens expect you to tell them whether the trips they want to do are currently possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26013.%E2%80%85Chaotic%E2%80%85Construction/3b99bd9c.png" data-original-src="https://upload.acmicpc.net/de631905-06bd-4308-8f59-cbc60a9b08f8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 295px;" /></p>

<p style="text-align: center;">Figure C.1: Depiction of the query &quot;<code>? 9 7</code>&quot; in the sample input.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ ($2 \leq n \leq 10^5$) and $q$ ($1 \leq q \leq 10^5$), the number of street segments and the number of events. No street segment is initially closed.</li>
	<li>$q$ lines, each describing an event. Each event is described in one of the following ways:
	<ul>
		<li>&quot;<code>- a</code>&quot;: Segment $a$ ($1 \leq a \leq n$) is closed. It is guaranteed that segment $a$ was open before.</li>
		<li>&quot;<code>+ a</code>&quot;: Segment $a$ ($1 \leq a \leq n$) is reopened. It is guaranteed that segment $a$ was closed before.</li>
		<li>&quot;<code>? a b</code>&quot;: A person asks you if it is possible to go from segment $a$ to segment $b$ ($1 \leq a, b \leq n \text{ and } a\neq b$).</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each event of the form &quot;<code>? a b</code>&quot;, print one line containing the word &quot;<code>possible</code>&quot;, if it is possible to move from segment $a$ to segment $b$, or &quot;<code>impossible</code>&quot; otherwise. If $a$ or $b$ are currently closed, the answer is &quot;<code>impossible</code>&quot;.</p>