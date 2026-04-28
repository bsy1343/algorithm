# [Platinum III] Escape Sequences - 19135

[문제 링크](https://www.acmicpc.net/problem/19135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 6, 맞힌 사람: 6, 정답 비율: 16.216%

### 분류

KMP, 문자열

### 문제 설명

<p>For a string $s$ consisting of only &quot;<em>a</em>&quot; and &quot;<em>b</em>&quot; , let $f(s)$ be the string obtained by replacing all &quot;<em>a</em>&quot; in $s$ with &quot;<em>aa</em>&quot; and &quot;<em>b</em>&quot; with &quot;<em>ab</em>&quot;. For example, $f($&quot;<em>aba</em>&quot;$)$ = &quot;<em>aaabaa</em>&quot;.</p>

<p>Given strings $s$ and $t$, determine the smallest non-negative integer $k$ where $t$ is a consecutive substring of $f^k(s)$.</p>

<p>Note that $f^k$ is defined by:</p>

<ul>
	<li>$f^0(s) = s$;</li>
	<li>$f^k(s) = f^{k - 1}(f(s))$.</li>
</ul>

### 입력

<p>The first and second lines contain string $s$ and $t$ respectively ($1 \leq |s|, |t| \leq 2 \cdot 10^5$).</p>

<p>Strings $s$ and $t$ consist of only characters &quot;<em>a</em>&quot; and &quot;<em>b</em>&quot;.</p>

### 출력

<p>A single integer denotes the minimum $k$.</p>

<p>If $k$ does not exists, print &quot;-1&quot; instead.</p>