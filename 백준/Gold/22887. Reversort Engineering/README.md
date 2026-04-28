# [Gold V] Reversort Engineering - 22887

[문제 링크](https://www.acmicpc.net/problem/22887)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 137, 정답: 83, 맞힌 사람: 77, 정답 비율: 62.097%

### 분류

정렬, 애드 혹, 해 구성하기

### 문제 설명

<p>Note: The main parts of the statements of the problems &quot;Reversort&quot; and &quot;Reversort Engineering&quot; are identical, except for the last paragraph. The problems can otherwise be solved independently.</p>

<p>Reversort is an algorithm to sort a list of distinct integers in increasing order. The algorithm is based on the &quot;Reverse&quot; operation. Each application of this operation reverses the order of some contiguous part of the list.</p>

<p>The pseudocode of the algorithm is the following:</p>

<pre>
Reversort(L):
  for i := 1 to length(L) - 1
    j := position with the minimum value in L between i and length(L), inclusive
    Reverse(L[i..j])
</pre>

<p>After i&minus;1 iterations, the positions 1,2,&hellip;,i&minus;1 of the list contain the i&minus;1 smallest elements of L, in increasing order. During the i-th iteration, the process reverses the sublist going from the i-th position to the current position of the i-th minimum element. That makes the i-th minimum element end up in the i-th position.</p>

<p>For example, for a list with 4 elements, the algorithm would perform 3 iterations. Here is how it would process L=[4,2,1,3]:</p>

<ol>
	<li>i=1, j=3 ⟶ L=[1,2,4,3]</li>
	<li>i=2, j=2 ⟶ L=[1,2,4,3]</li>
	<li>i=3, j=4 ⟶ L=[1,2,3,4]</li>
</ol>

<p>The most expensive part of executing the algorithm on our architecture is the Reverse operation. Therefore, our measure for the cost of each iteration is simply the length of the sublist passed to Reverse, that is, the value j&minus;i+1. The cost of the whole algorithm is the sum of the costs of each iteration.</p>

<p>In the example above, the iterations cost 3, 1, and 2, in that order, for a total of 6.</p>

<p>You are given a size N and a cost C. Find a list of N distinct integers between 1 and N such that the cost of applying Reversort to it is exactly C, or say that there is no such list.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with two integers N and C, the size of the wanted list and the desired cost, respectively.</p>

### 출력

<p>For each test case, if there is no list of size&nbsp;N&nbsp;such that applying Reversort to it costs exactly&nbsp;C, output one line containing&nbsp;<code>Case #x: IMPOSSIBLE</code>, where&nbsp;x&nbsp;is the test case number (starting from 1). Otherwise, output one line containing&nbsp;<code>Case #x: y<sub>1</sub>&nbsp;y<sub>2</sub>&nbsp;...&nbsp;y<sub>N</sub></code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and each&nbsp;y<sub>i</sub>&nbsp;is a distinct integer between&nbsp;1&nbsp;and&nbsp;N, representing the&nbsp;i-th element of one such possible list.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; C &le; 1000.</li>
</ul>

### 힌트

<p>Sample Case #1 is described in the statement above.</p>

<p>In Sample Case #2, the algorithm runs for only one iteration on the proposed output. In that iteration, reverse is applied to a sublist of size 1, therefore, its cost is 1.</p>

<p>In Sample Case #3, the first iteration reverses the full list, for a cost of 7. After that, the list is already sorted, but there are 5 more iterations, each of which contributes a cost of 1. Another valid output would be&nbsp;<code>7 5 4 3 2 1 6</code>. For that output, the first iteration has a cost of 6, the last one has a cost of 2, and all others have a cost of 1.</p>

<p>In Sample Case #4, Reversort will necessarily perform 6 iterations, each of which will have a cost of at least 1, so there is no way the total cost can be as low as required.</p>