# [Gold IV] SubsetMex - 26114

[문제 링크](https://www.acmicpc.net/problem/26114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 38, 맞힌 사람: 34, 정답 비율: 87.179%

### 분류

그리디 알고리즘

### 문제 설명

<p>A multiset is a collection of elements similar to a set, where elements can repeat multiple times. For example, the following is a multiset:</p>

<p>{0, 0, 1, 2, 2, 5, 5, 5, 8}</p>

<p>Given a multiset S defined on non-negative integers, and a target non-negative integer value n such that n does not belong to S, your goal is to insert n into S by using the following 3-step operation, repeatedly:</p>

<ol>
	<li>Choose a (possibly empty) subset T of S. Here, T is a set of distinct numbers that appear in S.</li>
	<li>Erase elements of T from S. (Remove only one copy of each element.)</li>
	<li>Insert mex(T) into S, where mex(T) is the smallest non-negative integer that does not belong to T. The name mex stands for &ldquo;minimum excluded&rdquo; value.</li>
</ol>

<p>Your goal is to find the minimum number of operations to perform so that n becomes part of S.</p>

<p>Since the size of S may be large, it will be given in the form of a list (f<sub>0</sub>, &hellip;, f<sub>n&minus;1</sub>) of size n, where fi represents the number of times that the number i appears in S. (Recall that n is the integer we are trying to insert into S.)</p>

### 입력

<p>The first line contains a single integer t (1 &le; t &le; 200) &mdash; the number of test cases. Each two of the following lines describe a test case:</p>

<ul>
	<li>The first line of each test case contains a single integer n (1 &le; n &le; 50), representing the integer to be inserted into S.</li>
	<li>The second line of each test case contains n integers f<sub>0</sub>, f<sub>1</sub>, &hellip;, f<sub>n&minus;1</sub> (0 &le; f<sub>i</sub> &le; 10<sup>16</sup>), representing the multiset S as mentioned above.</li>
</ul>

### 출력

<p>For each test case, print a single line containing the minimum number of operations needed to satisfy the condition.</p>

### 힌트

<p>In the first example, initially, S = {1, 1, 1, 3, 3, 3} and our goal is to have 4 in S. We can do the following:</p>

<ol>
	<li>choose T = {} then S becomes {0, 1, 1, 1, 3, 3, 3}</li>
	<li>choose T = {0, 1, 3} then S becomes {1, 1, 2, 3, 3}</li>
	<li>choose T = {1} then S becomes {0, 1, 2, 3, 3}</li>
	<li>choose T = {0, 1, 2, 3} then S becomes {3, 4}</li>
</ol>