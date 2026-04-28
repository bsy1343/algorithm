# [Gold V] Entropy - 7401

[문제 링크](https://www.acmicpc.net/problem/7401)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 15, 맞힌 사람: 11, 정답 비율: 13.415%

### 분류

수학, 구현, 애드 혹, 해 구성하기, 매개 변수 탐색, 미적분학

### 문제 설명

<p>In 1948 Claude E.~Shannon in &quot;The Mathematical Theory of Communication&quot; has introduced his famous formula for the entropy of a discrete set of probabilities $p_1, \ldots, p_n$: $$H = - \sum p_i \log_2 p_i \; .$$</p>

<p>We will apply this formula to an arbitrary text string by letting $p_i$ be the relative frequencies of occurrence of characters in the string. For example, the entropy of the string &quot;Northeastern European Regional Contest&quot; with the length of 38 characters (including 3 spaces) is $3.883$ with 3 digits after decimal point. The following table shows relative frequencies and the corresponding summands for the entropy of this string.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>char</th>
			<th>occurs</th>
			<th>$p_i$</th>
			<th>$-p_i \log_2 p_i$</th>
			<th>char</th>
			<th>occurs</th>
			<th>$p_i$</th>
			<th>$-p_i \log_2 p_i$</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
	<tbody>
		<tr>
			<td>space</td>
			<td>3</td>
			<td>0.079</td>
			<td>0.289</td>
			<td>i</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
		</tr>
		<tr>
			<td>C</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>l</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
		</tr>
		<tr>
			<td>E</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>n</td>
			<td>4</td>
			<td>0.105</td>
			<td>0.342</td>
		</tr>
		<tr>
			<td>N</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>o</td>
			<td>4</td>
			<td>0.105</td>
			<td>0.342</td>
		</tr>
		<tr>
			<td>R</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>p</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
		</tr>
		<tr>
			<td>a</td>
			<td>3</td>
			<td>0.079</td>
			<td>0.289</td>
			<td>r</td>
			<td>3</td>
			<td>0.079</td>
			<td>0.289</td>
		</tr>
		<tr>
			<td>e</td>
			<td>5</td>
			<td>0.132</td>
			<td>0.385</td>
			<td>s</td>
			<td>2</td>
			<td>0.053</td>
			<td>0.224</td>
		</tr>
		<tr>
			<td>g</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>t</td>
			<td>4</td>
			<td>0.105</td>
			<td>0.342</td>
		</tr>
		<tr>
			<td>h</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
			<td>u</td>
			<td>1</td>
			<td>0.026</td>
			<td>0.138</td>
		</tr>
	</tbody>
</table>

<p>Your task is to find a string with the given entropy.</p>

### 입력

<p>Input file consists of a single real number $H$ ($0.00 \le H \le 6.00$) with 2 digits after decimal point.</p>

### 출력

<p>Write to the output file a line with a single string of at least one and up to 1000 characters &#39;0&#39;--&#39;9&#39;, &#39;a&#39;--&#39;z&#39;, &#39;A&#39;--&#39;Z&#39;, &#39;.&#39; (dot), and spaces. This string must have the entropy within $0.005$ of $H$.&nbsp;</p>