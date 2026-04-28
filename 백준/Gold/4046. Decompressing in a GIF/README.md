# [Gold II] Decompressing in a GIF - 4046

[문제 링크](https://www.acmicpc.net/problem/4046)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 9, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

구현, 문자열, 애드 혹, 파싱

### 문제 설명

<p>One well known method to compress image files is the Graphics Interchange Format (GIF) encoding, created by CompuServe in 1987. Here&rsquo;s a simplified version applied to strings of alphabetic characters. Essential for this compression is a dictionary which assigns numeric encodings (we&rsquo;ll use base 10 numbers for this problem) to different strings of characters. The dictionary is initialized with mappings for characters or substrings which may appear in the string. For example, if we expect to encounter all 26 letters of the alphabet, the dictionary will initially store the encodings (A, 00), (B, 01), (C, 02), . . . , (Z, 25). If we are compressing DNA data, the dictionary will initially store only 4 entries: (A, 0), (T, 1), (G, 2) and (C, 3). Note that the length of each initial encoding is the same for all entries (2 digits in the first example, and 1 digit in the second).</p>

<p>The compression algorithm proceeds as follows:</p>

<ol>
	<li>Find the longest prefix of the uncompressed portion of the string which is in the dictionary, and replace it with its numeric encoding.</li>
	<li>If the end of the string has not been reached, add a new mapping (s,n) to the dictionary, where s = the prefix just compressed plus the next character after it in the string, and n = the smallest number not yet used in the dictionary.</li>
</ol>

<p>For example, assume we started with the string ABABBAABB and a dictionary with just two entries, (A, 0) and (B, 1). The table below shows the steps in compressing the string.</p>

<table class="table table-bordered" style="width:60%">
	<thead>
		<tr>
			<th>String</th>
			<th>Longest Prefix</th>
			<th>Replaced With</th>
			<th>New Dictionary Entry</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>ABABBAABB</td>
			<td>A</td>
			<td>0</td>
			<td>(AB,2)</td>
		</tr>
		<tr>
			<td>0BABBAABB</td>
			<td>B</td>
			<td>1</td>
			<td>(BA,3)</td>
		</tr>
		<tr>
			<td>01ABBAABB</td>
			<td>AB</td>
			<td>2</td>
			<td>(ABB,4)</td>
		</tr>
		<tr>
			<td>012BAABB</td>
			<td>BA</td>
			<td>3</td>
			<td>(BAA,5)</td>
		</tr>
		<tr>
			<td>0123ABB</td>
			<td>ABB</td>
			<td>4</td>
			<td>&mdash;</td>
		</tr>
	</tbody>
</table>

<p>The final compressed string is 01234.</p>

<p>There is only one other rule: the replacement strings used are always the size of the longest encoding in the dictionary at the time the replacement occurs. Thus, with the dictionary above, if the string to compress is long enough that an entry of the form (s, 10) is added to the dictionary, then from this point on all numerical replacement strings used in the compressed string must be expanded to 2 digits long (i.e., A will now be encoded as 00, B as 01, AB as 02, etc.); if an entry (s&prime;, 100) is added to the dictionary, all replacements from this point forward will increase to 3 digits long, and so on. Thus, the longer string ABABBAABBAABAABAB will be encoded as 01234027301, not 0123402731. Try it!</p>

<p>OK, now that you are experts at compressing, it&rsquo;s time to relax and decompress!</p>

### 입력

<p>Each test case will consist of two lines. The first line will contain a string of digits to decompress. The second line will contain the initial dictionary used in the compression. This line will start with a positive integer n indicating the number of entries in the dictionary (1 &le; n &le; 100), followed by n alphabetic strings. The first of these will be paired with 0 in the dictionary (or 00 if n &gt; 10), the second with 1, and so on. The last test case will be followed by a line containing a single 0.</p>

### 출력

<p>For each test case, output a single line containing the case number (using the format shown below) followed by the decompressed string. All input strings will have been legally compressed.</p>