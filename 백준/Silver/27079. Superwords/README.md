# [Silver III] Superwords - 27079

[문제 링크](https://www.acmicpc.net/problem/27079)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 14, 정답 비율: 31.818%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>The cows are playing dictionary games again; there&#39;s not much else to do while chewing one&#39;s cud.  The new game is a simple one but they need to verify their answers.</p>

<p>Given a list of N (1 &le; N &le; 100) words, what is the smallest &quot;superword&quot; that contains all of them, in order, as subwords?  Consider an example using three words: &#39;big&#39;, &#39;green&#39;, and &#39;engine&#39;.  To make a &quot;superword&quot; (which, regrettably, rarely appears in the dictionary), one combines them carefully to yield: &#39;bigreengine&#39;.</p>

<p>Words appear sequentially in a superword when the first letter of a constituent word appears strictly later in the superword than the first letter of the previous word and the last letter of that word appears strictly later in the superword than the last letter of the previous word. Here are some two word examples:</p>

<ul>
	<li>sin in -&gt; sinin</li>
	<li>sin sine -&gt; sinsine</li>
	<li>sin int -&gt; sint</li>
</ul>

<p>Your task is to find superwords.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1:  Each line contains a single word that contains only lower case letters (&#39;a&#39;..&#39;z&#39;).  No word is longer than 75 characters.</li>
</ul>

### 출력

<p>A single line that contains the &quot;superword&quot;.</p>