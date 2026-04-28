# [Platinum III] XOR Sum 2 - 14787

[문제 링크](https://www.acmicpc.net/problem/14787)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 192, 정답: 53, 맞힌 사람: 46, 정답 비율: 31.724%

### 분류

자료 구조, 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>You will be given a list of Q (1 &lt;= Q &lt;= 100,000) instructions.</p>

<p>If the instructions is to &quot;insert N&quot;, insert N into the list of numbers (there may be duplicates).</p>

<p>If the instruction is to &quot;print K&quot; - print the XOR sum of the largest K (1&lt;=K&lt;=Q) elements in the list (or, if the list contains less than K elements, the XOR sum of all elements in the list).</p>

<p>XOR sum of a list of numbers is the result of XOR-ing all of them. XOR can be applied to two integers using the built in ^ operator in most languages (or xor in Haskell).</p>

<p>Note that XOR function has some useful properties, among them that if N^M=X then N=X^M and M=X^N.</p>

### 입력

<p>First line of the input contains an integer T (1 &lt;= T &lt;= 10) - the number of test cases. Each test case start with a line containing an integer Q(1 &lt;= Q &lt;= 100,000). Following are Q lines containing one instruction each.</p>

<p>Instructions are in either of the following two forms:</p>

<pre>
insert N</pre>

<p>or</p>

<pre>
print K</pre>

<p>N is a non-negative integer less than 2^31 and K is a positive integer less than Q.</p>

### 출력

<p>For each print statement output the sum of (at most) K largest elements in the current list. Note that the list is cleared between test cases.</p>