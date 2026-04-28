# [Gold V] Ambiguous Cipher - 23995

[문제 링크](https://www.acmicpc.net/problem/23995)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

문자열

### 문제 설명

<p>Susie and Calvin are classmates. Calvin would like to be able to pass notes to Susie in class without their teacher or other classmates knowing what they are talking about, just in case the notes fall into the wrong hands. Calvin has devised the a system to encrypt his messages.</p>

<p>Calvin only passes one word to Susie each time, and that word consists of only uppercase letters, because Calvin is so excited to talk to Susie. Each word is encrypted as follows:</p>

<ul>
	<li>Calvin assigns a number to each letter based on the letter&#39;s position in the alphabet, where&nbsp;<code>A</code>&nbsp;= 0,&nbsp;<code>B</code>&nbsp;= 1, ...,&nbsp;<code>Z</code>&nbsp;= 25.</li>
	<li>For every letter in the word, Calvin determines the encrypted value of the letter by summing the values of the 1 or 2 letter(s) that are adjacent to that letter in the word. He takes that sum modulo 26, and this is the new value of the letter. Calvin then converts the value back to an uppercase letter based on positions in the alphabet, as before.</li>
	<li>The encrypted word is determined by encrypting every letter in the word using this method. Each letter&#39;s encryption is based only on the letters from the original unencrypted message, and not on any letters that have already been encrypted</li>
</ul>

<p>Let&#39;s take a look at one of the notes Calvin is writing for Susie. Since Calvin is always hungry, he wants to let Susie know that he wants to eat again. Calvin encrypts the word&nbsp;<code>SOUP</code>&nbsp;as follows:</p>

<ul>
	<li><code>S</code>&nbsp;= 18,&nbsp;<code>O</code>&nbsp;= 14,&nbsp;<code>U</code>&nbsp;= 20, and&nbsp;<code>P</code>&nbsp;= 15.</li>
	<li>Calvin encrypts each letter based on the values of its neighbor(s):
	<ul>
		<li>First letter: 14 mod 26 = 14.</li>
		<li>Second letter: (18 + 20) mod 26 = 12.</li>
		<li>Third letter: (14 + 15) mod 26 = 3.</li>
		<li>Fourth letter: 20 mod 26 = 20.</li>
	</ul>
	</li>
	<li>The values 14 12 3 20 correspond to the letters&nbsp;<code>OMDU</code>, and this is the encrypted word that Calvin will write on the note for Susie.</li>
</ul>

<p>It is guaranteed that Calvin will not send Susie any words that cannot be decrypted at all. For example, Calvin would not send Susie the word&nbsp;<code>APE</code>, since it does not have any valid decryptions. (That is, there is no word that Calvin could have encrypted to&nbsp;<code>APE</code>.)</p>

<p>However, Calvin&#39;s system is not perfect, and some of the words he sends Susie can actually be decrypted to multiple words, creating ambiguity! For example,&nbsp;<code>BCB</code>&nbsp;can be decrypted to&nbsp;<code>ABC</code>&nbsp;or&nbsp;<code>CBA</code>, among other possibilities.</p>

<p>Susie pulled another all-nighter yesterday to finish school projects, and she is too tired to decrypt Calvin&#39;s messages. She needs your help!</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each case is a single line that contains a string&nbsp;<b>W</b>&nbsp;of uppercase letters: an encrypted word that Calvin has sent.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the decrypted word, or&nbsp;<code>AMBIGUOUS</code>&nbsp;if it is impossible to uniquely determine the decrypted word.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li><b>W</b>&nbsp;consists of only of uppercase English letters.</li>
	<li><b>W</b>&nbsp;is decryptable to one or more words. (That is,&nbsp;<b>W</b>&nbsp;is the result of an encryption of some word.)</li>
	<li><b>W</b>&nbsp;does not decrypt to the word&nbsp;<code>AMBIGUOUS</code>. (You will only output that when the decryption is ambiguous.)</li>
</ul>

### 힌트

<p>Note that the last sample case would not appear in the Small dataset.</p>

<p>Sample Cases #1 &amp; #2 were explained in the problem statement.</p>

<p>In Sample Case #3,&nbsp;<code>BANANA</code>&nbsp;is the only word that encrypts to&nbsp;<code>AOAAAN</code>.</p>