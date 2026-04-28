# [Silver III] Arithmetic with Morse - 9523

[문제 링크](https://www.acmicpc.net/problem/9523)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 127, 정답: 87, 맞힌 사람: 75, 정답 비율: 68.182%

### 분류

자료 구조, 구현, 수학, 파싱, 스택, 문자열

### 문제 설명

<p>Morse code is a method used to transmit text messages as a series of dots &ldquo;<code>.</code>&rdquo; and dashes &ldquo;<code>-</code>&rdquo;. For example, the letter &ldquo;<code>A</code>&rdquo; is represented with &ldquo;<code>.-</code>&rdquo; and the letter &ldquo;<code>B</code>&rdquo; with &ldquo;<code>-...</code>&rdquo;. This code has been used for several years in the army and civil applications, but you are going to use it to do math.</p>

<p>With this in mind, we assign values to dots and dashes, and to save space we use two additional characters. The following table shows the four allowed characters and their values.</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>Character</th>
			<th>Value</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>.</td>
			<td>1</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><code>-</code></td>
			<td>5</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><code>:</code></td>
			<td>2</td>
			<td>(two times &ldquo;<code>.</code>&rdquo;)</td>
		</tr>
		<tr>
			<td><code>=</code></td>
			<td>10</td>
			<td>(two times &ldquo;<code>-</code>&rdquo;)</td>
		</tr>
	</tbody>
</table>

<p>A Morse number is a string that only contains the above four characters; its value is the sum of the values assigned to each individual character. As an example, the value of &ldquo;<code>=.-..</code>&rdquo; is 10+1+5+1+1 = 18. Notice that each Morse number represents a unique value, but there are values that can be represented with several Morse numbers. For instance, there are three Morse numbers with value 3: &ldquo;<code>...</code>&rdquo;, &ldquo;<code>.:</code>&rdquo; and &ldquo;<code>:.</code>&rdquo;.</p>

<p>Well, numbers are ready. To form expressions we also need operators. We consider two arithmetic operators: &ldquo;<code>+</code>&rdquo; represents addition, while &ldquo;<code>*</code>&rdquo; represents multiplication. A Morse expression is a sequence of strings that interleaves Morse numbers and operators, that starts and ends with a Morse number, and contains at least one operator. Morse expressions can be evaluated by replacing each Morse number by its value, and then evaluating the obtained mathematical expression using the common operators precedence and associativity. For example, the value of the Morse expression &ldquo;<code>=.-.. + ... * :.</code>&rdquo; is 18 + 3 &times; 3 = 18 + (3 &times; 3) = 27. Given a Morse expression, print its value.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 4) representing the number of operators in the Morse expression. The second line contains 2N + 1 non-empty strings representing the Morse expression. The line interleaves Morse numbers and operators, being the first and last strings Morse numbers. Each Morse number is at most 7 characters long, where each character is either &ldquo;<code>.</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, &ldquo;<code>:</code>&rdquo; or &ldquo;<code>=</code>&rdquo;. Each operator is either &ldquo;<code>+</code>&rdquo; or &ldquo;<code>*</code>&rdquo;.</p>

### 출력

<p>Output a line with an integer representing the value of the Morse expression.</p>