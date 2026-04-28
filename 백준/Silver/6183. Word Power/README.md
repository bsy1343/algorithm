# [Silver I] Word Power - 6183

[문제 링크](https://www.acmicpc.net/problem/6183)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 85, 맞힌 사람: 74, 정답 비율: 81.319%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>Farmer John wants to evaluate the quality of the names of his N (1 &lt;= N &lt;= 1000) cows. Each name is a string with no more than 1000 characters, all of which are non-blank.</p>

<p>He has created a set of M (1 &lt;= M &lt;= 100) &#39;good&#39; strings (no longer than 30 characters and fully non-blank). If the sequence letters of a cow&#39;s name contains the letters of a &#39;good&#39; string in the correct order as a subsequence (i.e., not necessarily all next to each other), the cow&#39;s name gets 1 quality point.</p>

<p>All strings is case-insensitive, i.e., capital letters and lower case letters are considered equivalent. &nbsp;For example, the name &quot;Bessie&quot; contains the letters of &quot;Be&quot;, &quot;sI&quot;, &quot;EE&quot;, and &quot;Es&quot; in the correct order, but not &quot;is&quot; or &quot;eB&quot;. Help Farmer John determine the number of quality points in each of his cow&#39;s names.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 contains a string that is the name of the ith cow</li>
	<li>Lines N+2..N+M+1: Line N+i+1 contains the ith good string</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N+1: Line i+1 contains the number of quality points of the ith name</li>
</ul>

### 힌트

<p>There are 5 cows, and their names are &quot;Bessie&quot;, &quot;Jonathan&quot;, &quot;Montgomery&quot;, &quot;Alicia&quot;, and &quot;Angola&quot;. The 3 good strings are &quot;se&quot;, &quot;nGo&quot;, and &quot;Ont&quot;.</p>

<p>&quot;Bessie&quot; contains &quot;se&quot;, &quot;Jonathan&quot; contains &quot;Ont&quot;, &quot;Montgomery&quot; contains both &quot;nGo&quot; and &quot;Ont&quot;, Alicia contains none of the good strings, and &quot;Angola&quot; contains &quot;nGo&quot;.</p>