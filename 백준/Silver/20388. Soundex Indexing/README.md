# [Silver IV] Soundex Indexing - 20388

[문제 링크](https://www.acmicpc.net/problem/20388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 21, 정답 비율: 80.769%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>The Soundex Index System was developed so that similar sounding names, or names with similar spelling could be encoded for easy retrieval. It has been used by the U.S. Bureau of the Census, and some States use it to help encode your driver&#39;s license number. Your task is to read a sequence of names, one at a time and one per line, compute the corresponding soundex code, and write to the output file the name and its soundex code (one line of output per name).</p>

<p>Names will contain from 1 to 20 upper case, alphabetic characters (ASCII values 65 thru 90, inclusive). Names shorter than 20 characters will NOT be padded with blanks. Thus a narne will consist of upper case letters only.</p>

<p><strong>How to generate the Soundex Code:</strong></p>

<p>A Soundex Code always consists of a letter followed by three digits. Here are the rules for soundex encoding:</p>

<ol>
	<li>The first letter of a name appears as the first and only letter in the soundex code.</li>
	<li>The letters A, E, I, O, U, Y, W, &amp; H are never encoded, but do break successive code sequences (see next rule).</li>
	<li>All other letters are encoded EXCEPT when they immediately follow a letter (including the first letter) that would be encoded with the same code digit.</li>
	<li>The soundex code guide is:
	<table class="table table-bordered table-center-30">
		<tbody>
			<tr>
				<th>Code</th>
				<th>Key Letters and Equivalents</th>
			</tr>
			<tr>
				<td>1</td>
				<td>B, P, F, V</td>
			</tr>
			<tr>
				<td>2</td>
				<td>C, S, K, G, J, Q, X, Z</td>
			</tr>
			<tr>
				<td>3</td>
				<td>D, T</td>
			</tr>
			<tr>
				<td>4</td>
				<td>L</td>
			</tr>
			<tr>
				<td>5</td>
				<td>M, N</td>
			</tr>
			<tr>
				<td>6</td>
				<td>R</td>
			</tr>
		</tbody>
	</table>
	</li>
	<li>Trailing zeros are appended to short codes so all names are encoded with a letter followed by three digits.</li>
	<li>Longer codes are truncated after the third digit.</li>
</ol>

### 입력

<p>The input&nbsp;contains a list of names, one per line. Each name will not exceed 20 characters, and you may assume that only upper case letters will be used. Your program should continue to read names until the end of the file is detected.</p>

### 출력

<p>The output&nbsp;should consist of a column of names and a column of their corresponding soundex codes. Write the headings &quot;NAME&quot; and &quot;SOUNDEX CODE&quot; in the first line of the output in columns 10 and 35, respectively. After the heading line, the names and soundex codes should be written (one pair per line) with the name starting in column 10 and the soundex code beginning in column 35. The comment &quot;END OF OUTPUT&quot; should appear at the end of the output on the line immediately after the last name. This comment should be written starting in column 20.</p>