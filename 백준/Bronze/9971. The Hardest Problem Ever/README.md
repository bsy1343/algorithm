# [Bronze II] The Hardest Problem Ever - 9971

[문제 링크](https://www.acmicpc.net/problem/9971)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 759, 정답: 494, 맞힌 사람: 427, 정답 비율: 66.511%

### 분류

구현, 문자열

### 문제 설명

<p>Julius Caesar lived in a time of danger and intrigue. The hardest situation Caesar ever faced was keeping himself alive. In order for him to survive, he decided to create one of the first ciphers. This cipher was so incredibly sound, that no one could figure it out without knowing how it worked. You are a sub captain of Caesar&rsquo;s army. It is your job to decipher the messages sent by Caesar and provide to your general. The code is simple. For each letter in a plaintext message, you shift it five places to the right to create the secure message (i.e., if the letter is &lsquo;A&rsquo;, the cipher text would be &lsquo;F&rsquo;). Since you are creating plain text out of Caesar&rsquo;s messages, you will do the opposite:</p>

<pre>
Cipher text
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

Plain text
V W X Y Z A B C D E F G H I J K L M N O P Q R S T U</pre>

<p>Only letters are shifted in this cipher. Any non-alphabetical character should remain the same, and all alphabetical characters will be upper case.</p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets. All characters will be uppercase.</p>

<p>A single data set has 3 components:</p>

<ol>
	<li>Start line &ndash; A single line, &ldquo;START&rdquo;</li>
	<li>Cipher message &ndash; A single line containing from one to two hundred characters, inclusive, comprising a single message from Caesar</li>
	<li>End line &ndash; A single line, &ldquo;END&rdquo;</li>
</ol>

<p>Following the final data set will be a single line, &ldquo;ENDOFINPUT&rdquo;.</p>

### 출력

<p>For each data set, there will be exactly one line of output. This is the original message by Caesar.</p>