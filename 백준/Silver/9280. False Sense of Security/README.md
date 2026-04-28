# [Silver IV] False Sense of Security - 9280

[문제 링크](https://www.acmicpc.net/problem/9280)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 68, 맞힌 사람: 58, 정답 비율: 65.169%

### 분류

구현, 문자열

### 문제 설명

<p>Freddy discovered a new procedure to grow much bigger cauliﬂowers. He wants to share this ﬁnding with his fellow gardener Tommy but he does not want anyone to steal the procedure. So the two gardeners agreed upon using a simple encryption technique proposed by M. E. Ohaver.</p>

<p>The encryption is based on the Morse code, which represents characters as variable-length sequences of dots and dashes. The following table shows the Morse code sequences for all letters:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9280.%E2%80%85False%E2%80%85Sense%E2%80%85of%E2%80%85Security/d1845a60.png" data-original-src="https://www.acmicpc.net/upload/images/fs1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:156px; width:340px" /></p>

<p>Note that four possible dot-dash combinations are unassigned. For the purposes of this problem we will assign them as follows (note these are not the assignments for actual Morse code):</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9280.%E2%80%85False%E2%80%85Sense%E2%80%85of%E2%80%85Security/2c0006f6.png" data-original-src="https://www.acmicpc.net/upload/images/fs2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:62px; width:386px" /></p>

<p>In practice, characters in a message are delimited by short pauses, typically displayed as spaces.<br />
Thus, the message ACM GREATER NY REGION is encoded as:</p>

<p>.- -.-. -- ..-- --. .-. . .- - . .-. ..-- -. -.-- ..-- .-. . --. .. --- -.</p>

<p>The Ohaver&rsquo;s encryption scheme is based on mutilating Morse code, namely by removing the pauses between letters. Since the pauses are necessary (because Morse is a variable-length encoding that is not preﬁx-free), a string is added that identiﬁes the number of dots and dashes in each character. For example, consider the message &ldquo;.--.-.--&rdquo;. Without knowing where the pauses should be, this could be &ldquo;ACM&rdquo;, &ldquo;ANK&rdquo;, or several other possibilities. If we add length information, such as &ldquo;.--.-.-- 242&rdquo;, then the code is unambiguous.</p>

<p>Ohaver&rsquo;s scheme has three steps, the same for encryption and decryption:</p>

<ol>
	<li>Convert the text to Morse code without pauses but with a string of numbers to indicate code lengths.</li>
	<li>Reverse the string of numbers.</li>
	<li>Convert the dots and dashes back into the text using the reversed string of numbers as code lengths.</li>
</ol>

<p>As an example, consider the encrypted message &ldquo;AKADTOF IBOETATUK IJN&rdquo;. Converting to Morse code with a length string yields:</p>

<p>.--.-.--..----..-...--..-...---.-.--..--.-..--...----. 232313442431121334242</p>

<p>By reversing the numbers and decoding, we get the original message &ldquo;ACM GREATER NY REGION&rdquo;.</p>

<p>The security of this encoding scheme is not too high but Freddy believes it is suﬃcient for his purposes. Will you help Freddy to implement this encoding algorithm and to protect his sensitive information?</p>

### 입력

<p>The input will consist of several messages encoded with Ohaver&rsquo;s algorithm, each of them on one line. Each message will use only the twenty-six capital letters, underscores, commas, periods, and question marks. Messages will not exceed 1000 characters in length.</p>

### 출력

<p>For each message in the input, output the decoded message on one line.</p>