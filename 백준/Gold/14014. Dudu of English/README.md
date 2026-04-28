# [Gold IV] Dudu of English - 14014

[문제 링크](https://www.acmicpc.net/problem/14014)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 375, 정답: 70, 맞힌 사람: 47, 정답 비율: 19.028%

### 분류

구현, 문자열, 파싱, 정규 표현식

### 문제 설명

<p><strong>&quot;your uf of library have bugs&quot;</strong>&nbsp;-- Dudu, 2015</p>

<p>Dudu realized that English is a very inefficient language. To address this issue he created his own dialect:&nbsp;<strong>dudu of english</strong>. Here are a couple of examples:</p>

<ul>
	<li>From &quot;The&nbsp;<a href="https://www.hackerrank.com/external_redirect?to=https://en.wikipedia.org/wiki/Disjoint-set_data_structure" target="_blank">Union-Find</a>&nbsp;in your library has bugs!&quot; to &quot;yur uf of lbrary hve bugs&quot;</li>
	<li>From &quot;My professor is funny sometimes.&quot; to &quot;prfessor of funny smtimes&quot;</li>
</ul>

<p>Your job is to write the first translator from English to dudu of english, using the following rules:</p>

<ul>
	<li>All capital letters should be &quot;decapitalized.&quot; dudu of english speakers are humble.</li>
	<li>Prepositions are overrated, and Dudu has realized that certain words are pretty much equivalent. They are called&nbsp;<strong>of-words</strong>, and should be translated simply to &quot;of.&quot; A list of of-words will be given below.</li>
	<li>For Dudu, vowels don&#39;t improve readability. If a word has K vowels, you should remove the first K/2 of them, rounded down. Dudu considers&nbsp;<strong>a</strong>,&nbsp;<strong>e</strong>,&nbsp;<strong>i</strong>,&nbsp;<strong>o</strong>, and&nbsp;<strong>u</strong>&nbsp;to be vowels.</li>
	<li>All punctuation should be removed. Who likes commas anyway?</li>
	<li>All line breaks should be removed from the initial input, and replaced with spaces.</li>
	<li>Any sequence of spaces in the input should be condensed to a single space. Dudu is not wasteful.</li>
	<li>Dudu prefers to read only short lines, but he doesn&#39;t like breaking words either. As you print the output, if a word causes the current line to exceed 20 characters in length (not including spaces), put a line break after it.</li>
</ul>

<p>The rules should be applied in the order specified above. Don&#39;t print any leading spaces (spaces at the beginning of a line).</p>

<p><strong>of-words</strong>&nbsp;are: of, to, into, onto, above, below, from, by, is, at.</p>

<p>Dudu considers any character that isn&#39;t a lowercase or uppercase letter, a space, or a line break to be punctuation.</p>

### 입력

<p>The input will start with an integer N indicating the number of lines to be translated.</p>

<p>The next N lines will contain the text to be translated.</p>

<ul>
	<li>1 &le; N &le; 50</li>
</ul>

<p>The total length of the text to be translated won&#39;t exceed 5000 characters.</p>

### 출력

<p>utput the text of the nput<br />
trnslated of ddu of nglish</p>

### 힌트

<p>ddu of nglish of rdable nough&nbsp;<br />
of not hve xplnation</p>