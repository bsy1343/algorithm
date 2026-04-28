# [Platinum III] Cell Phone Network - 6155

[문제 링크](https://www.acmicpc.net/problem/6155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 41, 맞힌 사람: 38, 정답 비율: 48.718%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has decided to give each of his cows a cell phone in hopes to encourage their social interaction. This, however, requires him to set up cell phone towers on his N (1 &lt;= N &lt;= 10,000) pastures (conveniently numbered 1..N) so they can all communicate.</p>

<p>Exactly N-1 pairs of pastures are adjacent, and for any two pastures A and B (1 &lt;= A &lt;= N; 1 &lt;= B &lt;= N; A != B) there is a sequence of adjacent pastures such that A is the first pasture in the sequence and B is the last. Farmer John can only place cell phone towers in the pastures, and each tower has enough range to provide service to the pasture it is on and all pastures adjacent to the pasture with the cell tower.</p>

<p>Help him determine the minimum number of towers he must install to provide cell phone service to each pasture.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N: Each line specifies a pair of adjacent pastures with two space-separated integers: A and B</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer indicating the minimum number of towers to install</li>
</ul>

### 힌트

<p>Farmer John has 5 pastures: pastures 1 and 3 are adjacent, as are pastures 5 and 2, pastures 4 and 3, and pastures 3 and 5. Geometrically, the farm looks like this (or some similar configuration)</p>

<pre>
               4  2
               |  |
            1--3--5</pre>

<p>The towers can be placed at pastures 2 and 3 or pastures 3 and 5.</p>