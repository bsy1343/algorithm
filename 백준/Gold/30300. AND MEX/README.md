# [Gold III] AND MEX - 30300

[문제 링크](https://www.acmicpc.net/problem/30300)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 328, 정답: 122, 맞힌 사람: 106, 정답 비율: 40.152%

### 분류

그리디 알고리즘, 애드 혹, 비트마스킹

### 문제 설명

<p>We define the <em>beauty</em> of an array as the value of its minimum excluded value (<strong>MEX</strong>$^{\dagger}$). A larger <strong>MEX</strong> corresponds to a more beautiful array.</p>

<p>You are given an array $A$ of length $N$. You want to enhance it in terms of its <em>beauty</em>. To achieve this, you can choose a non-negative integer $x$ and replace each element $A_i$ with $A_i\wedge x$ where $\wedge$ denotes the bitwise AND operator.</p>

<p>Find the optimal value of $x$ that maximizes the <em>beauty</em> of the array.</p>

### 입력

<p>The first line contains a single integer $T$ --- the number of test cases.</p>

<p>The first line of each test case contains a single integer $N$.</p>

<p>The second line of each test case contains $N$ space-separated integers $A_1,\ldots ,A_N$.</p>

### 출력

<p>For each test case, print a single line containing a single integer $x$ that maximizes the <strong>MEX</strong> of the array formed by taking the bitwise AND of each element of $A$ with $x$. If there are multiple solutions, you may print any.</p>

### 제한

<ul>
	<li>$1\le T\le 100\, 000$</li>
	<li>$1\le N\le 100\, 000$</li>
	<li>$0\le A_i&lt;2^{30}\ (1\le i\le N)$</li>
	<li>It is guaranteed that the sum of $N$ over all test cases does not exceed $100\, 000$.</li>
	<li>All values in the input are integers.</li>
	<li>$0\le x&lt;2^{30}$</li>
	<li>It can be shown that there always exists an optimal $x$ in the specified range.</li>
</ul>

### 힌트

<p>In the sample, we can choose $x=23$, so the new array will be \[[13\wedge 23,\, 11\wedge 23,\, 40\wedge 23,10\wedge 23,\, 33\wedge 23,\, 19\wedge 23] =[5,3,0,2,1,19]\] which has a <strong>MEX</strong> of $4$. Another possible answer is $x=19$.</p>

<p>${}^{\dagger}$ The <strong>MEX</strong> of an array is the smallest non-negative integer that does not belong to the array. For instance, the <strong>MEX</strong> of $[2,2,1]$ is $0$, the <strong>MEX</strong> of $[3,1,0,1]$ is $2$, and the <strong>MEX</strong> of $[0,3,1,2]$ is $4$.</p>