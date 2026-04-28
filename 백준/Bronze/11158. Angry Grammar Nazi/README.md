# [Bronze I] Angry Grammar Nazi - 11158

[문제 링크](https://www.acmicpc.net/problem/11158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 479, 정답: 207, 맞힌 사람: 194, 정답 비율: 45.647%

### 분류

구현, 문자열

### 문제 설명

<p>Your friend is what we can call a grammar nazi. He spends a lot of time on popular internet discussion forums. Unfortunately, he has a bad temper and loses his mind whenever someone incorrigibly befouls the English language, with unrelenting violations of grammatical and ortographic rules.</p>

<p>In order to avoid smashed keyboards, monitors and coffee-cup holders, you advice your friend to momentarily stop reading and count to ten each time he becomes angry, instead of smashing something.</p>

<p>Your friend becomes angry whenever he reads the following words or sequences of words:</p>

<ul>
	<li>&ldquo;u&rdquo;, &ldquo;ur&rdquo; instead of&nbsp;&ldquo;you&rdquo;, &ldquo;your&rdquo;.</li>
	<li>&ldquo;would of&rdquo;, &ldquo;should of&rdquo; instead of &ldquo;would have&rdquo;, &ldquo;should have&rdquo;.</li>
	<li>&ldquo;lol&rdquo; instead of &ldquo;haha&rdquo;. In fact he becomes angry even when a word contains &ldquo;lol&rdquo; as a substring.</li>
</ul>

<p>You decide to write a computer program that reads sentences one by one, and for each sentence calculates how many times your friend will have uttered a number after reading said sentence. Your friend does not read out loud, so numbers that are part of the input-sentences should not be counted.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. The following T lines each contain one sentence; that is, one or more words separated by space.</p>

<ul>
	<li>0 &lt; T &le; 50</li>
	<li>A sentence consists of at most 100 characters, including spaces.</li>
	<li>A word consists only of lower case letters between a and z, inclusively.</li>
	<li>Two adjacent words are separated by exactly one space, and a sentence never has leading or trailing spaces.</li>
</ul>

### 출력

<p>For each test case, output how many times your friend have said a number after reading the sentence.</p>