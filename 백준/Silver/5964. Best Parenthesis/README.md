# [Silver II] Best Parenthesis - 5964

[문제 링크](https://www.acmicpc.net/problem/5964)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 376, 정답: 111, 맞힌 사람: 83, 정답 비율: 32.296%

### 분류

수학, 자료 구조, 스택

### 문제 설명

<p>Recently, the cows have been competing with strings of balanced parentheses and comparing them with each other to see who has the best one.</p>

<p>Such strings are scored as follows (all strings are balanced): the string &quot;()&quot; has score 1; if &quot;A&quot; has score s(A) then &quot;(A)&quot; has score 2*s(A); and if &quot;A&quot; and &quot;B&quot; have scores s(A) and s(B), respectively, then &quot;AB&quot; has score s(A)+s(B). For example, s(&quot;(())()&quot;) = s(&quot;(())&quot;)+s(&quot;()&quot;) = 2*s(&quot;()&quot;)+1 = 2*1+1 = 3.</p>

<p>Bessie wants to beat all of her fellow cows, so she needs to calculate the score of some strings. Given a string of balanced parentheses of length N (2 &lt;= N &lt;= 100,000), help Bessie compute its score.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N + 1: Line i+1 will contain 1 integer: 0 if the ith character of the string is &#39;(&#39;, &nbsp;and 1 if the ith character of the string is &#39;)&#39;</li>
</ul>

### 출력

<ul>
	<li>Line 1: The score of the string. Since this number can get quite large, output the &nbsp;score modulo 12345678910.</li>
</ul>

### 힌트

<p>This corresponds to the string &quot;(())()&quot;.</p>