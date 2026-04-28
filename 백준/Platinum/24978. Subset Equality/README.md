# [Platinum V] Subset Equality - 24978

[문제 링크](https://www.acmicpc.net/problem/24978)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 401, 정답: 157, 맞힌 사람: 128, 정답 비율: 39.024%

### 분류

문자열, 애드 혹

### 문제 설명

<p>The cows are trying out a new method of exchanging coded messages with each-other where they mix irrelevant letters in among relevant letters to make the messages hard to decode.</p>

<p>The cows transmit two strings $s$ and $t$ each of length at most $10^5$ consisting only of the lowercase English letters &#39;a&#39; through &#39;r&#39;. To try and make sense of this coded message, you will be given $Q$ queries ($1 \leq Q \leq 10^5$). Each query provides a subset of the lowercase English letters from &#39;a&#39; to &#39;r.&#39; You need to determine for each query whether $s$ and $t$, when restricted only to the letters in the query, are equal.</p>

### 입력

<p>First line contains $s$.</p>

<p>Second line contains $t$.</p>

<p>Third line contains $Q$.</p>

<p>Next $Q$ lines each contain a query string. Within a query string, no letters are repeated. Furthermore, all query strings are in sorted order, and no query string appears more than once.</p>

### 출력

For each query, print 'Y' if $s$ and $t$, when restricted only to the letters in
the query, are equal, or 'N' otherwise.

### 힌트

<p>For the first query, both strings become "aa" when restricted only to 'a.'

<p>For the second query, the first string becomes "aac" while the second string
becomes "caa."