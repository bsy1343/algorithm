# [Platinum IV] Kolmogorov - 19154

[문제 링크](https://www.acmicpc.net/problem/19154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 16, 맞힌 사람: 16, 정답 비율: 61.538%

### 분류

수학, 그래프 이론, 최단 경로, 데이크스트라, 확률론

### 문제 설명

<p>Andrey cares a lot about smart children in the remote parts of Russia, who can&#39;t receive good education just because there are no math schools nearby. He dreams of opening a special school with a hostel inside, there gifted children could live and study together, with professors from Moscow State University working as teachers and tutors. He decided to travel around the country to speak with different people and see if they like this idea.</p>

<p>He has just arrived to Nsk, where he should visit the only school of this town and tell an inspiring and motivational speech. He is short in time, so he wants to get from his current location to the school as soon as possible.</p>

<p>There are $N$ intersections in the Nsk, connected by $M$ bidirectional roads. It takes exactly one minute to walk between any pair of intersections directly connected by a road. Every road connects two different intersections, no pair of intersections is directly connected by more than one road, and every pair of intersections is directly or indirectly connected.&nbsp;</p>

<p>Andrey starts his journey at intersection $1$ and goes to intersection $N$, where the school is located. Could you help him and calculate the minumum number of minutes he needs to walk to the target? Of course you could, but that&#39;s not the whole statement.</p>

<p>Headmaster of this school isn&#39;t happy of this visit and plans to make Andrey&#39;s lecture as short as possible. He knows that famous mathematician has a very strong fear of the dark, so to obtain his cruel goal headmaster turned off almost all the street lighting. Now, there is only one road that is still lighted at every moment of time. Moreover, what road is lighted may change every minute. To be more detailed, the following happens:</p>

<ul>
	<li>At the beginning of every minute one road is randomly and uniformly chosen among all $M$ possible roads.</li>
	<li>This road will be lighted for the current minute.</li>
	<li>If Andrey stands at intersection incident to the lighted road, he may choose to use this road to get to another end. He may also choose to stand still for this minute. Andrey can&#39;t use other roads except the lighted one.</li>
</ul>

<p>Compute the expected number of minutes Andrey needs to reach the goal, assuming he knows everything about the graph and acts optimally.</p>

### 입력

<p>The first line of the input contains the number of intersections $N$ and the number of bidirectional roads $M$ ($1 \leq N, M \leq 100\,000$).</p>

<p>Next $M$ lines contain two integers $a_i$ and $b_i$ each, denoting a pair of intersections connected by this road ($1 \leq a_i, b_i \leq N$, $a_i \neq b_i$). It&#39;s guaranteed that it&#39;s possible to reach any intersection from any other, and there are no loops or multiple edges.</p>

### 출력

<p>Print one real number --- the expected number of minutes Andrey needs to go from intersection $1$ to intersection $N$, if he acts optimally. Your answer will be considered correct, if it&#39;s absolute or relative error won&#39;t exceed $10^{-6}$.</p>

<p>Formally, if your answer is $A$ and the jury&#39;s answer is $B$, checker will accept your answer if $\frac{|A-B|}{\max(1,B)} \leq 10^{-6}$.</p>

### 힌트

<p>In the first example, Andrey can act using the following strategy:</p>

<ul>
	<li>Initially he stays at the intersection $1$.</li>
	<li>He waits until the road $(1, 2)$ is lighted, and use it to get to intersection $2$. The waiting time equals $2.0$ in average.</li>
	<li>Standing at the intersection $2$, he waits until the road $(2, 3)$ is lighted, and use it to get to intersection $3$. It also requires $2.0$ minutes to wait in average, so the expected time to reach the destination is $4.0$ minutes.</li>
</ul>

<p>In the second example, Andrey can act in the following way:</p>

<ul>
	<li>Initially he stays at the intersection $1$.</li>
	<li>He waits until one of the roads $(1, 2)$ or $(1, 3)$ is lighted, and use it to get to the intersection $2$ or $3$ respectively. It requires $2.0$ minutes to wait in average.</li>
	<li>Now he stays at the intersection $2$ or $3$, and in both cases he should just wait until the road to the intersection $4$ is lighted. It requires $4.0$ minutes to wait in average, so the expected time to reach the school is $6.0$ minutes;</li>
</ul>