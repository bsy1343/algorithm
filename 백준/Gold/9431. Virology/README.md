# [Gold IV] Virology - 9431

[문제 링크](https://www.acmicpc.net/problem/9431)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Little is understood about the virus and the way it infects its human hosts, but what has been discovered is a peculiar pattern in human DNA that can tell virologists if a particular person is vulnerable or immune to the virus. DNA was sampled from every individual working with the CDC, and a pattern was recognized to be present in only those who were infected by the virus.</p>

<p>We have isolated 9 genes within human DNA that can tell us if a person is vulnerable to infection. Most people have at least 14 occurrences of these genes. An individual that is considered vulnerable is known to have met the following conditions:</p>

<ul>
	<li>The individual must have exactly 14 occurrences of the numbered DNA genes (1-9). You will only test samples from people that meet this condition. There will be a max of 3 of the same gene in a test case. The order of the genes is not significant.</li>
	<li>Within their DNA there must be 4 total instances of triples and/or straights and 1 pair
	<ul>
		<li>triples (3 of the same gene, example: [7 7 7]</li>
		<li>straights of 3 (examples: [1 2 3] [7 8 9] [4 5 6])</li>
		<li>pair (2 of the same gene, example: [9 9])</li>
	</ul>
	</li>
</ul>

<p>Note: An instance of a gene cannot be reused in multiple sets</p>

<p>So if an individual with 14 numbered genes in their DNA has</p>

<ul>
	<li>4 triples/straights AND</li>
	<li>1 pair</li>
</ul>

<p>then they are vulnerable. If this pattern cannot be found in an individual&#39;s DNA then that individual is immune.</p>

<p>Your job is to take a list of DNA samples from individuals with 14 of the numbered genes and determine if they are vulnerable.</p>

### 입력

<p>The first number will be the number of test cases N (1 &lt;= N &lt;= 200000). Following that will be N lines of 14 numbers separated by spaces indicating the genes present in the DNA.</p>

### 출력

<p>If an individual is vulnerable to the virus, output Vulnerable. Otherwise, output Immune. Output each answer on a separate line.</p>