# [Platinum V] Brackets - 13291

[문제 링크](https://www.acmicpc.net/problem/13291)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 135, 정답: 46, 맞힌 사람: 34, 정답 비율: 33.010%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>A bracket sequence consisting of &lsquo;(&rsquo; and &lsquo;)&rsquo; is defined to be valid as follows:</p>

<ol>
	<li>An empty sequence is valid.</li>
	<li>If X is a valid bracket sequence, then (X) is a valid bracket sequence.</li>
	<li>If X and Y are valid bracket sequences, then the concatenation of X and Y , Z = XY , is a valid bracket sequence.</li>
</ol>

<p>For example, &ldquo;(())&rdquo;, &ldquo;()()&rdquo;, and &ldquo;(()())()&rdquo; are all valid bracket sequences, while &ldquo;(&rdquo; and &ldquo;())&rdquo; are invalid bracket sequences.</p>

<p>You get a bracket sequence from the professor of length n. However, it might not be valid at the moment. The professor asks you to check if it is possible to make the sequence valid by performing at most one segment inversion operation. That is, you may choose two 1-based indices l and r (1 &le; l &le; r &le; n) and invert each bracket with an index in the closed interval [l, r]. After the inversion, a left bracket &lsquo;(&rsquo; becomes a right bracket &lsquo;)&rsquo;, and a right bracket &lsquo;)&rsquo; becomes a left bracket &lsquo;(&rsquo;.</p>

<p>You can make &ldquo;())(&rdquo; valid by inverting the segment [3, 4]. You can make &ldquo;()))&rdquo; valid by inverting the segment [3, 3], or alternatively by inverting the segment [2, 2]. However, there does not exist a segment you can invert to make &ldquo;)))(&rdquo; valid.</p>

### 입력

<p>The input consists of one line containing between 1 and 5 000 brackets.</p>

### 출력

<p>Output &ldquo;possible&rdquo; if you can make the bracket sequence valid by performing at most one segment inversion, or &ldquo;impossible&rdquo; otherwise.</p>