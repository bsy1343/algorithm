# [Gold III] Tautology - 4265

[문제 링크](https://www.acmicpc.net/problem/4265)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 12, 맞힌 사람: 12, 정답 비율: 27.273%

### 분류

비트마스킹, 브루트포스 알고리즘, 자료 구조, 파싱, 스택, 문자열

### 문제 설명

<p>WFF &#39;N PROOF is a logic game played with dice. Each die has six faces representing some subset of the possible symbols K, A, N, C, E, p, q, r, s, t. A Well-formed formula (WFF) is any string of these symbols obeying the following rules:</p>

<ul>
	<li>p, q, r, s, and t are WFFs</li>
	<li>if w is a WFF, Nw is a WFF</li>
	<li>if w and x are WFFs, Kwx, Awx, Cwx, and Ewx are WFFs.</li>
</ul>

<p>The meaning of a WFF is defined as follows:</p>

<ul>
	<li>p, q, r, s, and t are logical variables that may take on the value 0 (false) or 1 (true).</li>
	<li>K, A, N, C, E mean and, or, not, implies, and equals as defined in the truth table below.</li>
</ul>

<table class="table table-bordered" style="width:60%">
	<thead>
		<tr>
			<th colspan="6">Definitions of K, A, N, C, and E</th>
		</tr>
		<tr>
			<th>w x</th>
			<th>Kwx</th>
			<th>Awx</th>
			<th>Nw</th>
			<th>Cwx</th>
			<th>Ewx</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1 1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>1 0</td>
			<td>0</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>0 1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>0 0</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>A tautology is a WFF that has value 1 (true) regardless of the values of its variables. For example, ApNp is a tautology because it is true regardless of the value of p. On the other hand, ApNq is not, because it has the value 0 for p=0, q=1.</p>

<p>You must determine whether or not a WFF is a tautology.</p>

### 입력

<p>Input consists of several test cases. Each test case is a single line containing a WFF with no more than 100 symbols. A line containing 0 follows the last case.</p>

### 출력

<p>For each test case, output a line containing tautology or not as appropriate.</p>