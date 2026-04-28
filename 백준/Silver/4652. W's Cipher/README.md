# [Silver IV] W's Cipher - 4652

[문제 링크](https://www.acmicpc.net/problem/4652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 34, 맞힌 사람: 28, 정답 비율: 58.333%

### 분류

구현, 문자열

### 문제 설명

<p>Weird Wally&#39;s Wireless Widgets, Inc. manufactures an eclectic assortment of small, wireless, network capable devices, ranging from dog collars, to pencils, to fishing bobbers. All these devices have very small memories. Encryption algorithms like Rijndael, the candidate for the Advanced Encryption Standard (AES) are demonstrably secure but they don&#39;t fit in such a tiny memory. In order to provide some security for transmissions to and from the devices, WWWW uses the following algorithm, which you are to implement.</p>

<p>Encrypting a message requires three integer keys, k<sub>1</sub>, k<sub>2</sub>, and k<sub>3</sub>. The letters [a-i] form one group, [j-r] a second group, and everything else ([s-z] and underscore) the third group. Within each group the letters are rotated left by k<sub>i</sub> positions in the message. Each group is rotated independently of the other two. Decrypting the message means doing a right rotation by k<sub>i</sub> positions within each group.</p>

<p>Consider the message the_quick_brown_fox encrypted with k<sub>i</sub> values of 2, 3 and 1. The encrypted string is _icuo_bfnwhoq_kxert. The figure below shows the decrypting right rotations for one character in each of the three character groups.</p>

<p>&lt;fig&gt; B W&rsquo;s Cipher<br />
http://www.icpc-midcentral.us/archives/2001/wscipher/wscipher.html</p>

<p>Looking at all the letters in the group [a-i] we see {i,c,b,f,h,e} appear at positions {2,3,7,8,11,17} within the encrypted message. After a right rotation of k<sub>1</sub>=2, these positions contain the letters {h,e,i,c,b,f}. The table below shows the intermediate strings that come from doing all the rotations in the first group, then all rotations in the second group, then all the rotations in the third group. Rotating letters in one group will not change any letters in any of the other groups.</p>

<table class = "table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td>&nbsp;</td>
			<td style="text-align:center">[a-i], k<sub>1</sub>= 2</td>
			<td style="text-align:center">[j-r], k<sub>2</sub>= 3</td>
			<td style="text-align:center">[s-z] and _, k<sub>3</sub>= 1</td>
		</tr>
		<tr>
			<td>Encrypted</td>
			<td>_icuo_bfnwhoq_kxert</td>
			<td>_heuo_icnwboq_kxfrt</td>
			<td>_heuq_ickwbro_nxfot</td>
		</tr>
		<tr>
			<td>Decrypted</td>
			<td>_heuo_icnwboq_kxfrt</td>
			<td>_heuq_ickwbro_nxfot</td>
			<td>the_quick_brown_fox</td>
		</tr>
		<tr>
			<td>Changes</td>
			<td>&nbsp; ^^ &nbsp; &nbsp; ^^ &nbsp; &nbsp;^ &nbsp; &nbsp; &nbsp; &nbsp; ^&nbsp;</td>
			<td>&nbsp; &nbsp; &nbsp; &nbsp; ^ &nbsp; ^ &nbsp; &nbsp; ^^ &nbsp;^ &nbsp; ^&nbsp;</td>
			<td>^ &nbsp; ^ &nbsp;^ &nbsp; &nbsp; ^ &nbsp; &nbsp; ^ &nbsp;^ &nbsp; &nbsp;^</td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

### 입력

<p>All input strings contain only lowercase letters and underscores(_). Each string will be at most 80 characters long. The k<sub>i</sub> are all positive integers in the range 1-100.</p>

<p>Input consists of information for one or more encrypted messages. Each problem begins with one line containing k<sub>1</sub>, k<sub>2</sub>, and k<sub>3</sub> followed by a line containing the encrypted message. The end of the input is signalled by a line with all key values of 0.</p>

### 출력

<p>For each encrypted message, the output is a single line containing the decrypted string.</p>