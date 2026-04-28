# [Bronze II] String Function Encoding - 5987

[문제 링크](https://www.acmicpc.net/problem/5987)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 263, 정답: 238, 맞힌 사람: 216, 정답 비율: 90.377%

### 분류

구현, 문자열

### 문제 설명

<p>Bessie discovered a new function that the entire herd can apply to its character strings.</p>

<p>Given both a number N (1 &lt;= N &lt;= 15) and a string S, with length strictly greater than N, define f(N, S) as a new string composed of the concatenation of the substring from character N (zero based -- first character is number 0) through the end of S and the string S itself.</p>

<p>For example, with N = 2, and S = &quot;COW&quot;, f(N, S) = &quot;W&quot; + &quot;COW&quot; = &quot;WCOW&quot;. Also, f(3, &quot;USACO&quot;) = &quot;CO&quot; + &quot;USACO&quot; = &quot;COUSACO&quot;.</p>

<p>Bessie is enthralled with this function and wants to iterate it several times. For example, if she iterates the function once for &quot;COW&quot; and N = 2, she will get &quot;WCOW&quot;. If she applies the function with N = 2 again to that string, she will get &quot;OWWCOW&quot;, and if she applies it one more time with N = 2, she will get &quot;WCOWOWWCOW&quot;.</p>

<p>Help Bessie encode a total of Z (1 &lt;= Z &lt;= 100) strings, str_1, str_2, and so on. &nbsp;Each str_i has length in the range 2..100 and contains only upper case letters. Each string is presented with its own N_i (0 &lt;= N_i &lt; length(str_i), and iteration count C_i (1 &lt;= C_i &lt;= 12).</p>

### 입력

<ul>
	<li>Line 1: A single integer: Z</li>
	<li>Lines 2..Z+1: Line i+1 contains two space-separated integers, a space, and string to be encoded: N_i, C_i, and str_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..Q: Line j contains the iterated, encoded version of str_j</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The arrow denotes an iteration of the function</p>

<ul>
	<li>COW -&gt; WCOW -&gt; OWWCOW -&gt; WCOWOWWCOW</li>
	<li>USACO -&gt; COUSACO -&gt; SACOCOUSACO&nbsp;</li>
</ul>