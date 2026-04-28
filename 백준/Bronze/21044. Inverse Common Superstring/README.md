# [Bronze I] Inverse Common Superstring - 21044

[문제 링크](https://www.acmicpc.net/problem/21044)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 156, 정답: 96, 맞힌 사람: 90, 정답 비율: 65.217%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Given a set of string <em>S</em> = {<em>S</em><sub>1</sub>, <em>S</em><sub>2</sub>, ..., <em>S<sub>n</sub></em>}, a common superstring <em>R</em> of the set <em>S</em> is a string such that each string in <em>S</em> appears as a substring in <em>R</em>. For example, let <em>S</em> be {&quot;abb&quot;, &quot;baab&quot;, &quot;bbc&quot;}, then one possible common superstring <em>R</em> of <em>S</em> is &quot;abbbaabbbc&quot; which has the length of 10 characters. Notice that all strings <em>S</em> in appear as substring in <em>R</em>. To verify: &quot;abb&quot; appears in &quot;[abb]baabbbc&quot;, &quot;baab&quot; appears in &quot;abb[baab]bbc&quot;, and &quot;bbc&quot; appears in &quot;abbbaab[bbc]&quot;. The string &quot;abbbaabbbc&quot; is also a common superstring of <em>S</em>; you can verify it by yourself.</p>

<p>Among all possible common superstrings, usually the shortest common superstring is more attractive. It has many real-world application such as sparse matrix compression, DNA sequencing, and many others. In the example above, the shortest common superstring will be &quot;baabbc&quot; with the length of 6 characters. To verify: &quot;aab&quot; appears in &quot;b[aab]bc&quot;, &quot;baab&quot; in &quot;[baab]bc&quot;, and &quot;bbc&quot; in &quot;baa[bbc]&quot;.</p>

<p>Unfortunately, the problem of finding the shortest common superstring is known to be NP-hard, i.e. up to this moment, there is no known polynomial-time algorithm to solve the problem.</p>

<p>The inverse problem of finding the shortest common superstring will be: given a string <em>R</em>, find the set of string <em>S</em> such that <em>R</em> is the shortest common superstring of <em>S</em>. Of course this inverse problem is very easy and trivial! The set <em>S</em> can simply contains a single string which equals to <em>R</em> (notice that a string is also a substring to the string itself).</p>

<p>Now, you are going to solve a more challenging problem. Given a string <em>R</em>, find the lexicographically (alphabetically) smallest string which does NOT appear as a substring in <em>R</em>. To simplify the problem, a string is defined as a non-empty sequence of only lowercase alphabetical character (a-z). For example, let the string <em>R</em> be &quot;icpc&quot;, then the lexicographically smallest string which does not appear as substring in <em>R</em> is &quot;a&quot;.</p>

<p>String <em>S</em> = <em>S</em><sub>1</sub><em>S</em><sub>2</sub><em>S</em><sub>3</sub>... is lexicographically smaller than string <em>T</em> = <em>T</em><sub>1</sub><em>T</em><sub>2</sub><em>T</em><sub>3</sub>... if one of the following is true:</p>

<ul>
	<li>|<em>S</em>| &lt; |<em>T</em>| and <em>S<sub>i</sub></em> = <em>T<sub>i</sub></em> for all 1 &le; <em>i</em> &le; |<em>S</em>|, or</li>
	<li>There exists an index <em>i</em> where <em>S<sub>i</sub></em> &lt; <em>T<sub>i</sub></em> and <em>S<sub>j</sub></em> = <em>T<sub>j</sub></em>&nbsp;for all 1 &le; <em>j</em> &lt; <em>i</em>.</li>
</ul>

### 입력

<p>The first line contains a string which length between 1 and 1000, inclusive. The given string contains only lowercase alphabetical character (a-z).</p>

### 출력

<p>The output contains the smallest lexicographical string which is NOT a substring of the input string, in a line. The output string should contain only lowercase alphabetical character.</p>