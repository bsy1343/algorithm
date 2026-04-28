# [Gold I] COW Operations - 24979

[문제 링크](https://www.acmicpc.net/problem/24979)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 239, 정답: 167, 맞힌 사람: 145, 정답 비율: 70.388%

### 분류

문자열, 애드 혹, 누적 합, 홀짝성, 불변량 찾기

### 문제 설명

<p>Bessie finds a string $s$ of length at most $2 \cdot 10^5$ containing only the three characters &#39;C&#39;, &#39;O&#39;, and &#39;W&#39;. She wants to know if it&#39;s possible to turn this string into a single &#39;C&#39; (her favorite letter) using the following operations:</p>

<p>1. Choose two adjacent equal letters and delete them.</p>

<p>2. Choose one letter and replace it with the other two letters in either order.</p>

<p>Finding the answer on the string itself isn&#39;t enough for Bessie, so she wants to know the answer for $Q$ ($1\le Q\le 2\cdot 10^5$) substrings of $s$.</p>

### 입력

The first line contains $s$.

<p>The next line contains $Q$.

<p>The next $Q$ lines each contain two integers $l$ and $r$ ($1\le l\le r\le |s|$,
where $|s|$ denotes the length of $s$).

### 출력

<p>A string of length $Q$, with the $i$-th character being &#39;Y&#39; if the $i$-th substring can be reduced and &#39;N&#39; otherwise.</p>

### 힌트

<p>The answer to the first query is yes because the first character of $s$ is already equal to &#39;C&#39;.</p>

<p>The answer to the fifth query is yes because the substring OW from the second to the third character of $s$ can be converted into &#39;C&#39; in two operations:</p>

<pre>
   OW
-&gt; CWW
-&gt; C
</pre>

<p>No other substring of this example string COW can be reduced to &#39;C&#39;</p>