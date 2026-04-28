# [Silver V] O Those Fads - 6123

[문제 링크](https://www.acmicpc.net/problem/6123)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 346, 정답: 246, 맞힌 사람: 230, 정답 비율: 70.769%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Like any other teenager, teen cows are occasionally overtaken by fads. Sometimes it&#39;s a hula hoop or a pet rock, other times it&#39;s Counterstrike, Pokemon, Rick Astley, or tribal tattoos on their udders.</p>

<p>Mathematically, we know that a fad has an initial attractiveness level L (1 &lt;= L &lt;= 50,000). Cow i has a resistance (0 &lt;= R_i &lt;= 1,000,000) that tells how long she can avoid a fad before having no alternative but to participate. When a fad&#39;s attractiveness level meets or exceeds a cow&#39;s fad resistance, then the cow will want to participate in the fad.</p>

<p>Each cow who participates in a fad increases (through peer pressure) that fad&#39;s attractiveness by some value K (1 &lt;= K &lt;= 2,500).</p>

<p>Given a population of N (1 &lt;= N &lt;= 100,000) cows, determine how many will participate in a fad.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, L, and K</li>
	<li>Lines 2..N+1: Line i+1 contains cow i&#39;s a single integer that is fad resistance: R_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of cows how ultimately participate in the fad.</li>
</ul>

<p>&nbsp;</p>