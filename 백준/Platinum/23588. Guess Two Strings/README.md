# [Platinum IV] Guess Two Strings - 23588

[문제 링크](https://www.acmicpc.net/problem/23588)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 7, 맞힌 사람: 6, 정답 비율: 14.286%

### 분류

브루트포스 알고리즘, 애드 혹, 비트마스킹, 무작위화

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Jury has chosen two secret binary strings of length $N$ and called them $s$ and $t$ such that $s$ is not lexicographically greater than $t$. Your task is to find out which strings were chosen. To do that, you can ask the jury to generate up to $Q$ strings. Each such string $r$ will be generated in the following way:</p>

<ol>
	<li>start by assigning $r = s$ or $r = t$, choosing one of them randomly with equal probability,</li>
	<li>randomly select $K$ <strong>distinct</strong> positions in the string $r$ so that each set of $K$ positions has equal probability of being selected,</li>
	<li>flip the digits at the selected positions in $r$: change all &quot;<code>0</code>&quot;s to &quot;<code>1</code>&quot;s and all &quot;<code>1</code>&quot;s to &quot;<code>0</code>&quot;s,</li>
	<li>give the modified string $r$ to you.</li>
</ol>

<p>Note that $s$ and $t$ don&#39;t change during generation of string $r$.</p>

<p>Your task is to correctly guess $s$ and $t$.</p>

### 입력



### 출력



### 힌트

<p>This example violates the constraints, and is given only to illustrate the process of interaction. All tests in the testing system will satisfy all the constraints from the statement.</p>