# [Gold IV] The ABC Conjecture - 31026

[문제 링크](https://www.acmicpc.net/problem/31026)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

수학, 정수론, 유클리드 호제법, 런타임 전의 전처리, 소인수분해

### 문제 설명

<p>As taken from Wikipedia:</p>

<blockquote>The abc conjecture (also known as the Oesterl&eacute;&ndash;Masser conjecture) is a conjecture in number theory, first proposed by Joseph Oesterl&eacute; (1988) and David Masser (1985). It is stated in terms of three positive integers, <code>a</code>, <code>b</code> and <code>c</code> (hence the name) that are relatively prime and satisfy <code>a + b = c</code>. If <code>d</code> denotes the product of the distinct prime factors of <code>a * b * c</code>, the conjecture essentially states that <code>d</code> is usually not much smaller than <code>c</code>. In other words: if <code>a</code> and <code>b</code> are composed from large powers of primes, then <code>c</code> is usually not divisible by large powers of primes.</blockquote>

<p>The abc conjecture has already become well known for the number of interesting consequences it entails. Many famous conjectures and theorems in number theory would follow immediately from the abc conjecture. Goldfeld (1996) described the abc conjecture as &quot;the most important unsolved problem in Diophantine analysis.&quot;</p>

<p>Several solutions have been proposed to the abc conjecture, the most recent of which is still being evaluated by the mathematical community.</p>

<p>To simplify the rules:</p>

<ul>
	<li><code>a</code>, <code>b</code>, and <code>c</code> are positive integers.</li>
	<li><code>a</code>, <code>b</code>, and <code>c</code> are composed of distinct prime factors.</li>
</ul>

<p>To illustrate the terms used, if</p>

<p><code>a = 16 = 2</code><sup>4</sup>,</p>

<p><code>b = 17</code>, and</p>

<p><code>c = 16 + 17 = 33 = 3 * 11</code>, then</p>

<p><code>d = 2 * 17 * 3 * 11 = 1122</code>,</p>

<p>which is greater than <code>c</code>.</p>

<p>The goal in this programming problem is to find the exceptions where <code>c &gt; d</code>, on a given range for <code>a</code>, <code>b</code>, and <code>c</code>.</p>

### 입력

<p>The first line of input contains <code>N</code> (<code>0 &lt; N &lt; 100</code>), indicating the number of test cases.</p>

<p>The following <code>N</code> lines each consist of two integers <code>L H</code> (<code>2 &le; L &le; H &le; 5000</code>), denoting the lower and upper bounds of <code>a</code>, <code>b</code>, and <code>c</code> (<code>L &le; a, b &lt; c &le; H</code> where <code>a != b</code>).</p>

### 출력

<p>For each test case, output either:</p>

<ul>
	<li>a line &quot;<code>a + b = c</code>&quot; for each equation that satisfies the above criteria. These should be sorted in ascending order by <code>c</code>, then by ascending order by <code>a</code> if there are multiple equations with the same value for <code>c</code>; or</li>
	<li>a line &quot;<code>No exceptions</code>&quot; if there are no equations that satisfy the above criteria,</li>
</ul>

<p>followed by a blank line.</p>