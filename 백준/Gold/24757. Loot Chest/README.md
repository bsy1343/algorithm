# [Gold II] Loot Chest - 24757

[문제 링크](https://www.acmicpc.net/problem/24757)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 22, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Your favorite online game has a prize system. After each match you win, there is a $P\%$ chance you will receive a prize. This value $P$ changes over time:</p>

<ul>
	<li>every time you lose a match, $P$ increases by $\Delta_L$,</li>
	<li>every time you win a match but fail to receive a prize, $P$ increases by $\Delta_W$, and</li>
	<li>every time you win a match and receive a prize, $P$ is set to $0$.</li>
</ul>

<p>Whenever $P$ is increased, it is capped at $100$. That is, if $P$ is to be increased by $\Delta$, $P$ increases to $\min(P+\Delta, 100)$.</p>

<p>The developers just revealed one of the prizes this season is a silverback gorilla suit with star-shaped sunglasses. You want it! Each prize has a $G\%$ chance of being this gorilla suit.</p>

<p>You start with $P = 0\%$. You have an $L\%$ chance of losing each match you play. Given $\Delta_L, \Delta_W, G,$ and $L$, compute the expected number of matches you will have to play until you obtain the silverback gorilla suit.</p>

<p>For example, in the first sample case you win every match you play and are guaranteed to receive a prize every $2$ matches. Each prize has a $50\%$ chance of being the gorilla suit. So you expect to obtain the gorilla suit after receiving $2$ prizes. Thus, in expectation, it takes $4$ matches to obtain the gorilla suit.</p>

### 입력

<p>The input consists of a single line containing four integers $\Delta_L$ ($1 \leq \Delta_L \leq 100$), $\Delta_W$ ($1 \leq \Delta_W \leq 100$), $G$ ($1 \leq G \leq 100$), and $L$ ($0 \leq L \leq 99$), which are described above.</p>

### 출력

<p>Display the expected number of matches you will play before you obtain the gorilla suit. Your answer should have an absolute or relative error of at most $10^{-6}$.</p>