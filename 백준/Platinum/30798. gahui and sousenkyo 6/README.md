# [Platinum V] gahui and sousenkyo 6 - 30798

[문제 링크](https://www.acmicpc.net/problem/30798)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 39, 맞힌 사람: 24, 정답 비율: 25.532%

### 분류

수학, 애드 혹, 해 구성하기, 많은 조건 분기, 비트마스킹

### 문제 설명

<p>Gahui is watching the annual character election. After the election, <strong>The top 16 characters</strong> receive enormous benefits for one year. For that reason, fans vote passionately to get their favorite characters into the top 16. Remarkably, at least one Cinderella appears in every election, achieving an outstanding outcome.</p>

<p>Gahui missed the broadcast of the fascinating character election. On the Internet, there was only the following information:</p>

<ul>
	<li>The number of characters participating in the election is $n$.</li>
	<li>No two characters have the same number of votes, and each character has received at least one vote.</li>
	<li>When the bitwise-xor operation is applied to the votes of all characters, the result is $x$.</li>
	<li>The number of votes for every character is less than $2^{63}$.</li>
</ul>

<p>Find character election results.</p>

### 입력

<p>$n$ and $x$ are given, separated by spaces.</p>

### 출력

<p>Print $n$ in the first line. $n$ is the number of characters participating in the election.</p>

<p>In the following $n$ lines, print the number of votes obtained by rank.</p>

<p>If there are multiple solutions, you may output any of them.</p>

### 제한

<ul>
	<li>$4 \le n \le 10^6$</li>
	<li>$0 \le x \le 2^{30}$</li>
</ul>