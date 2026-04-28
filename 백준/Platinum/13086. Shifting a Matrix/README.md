# [Platinum IV] Shifting a Matrix - 13086

[문제 링크](https://www.acmicpc.net/problem/13086)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

수학, 구현, 문자열, 파싱, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>You are given N&times;N matrix A initialized with A<sub>i,j</sub>=(i&minus;1)N+j, where A<sub>i,j</sub> is the entry of the i-th row and the j-th column of A. Note that i and j are 1-based.</p>

<p>You are also given an operation sequence which consists of the four types of shift operations: left, right, up, and down shifts. More precisely, these operations are defined as follows:</p>

<ul>
	<li>Left shift with i: circular shift of the i-th row to the left, i.e., setting previous A<sub>i,k</sub> to new A<sub>i,k&minus;1</sub> for 2 &le; k &le; N, and previous A<sub>i,1</sub> to new A<sub>i,N</sub>.</li>
	<li>Right shift with i: circular shift of the i-th row to the right, i.e., setting previous A<sub>i,k</sub> to new A<sub>i,k+1</sub> for 1 &le; k &le; N&minus;1, and previous A<sub>i,N</sub> to new A<sub>i,1</sub>.</li>
	<li>Up shift with j: circular shift of the j-th column to the above, i.e., setting previous A<sub>k,j</sub> to new A<sub>k&minus;1,j</sub> for 2 &le; k &le; N, and previous A<sub>1,j</sub> to new A<sub>N,j</sub>.</li>
	<li>Down shift with j: circular shift of the j-th column to the below, i.e., setting previous A<sub>k,j</sub> to new A<sub>k+1,j</sub> for 1 &le; k &le; N&minus;1, and previous A<sub>N,j</sub> to new A<sub>1,j</sub>.</li>
</ul>

<p>An operation sequence is given as a string. You have to apply operations to a given matrix from left to right in a given string. Left, right, up, and down shifts are referred as &#39;L&#39;, &#39;R&#39;, &#39;U&#39;, and &#39;D&#39; respectively in a string, and the following number indicates the row/column to be shifted. For example, &quot;R25&quot; means we should perform right shift with 25. In addition, the notion supports repetition of operation sequences. An operation sequence surrounded by a pair of parentheses must be repeated exactly m times, where m is the number following the close parenthesis. For example, &quot;(L1R2)10&quot; means we should repeat exactly 10 times the set of the two operations: left shift with 1 and right shift with 2 in this order.</p>

<p>Given operation sequences are guaranteed to follow the following BNF:</p>

<pre>
<code>&lt;sequence&gt; := &lt;sequence&gt;&lt;repetition&gt; | &lt;sequence&gt;&lt;operation&gt; | &lt;repetition&gt; | &lt;operation&gt;
&lt;repetition&gt; := &#39;(&#39;&lt;sequence&gt;&#39;)&#39;&lt;number&gt;
&lt;operation&gt; := &lt;shift&gt;&lt;number&gt;
&lt;shift&gt; := &#39;L&#39; | &#39;R&#39; | &#39;U&#39; | &#39;D&#39;
&lt;number&gt; := &lt;nonzero_digit&gt; |&lt;number&gt;&lt;digit&gt;
&lt;digit&gt; := &#39;0&#39; | &lt;nonzero_digit&gt;
&lt;nonzero_digit&gt; := &#39;1&#39; | &#39;2&#39; | &#39;3&#39; | &#39;4&#39; | &#39;5&#39; | &#39;6&#39; | &#39;7&#39; | &#39;8&#39; | &#39;9&#39;</code></pre>

<p>Given N and an operation sequence as a string, make a program to compute the N&times;N matrix after operations indicated by the operation sequence.</p>

### 입력

<p>The input consists of a single test case. The test case is formatted as follows.</p>

<pre>
N L
S</pre>

<p>The first line contains two integers N and L, where N (1 &le; N &le; 100) is the size of the given matrix and L (2 &le; L &le; 1,000) is the length of the following string. The second line contains a string S representing the given operation sequence. You can assume that S follows the above BNF. You can also assume numbers representing rows and columns are no less than 1 and no more than N, and the number of each repetition is no less than 1 and no more than 10<sup>9</sup> in the given string.</p>

### 출력

<p>Output the matrix after the operations in N lines, where the i-th line contains single-space separated N integers representing the i-th row of A&nbsp;after the operations.</p>