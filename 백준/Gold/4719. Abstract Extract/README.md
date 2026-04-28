# [Gold II] Abstract Extract - 4719

[문제 링크](https://www.acmicpc.net/problem/4719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 2, 맞힌 사람: 2, 정답 비율: 13.333%

### 분류

구현, 문자열

### 문제 설명

<p>When writing articles, there is usually an abstract section which summarizes the entire article. We are experimenting with an automatic abstract generation algorithm. The algorithm reads in an article and prepares an abstract that summarizes the entire article. The abstract is formed by combining the &ldquo;topic sentences&rdquo; extracted from consecutive paragraphs.</p>

<p>For the purposes of this problem,</p>

<ul>
	<li>An article consists of one or more paragraphs.</li>
	<li>A paragraph is a maximal sequence of non-empty lines.</li>
	<li>A sentence is a maximal sequence of characters within a paragraph that begins with a non- whitespace character, that ends with a &lsquo;.&rsquo; (period), &lsquo;?&rsquo;, or &lsquo;!&rsquo;, and that does not contain any other occurrences of &lsquo;.&rsquo;, &lsquo;?&rsquo;, or &lsquo;!&rsquo;.</li>
	<li>A word is a maximal sequence of alphabetic characters within a sentence.</li>
</ul>

<p>The term maximal in the definitions above is intended to convey the idea that we are only interested in the longest sequences that match the definition, not in any of their subsequences. For example, the sentence &ldquo;How now, brown cow?&rdquo; contains four words. &ldquo;now&rdquo; is a word in this sentence, but &ldquo;no&rdquo;, &ldquo;ow&rdquo;, etc., are not words because they are not maximal &ndash; they are subsequences of a larger sequence of alphabetic characters.</p>

<p>A topic sentence for a paragraph is the single sentence in the paragraph that best describes the paragraph&rsquo;s content. For our purposes, we will select the earliest sentence in the paragraph that maximizes the number of distinct words in S that also occur in any following sentence within the same paragraph.</p>

<p>Paragraphs with fewer than three sentences are ignored and will not contribute to the abstract.</p>

<p>When comparing words for distinctness, changes in upper/lower case are ignored. For example, the sentence &ldquo;See what I see.&rdquo; contains three distinct words, not four.</p>

### 입력

<p>Input will consist of one or more articles. Each article is terminated by a line containing only &ldquo;***&rdquo; or &ldquo;******&rdquo;. The latter string (&ldquo;******&rdquo;) indicates the end of the entire input set.</p>

<ul>
	<li>Each article will contain one or more paragraphs. Each paragraph will consist of one or more non-empty lines, and is terminated by an empty line or by the &ldquo;***&rdquo; or &ldquo;******&rdquo; markers described above.</li>
	<li>No article will be longer than 500 lines; No line will contain more than 150 characters. No word will contain more than 50 characters.</li>
	<li>The only whitespace characters in the input will be blanks (ASCII 32) and line terminators.</li>
</ul>

### 출력

<p>For each document, print the abstract followed by a line containing &ldquo;======&rdquo; (six equal signs).&nbsp;</p>

<p>Each abstract will be formed from the sequence of topic sentences, selected as described above, in the order that they occur in the input document. Each sentence shall be printed exactly as it&nbsp;appears in the input and should be followed by a line break.</p>