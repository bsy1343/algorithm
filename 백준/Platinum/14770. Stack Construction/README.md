# [Platinum III] Stack Construction - 14770

[문제 링크](https://www.acmicpc.net/problem/14770)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 12, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>You were recently hired by Rural and Municipal Roadway Communications to manage messages on a scrolling display above a major highway. Much to your surprise, these are very primitive displays. You have to input the message manually every time it should be changed (there is no memory to preload a list of messages).</p>

<p>Strangely, the only way to post messages is using an on-board stack. You can push a character onto the top of the stack, you can pop the character that is on top of the stack, and you can print the character that is on top of the stack..</p>

<p>Out of boredom, or perhaps the universal human desire to do as little work as possible to get the job done, you wonder what the minimum number of <code>push</code>, <code>pop</code>, and <code>print</code> are required to print a message your boss has told you to display. Oh, you must also ensure the stack is clear at the end so that you are ready to input a new message next time your boss asks you to do this.</p>

<p>Example If we want to print the message abba and then clear the stack you could do the following. Note the contents of the stack are recorded below with the top of the stack on the right.</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th>&nbsp;</th>
			<th>operation</th>
			<th>stack contents</th>
			<th>displayed message</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>1</th>
			<td><code>push a</code></td>
			<td><code>a</code></td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<th>2</th>
			<td><code>print</code></td>
			<td><code>a</code></td>
			<td><code>a</code></td>
		</tr>
		<tr>
			<th>3</th>
			<td><code>push b</code></td>
			<td><code>ab</code></td>
			<td><code>a</code></td>
		</tr>
		<tr>
			<th>4</th>
			<td><code>print</code></td>
			<td><code>ab</code></td>
			<td><code>ab</code></td>
		</tr>
		<tr>
			<th>5</th>
			<td><code>print</code></td>
			<td><code>ab</code></td>
			<td><code>abb</code></td>
		</tr>
		<tr>
			<th>6</th>
			<td><code>pop</code></td>
			<td><code>a</code></td>
			<td><code>abb</code></td>
		</tr>
		<tr>
			<th>7</th>
			<td><code>print</code></td>
			<td><code>a</code></td>
			<td><code>abba</code></td>
		</tr>
		<tr>
			<th>8</th>
			<td><code>pop</code></td>
			<td>&nbsp;</td>
			<td><code>abba</code></td>
		</tr>
	</tbody>
</table>

<p>In fact, this is the fewest operations that can be performed to print exactly the message abba and leave the stack empty.</p>

### 입력

<p>The first line of input is a single integer T &le; 30 indicating the number of test cases. Each of the following T lines contains a single string consisting of any printable characters. The first and last character of each line will not be a space. Each line has at least one and at most 200 characters.</p>

### 출력

<p>For each of the T strings in the input, you should output on a single line the minimum number of operations required to print the string on the display.</p>