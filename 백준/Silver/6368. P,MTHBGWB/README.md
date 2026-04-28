# [Silver V] P,MTHBGWB - 6368

[문제 링크](https://www.acmicpc.net/problem/6368)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 171, 정답: 140, 맞힌 사람: 93, 정답 비율: 76.860%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>Morse code represents characters as variable length sequences of dots and dashes. In practice, characters in a message are delimited by short pauses. The following table shows the Morse code sequences:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<th>A</th>
			<td>.-</td>
			<th>H</th>
			<td>....</td>
			<th>O</th>
			<td>---</td>
			<th>V</th>
			<td>...-</td>
		</tr>
		<tr>
			<th>B</th>
			<td>-...</td>
			<th>I</th>
			<td>..</td>
			<th>P</th>
			<td>.--.</td>
			<th>W</th>
			<td>.--</td>
		</tr>
		<tr>
			<th>C</th>
			<td>-.-.</td>
			<th>J</th>
			<td>.---</td>
			<th>Q</th>
			<td>--.-</td>
			<th>X</th>
			<td>-..-</td>
		</tr>
		<tr>
			<th>D</th>
			<td>-..</td>
			<th>K</th>
			<td>-.-</td>
			<th>R</th>
			<td>.-.</td>
			<th>Y</th>
			<td>-.--</td>
		</tr>
		<tr>
			<th>E</th>
			<td>.</td>
			<th>L</th>
			<td>.-..</td>
			<th>S</th>
			<td>...</td>
			<th>Z</th>
			<td>--..</td>
		</tr>
		<tr>
			<th>F</th>
			<td>..-.</td>
			<th>M</th>
			<td>--</td>
			<th>T</th>
			<td>-</td>
			<th>&nbsp;</th>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<th>G</th>
			<td>--.</td>
			<th>N</th>
			<td>-.</td>
			<th>U</th>
			<td>..-</td>
			<th>&nbsp;</th>
			<td>&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Note that four dot-dash combinations are unassigned. For the purposes of this problem we will assign them as follows (these are not the assignments for actual Morse code):</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<th>underscore</th>
			<td>..--</td>
			<th>period</th>
			<td>---.</td>
		</tr>
		<tr>
			<th>comma</th>
			<td>.-.-</td>
			<th>question mark</th>
			<td>----</td>
		</tr>
	</tbody>
</table>

<p>Thus, the message &ldquo;ACM_GREATER_NY_REGION&rdquo; is encoded as:</p>

<p>.- -.-. -- ..-- --. .-. . .- - . .-. ..-- -. -.-- ..-- .-. . --. .. --- -.</p>

<p>M.E. Ohaver proposed an encryption scheme based on mutilating Morse code. Her scheme replaces the pauses between letters, necessary because Morse is a variable-length encoding that is not prefix-free, with a string that identifies the number of dots and dashes in each. For example, consider the message &ldquo;.--.-.--&rdquo;. Without knowing where the pauses should be, this could be &ldquo;ACM&rdquo;, &ldquo;ANK&rdquo;, or several other possibilities. If we add length information, however, &ldquo;.--.-.--242&rdquo;, then the code is unabiguous.</p>

<p>Ohaver&rsquo;s scheme has three steps, the same for encryption and decryption:</p>

<ol>
	<li>Convert the text to Morse code without pauses but with a string of numbers to indicate code lengths</li>
	<li>Reverse the string of numbers</li>
	<li>Convert the dots and dashes back into to text using the reversed string of numbers as code lengths</li>
</ol>

<p>As an example, consider the encrypted message &ldquo;AKADTOF_IBOETATUK_IJN&rdquo;. Converting to Morse code with a length string yields &ldquo;.--.-.--..----..-...--..-...---.-.--..--.-..--...----.232313442431121334242&rdquo;. Reversing the numbers and decoding yields the original message &ldquo;ACM_GREATER_NY_REGION&rdquo;</p>

### 입력

<p>This problem requires that you implement Ohaver&rsquo;s encoding algorithm. The input will consist of several messages encoded with Ohaver&rsquo;s algorithm. The first line of the input is an integer n that specifies the number of test cases. The following n lines contain one message per line. Each message will use only the twenty-six capital letters, underscores, commas, periods, and question marks. Messages will not exceed 100 characters in length.</p>

### 출력

<p>For each message in the input, output the line number starting in column one, a colon, a space, and then the decoded message. The output format must be adhered to precisely.</p>

### 힌트

<p>As presented, this encryption scheme is only trivially secure. In fact it offers no security at all if the algorithm is known to the attacker. The key is the string of numbers needed to decide where the pauses should be inserted to recover the message, but with the method shown here, this information is encoded in and easily recovered from the encrypted data. Even should some other method be chosen to scramble the length information in the encoding, secrecy of the algorithm is the real key in this technique. Modifications of Ohaver&rsquo;s technique do exist in which the security is not based on the secrecy of the algorithm.</p>