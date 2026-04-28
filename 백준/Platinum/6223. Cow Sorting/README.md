# [Platinum I] Cow Sorting - 6223

[문제 링크](https://www.acmicpc.net/problem/6223)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 424, 정답: 283, 맞힌 사람: 266, 정답 비율: 69.816%

### 분류

그리디 알고리즘, 순열 사이클 분할

### 문제 설명

<p>Farmer John&#39;s N (1 &lt;= N &lt;= 10,000) cows are lined up to be milked in the evening. Each cow has a unique &quot;grumpiness&quot; level in the range 1...100,000. Since grumpy cows are more likely to damage FJ&#39;s milking equipment, FJ would like to reorder the cows in line so they are lined up in increasing order of grumpiness. During this process, the places of any two cows (not necessarily adjacent) can be interchanged. Since grumpy cows are harder to move, it takes FJ a total of X+Y units of time to exchange two cows whose grumpiness levels are X and Y.</p>

<p>Please help FJ calculate the minimal time required to reorder the cows.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N.</li>
	<li>Lines 2..N+1: Each line contains a single integer: line i+1 describes the grumpiness of cow i.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with the minimal time required to reorder the cows in increasing order of grumpiness.</li>
</ul>

### 힌트

<pre>
2 3 1 : Initial order.   
2 1 3 : After interchanging cows with grumpiness 3 and 1 (time=1+3=4). 
1 2 3 : After interchanging cows with grumpiness 1 and 2 (time=2+1=3). </pre>

<p>&nbsp;</p>