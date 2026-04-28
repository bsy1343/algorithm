# [Bronze I] DRM Messages - 15087

[문제 링크](https://www.acmicpc.net/problem/15087)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 252, 정답: 217, 맞힌 사람: 174, 정답 비율: 85.714%

### 분류

구현, 문자열

### 문제 설명

<p>DRM Encryption is a new kind of encryption. Given an encrypted string (which we&rsquo;ll call a DRM message), the decryption process involves three steps: Divide, Rotate and Merge. This process is described in the following example with the DRM message &ldquo;EWPGAJRB&rdquo;:</p>

<ul>
	<li><strong>Divide</strong> &ndash; First, divide the message in half to &ldquo;EWPG&rdquo; and &ldquo;AJRB&rdquo;.</li>
	<li><strong>Rotate</strong> &ndash; For each half, calculate its rotation value by summing up the values of each character (A = 0, B = 1, . . . Z = 25). The rotation value of &ldquo;EWPG&rdquo; is 4 + 22 + 15 + 6 = 47. Rotate each character in &ldquo;EWPG&rdquo; 47 positions forward (wrapping from Z to A when necessary) to obtain the new string &ldquo;ZRKB&rdquo;. Following the same process on &ldquo;AJRB&rdquo; results in &ldquo;BKSC&rdquo;.</li>
	<li><strong>Merge</strong> &ndash; The last step is to combine these new strings (&ldquo;ZRKB&rdquo; and &ldquo;BKSC&rdquo;) by rotating each character in the first string by the value of the corresponding character in the second string. For the first position, rotating &lsquo;Z&rsquo; by &lsquo;B&rsquo; means moving it forward 1 character, which wraps it around to &lsquo;A&rsquo;. Continuing this process for every character results in the final decrypted message, &ldquo;ABCD&rdquo;.</li>
</ul>

### 입력

<p>The input contains a single DRM message to be decrypted. All characters in the string are uppercase letters and the string&rsquo;s length is even and &le; 15 000.</p>

### 출력

<p>Display the decrypted DRM message.</p>