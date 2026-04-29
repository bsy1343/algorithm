# [Gold I] Mukjjippa - 32469

[문제 링크](https://www.acmicpc.net/problem/32469)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 133, 정답: 63, 맞힌 사람: 58, 정답 비율: 52.727%

### 분류

다이나믹 프로그래밍, 모듈로 곱셈 역원, 수학, 정수론, 확률론

### 문제 설명

<p>Two players A and B are playing a game called <strong>mukjjippa</strong>.</p>

<p>The game consists of several turns.</p>

<p>At the $i$-th turn ($1\le i\le n$):</p>

<ul>
	<li>Each player chooses exactly one from $\{\mathrm R,\mathrm S,\mathrm P\}$ (meaning rock, scissors, and paper, respectively).</li>
	<li>Let $X_i$ and $Y_i$ be the choices of A and B, respectively.</li>
	<li>If $(X_i,Y_i)\in\{(\mathrm R,\mathrm S) ,(\mathrm S,\mathrm P) ,(\mathrm P,\mathrm R)\}$, then A becomes an attacker for the $(i+1)$-th turn and the game continues.</li>
	<li>Otherwise, if $(X_i,Y_i)\in\{(\mathrm R,\mathrm P) ,(\mathrm S,\mathrm R) ,(\mathrm P,\mathrm S)\}$, then B becomes an attacker for the $(i+1)$-th turn and the game continues.</li>
	<li>Otherwise, if there is an attacker for the $i$-th turn, then the attacker becomes a winner and the game ends.</li>
	<li>Otherwise, there is no attacker for the $(i+1)$-th turn and the game continues.</li>
</ul>

<p>Note that there is no attacker for the first turn.</p>

<p>If the game does not end until the beginning of the $(n+1)$-th turn, nobody is a winner.</p>

<p>The probability distribution of each choice is given. All choices are independent.</p>

<p>Find the probability that A wins.</p>

### 입력

<p>The first line contains an integer $n$.</p>

<p>The $i$-th of the next $n$ lines contains three integers $r_i$, $s_i$, and $p_i$. This means that the probabilities that $X_i$ is $\mathrm R$, $\mathrm S$, and $\mathrm P$ are $\frac{r_i}{r_i+s_i+p_i}$, $\frac{s_i}{r_i+s_i+p_i}$, and $\frac{p_i}{r_i+s_i+p_i}$, respectively.</p>

<p>The $i$-th of the next $n$ lines contains three integers $r_i'$, $s_i'$, and $p_i'$. This means that the probabilities that $Y_i$ is $\mathrm R$, $\mathrm S$, and $\mathrm P$ are $\frac{r_i'}{r_i'+s_i'+p_i'}$, $\frac{s_i'}{r_i'+s_i'+p_i'}$, and $\frac{p_i'}{r_i'+s_i'+p_i'}$, respectively.</p>

### 출력

<p>Let $\frac{x}{y}$ be the probability that A wins, where $x$ and $y$ are coprime integers, and $x\ge 0$ and $y&gt;0$.</p>

<p>Print the integer $z$ such that $yz\equiv x\pmod{998\, 244\, 353}$ and $0\le z&lt;998\, 244\, 353$.</p>

<p>It can be proved that such an integer $z$ always exists and is uniquely determined, under the constraints of this problem.</p>

### 제한

<ul>
	<li>$1\le n\le 2\times 10^5$</li>
	<li>$0\le r_i,s_i,p_i\le 10^6$ ($1\le i\le n$)</li>
	<li>$r_i+s_i+p_i&gt;0$ ($1\le i\le n$)</li>
	<li>$0\le r_i',s_i',p_i'\le 10^6$ ($1\le i\le n$)</li>
	<li>$r_i'+s_i'+p_i'&gt;0$ ($1\le i\le n$)</li>
</ul>