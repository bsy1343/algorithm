# [Gold IV] Scrambled Scrabble - 33119

[문제 링크](https://www.acmicpc.net/problem/33119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 57, 정답: 41, 맞힌 사람: 37, 정답 비율: 80.435%

### 분류

그리디 알고리즘, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>You are playing a word game using a standard set of $26$ uppercase English letters: <code>A-Z</code>. In this game, you can form <em>vowels</em> and <em>consonants</em> as follows.</p>

<ul>
	<li>The letters <code>A</code>, <code>E</code>, <code>I</code>, <code>O</code>, and <code>U</code> can only form a vowel.</li>
	<li>The letter <code>Y</code> can form either a vowel or a consonant.</li>
	<li>Each of the remaining letters other than <code>A</code>, <code>E</code>, <code>I</code>, <code>O</code>, <code>U</code>, and <code>Y</code> can only form a consonant.</li>
	<li>The string <code>NG</code> can form a single consonant when concatenated together.</li>
</ul>

<p>Denote a <em>syllable</em> as a concatenation of a consonant, a vowel, and a consonant in that order. A <em>word</em> is a concatenation of one or more syllables.</p>

<p>You are given a string $S$ and you want to create a word from it. You are allowed to delete zero or more letters from $S$ and rearrange the remaining letters to form the word. Find the length of the longest word that can be created, or determine if no words can be created.</p>

### 입력

<p>A single line consisting of a string $S$ ($1 ≤ |S| ≤ 5000$). The string $S$ consists of only uppercase English letters.</p>

### 출력

<p>If a word cannot be created, output $0$. Otherwise, output a single integer representing the length of longest word that can be created.</p>