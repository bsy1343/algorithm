# [Gold II] Excursion - 33242

[문제 링크](https://www.acmicpc.net/problem/33242)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 2048 MB

### 통계

제출: 24, 정답: 10, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Jimmy goes on an excursion in the country of Treenidad and Treebago. People there are obsessed with trees so much, they modeled their country after them. Being a careful planner, Jimmy wants to know in advance which cities should be visited to maximize the total appeal of his excursion. The appeal of a city is defined by a not necessarily positive integer. Since he went through a lot of hassle to get his visa, he wants to visit at least one city. Jimmy's excursion can start from any city. His only requirement when visiting the country is that he mustn't visit the same city twice.</p>

### 입력

<p>The first line in the input contains an integer $1\leq n \leq 10^6$, the number of cities in Treenidad and Treebago.\\ After that, $n$ lines follow, the first of which describes the root of the tree.\\ Each of the following lines contains two integers, $V$ and $C$, which describe the properties of a node in the tree:</p>

<ul>
	<li>$V$ represents the value at that node, with $-2^{31} \leq V &lt; 2^{31}$.</li>
	<li>$C$ represents the number of children of the node, with $0 \leq C &lt; 10^6$.</li>
</ul>

<p>After that, $C$ lines follow, each recursively defining the child trees. It is guaranteed that the height of the tree is less than or equal to $990$.</p>

### 출력

<p>The maximum appeal Jimmy can gather in his excursion.</p>