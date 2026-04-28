# [Platinum V] Jack the Mole - 23373

[문제 링크](https://www.acmicpc.net/problem/23373)

### 성능 요약

시간 제한: 6.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 195, 정답: 79, 맞힌 사람: 50, 정답 비율: 40.650%

### 분류

다이나믹 프로그래밍, 배낭 문제, 비트 집합

### 문제 설명

<p>The spy agency you are employed by<sup>1</sup>&nbsp;has sent you and some fellow spies on an important mission deep in the jungles of Luxembourg. Your colleagues and you are currently waiting on an abandoned and overgrown airstrip, about to be picked up by the finest spy plane the Dutch bureaucracy can buy.</p>

<p>However, an urgent communication from the HQ has just come in to inform you counterintelligence has learned that during the mission, an infamous counter-spy called Jack the Mole was planted among you! You do a headcount and to your horror realize that while you started the mission with $n-1$ people, there are now $n$!<sup>2</sup>&nbsp;Since you all take Covid regulations very seriously, you all wore masks, so it is not obvious who the imposter is.</p>

<p>Then you remember: the finest spy plane in question is thrown off balance rather easily, so the agency picked the $n-1$ agents so that it is possible to divide them into two groups of equal weight, but not necessarily of equal size, for the left and the right side of the plane respectively. However, it did not specify exactly which two groups (anonymity and all that). Of course you have a scale with you (doesn&#39;t any good spy?), so you can find which of the $n$ people on the mission is potentially the mole.</p>

<p><sup>1</sup>When your family members ask, please lie to them and say you work as a computer programmer.</p>

<p><sup>2</sup>Exclamation point, not factorial.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing the number of spies present, $n$ ($3 \leq n \leq 300$).</li>
	<li>One line containing $n$ space separated integers $w_1, \ldots, w_n$ ($1\leq w_{i} \leq 1000$), the $i$th of which gives the weight of the $i$th spy in kilograms3.</li>
</ul>

<p><sup>3</sup>If those ranges seem odd, recall spies can be very muscular or very nimble.</p>

### 출력

<p>Output a single number $k$, the number of spies that are potentially the mole, followed by $k$ integers, the suspects, in increasing order.</p>