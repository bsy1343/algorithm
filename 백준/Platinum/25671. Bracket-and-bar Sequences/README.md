# [Platinum III] Bracket-and-bar Sequences - 25671

[문제 링크](https://www.acmicpc.net/problem/25671)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 재귀

### 문제 설명

<p>Let us define the set of <em>regular bracket-and-bar sequences</em> $R$ recursively. It is the set of strings that can be obtained following only the rules below:</p>

<ul>
	<li>$\varepsilon \in R$ (empty string)</li>
	<li>$A, B \in R \Rightarrow AB \in R$ (concatenation)</li>
	<li>$A, B \in R \Rightarrow $<code>(</code>$A$<code>|</code>$B$<code>)</code>$ \in R$</li>
</ul>

<p>For example, the sequences containing two triples &quot;<code>(|)</code>&quot; look as folows: &quot;<code>((|)|)</code>&quot;, &quot;<code>(|(|))</code>&quot;, &quot;<code>(|)(|)</code>&quot;.</p>

<p>Establish a correspondence between regular bracket-and-bar sequences of certain length and integers, and implement that correspondence.</p>

### 입력



### 출력

