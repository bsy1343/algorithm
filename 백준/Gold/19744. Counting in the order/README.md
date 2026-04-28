# [Gold V] Counting in the order - 19744

[문제 링크](https://www.acmicpc.net/problem/19744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 36, 맞힌 사람: 32, 정답 비율: 54.237%

### 분류

자료 구조, 스택

### 문제 설명

<p>During the whole year Vasya didn&#39;t go to the university, therefore he didn&#39;t pass his exams and was expelled. That&#39;s how he ended up in the army. And the most popular exercise in the army is standing in the order.</p>

<p>There&#39;re $n$ soldiers in Vasya&#39;s troop including himself. Soldiers are standing in a row, each of them is looking to the left or to the right and have his own serial number from $1$ to $n$ equal to his place in the order. The height of the $i$-th soldier is $h_i$. Vasya thinks that the soldier with number $i$ see the soldier with number $j$ if the following conditions are true:</p>

<ul>
	<li>soldier $i$ looks toward the soldier $j$;</li>
	<li>all soldiers standing between them are not taller than soldier $j$.</li>
</ul>

<p>For example, if there&#39;re $4$ soldiers in the row with heights $h_1 = 178$, $h_2 = 180$, $h_3 = 170$, $h_4 = 190$ and all soldiers are looking to the left, then $2$-nd soldier will see only the $1$-st one, $3$-rd --- only $2$-nd one (because between him and first soldier there is higher second soldier), $4$-th will see $2$-nd and $3$-rd soldier.</p>

<p>Because there is nothing to do in the order, Vasya wants to calculate how many soldiers see each of the soldiers.</p>

### 입력

<p>The first line of input contains number $n$ --- the number of soldiers in the row ($1 \le n \le 10^5$).</p>

<p>The second line contains $n$ numbers $h_1, h_2, \ldots, h_n$ --- heights of soldiers in the row ($1 \le h_i \le 10^9$).</p>

<p>The third line contains $n$ symbols representing the directions in which the soldiers look: $i$-th symbol is equal &lt;&lt;<code>L</code>&gt;&gt; if $i$-th soldier looks to the left, i.e. potentially can see only the soldiers with serial numbers $1, 2, \ldots, i - 1$, or &lt;&lt;<code>R</code>&gt;&gt; if $i$-th soldier looks to the right and potentially can see only the soldier with serial numbers $i + 1, i + 2, \ldots, n$.</p>

### 출력

<p>Output $n$ integers, where $i$-th integer is equal to the number of soldiers in the row that $i$-th soldier see.</p>