# [Platinum II] min-xor - 19239

[문제 링크](https://www.acmicpc.net/problem/19239)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 8 MB

### 통계

제출: 77, 정답: 27, 맞힌 사람: 25, 정답 비율: 38.462%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Consider two integers a and b. Their bitwise xor (exclusive or) is computed as it follows:</p>

<ul>
	<li>Write each of them in binary: a=a<sub>k-1</sub>a<sub>k-2</sub>...a<sub>0</sub> and b = b<sub>k-1</sub>b<sub>k-2</sub>...b<sub>0</sub>;</li>
	<li>Their bitwise xor, denoted by a ^ b, has a bit equals to 1 in the position p if and only if exactly one of a<sub>p</sub> and b<sub>p</sub> has a value of 1.</li>
</ul>

<p>For example, 9 ^ 3 = 10 because 9 = 1001<sub>(2)</sub>, 3 = 0011<sub>(2)</sub> and 10 = 1010<sub>(2)</sub>.</p>

<p>You are given a sequence of N operations on a set of integers. The set is initially empty. Each operation can be one of the following:</p>

<ol>
	<li>insert(x): append integer x to the set;</li>
	<li>delete(x): remove integer x from the set;</li>
	<li>min-xor(): print the smallest bitwise xor between any two integers currently in the set.</li>
</ol>

<p>You must print the output from every min-xor() operation.</p>

### 입력

<p>The first line of the input contains the number of operations N. Each of the following lines describes an operation using the following syntax:</p>

<ul>
	<li>1 x for insert(x)</li>
	<li>2 x for delete(x)</li>
	<li>3 for min-xor()</li>
</ul>

### 출력

<p>The output must contain a number of lines equals to the number of min-xor() operations. Each line must contain a single number, the answer to the corresponding min-xor() operation.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100,000;</li>
	<li>1 &le; x &le; 1,000,000,000 for all insert(x) and delete(x) operations;</li>
	<li>For any insert(x) operation it is guaranteed that x does not exist in the set;</li>
	<li>For any delete(x) operation it is guaranteed that x exists in the set;</li>
	<li>For any min-xor() operation it is guaranteed that the set has at least 2 elements;</li>
</ul>

### 힌트

<p>For the first min-xor(), the set is {24, 17}. The minimum bitwise xor is 24 ^ 17 = 9.</p>

<p>For the second min-xor(), the set is {24, 17, 23, 30}. The minimum bitwise xor is 24 ^ 30 = 6 (also 17 ^ 23 = 6).</p>

<p>For the third min-xor(), the set is {24, 23, 30}. The minimum bitwise xor is 24 ^ 30 = 6.</p>

<p>For the last min-xor(), the set is {24, 23}. The minimum bitwise xor is 24 ^ 23 = 15.</p>