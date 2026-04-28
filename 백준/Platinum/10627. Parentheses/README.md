# [Platinum III] Parentheses - 10627

[문제 링크](https://www.acmicpc.net/problem/10627)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 227, 정답: 44, 맞힌 사람: 43, 정답 비율: 34.677%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are given \(n\) strings \(\mathit{str}_1, \mathit{str}_2, \ldots, \mathit{str}_n\), each consisting of <code>(</code> and <code>)</code>. The objective is to determine whether it is possible to permute the \(n\) strings so that the concatenation of the strings represents a <em>valid</em> string.</p>

<p>Validity of strings are defined as follows:</p>

<ul>
	<li>
	<p>The empty string is valid.</p>
	</li>
	<li>
	<p>If \(A\) and \(B\) are valid, then the concatenation of \(A\) and \(B\) is valid.</p>
	</li>
	<li>
	<p>If \(A\) is valid, then the string obtained by putting \(A\) in a pair of matching parentheses is valid.</p>
	</li>
	<li>
	<p>Any other string is not valid.</p>
	</li>
</ul>

<p>For example, &quot;()()&quot; and &quot;(())&quot; are valid, while &quot;())&quot; and &quot;((()&quot; are not valid.</p>

### 입력

<p>The first line of the input contains an integer \(n\) (\(1 \leq n \leq 100\)), representing the number of strings. Then \(n\) lines follow, each of which contains \(\mathit{str}_i\) (\(1 \leq \lvert \mathit{str}_i \rvert \leq 100\)). All characters in \(\mathit{str}_i\) are <code>(</code> or <code>)</code>.</p>

### 출력

<p>Output a line with &quot;Yes&quot; (without quotes) if you can make a valid string, or &quot;No&quot; otherwise.</p>