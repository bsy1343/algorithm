# [Gold II] Free Figurines - 13950

[문제 링크](https://www.acmicpc.net/problem/13950)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 72, 맞힌 사람: 68, 정답 비율: 46.897%

### 분류

애드 혹

### 문제 설명

<p>A matryoshka doll is a set of wooden figurines of increasing sizes that can be nested one inside the other. They are nested by placing a figurine inside a larger figurine which is, in turn, placed inside a yet larger figurine, etc. We may never place more than one figurine directly inside another figurine, no matter the sizes of the figurines involved.</p>

<p>We are currently playing with a set of n figurines denoted by integers 1 through n in the order of increasing size. If a figurine a is placed directly inside a figurine b we say that b is a parent of a, and if a figurine has no parent we call it free. A configuration of the whole set can be described by specifying the current parent of each figurine.</p>

<p>We are allowed to perform the following steps while playing:</p>

<ul>
	<li>Place a free figurine inside a larger free figurine that is currently empty.</li>
	<li>Open a non-empty free figurine and take out the figurine placed directly inside.</li>
</ul>

<p>Find the minimal number of steps to obtain the given target configuration from the given initial configuration.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100 000) &mdash; the number of figurines.</p>

<p>The following line contains a sequence of n integers p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> (0 &le; p<sub>k</sub> &le; n) describing the initial configuration. The k-th integer p<sub>k</sub> is 0 if the figurine k is free, or the parent of figurine k otherwise.</p>

<p>The following line contains a sequence of n integers q<sub>1</sub>, q<sub>2</sub>, . . . , q<sub>n</sub> (0 &le; q<sub>k</sub> &le; n) describing the target configuration in the same format.</p>

<p>You may assume that both configurations are valid: a figurine is always smaller than its parent and no two figurines have the same parent.</p>

### 출력

<p>Output a single integer &mdash; the minimal number of steps.</p>