# [Gold IV] The Concatenation of Words - 8123

[문제 링크](https://www.acmicpc.net/problem/8123)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 14, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

백트래킹, 다이나믹 프로그래밍

### 문제 설명

<p>We are given a word&nbsp;<i>w</i>&nbsp;being a pattern and a finite sequence of nonempty words&nbsp;<i>C</i>&nbsp;=&nbsp;(<i>w</i><sub>1</sub>,&nbsp;...,&nbsp;<i>w<sub>k</sub></i>). In the sequence&nbsp;<i>C</i>&nbsp;one should indicate words which form the pattern when concatenated in the same order as they appear in the sequence&nbsp;<i>C</i>. The answer is an increasing sequence of numbers of words of the given sequence&nbsp;<i>C</i>, which form the pattern after concatenation. The pattern&nbsp;<i>w</i>&nbsp;and each word in the sequence&nbsp;<i>C</i>&nbsp;consist of at most 150 small letters of English alphabet from &#39;a&#39; to &#39;z&#39; and contain no diacritics. The number of words in the sequence is positive and not greater then 200.</p>

<p>The pattern&nbsp;<code>rytter</code>&nbsp;can be formed from the words of the sequence&nbsp;<i>C</i>&nbsp;=&nbsp;(<code>ry</code>,&nbsp;<code>r</code>,&nbsp;<code>yt</code>,&nbsp;<code>y</code>,&nbsp;<code>tt</code>,&nbsp;<code>t</code>,&nbsp;<code>e</code>,&nbsp;<code>te</code>,&nbsp;<code>r</code>,&nbsp;<code>er</code>) choosing successively and concatenating the words numbered (2, 4, 5, 7, 9). The choice (1, 5, 10) is another way to obtain the same pattern.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the input the following data: the pattern&nbsp;<i>w</i>, the number of words in the sequence&nbsp;<i>C</i>, and successive words of the sequence,</li>
	<li>if there is no way to form the pattern&nbsp;<i>w</i>&nbsp;from the words of the sequence&nbsp;<i>C</i>&nbsp;according to the rules given above, then it writes one word NIE (&quot;no&quot;) in the&nbsp;output,</li>
	<li>if there exist solutions and their number is less then 1000000, then it writes in the&nbsp;output the number of solutions, and then one of the solutions to the task,</li>
	<li>if there are more solutions then 999999, then it writes in the&nbsp;output the number 1000000, and then one of the solutions to the task.</li>
</ul>

### 입력

<ul>
	<li>In the first line of the input there is one word composed of at most 150 small letters of English alphabet. That is the pattern&nbsp;<i>w</i>.</li>
	<li>In the second line there is a positive integer&nbsp;<i>k</i>&nbsp;&lt;=&nbsp;200. That is the number of words of the sequence&nbsp;<i>C</i>.</li>
	<li>In the consecutive&nbsp;<i>k</i>&nbsp;lines there are successive nonempty words composing the sequence&nbsp;<i>C</i>, each word is written in a separate line and consists of at most 150 small letters of English alphabet. The first letter of a word is always the first character in the corresponding line, and just after the last letter there is the end of the line.</li>
</ul>

### 출력

<p>In the output one should write:</p>

<ul>
	<li>either one word NIE, when it is impossible to form the pattern from the words of the sequence&nbsp;<i>C</i>&nbsp;meeting the rules of the task,</li>
	<li>or in the first line - one number being either the number of solutions to the task or 1000000;<br />
	in the following lines - an increasing sequence of numbers of the chosen words from the sequence&nbsp;<i>C</i>&nbsp;which after concatenation form the pattern - each number in a separate line.</li>
</ul>