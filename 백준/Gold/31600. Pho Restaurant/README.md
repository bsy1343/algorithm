# [Gold V] Pho Restaurant - 31600

[문제 링크](https://www.acmicpc.net/problem/31600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 208, 정답: 82, 맞힌 사람: 79, 정답 비율: 46.199%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>As you may know, pho is one of the most common dishes in Hanoi. It contains a special kind of flour noodles, meat (usually beef or chicken), and green onions dipped in a tasty broth. Vietnamese people enjoy pho for breakfast, lunch, dinner, and even light meals. For tourists, trying pho is a must, especially in the cold of Hanoi.</p>

<p>You own a <em>phở b&ograve;</em> (beef pho) restaurant in Vietnam with $n$ tables, numbered $1$ to $n$. The 2024 ICPC Asia Pacific Championship contestants are currently in your restaurant. Each contestant is initially seated at one of the tables and there is at least one contestant initially seated at each table.</p>

<p>Each contestant would like to order one of the two most well-known kinds of pho: <em>phở t&aacute;i</em> (pho with medium-rare beef) or <em>phở ch&iacute;n</em> (pho with well-done beef). The initial state of table $i$ is represented by the binary string $S_i$. The length of $S_$i is the number of contestants initially seated at table $i$. The $j$-th character of $S_i$ is $0$ if the $j$-th contestant initially seated at the table would like to order a <em>phở t&aacute;i</em>, and $1$ if the contestant would like to order a <em>phở ch&iacute;n</em>.</p>

<p>To make it easier to track the orders, the restaurant wants the contestants seated at the same table to have the same order. That is, for each table, at least one of the following must be true:</p>

<ul>
	<li>All of the contestants seated at that table would like to order a <em>phở t&aacute;i</em>.</li>
	<li>All of the contestants seated at that table would like to order a <em>phở ch&iacute;n</em>.</li>
</ul>

<p>To satisfy this requirement and the contestants&rsquo; orders, you want to move zero or more contestants to a different table. The destination table must be one of the $n$ tables. In other words, you must not add new tables. There is no limit to the number of contestants that can be seated at the same table. After moving the contestants, the following condition should be satisfied by each table: either there is no contestant seated at that table or all contestants seated at that table would like to order the same dish.</p>

<p>Since moving contestants takes some time, you would like to compute the minimum number of contestants you need to move.</p>

### 입력

<p>The first line of input contains one integer $n$ ($2 &le; n &le; 100\, 000$). Each of the next $n$ lines contains a binary string. The $i$-th line contains $S_i$ ($1 &le; |S_i | &le; 200\, 000$). The sum of $|S_i |$ across all $i$ does not exceed $500\, 000$.</p>

### 출력

<p>Output an integer representing the minimum number of contestants you need to move.</p>