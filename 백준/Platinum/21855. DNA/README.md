# [Platinum V] DNA - 21855

[문제 링크](https://www.acmicpc.net/problem/21855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 26, 맞힌 사람: 24, 정답 비율: 35.294%

### 분류

애드 혹, 해 구성하기, 비트마스킹

### 문제 설명

<p>It is known that the human DNA is represented by an integer number. On a microscopical level, the DNA consists of numerous genes. Considering the binary representation of the corresponding number of the DNA, we notice the following rule: digit 1 on the i<sup>th</sup> position indicates the presence of the i<sup>th</sup> gene, whereas digit 0 indicates its absence (i is a positive integer). Moreover, it was observed that any two distinct adults can give birth to a child whose DNA only contains the i<sup>th</sup> gene if and only if the DNAs of both of the adults contain that gene.</p>

<p>Generate an array of 2000 non-negative integers representing the DNAs of a group of adults so that the total number of children with distinct DNAs that can be born from adults belonging to this group is as big as possible. (as big as possible doesn&rsquo;t mean optimum). The scoring will respect the table below.</p>

### 입력



### 출력



### 제한

<ul>
	<li>This problem is &ldquo;output-only&rdquo;.</li>
	<li>The demanded array must contain non-negative integers from the range [0, 2<sup>20</sup> -1].</li>
	<li>All children must come from different adults, meaning that any 2 children must have at least one different parent.</li>
	<li>The two parents of a child must be distinct.</li>
</ul>

### 힌트

<p>Considering that the adults have the following DNAs: 1, 5, 3, 6, 9, 12, the distinct DNAs of the children will be 1, 0, 4, 2, 8.</p>