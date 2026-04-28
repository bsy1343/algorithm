# [Silver I] Removing Pairs - 23414

[문제 링크](https://www.acmicpc.net/problem/23414)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 54, 맞힌 사람: 44, 정답 비율: 60.274%

### 분류

그리디 알고리즘, 문자열, 홀짝성

### 문제 설명

<p>The <em>pair removal</em> operation is removing two adjacent characters from a string. For example, given the string &quot;<code>abcd</code>&quot;, we can obtain &quot;<code>ab</code>&quot;, &quot;<code>ad</code>&quot;, and &quot;<code>cd</code>&quot; by pair removal.</p>

<p>You are given a string $t$. You can apply pair removal any number of times. Is it possible to obtain the string $s$?</p>

### 입력

<p>The first line contains the string $s$, and the second line contains the string $t$ ($1 \le |s| \le |t| \le 10^5$). Both strings are composed of lowercase letters of English alphabet.</p>

### 출력

<p>Print &quot;<code>YES</code>&quot; if it is possible to obtain $s$ from $t$ using pair removal, or &quot;<code>NO</code>&quot; otherwise.</p>

### 힌트

<p>In the first test, one of the possible pair removal sequences is the following:</p>

<ul>
	<li><code>ab<u>cb</u>cxdda</code></li>
	<li><code>abcx<u>dd</u>a</code></li>
	<li><code>a<u>bc</u>xa</code></li>
	<li><code>axa</code></li>
</ul>