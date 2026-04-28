# [Gold II] Mirror Brackets - 31109

[문제 링크](https://www.acmicpc.net/problem/31109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 8, 맞힌 사람: 8, 정답 비율: 32.000%

### 분류

구현, 재귀, 문자열

### 문제 설명

<p>Let&#39;s remind you what a correct bracket sequence (CBS) is.</p>

<ul>
	<li>An empty string is CBS.</li>
	<li>If $s$ is CBS, then <code>(</code>$s$<code>)</code> and <code>[</code>$s$<code>]</code> also are CBS.</li>
	<li>If $s$ and $t$ are CBS, then $st$ also is CBS.</li>
	<li>If a sequence can&#39;t be obtained applying the rules given above, then it is not a CBS.</li>
</ul>

<p>Vasya wrote a correct bracket sequence consisting of brackets &quot;<code>(</code>&quot;, &quot;<code>)</code>&quot;, &quot;<code>[</code>&quot; and &quot;<code>]</code>&quot;. After that Vasya added to some places of the sequence characters &quot;<code>b</code>&quot;, &quot;<code>d</code>&quot;, &quot;<code>o</code>&quot;, &quot;<code>p</code>&quot;, &quot;<code>q</code>&quot; and &quot;<code>x</code>&quot;. As a result, Vasya got some string $z$.</p>

<p>Now Vasya performs the following operations:</p>

<p>If $z$ has a substring of the form <code>(</code>$s$<code>)</code> (there are no brackets in $s$), then Vasya replaces it with $s$ string&#39;s mirror reflection relative to vertical axis. If $z$ contains a substring of the form <code>[</code>$t$<code>]</code> (there are no brackets in $t$ as well), then Vasya replaces it with $t$ string&#39;s mirror reflection relative to horizontal axis. For example, substring &quot;<code>(qbpoxd)</code>&quot; will be replaced with &quot;<code>bxoqdp</code>&quot;, and substring &quot;<code>[qbpoxd]</code>&quot; will be replaced with &quot;<code>dpboxq</code>&quot;.</p>

<p>Vasya performs operations until there are no brackets left in the string.</p>

<p>Calculate by the given $z$ string what result Vasya will have in the end.</p>

### 입력

<p>The only line contains the $z$ string whose length does not exceed $10^5$ characters, consisting of characters &quot;<code>(</code>&quot;, &quot;<code>)</code>&quot;,&quot;<code>[</code>&quot;, &quot;<code>]</code>&quot;, &quot;<code>b</code>&quot;, &quot;<code>d</code>&quot;, &quot;<code>o</code>&quot;, &quot;<code>p</code>&quot;, &quot;<code>q</code>&quot; and &quot;<code>x</code>&quot;. It is guaranteed that all the brackets in $z$ organize a correct bracket sequence. It is also guaranteed that the input data contain at least one letter.</p>

### 출력

<p>Print the string Vasya will get in the end.</p>