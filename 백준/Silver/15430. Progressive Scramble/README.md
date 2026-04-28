# [Silver IV] Progressive Scramble - 15430

[문제 링크](https://www.acmicpc.net/problem/15430)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 61, 맞힌 사람: 53, 정답 비율: 66.250%

### 분류

구현, 문자열

### 문제 설명

<p>You are a member of a naive spy agency. For secure communication, members of the agency use a very simple encryption algorithm &ndash; which changes each symbol in the message &lsquo;progressively&rsquo;, i.e., based on the symbols preceding it. The allowed symbols are space and the 26 lowercase English letters. For encryption purposes we assign them the values 0 (for space) and 1 through 26 (for a&ndash;z). We&rsquo;ll let v(s) represent the numeric value of symbol s.</p>

<p>Consider a message with symbols s<sub>1</sub>, s<sub>2</sub>, . . . , s<sub>n</sub>. The encryption algorithm starts by converting the first symbol s<sub>1</sub> into its associated value u<sub>1</sub> = v(s<sub>1</sub>). Then for each subsequent symbol s<sub>i</sub> in the message, the computed value is u<sub>i</sub> = v(s<sub>i</sub>) + u<sub>i&minus;1</sub> &mdash; the sum of its associated value and the computed value for the previous symbol. (Note that when there is a space in the input message, the previous scrambled letter is repeated.) This process continues until all the u<sub>i</sub> are computed.</p>

<p>At this point, the message is a sequence of numeric values. We need to convert it back to symbols to print it out. We do this by taking the value u<sub>i</sub> modulo 27 (since there are 27 valid symbols), and replacing that value with its corresponding symbol. For example, if u<sub>i</sub> = 32, then 32 mod 27 = 5, which is the symbol &lsquo;e&rsquo; (since v(e) = 5).</p>

<p>Let&rsquo;s look at an example. Suppose we want to encrypt the string &ldquo;my pie&rdquo;.</p>

<ol>
	<li>First, convert each symbol s<sub>i</sub> into v(s<sub>i</sub>): [13, 25, 0, 16, 9, 5].</li>
	<li>Next, compute each u<sub>i</sub>: [13, 38, 38, 54, 63, 68].</li>
	<li>Then, use modulus on the ui: [13, 11, 11, 0, 9, 14].</li>
	<li>Finally, convert these back to symbols: &ldquo;mkk in&rdquo;.</li>
</ol>

<p>Create a program that takes text and encrypts it using this algorithm, and also decrypts text that has been encrypted with this algorithm.</p>

### 입력

<p>The input to your program consists of a single integer 1 &le; n &le; 100 on its own line. This number is followed by n lines, each containing the letter &lsquo;e&rsquo; or &lsquo;d&rsquo;, a single space, and then a message made up of lowercase letters (a&ndash;z) and spaces, continuing to the end of the line. Each message is between 1 and 80 characters long. The letters &lsquo;d&rsquo; and &lsquo;e&rsquo; indicate that your program decrypts or encrypts the subsequent string, respectively.</p>

### 출력

<p>Output the result of encrypting or decrypting each message from the input on its own separate line. Note that differences in whitespace are significant in this problem. Therefore your output must match the correct output character-for-character, including spaces.</p>