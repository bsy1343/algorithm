# [Gold I] Dolls - 28492

[문제 링크](https://www.acmicpc.net/problem/28492)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 32, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Marc is teaching some children about objects with different sizes. To demonstrate this concept, he will be using dolls. These dolls are hollow on the inside, so smaller dolls can be placed inside larger ones.</p>

<p>Each doll has a certain size. A doll of size $x$ can fit inside another doll of size $y$ if $y - x &ge; 2$. In other words, a smaller doll can fit in a larger doll if the difference in size between the larger doll and the smaller doll is at least $2$.</p>

<p>A doll stack is formed by selecting some dolls that Marc has and repeatedly fitting the smallest doll into the second smallest doll until only one doll is left. The size of a doll stack is the number of dolls used to create it.</p>

<p>There are n days. On the $i$th ($1 &le; i &le; n$) day, Marc will buy a doll of size $a[i]$. After buying the doll, he will try to construct a doll stack with the maximum number of dolls. Help Marc compute, for each day, the maximum size of a doll stack using the dolls available on that day.</p>

### 입력

<p>The first line of input contains exactly $1$ integer, $n$.</p>

<p>The second line contain $n$ integers $a[1], a[2], \dots , a[n]$, representing the sizes of the dolls bought on each of the $n$ days.</p>

### 출력

<p>The output should contain $n$ integers on a single line and separated by spaces. The $i$-th integer should be the maximum size of a doll stack using the dolls available on that day.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 100\,000$</li>
	<li>$1 &le; a[i] &le; 500\,000$</li>
</ul>