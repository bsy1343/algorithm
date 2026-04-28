# [Silver III] Delta Encoding and Decoding - 3788

[문제 링크](https://www.acmicpc.net/problem/3788)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 12, 맞힌 사람: 12, 정답 비율: 29.268%

### 분류

구현, 문자열

### 문제 설명

<p>A very simple encryption scheme which represents a big improvement over a substitution cipher is a delta cipher. Here&rsquo;s how it works: The letters A through Z are given a numerical values starting with 0 and ending with 25. These values aren&rsquo;t necessarily given in that order, but the mapping is one to one. (The trivial mapping where A has value 0, B has value 1, etc. is the default cipher. It&rsquo;s what you use when you don&rsquo;t have anything better.)</p>

<p>In order to encrypt a message, the differences between successive values are used.</p>

<ol>
	<li>All characters except letters are transferred to the encrypted message unchanged.</li>
	<li>When one letter is preceeded by something other than a letter, it is treated as though it had been preceeded by an A.</li>
	<li>Case both does and does not matter in this encryption scheme. If a letter is originally uppercase, the encrypted version should be uppercase. If it is lowercase, the encrypted version should be lowercase. However, A and a are the same letter.</li>
	<li>When one letter is preceeded by another, the difference between the two values is the value of the first is subtracted from the second. The letter whose value is equivalent to this difference modulo 26 will replace the second letter in the new text.</li>
</ol>

<p>The input is merely a sequence of a commands, one per line, and is terminated by an EOF. No line contains more than 10000 characters. There are three command words: ENCRYPT, DECRYPT, and CIPHER. The case of the letters in these words is not important, and each word will be followed by at least one space. Any line which begins with any word other than one of these three commands requires the response &ldquo;Command not understood.&rdquo;</p>

<p>The ENCRYPT and DECRYPT commands are self-explanatory. The encrypt command is followed by plain text which needs to be encrypted and the decrypt command is followed by encrypted text which must be put into plain text. Whatever follows one of these two command words should be either encrypted or decrypted using the current cipher. If no cipher has yet been given, you should use the default cipher.</p>

<p>The CIPHER command should be followed by the twenty-six letters of the alphabet. The order of these letters is important and that order determines the value for each character &mdash; the first letter has value 0; the second letter has value 1; etc. There may be spaces and punctuation; these should be ignored; however, this line must have exactly twenty-six letters on it with no repetitions. Any problem requires the response, &ldquo;Bad cipher. Using default.&rdquo; (And, as indicated, you should actually use the default). If the cipher is understandable, you need to echo it back to the user as shown below, and then use it for all subsequent commands.</p>

### 입력



### 출력

