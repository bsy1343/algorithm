# [Platinum IV] Reverse Game - 21906

[문제 링크](https://www.acmicpc.net/problem/21906)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 332, 정답: 178, 맞힌 사람: 157, 정답 비율: 57.091%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>Alice and Bob are playing a turn-based game. The rules of the game are as follows:</p>

<ol>
	<li>At the beginning of the game some binary string $s$ is chosen.</li>
	<li>On his turn player has to choose some substring $t$ of $s$, equal to one of <code>10</code>, <code>110</code>, <code>100</code>, <code>1010</code>. Then the player has to reverse $t$. For example, if $s&nbsp;= $<code>010101</code>, the player can select substring $t = $<code>1010</code> and reverse it, obtaining $s = $<code>001011</code></li>
	<li>he player who can&rsquo;t make a move (who can&rsquo;t choose an appropriate substring $t$) loses.</li>
	<li>The players cannot skip a turn.</li>
</ol>

<p>Which player has the winning strategy, if Alice moves first?</p>

<p>A string $a$ is a substring of a string $b$ if $a$ can be obtained from $b$ by deletion of several (possibly, zero or all) characters from the beginning and several (possibly, zero or all) characters from the end.</p>

### 입력

<p>The only line of the input contains a binary string $s$ ($1 \le |s| \le 10^6$) &mdash; the string with which Alice and Bob play.</p>

### 출력

<p>If Alice wins, output <code>Alice</code>. Otherwise, output <code>Bob</code>.</p>

### 힌트

<p>In the first sample, Alice can choose substring <code>10</code> of <code>010</code> and reverse it, obtaining string <code>001</code>. Bob can&rsquo;t make any move with this string, and loses.</p>

<p>In the second sample, Alice can&rsquo;t make a single move and loses.</p>