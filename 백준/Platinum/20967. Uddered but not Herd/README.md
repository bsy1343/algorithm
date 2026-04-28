# [Platinum III] Uddered but not Herd - 20967

[문제 링크](https://www.acmicpc.net/problem/20967)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 90, 맞힌 사람: 73, 정답 비율: 57.031%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A little known fact about cows is that they have their own version of the alphabet, the &quot;cowphabet&quot;. It consists of the 26 letters &#39;a&#39; through &#39;z&#39;, but when a cow speaks the cowphabet, she lists these letters in a specific ordering that might be different from the order &#39;abcdefghijklmnopqrstuvwxyz&#39; we are used to hearing.</p>

<p>To pass the time, Bessie&#39;s cousin Mildred has been humming the cowphabet over and over again, and Farmer Nhoj is curious how many times she&#39;s hummed it.</p>

<p>Given a lowercase string of letters that Farmer Nhoj has heard Mildred say, compute the minimum number of times Mildred must have hummed the entire cowphabet in order for Farmer Nhoj to have heard the given string. Farmer Nhoj isn&#39;t always paying attention to what Mildred hums, and so he might have missed some of the letters that Mildred has hummed. The string you are told consists of just the letters that he remembers hearing.</p>

### 입력

<p>The only line of input contains the string of lowercase letters that Farmer Nhoj heard Mildred say. This string has length at least $1$ and at most $10^5$.</p>

### 출력

<p>Print the minimum number of times Mildred must have hummed the entire cowphabet.</p>

### 제한

<ul>
	<li>In test cases 1-5, Farmer Nhoj only heard letters that appear in Mildred&#39;s or Bessie&#39;s names.</li>
	<li>In test cases 6-16, Farmer Nhoj never heard any of the letters that appear in Mildred&#39;s name.</li>
</ul>

### 힌트

<p>Mildred must have hummed the cowphabet at least three times. It is possible for Mildred to have only hummed the cowphabet three times if the cowphabet starts with &quot;mildre&quot; and Farmer Nhoj heard the letters in uppercase as denoted below.</p>

<pre>
MILDREabcfghjknopqstuvwxyz
milDREabcfghjknopqstuvwxyz
mildrEabcfghjknopqstuvwxyz
</pre>