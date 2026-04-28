# [Bronze I] Cipher - 9850

[문제 링크](https://www.acmicpc.net/problem/9850)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 236, 정답: 139, 맞힌 사람: 119, 정답 비율: 58.333%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>You are the leader of a crack intelligence unit, and today your team intercepted a set of encrypted messages (&rdquo;ciphertexts&rdquo;) from &ldquo;Kojak&rdquo;, a well known and much feared terrorist leader. It is thought that these ciphertexts contain instructions to his henchmen on which targets to attack next. One of the ciphertexts reads as follows:</p>

<pre>
XLMW MW OSNEO. M EQ LIVIFC SVHIVMRK XLEX EPP QC QIR QYWX IEX TITTIVSRM TMDDEW IZIVCHEC. XLMW SVHIV AMPP FI VITIEPIH SRPC YTSR QC VIXMVIQIRX. PSRK PMZI XLI GLMTQYROW!</pre>

<p>Your team knows that despite Kojak&rsquo;s sophistication, he uses a simple Caesar Cipher. In this cipher, letters are shifted by a fixed number of positions P, where P is unknown to you. For example, if letters are shifted by P=2 positions, we get the following &ldquo;key&rdquo;:</p>

<table class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td style="text-align: center;">Plain</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">B</td>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">D</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">G</td>
			<td style="text-align: center;">H</td>
			<td style="text-align: center;">I</td>
			<td style="text-align: center;">J</td>
			<td style="text-align: center;">K</td>
			<td style="text-align: center;">L</td>
			<td style="text-align: center;">M</td>
			<td style="text-align: center;">N</td>
			<td style="text-align: center;">O</td>
			<td style="text-align: center;">P</td>
			<td style="text-align: center;">Q</td>
			<td style="text-align: center;">R</td>
			<td style="text-align: center;">S</td>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">U</td>
			<td style="text-align: center;">V</td>
			<td style="text-align: center;">W</td>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">Y</td>
			<td style="text-align: center;">Z</td>
		</tr>
		<tr>
			<td style="text-align: center;">Cipher</td>
			<td style="text-align: center;">C</td>
			<td style="text-align: center;">D</td>
			<td style="text-align: center;">E</td>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">G</td>
			<td style="text-align: center;">H</td>
			<td style="text-align: center;">I</td>
			<td style="text-align: center;">J</td>
			<td style="text-align: center;">K</td>
			<td style="text-align: center;">L</td>
			<td style="text-align: center;">M</td>
			<td style="text-align: center;">N</td>
			<td style="text-align: center;">O</td>
			<td style="text-align: center;">P</td>
			<td style="text-align: center;">Q</td>
			<td style="text-align: center;">R</td>
			<td style="text-align: center;">S</td>
			<td style="text-align: center;">T</td>
			<td style="text-align: center;">U</td>
			<td style="text-align: center;">V</td>
			<td style="text-align: center;">W</td>
			<td style="text-align: center;">X</td>
			<td style="text-align: center;">Y</td>
			<td style="text-align: center;">Z</td>
			<td style="text-align: center;">A</td>
			<td style="text-align: center;">B</td>
		</tr>
	</tbody>
</table>

<p>So, for example, <code>HELLO WORLD</code> is encrypted to <code>JGNNQ YQTNF</code>. Kojak encrypts only upper-case letters.</p>

<p>Your team also knows that the words &ldquo;CHIPMUNKS&rdquo; and &ldquo;LIVE&rdquo; always appear in Kojak&rsquo;s messages, and that he uses a different key for each message. You can assume that for each message, there is exactly one key that results in the words &ldquo;CHIPMUNKS&rdquo; and &ldquo;LIVE&rdquo; to appear in the decrypted message. Your task is to write a program to decrypt all of Kojak&rsquo;s encrypted messages (not just the one shown above) to produce the corresponding plaintext. The fate of your nation is in your hands!</p>

### 입력

<p>This is a text file containing a single line of ciphertext consisting of at most 1,000 characters.</p>

### 출력

<p>The plaintext version of the ciphertext. The plaintext version has exactly the same characters as the ciphertext (including newlines, spaces etc), except that uppercase letters are replaced by their decrypted version. Thus, Kojak&rsquo;s message above leads to the following output:</p>