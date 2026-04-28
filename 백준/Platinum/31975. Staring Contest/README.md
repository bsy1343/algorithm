# [Platinum III] Staring Contest - 31975

[문제 링크](https://www.acmicpc.net/problem/31975)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 20, 맞힌 사람: 16, 정답 비율: 34.783%

### 분류

무작위화

### 문제 설명

<p>A staring contest is a classical battle of imperturbability in which two people stare into each other&#39;s eyes while maintaining a facial expression of assured serenity. The goal is to maintain eye contact for longer than your opponent. The contest ends when one participant breaks composure, typically by looking away, smiling, speaking, or giggling.</p>

<p>As a coach of the national staring contest you need to determine the imperturbability of each of your team&#39;s $n$ members for the upcoming world finals. The $i$th athlete can maintain eye contact for exactly $a_i$ seconds, but these values are unknown to you in the beginning. For instance, you could have a team of $n=3$ members:</p>

<table class="table table-bordered td-center th-center table-center-30">
	<tbody>
		<tr>
			<th>$i$</th>
			<th>Name</th>
			<th>$a_i$</th>
		</tr>
		<tr>
			<td>1</td>
			<td>Anna</td>
			<td>431</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Esther</td>
			<td>623</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Tony</td>
			<td>121</td>
		</tr>
	</tbody>
</table>

<p>When athletes $i$ and $j$ compete, the confrontation lasts exactly $\min(a_i, a_j)$ seconds, at which moment the weaker contestant breaks composure and both contestants start smiling and giggling within a fraction of a second. For instance, if Anna competes against Esther, the contest lasts for $431$ seconds. Importantly, to an outside observer the actual <em>winner</em> of the confrontation (in this case, Esther) is impossible to determine, only the <em>duration</em> of the contest is measurable.</p>

<p>Your goal is to estimate the values $a_1,\ldots, a_n$ using as few staring contests as possible. Clearly, the strength of the strongest athlete can never be determined, so you are allowed to underestimate one of the $a_i$.</p>

### 입력



### 출력



### 제한

<p>The number $n$ of athletes satisfies $2\leq n\leq 1500$. The imperturbability $a_i$ of each athlete satisfies $1\leq a_i\leq 86\,400$, they are all different. You can use at most $3000$ queries; your final line of output, <em>i.e.</em>, the line starting with <code>!</code>, is not counted as a query.</p>