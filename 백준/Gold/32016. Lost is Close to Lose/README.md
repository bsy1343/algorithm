# [Gold V] Lost is Close to Lose - 32016

[문제 링크](https://www.acmicpc.net/problem/32016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 16, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 집합과 맵

### 문제 설명

<p>Better Documents Inc. is contemplating the next generation of word processors. Now, nearly every word processor includes a Spell Checker. BDI, however, is looking forward to replacing that with a true Typo Checker. We&#39;ve all been caught, after relying on a spell checker, by typing mistakes (&quot;typos&quot;) that just happen to wind up as a correctly spelled word, just not the word we intended. BDI hopes to use AI to determine when a word&#39;s context suggests that it is out of place and probably should have been a different, but similarly spelled, word.</p>

<p>As a first step in this process, they want to see how common such similar words really are in ordinary text. Write a program to read in paragraphs of text and to produce a list of similarly spelled words occurring in that text.</p>

<p>For the purpose of this program, a <em>word</em> is any maximal string of non-whitespace characters containing at least one alphabetic character. <em>Whitespace</em> can be either blanks or line terminators (&quot;<code>\r</code>&quot; or &quot;<code>\n</code>&quot;). The <em>core</em> of a word is what you have left after removing any non-alphabetic characters and replacing any upper-case alphabetic characters to their lower-case equivalents.</p>

<p>Two words are considered to be <em>similarly spelled</em> if the core of one word can be converted to the core of the other word by a single application of any one of the following transformations:</p>

<ul>
	<li>Delete a single character.</li>
	<li>Insert a single alphabetic character.</li>
	<li>Replace a single character by a different alphabetic character.</li>
	<li>Transpose (exchange) any two adjacent characters.</li>
</ul>

### 입력

<p>Input consists of $1$ to $100$ lines of text, followed by an end of input marker in the form of a line containing only the string &quot;***&quot;.</p>

<p>Each line of text will contain $0$ to $80$ ASCII characters (not counting line terminators).</p>

### 출력

<p>For each word core in the text that has 1 or more similarly spelled words, print a line consisting of</p>

<ol>
	<li>That word core</li>
	<li>A colon (&quot;:&quot;) followed by a blank</li>
	<li>A list of all similarly spelled word cores (with no duplicates and not containing the core to the left of the colons), in alphabetic order, separated by single spaces.</li>
</ol>

<p>The lines printed should be in alphabetic order of the word cores to the left of the colon.</p>

<p>If there are no similarly spelled words in the input, print a single line containing the string &quot;***&quot;.</p>