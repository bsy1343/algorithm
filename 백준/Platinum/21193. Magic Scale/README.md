# [Platinum IV] Magic Scale - 21193

[문제 링크](https://www.acmicpc.net/problem/21193)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 237, 정답: 38, 맞힌 사람: 31, 정답 비율: 41.333%

### 분류

자료 구조, 정렬, 우선순위 큐, 트리를 사용한 집합과 맵

### 문제 설명

<p>A treasure is locked into a room of a well-guarded dungeon. At the door of the room, there is a magic scale and a set of N weights. The scale has an associated unknown target total weight W. We have the following properties:</p>

<ul>
	<li>It is guaranteed that a subset of the weights will sum to exactly W.</li>
	<li>When the total weight on the scale is exactly W, the door opens, unlocking the treasure.</li>
	<li>If the total weight on the scale is less than W, nothing happens.</li>
	<li>As a security measure, if the total weight on the scale exceeds W, the door will be forever locked.</li>
</ul>

<p>One way to guarantee opening the door and reaching the coveted treasure is therefore to try all subsets of the N weights in order of increasing total weight. However, multiple subsets might have the same total weight, so a better strategy is to try one subset for each given total weight.</p>

<p>Help our adventurer by enumerating the first K possible total weights in increasing order, together with one corresponding subset of weights for each total weight.</p>

### 입력

<ul>
	<li>The first line contains a single integer N.</li>
	<li>The second line contains a single integer K.</li>
	<li>The third line contains a space-separated list of N integers representing the N weights.</li>
</ul>

### 출력

<p>K lines representing the first K possible total weights in increasing order, together with the corresponding weights. The format of each of the K lines is:</p>

<pre>
total_weight: weight_1 weight_2 ... weight_p</pre>

<p>where <code>weight_1 weight_2 ... weight_p</code> are p space-separated weights that sum to <code>total_weight</code> (if there are multiple options, any will be accepted).</p>

<p>It is guaranteed that it will be possible to find at least K different weight sums given the input data.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>1 &le; K &le; 1000</li>
	<li>Each weight is in [1, 1000000]</li>
</ul>