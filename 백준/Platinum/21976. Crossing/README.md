# [Platinum I] Crossing - 21976

[문제 링크](https://www.acmicpc.net/problem/21976)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 22, 맞힌 사람: 20, 정답 비율: 52.632%

### 분류

자료 구조, 세그먼트 트리, 집합과 맵, 느리게 갱신되는 세그먼트 트리, 해싱

### 문제 설명

<p>Do you know Just Odd Investigations Laboratory? The business of this laboratory is to do &ldquo;just odd investigations.&rdquo; In the following, we call it JOI Laboratory for short.</p>

<p>In recent years, broad gardens with splendid flowers were discovered in several historical ruins in the world. JOI Laboratory discovered that the flowers in these gardens are new species, and their genes have similar features. The genes of these new flowers are strings of length N consisting of <code>J</code>, <code>O</code>, <code>I</code>. These strings are called <strong>gene sequences</strong>.</p>

<p>You are a researcher working in JOI Laboratory. You initially have three flowers of new species. Their gene sequences are S<sub>A</sub>, S<sub>B</sub>, S<sub>C</sub>, respectively.</p>

<p>You can obtain a flower of new species from two flowers of new species by an operation called <strong>crossing</strong>. The i-th character (1 &le; i &le; N) of the gene sequence of the new flower is determined by the following rule.</p>

<ul>
	<li>If the i-th characters of the gene sequences of the two flowers are the same, the i-th character of the gene sequence of the new flower will be the same character.</li>
	<li>If the i-th characters of the gene sequences of the two flowers are different, the i-th character of the gene sequence of the new flower will be one of <code>J</code>, <code>O</code>, or <code>I</code> which is different from these two characters.</li>
</ul>

<p>In other words, if the i-th characters of the gene sequences of the two flowers are c<sub>1</sub> and c<sub>2</sub>, the i-th character c<sub>3</sub> of the gene sequence of the new flower is given by the following table.</p>

<table class="table table-bordered table-center-50 td-center th-center">
	<tbody>
		<tr>
			<th>c<sub>1</sub></th>
			<td>J</td>
			<td>J</td>
			<td>J</td>
			<td>O</td>
			<td>O</td>
			<td>O</td>
			<td>I</td>
			<td>I</td>
			<td>I</td>
		</tr>
		<tr>
			<th>c<sub>2</sub></th>
			<td>J</td>
			<td>O</td>
			<td>I</td>
			<td>J</td>
			<td>O</td>
			<td>I</td>
			<td>J</td>
			<td>O</td>
			<td>I</td>
		</tr>
		<tr>
			<th>c<sub>3</sub></th>
			<td>J</td>
			<td>I</td>
			<td>O</td>
			<td>I</td>
			<td>O</td>
			<td>J</td>
			<td>O</td>
			<td>J</td>
			<td>I</td>
		</tr>
	</tbody>
</table>

<p>You may use the same flower for crossing as many times as you want. If you obtain a new flower by crossing, you may use it for subsequent crossings.</p>

<p>In order to obtain more beautiful flowers, JOI Laboratory proposed (Q + 1) gene sequences numbered from 0 to Q as candidate gene sequences. You are given a list describing the candidate gene sequences. The list contains a string T<sub>0</sub> and, for each j (1 &le; j &le; Q), integers L<sub>j</sub>, R<sub>j</sub> and a character C<sub>j</sub>. The candidate gene sequences are given as follows.</p>

<ul>
	<li>The candidate gene sequence 0 is T<sub>0</sub>.</li>
	<li>The candidate gene sequence j (1 &le; j &le; Q) is obtained from the candidate gene sequence j &minus; 1 by replacing the characters from the L<sub>j</sub>-th position to the R<sub>j</sub>-th position by the character C<sub>j</sub>.</li>
</ul>

<p>Write a program which, given an integer N, the gene sequences of the three initial flowers, and the list describing the candidate gene sequences, determines, for each candidate gene sequence, whether it is possible to obtain a flower whose gene sequence is the given one from the three initial flowers by crossing zero or more times.</p>

### 입력

<p>Read the following data from the standard input.</p>

<pre>
N
S<sub>A</sub>
S<sub>B</sub>
S<sub>C</sub>
Q
T<sub>0</sub>
L<sub>1</sub> R<sub>1</sub> C<sub>1</sub>
.
.
.
L<sub>Q</sub> R<sub>Q</sub> C<sub>Q</sub></pre>

### 출력

<p>Write (Q + 1) lines to the standard output. In the (j + 1)-th line (0 &le; j &le; Q), output <code>Yes</code> if it is possible to obtain a flower whose gene sequence is the candidate gene sequence j from the three initial flowers by crossing zero or more times. Otherwise, output <code>No</code>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 200 000.</li>
	<li>S<sub>A</sub>, S<sub>B</sub>, S<sub>C</sub> are strings of length N. Each character is either <code>J</code>, <code>O</code>, or <code>I</code>.</li>
	<li>1 &le; Q &le; 200 000.</li>
	<li>T<sub>0</sub> is a string of length N. Each character is either <code>J</code>, <code>O</code>, or <code>I</code>.</li>
	<li>1 &le; L<sub>j</sub> &le; R<sub>j</sub> &le; N (1 &le; j &le; Q).</li>
	<li>C<sub>j</sub> is either <code>J</code>, <code>O</code>, or <code>I</code> (1 &le; j &le; Q).</li>
</ul>