# [Silver I] Compression - 31899

[문제 링크](https://www.acmicpc.net/problem/31899)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 43, 맞힌 사람: 39, 정답 비율: 60.938%

### 분류

애드 혹

### 문제 설명

<p>Infinite Compression Plan Consortium (ICPC) has developed a new, great data compression strategy, called &ldquo;Don&rsquo;t Repeat Yourself&rdquo; (DRY). DRY works on a string of characters, and if the string contains two consecutive instances of the same substring, it simply removes one of them. For example, in the string &ldquo;<code>alfalfa seeds</code>&rdquo;, it could remove one of the two &ldquo;<code>e</code>&rdquo; substrings in &ldquo;<code>seeds</code>&rdquo;, and one of the two &ldquo;<code>lfa</code>&rdquo; substrings in &ldquo;<code>alfalfa</code>&rdquo;, resulting in &ldquo;<code>alfa seds</code>&rdquo;. DRY can also take advantage of previous removals &mdash; for instance, in the string &ldquo;<code>seventeenth baggage</code>&rdquo;, it will first remove the duplicate &ldquo;<code>e</code>&rdquo; in &ldquo;<code>seventeenth</code>&rdquo; and the duplicate &ldquo;<code>g</code>&rdquo; in &ldquo;<code>baggage</code>&rdquo;, resulting in &ldquo;<code>sevententh bagage</code>&rdquo;, and then remove the duplicate &ldquo;<code>ent</code>&rdquo; in &ldquo;<code>sevententh</code>&rdquo; and &ldquo;<code>ag</code>&rdquo; in &ldquo;<code>bagage</code>&rdquo;, resulting in &ldquo;<code>seventh bage</code>&rdquo;.</p>

<p>If there are multiple choices of repeating consecutive substrings to remove, DRY should choose in a way that results in the shortest possible final string. For example, in the string &ldquo;<code>ABBCDCABCDCD</code>&rdquo;, DRY has two choices &mdash; either removing the repeated &ldquo;<code>B</code>&rdquo; near the beginning, or the repeated &ldquo;<code>CD</code>&rdquo; at the end. If the &ldquo;<code>B</code>&rdquo; is removed, then DRY will be able to remove the repeated &ldquo;<code>ABCDC</code>&rdquo;, resulting in &ldquo;<code>ABCDCD</code>&rdquo;, from which the &ldquo;<code>CD</code>&rdquo; at the end will finally be removed, resulting in &ldquo;<code>ABCD</code>&rdquo;. However, if DRY removed the &ldquo;<code>CD</code>&rdquo; at the end first, it would be left with &ldquo;<code>ABBCDCABCD</code>&rdquo;, from which only the repeated &ldquo;<code>B</code>&rdquo; can be removed to obtain &ldquo;<code>ABCDCABCD</code>&rdquo; &mdash; and from that string nothing more can be removed. So, the correct choice for DRY is to begin by compressing the double &ldquo;<code>B</code>&rdquo;, and to finally end up with &ldquo;<code>ABCD</code>&rdquo;.</p>

<p>ICPC observed that DRY obtains the best results on binary strings &mdash; that is, strings composed only of zeroes and ones. So, it has tasked you with implementing the best possible DRY algorithm working on binary strings. For any binary string, you should output a shortest string that can be obtained by repeatedly applying DRY to it.</p>

### 입력

<p>The input consists of a single line containing a nonempty string of length less than or equal to $10^5$, consisting only of zeroes and ones.</p>

### 출력

<p>Output one line, containing a shortest possible result of running DRY on the input string. If there is more than one possible shortest result, any one will be accepted.</p>