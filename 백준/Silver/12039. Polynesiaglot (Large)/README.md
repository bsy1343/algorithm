# [Silver II] Polynesiaglot (Large) - 12039

[문제 링크](https://www.acmicpc.net/problem/12039)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 205, 정답: 155, 맞힌 사람: 141, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Ursula is a big fan of constructing artificial languages. Today, she is starting to work on a language inspired by real Polynesian languages. The only rules she has established are:</p>

<ul>
	<li>All words consist of letters. Letters are either consonants or vowels.</li>
	<li>Any consonant in a word must be immediately followed by a vowel.</li>
</ul>

<p>For example, in a language in which&nbsp;<em>a</em>&nbsp;is the only vowel and&nbsp;<em>h</em>&nbsp;is the only consonant,&nbsp;<em>a</em>,&nbsp;<em>aa</em>,&nbsp;<em>aha</em>,&nbsp;<em>aaha</em>, and&nbsp;<em>haha</em>&nbsp;are valid words, whereas&nbsp;<em>h</em>,&nbsp;<em>ahh</em>,&nbsp;<em>ahah</em>, and&nbsp;<em>ahha</em>&nbsp;are not. Note that the rule about consonants disallows ending a word in a consonant as well as following a consonant with another consonant.</p>

<p>If Ursula&#39;s new language has&nbsp;<strong>C</strong>&nbsp;different consonants and&nbsp;<strong>V</strong>&nbsp;different vowels available to use, then how many different valid words of length&nbsp;<strong>L</strong>&nbsp;are there in her language? Since the output can be a really big number, we only ask you to output the remainder of dividing the result by the prime 10<sup>9</sup>+7 (1000000007).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with three integers&nbsp;<strong>C</strong>,&nbsp;<strong>V</strong>, and&nbsp;<strong>L</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<strong>V</strong>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le; 500.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of different valid words of length&nbsp;<strong>L</strong>&nbsp;in the language, modulo the prime 10<sup>9</sup>+7 (1000000007).</p>

### 힌트

<p>In Case #1, suppose that the only vowel is&nbsp;<em>a</em>&nbsp;and the only consonant is&nbsp;<em>h</em>. Then the possible valid words of length 4 are:&nbsp;<em>aaaa</em>,&nbsp;<em>aaha</em>,&nbsp;<em>ahaa</em>,&nbsp;<em>haaa</em>,&nbsp;<em>haha</em>.</p>

<p>In Case #2 (which would not appear in the Small dataset 1), suppose that the two vowels are&nbsp;<em>a</em>&nbsp;and&nbsp;<em>e</em>&nbsp;and the only consonant is&nbsp;<em>h</em>. Then the possible valid words of length 2 are:&nbsp;<em>aa</em>,&nbsp;<em>ae</em>,&nbsp;<em>ea</em>,&nbsp;<em>ee</em>,&nbsp;<em>ha</em>,&nbsp;<em>he</em>.</p>