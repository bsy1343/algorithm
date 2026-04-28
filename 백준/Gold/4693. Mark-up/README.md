# [Gold IV] Mark-up - 4693

[문제 링크](https://www.acmicpc.net/problem/4693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 10, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>Mark-up languages are computer languages that assist in the formatting of text files. Special keywords are used to mark the text to allow control of fonts, page styles, paragraph styles, etc. TeX, troff, and HTML are examples of mark-up languages.</p>

<p>Spell checking can be difficult to adapt to these special texts. In general, special processors or spell checkers must be created in order to accommodate mark-up languages. A special processor would recognize the mark-up language and strip it from the text so that the &quot;plain&quot; text could then be processed by a spell checker. For this problem, you are to write such a processor for a small mark-up language so that the output of your program will be the plain text without the mark-ups.</p>

<p>The mark-up language to consider is one which allows the modification of fonts within the text. Each markup command will be preceded by a \ character. If the letter following the \ character is not a recognized command from the table below then the character following the \ is printed as part of the plain text. For instance, the mark-up \\ can be used to print a single \.</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<td><code>\b</code></td>
			<td>toggle bold font on/off (default state is off)</td>
		</tr>
		<tr>
			<td><code>\i</code></td>
			<td>toggle italics font on/off (default state is off)</td>
		</tr>
		<tr>
			<td><code>\s</code></td>
			<td>set font size; the s is immediately followed by an optional number; if the number is missing then the command will restore the previous size</td>
		</tr>
		<tr>
			<td><code>\*</code></td>
			<td>toggle processing of mark-ups on/off; if processing is toggle off then mark-ups are considered to be literal text (default state is on)</td>
		</tr>
	</tbody>
</table>

<p>The number following the \s command can have a decimal point so 12, 9.5, 11., and .5 should all be recognized as valid numbers.</p>

### 입력

<p>The input file will be plain text containing mark-ups from the language above. At the start, processing of mark-ups should be on. The file should be processed until the end-of-file is encountered.</p>

### 출력

