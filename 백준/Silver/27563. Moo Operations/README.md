# [Silver V] Moo Operations - 27563

[문제 링크](https://www.acmicpc.net/problem/27563)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 921, 정답: 427, 맞힌 사람: 374, 정답 비율: 47.826%

### 분류

그리디 알고리즘, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Because Bessie is bored of playing with her usual text string where the only characters are &#39;C,&#39; &#39;O,&#39; and &#39;W,&#39; Farmer John gave her $Q$ new strings ($1 \leq Q \leq 100$), where the only characters are &#39;M&#39; and &#39;O.&#39; Bessie&#39;s favorite word out of the characters &#39;M&#39; and &#39;O&#39; is obviously &quot;MOO,&quot; so she wants to turn each of the $Q$ strings into &quot;MOO&quot; using the following operations:</p>

<ol>
	<li>Replace either the first or last character with its opposite (so that &#39;M&#39; becomes &#39;O&#39; and &#39;O&#39; becomes &#39;M&#39;).</li>
	<li>Delete either the first or last character.</li>
</ol>

<p>Unfortunately, Bessie is lazy and does not want to perform more operations than absolutely necessary. For each string, please help her determine the minimum number of operations necessary to form &quot;MOO&quot; or output $-1$ if this is impossible.</p>

### 입력

<p>The first line of input contains the value of $Q$.</p>

<p>The next $Q$ lines of input each consist of a string, each of its characters either &#39;M&#39; or &#39;O&#39;. Each string has at least 1 and at most 100 characters.</p>

### 출력

<p>Output the answer for each input string on a separate line.</p>

### 힌트

<p>A sequence of $4$ operations transforming the first string into &quot;MOO&quot; is as follows:</p>

<pre>
Replace the last character with O (operation 1)
Delete the first character (operation 2)
Delete the first character (operation 2)
Delete the first character (operation 2)
</pre>

<p>The second string cannot be transformed into &quot;MOO.&quot; The third string is already &quot;MOO,&quot; so no operations need to be performed.</p>