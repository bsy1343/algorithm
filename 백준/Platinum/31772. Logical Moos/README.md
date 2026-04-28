# [Platinum IV] Logical Moos - 31772

[문제 링크](https://www.acmicpc.net/problem/31772)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 174, 정답: 66, 맞힌 사람: 48, 정답 비율: 43.243%

### 분류

구현, 누적 합

### 문제 설명

<p>Farmer John has a boolean statement that is $N$ keywords long ($1 \leq N &lt; 2 \cdot 10^5$, $N$ odd). Only <code>true</code> or <code>false</code> appear in odd positions, while only <code>and</code> and <code>or</code> appear in even positions.</p>

<p>A phrase of the form $x\text{ OPERATOR }y$, where $x$ and $y$ are either <code>true</code> or <code>false</code>, and $\text{OPERATOR}$ is <code>and</code> or <code>or</code>, evaluates as follows:</p>

<ul>
	<li>$x$<code> and </code>$y$: This evaluates to true if both $x$ and $y$ are true, and false otherwise.</li>
	<li>$x$<code> or </code>$y$: This evaluates to true if either $x$ or $y$ is true, and false otherwise.</li>
</ul>

<p>When evaluating the statement, FJ has to take the order of precedence in Moo Language into account. Similar to C++, <code>and</code> takes priority over <code>or</code>. More specifically, to evaluate the statement, repeat the following step until the statement consists of only one keyword.</p>

<ol>
	<li>If the statement contains an <code>and</code>, choose any of them and replace the phrase surrounding it with its evaluation.</li>
	<li>Otherwise, the statement contains an <code>or</code>. Choose any of them and replace the phrase surrounding it with its evaluation.</li>
</ol>

<p>It may be proven that if multiple phrases can be evaluated during a given step, it does not matter which one is chosen; the statement will always evaluate to the same value.</p>

<p>FJ has $Q$ $(1 \leq Q \leq 2 \cdot 10^5)$ queries. In each query, he gives you two integers $l$ and $r$ ($1 \leq l \leq r \leq N$, $l$ and $r$ are both odd), and deletes the segment from keyword $l$ to keyword $r$ inclusive. In turn, he wishes to replace the segment he just deleted with just one simple <code>true</code> or <code>false</code> so that the whole statement evaluates to a certain boolean value. Help FJ determine if it&#39;s possible!</p>

### 입력

<p>The first line contains $N$ and $Q$.</p>

<p>The next line contains $N$ strings, a valid boolean statement.</p>

<p>The following $Q$ lines contain two integers $l$ and $r$, and a string <code>true</code> or <code>false</code>, denoting whether he wants the whole statement to evaluate to true or false.</p>

### 출력

<p>Output a string of length $Q$, where the $i$&#39;th character is Y if the $i$&#39;th query is possible, otherwise N.</p>