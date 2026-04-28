# [Bronze I] Last Word - 17576

[문제 링크](https://www.acmicpc.net/problem/17576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 341, 정답: 155, 맞힌 사람: 137, 정답 비율: 46.128%

### 분류

구현, 문자열

### 문제 설명

<p>The <code>substring()</code> function is a commonly-used operation available in most programming languages that operates on strings. A start offset and a length are provided and used to construct a new string containing only the characters in a sequence of that length beginning from the offset.</p>

<p>One particular string has had this called a large number of times in sequence: we repeatedly used the standard library function <code>substring(s, start, length)</code> to chop it up until now a potentially much shorter string remains.</p>

<p>Find the value of the string produced by all of these operations.</p>

### 입력

<ul>
	<li>The first line of input contains the string s (1 &le; |s| &le; 10<sup>6</sup>).</li>
	<li>The second line of input contains the number of operations, n (1 &le; n &le; 10<sup>6</sup>).</li>
	<li>Each of the following n lines contains the two integers start<sub>i</sub> and length<sub>i</sub> (0 &le; start<sub>i</sub> &lt; length<sub>i&minus;1</sub>; 1 &le; start<sub>i</sub> + length<sub>i</sub> &le; length<sub>i&minus;1</sub>).</li>
</ul>

### 출력

<p>Output the string after all of the successive substring() operations.</p>