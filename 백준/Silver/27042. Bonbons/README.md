# [Silver IV] Bonbons - 27042

[문제 링크](https://www.acmicpc.net/problem/27042)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 112, 정답: 91, 맞힌 사람: 68, 정답 비율: 80.952%

### 분류

수학, 자료 구조, 덱, 큐

### 문제 설명

<p>FJ knows that the cows (like everyone else) love bonbons, which are very expensive candy. He has decided to purchase and give a single bonbon to one of his N (1 &le; N &le; 7,100,000) cows (which are conveniently numbered 1..N).  He lines the cows up in order in a circle and starts with cow 1.  He moves to cow 2 and asks her to leave the circle.  He moves to cow 4 and asks her to leave. He continues to ask every other cow to leave the circle until only one remains -- and she gets the bonbon.</p>

<p>Determine which cow gets the bonbon.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, the number of the cow that gets the bonbon.</li>
</ul>

### 힌트

<pre>
Initial circle: 1 2 3 4 5 6 7 
Becomes:        1   3 4 5 6 7 
Becomes:        1   3   5 6 7 
Becomes:        1   3   5   7
Becomes:            3       7
Becomes:                    7
</pre>