# [Platinum II] Mercurialist - 30355

[문제 링크](https://www.acmicpc.net/problem/30355)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

수학, 정수론, 조합론, 확률론, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p>This country has a medicine for immortality. Alice got $X + Y + Z$ bottles from the <em>Hatter</em>.</p>

<p>$X$ bottles contain <em>elixir</em>. If Alice drinks it, she will immediately become immortal.</p>

<p>$Y$ bottles contain mercury, and each has a different toxicity. If she drinks the $i$-th bottle, the following event $i$ will occur after $K + i - 0.5$ days.</p>

<ul>
	<li>Event $i$: Alice will immediately die if she has not drunk the elixir before event $i$. If she has drunk the elixir, she won&#39;t die.</li>
</ul>

<p>The remaining $Z$ bottles contain yogurt. Nothing will happen when Alice drinks it.</p>

<p>At the same time every morning, Alice chooses one non-empty bottle with equal probability and drinks it. If all bottles are empty, she does nothing.</p>

<p>Answer the probability that Alice will be alive $10^{10^10}$ days after the first day she starts drinking bottles. Note that Alice won&#39;t die other than events.</p>

<p>The probability can be expressed as $\frac{P}{Q}$ using coprime integers $P$ and $Q$. Output a non-negative integer $R$ less than $998244353$ such that  $R \times Q \equiv P \pmod {998244353}$. It can be proven that the probability is a rational number, and $R$ is uniquely determined under the conditions of this problem.</p>

### 입력

<blockquote>
<p>$X$ $Y$ $Z$ $K$</p>
</blockquote>

### 출력

<p>Output $R$ defined in the statement. Add a new line at the end of the output.</p>

### 제한

<ul>
	<li>All inputs consist of integers.</li>
	<li>$1 \le X, Y, Z, K \le 10^5$</li>
</ul>

### 힌트

<p>In Sample Input 1, Alice will only die if she drinks mercury on day 1 and yogurt on day 2. The probability of death is $1/3 \times 1/2 = 1/6$, therefore the answer is $5/6$.</p>

<p>In Sample Input 2, Alice never dies.</p>