# [Silver V] Adjusting passwords - 27682

[문제 링크](https://www.acmicpc.net/problem/27682)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 50, 맞힌 사람: 37, 정답 비율: 59.677%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>Another IPSC has just started and you are late! You rush to your PC only to discover that you locked the screen and now you have to enter your password quickly to unlock it.</p>

<p>You are presented with a password prompt. It only supports the following keys:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th align="left">Key</th>
			<th align="left">Action</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td align="left"><code>a</code> to <code>z</code></td>
			<td align="left">enters the character.</td>
		</tr>
		<tr>
			<td align="left">enter</td>
			<td align="left">submits the password.</td>
		</tr>
		<tr>
			<td align="left">backspace</td>
			<td align="left">erases the last entered character, if any.</td>
		</tr>
	</tbody>
</table>

<p>If you submit an invalid password, you will see an error message and a new, empty prompt will open.</p>

<p>Your password is <em>P</em>. In all the rush, you just typed the string <em>Q</em> into the prompt. It is possible that <em>Q</em> is not <em>P</em>: there may be a typo or two, or it can even be a completely different string.</p>

<p>Given <em>P</em> and <em>Q</em>, log in using as few additional keystrokes as possible.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. (<em>t</em> &le; 1000) Each test case is preceded by a blank line.</p>

<p>Each test case consists of two lines. The first line contains the correct password <em>P</em> and the second line contains the already typed string <em>Q</em>. Both are non-empty and have at most 50 characters.</p>

### 출력

<p>For each test case, output a line containing the list of keystrokes you want to press. Pressing enter is represented by <code>*</code> and pressing backspace is represented by <code>&lt;</code>.</p>

<p>If there are multiple optimal solutions, you may output any of them.</p>

### 힌트

<p>In the first test case, we keep pressing backspace until we delete the typo. In the second test case, it&rsquo;s faster to press enter immediately, receive an error message and begin anew from an empty prompt.</p>