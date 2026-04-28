# [Gold III] Friends - 6579

[문제 링크](https://www.acmicpc.net/problem/6579)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 32, 맞힌 사람: 30, 정답 비율: 51.724%

### 분류

자료 구조, 구현, 파싱, 스택, 문자열

### 문제 설명

<p>You want to plan a big birthday party with your friends. On planning you notice that you have to do a lot of operations with sets of friends. There is one group which consist of Arthur, Biene and Clemens. Then there is a group of friends you know from snowboarding which consists of Daniel, Ernst, Frida and Gustav. If you want to invite them both, the resulting party group consists of g1 + g2 (the result is the union of both groups). Then you can compute the intersection of the two groups g1 * g2, which consists of the empty set. Maybe you want to invite a group g1, but excluding all members of an other group g2, which is written as g1 - g2.</p>

<p>Intersection (*) has precedence over union (+) and set difference (-). All operations are left associative, which means that in A op<sub>1</sub> B op<sub>2</sub> C you first have to evaluate A op<sub>1</sub> B (provided op<sub>1</sub> and op<sub>2</sub> have equal precedence).</p>

### 입력

<p>The input consists of one or more lines. Each line contains one expression that you have to evaluate. Expressions are syntactically correct and only consist of the characters:</p>

<ul>
	<li>&#39;{&#39; and &#39;}&#39;</li>
	<li>the elements &#39;A&#39; to &#39;Z&#39; meaning friend Arthur to Zora.</li>
	<li>the operations &#39;+&#39;, &#39;-&#39; and &#39;*&#39;</li>
	<li>&#39;(&#39; and &#39;)&#39; for grouping operations</li>
	<li>the newline character &#39;\n&#39; marking the end of an expression.</li>
</ul>

<p>A line is never longer than 255 characters.</p>

### 출력

<p>Output the resulting set in curly braces &#39;{&#39; and &#39;}&#39;, each on a line of its own. Print elements of sets sorted alphabetically.</p>