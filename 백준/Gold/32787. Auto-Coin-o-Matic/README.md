# [Gold I] Auto-Coin-o-Matic - 32787

[문제 링크](https://www.acmicpc.net/problem/32787)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 14, 맞힌 사람: 13, 정답 비율: 46.429%

### 분류

다이나믹 프로그래밍, 오프라인 쿼리

### 문제 설명

<p>It's finally here! The day you unveil your new invention, the Auto-Coin-o-Matic! You watch with glee and anxiety as people insert their card into the machine, type in the amount they want, and get exact change out with the fewest number of coins.</p>

<p>But was it actually the fewest number of coins? That's how it was programmed, but what if you had a bug? It's okay, you're watching. You decide to randomly pick some transactions and double check that what the machine gave out is indeed the fewest number of coins possible. But, oh no, the machine is running out of certain types of coins! Will it still work correctly?</p>

### 입력

<p>The input starts with two integers $n$ and $m$ ($1 \le n \le 2000$, $1 \le m \le 10^5$).</p>

<p>The next line contains $n$ integers, $d_1, d_2, \ldots, d_n$ ($1 \le d_i \le 10^5$) representing the denominations of coins available initially. It is guaranteed that all denominations are unique.</p>

<p>The next $m$ lines contain a character $c$ ($c\in \{$<code>Q</code>, <code>X</code>$\}$) and an integer $v$ ($1 \le v \le 10^5$), where $c$ is the type of event and $v$ is the value of the event.</p>

<ul>
	<li>
	<p>If $c$ is the character <code>Q</code>, this is a query and the output should be the minimum number of coins needed to give out exactly $v$. It is guaranteed that there will be at least one query.</p>

	<p>If it is not possible to make $v$ exactly with the available denominations, output $-1$ instead.</p>
	</li>
	<li>
	<p>If $c$ is the character <code>X</code>, this means the machine is out of coins of denomination $v$. All queries after this point cannot use this denomination. It is guaranteed that each <code>X</code> event corresponds to a denomination $v$ which the machine currently has in stock.</p>
	</li>
</ul>

### 출력

<p>Output $k$ lines, where $k$ is the number of query events ($c = $<code>Q</code>). On the $i$<sup>th</sup> line, output the fewest number of coins needed to give change for the $i$<sup>th</sup> query, or $-1$ if this is impossible.</p>