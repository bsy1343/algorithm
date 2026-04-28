# [Platinum II] Palindromic Deletions - 26419

[문제 링크](https://www.acmicpc.net/problem/26419)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 9, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

조합론, 다이나믹 프로그래밍, 포함 배제의 원리, 기댓값의 선형성, 수학, 누적 합, 확률론, 두 포인터

### 문제 설명

<p>Games with words and strings are very popular lately. Now Edsger tries to create a similar new game of his own. Here is what he came up with so far.</p>

<p>Edsger&#39;s new game is called <i>Palindromic Deletions</i>. As a player of this game, you are given a string of length $N$. Then you will perform the following process $N$ times:</p>

<ol>
	<li>Pick an index in the current string uniformly at random.</li>
	<li>Delete the character at that index. You will then end up with a new string with one fewer character.</li>
	<li>If the new string is a <a href="https://en.wikipedia.org/wiki/Palindrome" target="_blank">palindrome</a>, you eat a piece of candy in celebration.</li>
</ol>

<p>Now Edsger wonders: given a starting string, what is the <a href="https://en.wikipedia.org/wiki/Expected_value" target="_blank">expected number</a> of candies you will eat during the game?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case consists of two lines.</p>

<p>The first line of each test case contains an integer $N$, representing the length of the string.</p>

<p>The second line of each test case contains a string $S$ of length $N$, consisting of lowercase English characters.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: E</code>, where $x$ is the test case number (starting from 1) and $E$ is the expected number of candies you will eat during the game.</p>

<p>$E$ should be computed <i>modulo</i> the prime $10^9+7$ ($1000000007$) as follows. Represent the answer of a test case as an irreducible fraction $\frac{p}{q}$. The number $E$ then must satisfy the modular equation $E&times;q&equiv;p \pmod{(10^9+7)} $, and be between $0$ and $10^9+6$, inclusive. It can be shown that under the constraints of this problem, such a number $E$ always exists and can be uniquely determined.</p>

### 제한

<ul>
	<li>$1&le;T&le;20$.</li>
	<li>String $S$ consists of only lowercase letters of the English alphabet.</li>
</ul>