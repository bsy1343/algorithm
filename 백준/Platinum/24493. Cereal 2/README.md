# [Platinum I] Cereal 2 - 24493

[문제 링크](https://www.acmicpc.net/problem/24493)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 301, 정답: 55, 맞힌 사람: 47, 정답 비율: 19.583%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 깊이 우선 탐색, 이분 매칭

### 문제 설명

<p>Farmer John&#39;s cows like nothing more than cereal for breakfast! In fact, the cows have such large appetites that they will each eat an entire box of cereal for a single meal.</p>

<p>The farm has recently received a shipment with $M$ different types of cereal $(2\le M\le 10^5)$. Unfortunately, there is only one box of each cereal! Each of the $N$ cows $(1\le N\le 10^5)$ has a favorite cereal and a second favorite cereal. When given a selection of cereals to choose from, a cow performs the following process:</p>

<ol>
	<li>If the box of her favorite cereal is still available, take it and leave.</li>
	<li>Otherwise, if the box of her second-favorite cereal is still available, take it and leave.</li>
	<li>Otherwise, she will moo with disappointment and leave without taking any cereal.</li>
</ol>

<p>Find the minimum number of cows that go hungry if you permute them optimally. Also, find any permutation of the $N$ cows that achieves this minimum.</p>

### 입력

<p>The first line contains two space-separated integers $N$ and $M.$</p>

<p>For each $1\le i\le N,$ the $i$-th line contains two space-separated integers $f_i$ and $s_i$ ($1\le f_i,s_i\le M$ and $f_i\neq s_i$) denoting the favorite and second-favorite cereals of the $i$-th cow.</p>

### 출력

<p>Print the minimum number of cows that go hungry, followed by any permutation of $1\ldots N$ that achieves this minimum. If there are multiple permutations, any one will be accepted.</p>

### 힌트

<p>In this example, there are $8$ cows and $10$ types of cereal.</p>

<p>Note that we can effectively solve for the first three cows independently of the last five, since they share no favorite cereals in common.</p>

<p>If the first three cows choose in the order $[1,2,3]$, then cow $1$ will choose cereal $2$, cow $2$ will choose cereal $3$, and cow $3$ will go hungry.</p>

<p>If the first three cows choose in the order $[1,3,2]$, then cow $1$ will choose cereal $2$, cow $3$ will choose cereal $3$, and cow $2$ will choose cereal $4$; none of these cows will go hungry.</p>

<p>Of course, there are other permutations that result in none of the first three cows going hungry. For example, if the first three cows choose in the order $[3,1,2]$ then cow $3$ will choose cereal $2$, cow $1$ will choose cereal $1$, and cow $2$ will choose cereal $3$; again, none of cows $[1,2,3]$ will go hungry.</p>

<p>It can be shown that out of the last five cows, at least one must go hungry.</p>