# [Gold IV] Dispersed parentheses - 31357

[문제 링크](https://www.acmicpc.net/problem/31357)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The sequence of calculations in arithmetic expressions is usually set by a certain arrangement of parentheses. For example, $(3 \cdot (2+1)) \cdot (4-5)$. After deleting all the elements from the expression except parentheses remaining symbols form <em>a parentheses sequence</em> $(())()$. Let&rsquo;s assume that adding character &lt;&lt;$0$&gt;&gt; does not corrupt the sequence. Let&rsquo;s call such sequence a <em>disperse parentheses sequence</em>. Also this can be defined as follows:</p>

<ul>
	<li>An empty line is a disperse parentheses sequence.</li>
	<li>If $S$ and $T$ --- disperse parentheses sequences, then lines $0S, S0, (S)$ and $ST$ are also disperse parentheses sequences.</li>
</ul>

<p><em>The depth</em> of disperse parentheses sequence is the maximum difference between the number of opening and closing parentheses in the sequence prefix. (The prefix of line $S$ is the line, which can be obtained from $S$ by deleting symbols from the tail of the line. For example, the prefixes of line &laquo;$ABCAB$&raquo; are lines &lt;&lt;&gt;&gt;, &lt;&lt;$A$&gt;&gt;, &lt;&lt;$AB$&gt;&gt;, &lt;&lt;$ABC$&gt;&gt;, &lt;&lt;$ABCA$&gt;&gt; and &lt;&lt;$ABCAB$&gt;&gt;). Thus, the depth of the sequence &laquo;$(0)(0())0$&raquo; equals two (prefix &laquo;$(0)(0($&raquo; contains three openinig and one closing parentheses).</p>

<p>Calculate the number of possible disperse parentheses sequences $n$ symbols long, that have a depth $k$.</p>

### 입력

<p>Single line contains space-separated integers $n$ and $k$ ($1 \le n \le 300$, $0 \le k \le n$).</p>

### 출력

<p>Output the number of possible disperse parentheses sequences $n$ symbols long, that have a depth $k$ modulo ($10^9+9$).</p>