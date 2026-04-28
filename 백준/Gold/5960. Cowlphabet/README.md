# [Gold III] Cowlphabet - 5960

[문제 링크](https://www.acmicpc.net/problem/5960)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 38, 맞힌 사람: 33, 정답 비율: 55.932%

### 분류

다이나믹 프로그래밍, 그래프 이론, 문자열

### 문제 설명

<p>Like all bovines, Farmer John&#39;s cows speak the peculiar &#39;Cow&#39; language. Like so many languages, each word in this language comprises a sequence of upper and lowercase letters (A-Z and a-z). &nbsp;A word is valid if and only if each ordered pair of adjacent letters in the word is a valid pair.</p>

<p>Farmer John, ever worried that his cows are plotting against him, recently tried to eavesdrop on their conversation. He overheard one word before the cows noticed his presence. The Cow language is spoken so quickly, and its sounds are so strange, that all that Farmer John was able to perceive was the total number of uppercase letters, U (1 &lt;= U &lt;= 250) and the total number of lowercase letters, L (1 &lt;= L &lt;= 250) in the word.</p>

<p>Farmer John knows all P (1 &lt;= P &lt;= 200) valid ordered pairs of adjacent letters. &nbsp;He wishes to know how many different valid words are consistent with his limited data. &nbsp;However, since this number may be very large, he only needs the value modulo 97654321.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: U, L and P</li>
	<li>Lines 2..P+1: Two letters (each of which may be uppercase or lowercase), representing one valid ordered pair of adjacent letters in Cow.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, the number of valid words consistent with Farmer &nbsp;John&#39;s data mod 97654321.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The word Farmer John overheard had 2 uppercase and 2 lowercase letters. &nbsp;The valid pairs of adjacent letters are AB, ab, BA, ba, Aa, Bb and bB.</p>

<p>The possible words are:</p>

<pre>
AabB
ABba
abBA
BAab
BbBb
bBAa
bBbB</pre>

<p>&nbsp;</p>