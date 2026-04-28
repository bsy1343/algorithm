# [Silver IV] Prehistoric Operating Systems - 7515

[문제 링크](https://www.acmicpc.net/problem/7515)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 189, 정답: 106, 맞힌 사람: 94, 정답 비율: 53.107%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>It is the year 2254. Ohio Smith is a specialist in dealing with ancient operating systems. For research purposes, he tries to install several operating systems on his computer which were used about 250 years ago.</p>

<p>Prior research has yielded the result that the order those ancient operating systems is installed in does not matter most of the time. However, the operating system of a certain brand, the DOORS OS, has an interesting quirk: Two versions of DOORS cannot be installed in succession. There always has to be another operating system installed in between (for reasons that seem to be related to some entity called MBR, but Ohio is not yet sure of the details).</p>

<p>Ohio Smith wants to install n operating systems on his computer. In how many ways can he choose between DOORS and other operating systems?</p>

<p>You are given the number of operating systems that Ohio wants to install. Your task is to compute the number of valid OS install sequences.</p>

### 입력

<p>The first line contains the number of scenarios.</p>

<p>Every scenario consists of a single line containing the number 1 &le; n &le; 40 operting systems.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1.</p>

<p>Then, for each scenario, print the number of possible installation sequences on a single line.</p>

### 힌트

<p>In the first example, there are 5 possible ways to install 3 operating systems:</p>

<ol>
	<li>DOORS, other, other</li>
	<li>other, other, other</li>
	<li>other, other, DOORS</li>
	<li>other, DOORS, other</li>
	<li>DOORS, other, DOORS</li>
</ol>