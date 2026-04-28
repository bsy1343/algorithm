# [Platinum II] Letter Stamper (Small) - 12543

[문제 링크](https://www.acmicpc.net/problem/12543)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 145, 정답: 65, 맞힌 사람: 35, 정답 비율: 48.611%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Roland is a high-school math teacher. Every day, he gets hundreds of papers from his students. For each paper, he carefully chooses a letter grade: &#39;A&#39;, &#39;B&#39; or &#39;C&#39;. (Roland&#39;s students are too smart to get lower grades like a &#39;D&#39; or an &#39;F&#39;). Once the grades are all decided, Roland passes the papers onto his assistant - you. Your job is to stamp the correct grade onto each paper.</p>

<p>You have a low-tech but functional letter stamp that you use for this. To print out a letter, you attach a special plate to the front of the stamp corresponding to that letter, dip it in ink, and then apply it to the paper.</p>

<p>The interesting thing is that instead of removing the plate when you want to switch letters, you can just put a new plate on top of the old one. In fact, you can think of the plates on the letter stamp as being a stack, supporting the following operations:</p>

<ul>
	<li>Push a letter on to the top of the stack. (This corresponds to attaching a new plate to the front of the stamp.)</li>
	<li>Pop a letter from the top of the stack. (This corresponds to removing the plate from the front of the stamp.)</li>
	<li>Print the letter on the top of the stack. (This corresponds to actually using the stamp.) Of course, the stack must actually have a letter on it for this to work.</li>
</ul>

<p>Given a sequence of letter grades (&#39;A&#39;, &#39;B&#39;, and &#39;C&#39;), how many operations do you need to print the whole sequence in order? The stack begins empty, and you must empty it when you are done. However, you have unlimited supplies of each kind of plate that you can use in the meantime.</p>

<p>For example, if you wanted to print the sequence &quot;ABCCBA&quot;, then you could do it in 12 operations, as shown below:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:200px">
	<tbody>
		<tr>
			<td>Operation</td>
			<td>Printed so far</td>
			<td>Stack</td>
		</tr>
		<tr>
			<td>0. -<br />
			1. Push A<br />
			2. Print<br />
			3. Push B<br />
			4. Print<br />
			5. Push C<br />
			6. Print<br />
			7. Print<br />
			8. Pop<br />
			9. Print<br />
			10. Pop<br />
			11. Print<br />
			12. Pop</td>
			<td>-<br />
			-<br />
			A<br />
			A<br />
			AB<br />
			AB<br />
			ABC<br />
			ABCC<br />
			ABCC<br />
			ABCCB<br />
			ABCCB<br />
			ABCCBA<br />
			ABCCBA</td>
			<td>-<br />
			A<br />
			A<br />
			AB<br />
			AB<br />
			ABC<br />
			ABC<br />
			ABC<br />
			AB<br />
			AB<br />
			A<br />
			A<br />
			-<br />
			&nbsp;</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The first line of the input file contains the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line. Each of these lines contains a single string&nbsp;<strong>S</strong>, representing the sequence of characters that you want to print out in order.</p>

<h3>Limits</h3>

<ul>
	<li><strong>S</strong>&nbsp;is a non-empty string containing only the letters &#39;A&#39;, &#39;B&#39;, and &#39;C&#39;.</li>
	<li><span style="font-size:13px">1 &le;&nbsp;</span><strong style="font-size:13px">T</strong><span style="font-size:13px">&nbsp;&le; 100.</span></li>
	<li><strong>S</strong>&nbsp;has at most 100 characters.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: N&quot;, where x is the case number (starting from 1) and N is the minimum number of stack operations required to print out&nbsp;<strong>S</strong>.</p>