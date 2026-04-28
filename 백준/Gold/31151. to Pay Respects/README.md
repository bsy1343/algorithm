# [Gold III] to Pay Respects - 31151

[문제 링크](https://www.acmicpc.net/problem/31151)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 23, 맞힌 사람: 21, 정답 비율: 60.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are playing a game, and you are going to fight the secret boss. In this game, the boss doesn&#39;t attack you, but they can cast regeneration spells.</p>

<p>The fight consists of exactly $N$ rounds, in each round the following actions can happen, in this order:</p>

<ol>
	<li>The boss can choose to cast the &quot;Regeneration&quot; spell.</li>
	<li>You can choose to cast the &quot;Poison&quot; spell if you have any mana left.</li>
	<li>You attack with a sword, dealing $X$ damage.</li>
	<li>All the passive effects are applied.</li>
</ol>

<p>There are two types of passive effects: regeneration and poison. The effects stack, which means that the current state of the boss can be described with three integers: current health points ($hp$), current poison stacks ($p$) and current regeneration stacks ($r$). At the beginning of the fight, there are no poison stacks and no regeneration stacks ($p=r=0$). Each poison stack deals $P$ damage, each regeneration stack heals $R$ health points.</p>

<p>Spells have the following effects:</p>

<p>&quot;Regeneration&quot;: increase the number of regenerations stacks $r$ by $1$.</p>

<p>&quot;Poison&quot;: increase the number of poison stacks $p$ by $1$. <strong>If the number of regeneration stacks is strictly positive</strong> ($r &gt; 0$), then decrease it by $1$.</p>

<p>After the round the $hp$ will decrease by $X + P \cdot p - R \cdot r$ (this value can be negative if the boss heals faster than you deal damage).</p>

<p>For each round you know if the boss will cast &quot;Regeneration&quot;. You have enough mana to cast &quot;Poison&quot; $K$ times (you don&#39;t have to use all of your mana). What&#39;s the largest total damage you can deal to the boss, in other words, what is the maximum value of $hp_{start} - hp_{end}$? Assume that $hp_{start} = 10^{1000}$, so you can&#39;t actually kill the boss in $N$ rounds. Boss $hp$ can go higher than the initial value (see the third sample case).</p>

### 입력

<p>The first line of the input contains $5$ integers $N$, $X$, $R$, $P$, $K$ ($1 \le N, X, R, P \le 10^6$, $0 \le K \le N$).</p>

<p>The second line of the input contains a binary string of length $N$. The $i$-th character of this string is <code>1</code>, if the boss casts &quot;Regeneration&quot; at the beginning of the $i$-th round, and <code>0</code> otherwise.</p>

### 출력

<p>Output a single integer --- the largest total damage you can deal during the fight.</p>

### 힌트

<p>Let&#39;s look at the first sample. We can cast the &quot;Poison&quot; spell at most once. Let&#39;s look at what will happen if we cast this spell during the first round.</p>

<ul>
	<li>During the first round, we apply a &quot;Poison&quot; spell, so at the end of this round there will be $0$ regeneration stacks, and $1$ poison stack. Therefore, the $hp$ will decrease by $X + P\cdot 1 - R\cdot 0 = 1011$ this round.</li>
	<li>At the beginning of the second round, the boss will cast the &quot;Regeneration&quot; spell, so there will be $1$ regeneration stack and $1$ poison stack at the end of the second round. So, the $hp$ will decrease by $X + P\cdot 1 - R\cdot 1 = 1010$ this round. Overall, the health of the boss decreased by $1011 + 1010 = 2021$.</li>
</ul>

<p>Now let&#39;s look at what will happen if we cast this spell during the second round.</p>

<ul>
	<li>During the first round, no spells are applied, so at the end of this round there will be $0$ regeneration stacks, and $0$ poison stacks. Therefore, the $hp$ will decrease by $X + P\cdot 0 - R\cdot 0 = 1010$ this round.</li>
	<li>At the beginning of the second round, the boss will cast the &quot;Regeneration&quot; spell, so that there will be one regeneration stack after that. Then, we will we apply a &quot;Poison&quot; spell, decreasing the number of regeneration stacks by one. So, there will be $0$ regeneration stacks and $1$ poison stack at the end of the second round. Therefore, the $hp$ will decrease by $X + P\cdot 1 - R\cdot 0 = 1011$ this round. Overall, the health of the boss decreased by $1010 + 1011 = 2021$ again.</li>
</ul>

<p>So, no matter when we cast the &quot;Poison&quot; spell in this sample, we will still decrease the $hp$ by $2021$.</p>