# [Gold II] Genome - 9887

[문제 링크](https://www.acmicpc.net/problem/9887)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬, 최장 공통 부분 수열 문제

### 문제 설명

<p>In comparative genomic, biologists would like to find a gene sequence that is conserved among a set of species.</p>

<p>Let {1, 2, . . . , n} be a set of n integers in which each integer represents a gene. For the m species S<sub>1</sub>, S<sub>2</sub>, &middot; &middot; &middot;, S<sub>m</sub>, each species S<sub>i</sub> is identified by a permutation of {1, 2, . . . , n}. The permutation represents the ordering of genes in S<sub>i</sub>.</p>

<p>A subsequence of an integer sequence is obtained by omitting none, one, or more integers from the original sequence. An integer sequence x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>k</sub> is a conserved gene sequence among the m species if x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>k</sub> is a subsequence of S<sub>i</sub> for all i = 1, 2, . . . , m. Our aim is to find the length of the longest conserved gene sequences for the m species.</p>

### 입력

<p>The input&nbsp;contains m + 1 lines. The first line contains two integers n and m separated by spaces, where 1 &le; n &le; 100 and 1 &le; m &le; 10. Each of the next m lines contains a permutation of 1, 2, . . . , n, with spaces between two adjacent integers.</p>

### 출력

<p>The output&nbsp;contains an integer that gives the length of the longest conserved gene sequences.</p>

### 힌트

<p>Consider the following 3 species,</p>

<ul>
	<li>5, 3, 4, 1, 2;</li>
	<li>2, 5, 4, 3, 1;</li>
	<li>5, 2, 3, 1, 4.</li>
</ul>

<p>The following subsequences</p>

<ul>
	<li>5, 1;</li>
	<li>5, 3;</li>
	<li>5, 4;</li>
	<li>3, 1;</li>
</ul>

<p>are conserved gene sequences among the 3 species but are not longest. The longest conserved gene sequence of the 3 species is 5, 3, 1.</p>