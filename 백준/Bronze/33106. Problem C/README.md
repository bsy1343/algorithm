# [Bronze I] Problem C - 33106

[문제 링크](https://www.acmicpc.net/problem/33106)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 102, 정답: 88, 맞힌 사람: 62, 정답 비율: 89.855%

### 분류

구현, 문자열

### 문제 설명

<p>The English language is infamous for having an inconsistent spelling system. One feature in the spelling system that you are interested in is the usage of the letter <code>c</code>. The letter <code>c</code> can be pronounced in multiple different ways, which might be confusing for the speaker. However, there are some simplified patterns to help speakers determine which pronunciation to use.</p>

<ul>
	<li>It is pronounced as ⟨k⟩ if it is either: followed by <code>a</code>, <code>o</code>, or <code>u</code>; followed by a consonant letter other than <code>h</code> and <code>y</code>; or at the end of a word. The consonant letters are the English letters excluding the vowel letters: <code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, and <code>u</code>.</li>
	<li>It is pronounced as ⟨s⟩ if it is followed by <code>e</code>, <code>i</code>, or <code>y</code>.</li>
	<li>The pair of adjacent letters <code>ch</code> is pronounced with a unique sound ⟨c⟩.</li>
</ul>

<p>You are given $N$ words: $S_1, S_2, \dots , S_N$. For each given word, simplify the spelling system by replacing every occurence of <code>c</code> into <code>k</code> or <code>s</code> (for the sound ⟨k⟩ and ⟨s⟩ respectively) according to the patterns above and every occurence of <code>ch</code> into <code>c</code>.</p>

### 입력

<p>The first line consists of an integer $N$ ($1 ≤ N ≤ 100$).</p>

<p>Each of the next $N$ lines consists of a string $S_i$. String $S_i$ consists of only lowercase English letters, and its length is between $1$ and $100$.</p>

### 출력

<p>For each word, output a single line containing a string that represents the simplified spelling system of string $S_i$ according to the patterns above.</p>