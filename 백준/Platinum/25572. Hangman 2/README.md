# [Platinum I] Hangman 2 - 25572

[문제 링크](https://www.acmicpc.net/problem/25572)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 9, 맞힌 사람: 5, 정답 비율: 19.231%

### 분류

해싱, 문자열

### 문제 설명

<p>John likes to play Hangman, the word guessing game. Today, however, he got really mad at the game. He arrived at the configuration <code>spi_e</code>, where finding the solution requires pure luck (solutions include <code>spice</code>, <code>spike</code>, <code>spine</code> and <code>spire</code>).</p>

<p>John is frustrated and argues that some words should never be chosen initially, namely words that differ from other words by <strong>at most two leers</strong>.</p>

<p>Given a list of N distinct words, all of length K, print in alphabetical order those words from which no other word can be obtained by substituting <strong>at most two leers</strong>.</p>

<p>Unlike classic Hangman, in this problem when John guesses a letter only one instance of the letter is revealed. For example, <code>spi_e</code> could hypothetically resolve to <code>spise</code>, whereas in classic Hangman guessing <code>s</code> would reveal both <code>s</code>&#39;s, so <code>spi_e</code> would be an invalid configuration.</p>

### 입력

<p>The first line contains an integer T, the number of tests. The T tests follow. Each of them has the following structure:</p>

<ul>
	<li>The first line contains two integer numbers N and K.</li>
	<li>Each of the following N lines contains a word of K small English letters.</li>
</ul>

### 출력

<p>For each of the T tests print one line with the following structure:</p>

<ul>
	<li>A sequence of N characters: the i<sup>th</sup> character is <code>1</code> if the i<sup>th</sup> word can be obtained by substituting <strong>at most two letters</strong> from another or <code>0</code> if not and can be played in the game.</li>
</ul>

### 제한

<ul>
	<li>1 &le; T &le; 10</li>
	<li>1 &le; N &sdot; K &le; 4.5 &sdot; 10<sup>4</sup></li>
</ul>

### 힌트

<ul>
	<li><code>spi_e</code> could lead to <code>spike</code>, <code>spine</code> and <code>spire</code></li>
	<li><code>ch_ir</code> could lead to <code>chair</code> and <code>choir</code></li>
	<li><code>cho__</code> could lead to <code>choir</code> and <code>chore</code></li>
</ul>

<p>The only word that can be used in the game is: <code>speed</code>.</p>