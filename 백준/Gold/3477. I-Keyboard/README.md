# [Gold II] I-Keyboard - 3477

[문제 링크](https://www.acmicpc.net/problem/3477)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 8, 맞힌 사람: 6, 정답 비율: 26.087%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Most of you have probably tried to type an SMS message on the keypad of a cellular phone. It is sometimes very annoying to write longer messages, because one key must be usually pressed several times to produce a single letter. It is due to a low number of keys on the keypad. Typical phone has twelve keys only (and maybe some other control keys that are not used for typing). Moreover, only eight keys are used for typing 26 letters of an English alphabet. The standard assignment of letters on the keypad is shown in the left picture:</p>

<table align="CENTER">
	<tbody>
		<tr>
			<td>
			<table border="1" cellpadding="3" cellspacing="0">
				<tbody>
					<tr>
						<td>1<br />
						&nbsp;</td>
						<td>2<br />
						abc</td>
						<td>3<br />
						def</td>
					</tr>
					<tr>
						<td>4<br />
						ghi</td>
						<td>5<br />
						jkl</td>
						<td>6<br />
						mno</td>
					</tr>
					<tr>
						<td>7<br />
						pqrs</td>
						<td>8<br />
						tuv</td>
						<td>9<br />
						wxyz</td>
					</tr>
					<tr>
						<td>*<br />
						&nbsp;</td>
						<td>0<br />
						<em>space</em></td>
						<td>#<br />
						&nbsp;</td>
					</tr>
				</tbody>
			</table>
			</td>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>
			<table border="1" cellpadding="3" cellspacing="0">
				<tbody>
					<tr>
						<td>1<br />
						&nbsp;</td>
						<td>2<br />
						abcd</td>
						<td>3<br />
						efg</td>
					</tr>
					<tr>
						<td>4<br />
						hijk</td>
						<td>5<br />
						lm</td>
						<td>6<br />
						nopq</td>
					</tr>
					<tr>
						<td>7<br />
						rs</td>
						<td>8<br />
						tuv</td>
						<td>9<br />
						wxyz</td>
					</tr>
					<tr>
						<td>*<br />
						&nbsp;</td>
						<td>0<br />
						<em>space</em></td>
						<td>#<br />
						&nbsp;</td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
	</tbody>
</table>

<p>There are 3 or 4 letters assigned to each key. If you want the first letter of any group, you press that key once. If you want the second letter, you have to press the key twice. For other letters, the key must be pressed three or four times. The authors of the keyboard did not try to optimise the layout for minimal number of keystrokes. Instead, they preferred the even distribution of letters among the keys. Unfortunately, some letters are more frequent than others. Some of these frequent letters are placed on the third or even fourth place on the standard keyboard. For example, S is a very common letter in an English alphabet, and we need four keystrokes to type it. If the assignment of characters was like in the right picture, the keyboard would be much more comfortable for typing average English texts.</p>

<p>ACM have decided to put an optimised version of the keyboard on its new cellular phone. Now they need a computer program that will find an optimal layout for the given letter frequency. We need to preserve alphabetical order of letters, because the user would be confused if the letters were mixed. But we can assign any number of letters to a single key.</p>

### 입력

<p>There is a single positive integer T on the first line of input. It stands for the number of test cases to follow. Each test case begins with a line containing two integers K, L (1 &lt;= K &lt;= L &lt;= 90) separated by a single space. K is the number of keys, L is the number of letters to be mapped onto those keys. Then there are two lines. The first one contains exactly K characters each representing a name of one key. The second line contains exactly L characters representing names of letters of an alphabet. Keys and letters are represented by digits, letters (which are case-sensitive), or any punctuation characters (ASCII code between 33 and 126 inclusively). No two keys have the same character, no two letters are the same. However, the name of a letter can be used also as a name for a key.</p>

<p>After those two lines, there are exactly L lines each containing exactly one positive integer F<sub>1</sub>, F<sub>2</sub>, ... F<sub>L</sub>. These numbers determine the frequency of every letter, starting with the first one and continuing with the others sequentially. The higher number means the more common letter. No frequency will be higher than 100000.</p>

### 출력

<p>Find an optimal keyboard for each test case. Optimal keyboard is such that has the lowest &quot;price&quot; for typing average text. The price is determined as the sum of the prices of each letter. The price of a letter is a product of the letter frequency (Fi) and its position on the key. The order of letters cannot be changed, they must be grouped in the given order.</p>

<p>If there are more solutions with the same price, we will try to maximise the number of letters assigned to the last key, then to the one before the last one etc.</p>

<p>More formally, you are to find a sequence P<sub>1</sub>, P<sub>2</sub>, ... P<sub>L</sub> representing the position of every letter on a particular key. The sequence must meet following conditions:</p>

<ul>
	<li>P<sub>1</sub> = 1</li>
	<li>for each i&gt;1, either P<sub>i</sub> = P<sub>i-1</sub>+1 or P<sub>i</sub> = 1</li>
	<li>there are at most K numbers P<sub>i</sub> such that P<sub>i</sub> = 1</li>
	<li>the sum of products S<sub>P</sub> =&nbsp;&Sigma;<sub>1&le;i&le;L</sub>F<sub>i</sub>&middot;P<sub>i</sub> is minimal</li>
	<li>for any other sequence Q meeting these criteria and with the same sum S<sub>Q</sub> = S<sub>P</sub>, there exists such M, 1 &lt;= M &lt;= L that for any&nbsp;J,&nbsp;M &lt; J &lt;= L, P<sub>J</sub> = Q<sub>J</sub>, and P<sub>M</sub>&gt;Q<sub>M</sub>.</li>
</ul>

<p>The output for every test case must start with a single line saying Keypad #I:, where I is a sequential order of the test case, starting with 1. Then there must be exactly K lines, each representing one letter, in the same order that was used in input. Each line must contain the character representing the key, a colon, one space and a list of letters assigned to that particular key. Letters are not separated from each other.</p>

<p>Print one blank line after each test case, including the last one.</p>