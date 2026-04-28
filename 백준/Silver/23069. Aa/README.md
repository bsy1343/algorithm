# [Silver I] Aa - 23069

[문제 링크](https://www.acmicpc.net/problem/23069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The letter &Aring; is a relatively new invention in the Danish alphabet, being introduced only in 1948. Before that, the digraph Aa was used instead -- this survives in town names like Aabenraa and Aarhus.</p>

<p>When sorting Danish words, &Aring; is treated as the last letter of the alphabet. Interestingly, this partially extends to the digraph: Aa is sorted like &Aring;, <em>but only when it represents a single sound</em>. Thus, while <code>Aarhus</code> (pronunced &quot;&Aring;rhus&quot;) would sort after <code>Zurich</code>, and <code>afrikaans</code> after <code>afrikan</code>, <code>kontraalt</code> (&quot;kontra-alt&quot;) would come before <code>kontrabas</code>.</p>

<p>Given a list of made-up words that could be pronounced in any way, is it possible that it is sorted?</p>

### 입력

<p>The first line of the input contains an integer $N$, the number of words. The next $N$ lines each contain a non-empty string with characters from <code>a-z</code>, the list of words.</p>

<p>All words are guaranteed to be unique.</p>

### 출력

<p>If it is possible to pick out a set of non-overlapping occurrences of <code>aa</code>&#39;s in the input words that should be sorted as &Aring; in such a way that the whole list becomes sorted, output <code>yes</code>.</p>

<p>Otherwise, output <code>no</code>.</p>

### 힌트

<p>In the first sample, we compare the words <code>aarhus</code> and <code>aahus</code>. If we interpret the a&#39;s in <code>aarhus</code> as pronounced separately, but the ones in <code>aahus</code> as making up a single sound, the word list becomes sorted.</p>

<p>In the second sample, regardless of how we interpret a&#39;s, the word list is unsorted.</p>

<p>In the third sample, the word list is again unsorted regardless of how we interpret a&#39;s: if the aa is pronounced as two separate sounds, the first two words are misordered, while if it is pronounced as a single sound, the last two words are misordered.</p>

<p>In the fourth sample, the word list can be seen as sorted if we interpret it as aaaay, aa&aring;record, aa&aring;rghhhh, a&aring;argh, &aring;aahhh, &aring;&aring;battery, where &aring;&#39;s denote aa&#39;s that make up a single sound.</p>

<p>In the fifth sample, there is again no interpretation that results in a sorted list.</p>