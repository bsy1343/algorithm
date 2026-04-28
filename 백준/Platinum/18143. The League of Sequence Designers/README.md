# [Platinum III] The League of Sequence Designers - 18143

[문제 링크](https://www.acmicpc.net/problem/18143)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 24, 맞힌 사람: 21, 정답 비율: 48.837%

### 분류

해 구성하기, 수학

### 문제 설명

<p>Consider the following sequence problem: given n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, where |a<sub>i</sub>| &le; 10<sup>6</sup> for all 1 &le; i &le; n and 1 &le; n &lt; 2000, compute</p>

<p>\[\max_{1 \le \ell \le r \le n}{(r - \ell + 1)} \cdot \sum_{\ell \le i \le r}{a_i}\text{.}\]</p>

<p>As an attempt to solve the above problem, Natasha came up with a textbook greedy algorithm using the idea of computing heaviest segment via prefix sums as follows:</p>

<pre>
Function FindAnswer(a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>)
&nbsp; result = 0
&nbsp; curMax = 0
&nbsp; left = 0
&nbsp; for i = 1 to n do
&nbsp;   curMax = curMax + a<sub>i</sub>
&nbsp;   if curMax &lt; 0 then
&nbsp;     curMax = 0
&nbsp;     left = i
&nbsp;   end
&nbsp;   result = max(result, (i - left) &times; curMax)
&nbsp; end
&nbsp; return result
</pre>

<p>As you can see, Natasha&rsquo;s idea is not entirely correct. For example, when the input sequence is 6, &minus;8, 7, &minus;42, the function <code>FindAnswer</code> will return 7, but the correct answer is 3&middot;(6&minus;8+7) = 15.</p>

<p>Bruce tries to tell Natasha that her solution is not correct, but she does not believe.</p>

<p>Given an integer k and a lower bound of sequence length L, your task in this problem is to help Bruce design a sequence of n integers with n &ge; L such that the correct answer and the answer produced by Natasha&rsquo;s algorithm differ by exactly k.</p>

<p>Note that, the sequence you produce must follow the specification to the original problem. That is, 1 &le; n &lt; 2000 and |a<sub>i</sub>| &le; 10<sup>6</sup> for all 1 &le; i &le; n. Print -1 if it is impossible to form such a sequence.</p>

### 입력

<p>The input file starts with an integer T, the number of testcases, in the first line.</p>

<p>Then there are T lines, one for each testcase, each containing two integers k and L, separated by a space.</p>

### 출력

<p>The output for each testcase consists of either one or two lines, depending on the result. The format is as follows.</p>

<p>If there exists no such sequences, print the integer -1 in a line. Otherwise, print in the first line the integer n denoting the length of the sequence. In the second line, print the n integers a<sub>1</sub>, . . . , a<sub>n</sub> separated with a space.</p>

### 제한

<ul>
	<li>1 &le; T &le; 5</li>
	<li>1 &le; k &le; 10<sup>9</sup></li>
	<li>0 &le; L &le; 10<sup>9</sup></li>
</ul>