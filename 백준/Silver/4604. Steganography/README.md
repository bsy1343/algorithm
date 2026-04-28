# [Silver IV] Steganography - 4604

[문제 링크](https://www.acmicpc.net/problem/4604)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 171, 정답: 109, 맞힌 사람: 92, 정답 비율: 61.745%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>In cryptography, the goal is to encrypt a message so that, even if the the message is intercepted, only the intended recipient can decrypt it. In steganography, which literally means &quot;hidden writing&quot;, the goal is to hide the fact that a message has even been sent. It has been in use since 440 BC. Historical methods of steganography include invisible inks and tatooing messages on messengers where they can&#39;t easily be seen. A modern method is to encode a message using the least-significant bits of the RGB color values of pixels in a digital image.</p>

<p>For this problem you will uncover messages hidden in plain text. The spaces within the text encode bits; an odd number of consecutive spaces encodes a 0 and an even number of consecutive spaces encodes a 1. The four texts in the example input below (terminated by asterisks) encode the following bit strings: 11111, 000010001101101, 01, and 000100010100010011111. Each group of five consecutive bits represents a binary number in the range 0&ndash;31, which is converted to a character according to the table below. If the last group contains fewer than five bits, it is padded on the right with 0&#39;s.</p>

<table class="table table-bordered" style="width:20%">
	<tbody>
		<tr>
			<td>&quot; &quot; (space)</td>
			<td>0</td>
		</tr>
		<tr>
			<td>&quot;A&quot; &ndash; &quot;Z&quot;</td>
			<td>1&ndash;26</td>
		</tr>
		<tr>
			<td>&quot;&#39;&quot; (apostrophe)</td>
			<td>27</td>
		</tr>
		<tr>
			<td>&quot;,&quot; (comma)</td>
			<td>28</td>
		</tr>
		<tr>
			<td>&quot;-&quot; (hyphen)</td>
			<td>29</td>
		</tr>
		<tr>
			<td>&quot;.&quot; (period)</td>
			<td>30</td>
		</tr>
		<tr>
			<td>&quot;?&quot; (question mark)</td>
			<td>31</td>
		</tr>
	</tbody>
</table>

<p>The first message is 11111<sub>2</sub> = 31<sub>10</sub> = &quot;?&quot;. The second message is (00001, 00011, 01101)<sub>2</sub> = (1, 3, 13)<sub>10</sub> = &quot;ACM&quot;. The third message is 01<u>000</u><sub>2</sub> = 8<sub>10</sub> = &quot;H&quot;, where the underlined 0&#39;s are padding bits. The fourth message is (00010, 00101, 00010, 01111, 1<u>0000</u>)<sub>2</sub> = (2, 5, 2, 15, 16)<sub>10</sub> = &quot;BEBOP&quot;.</p>

### 입력

<p>The input consists of one or more texts. Each text contains one or more lines, each of length at most 80 characters, followed by a line containing only &quot;*&quot; (an asterisk) that signals the end of the text. A line containing only &quot;#&quot; signals the end of the input. In addition to spaces, text lines may contain any ASCII letters, digits, or punctuation, except for &quot;*&quot; and &quot;#&quot;, which are used only as sentinels.</p>

### 출력

<p>For each input text, output the hidden message on a line by itself. Hidden messages will be 1&ndash;64 characters long.</p>