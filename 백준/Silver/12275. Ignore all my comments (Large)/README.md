# [Silver I] Ignore all my comments (Large) - 12275

[문제 링크](https://www.acmicpc.net/problem/12275)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 42, 맞힌 사람: 36, 정답 비율: 70.588%

### 분류

구현, 자료 구조, 문자열, 스택

### 문제 설명

<p>Good programmers write fabulous comments. Igor is a programmer and he likes the old C-style comments in&nbsp;<b><code>/* ... */</code></b>&nbsp;blocks. For him, it would be ideal if he could use this style as a uniform comment format for all programming languages or even documents, for example Python, Haskell or HTML/XML documents.</p>

<p>Making this happen doesn&#39;t seem too difficult to Igor. What he will need is a comment pre-processor that removes all the comment blocks in&nbsp;<b><code>/*</code></b>, followed by comment text, and by another&nbsp;<b><code>*/</code></b>. Then the processed text can be handed over to the compiler/document renderer to which it belongs&mdash;whatever it is.</p>

<p>Igor&#39;s pre-processor isn&#39;t quite that simple, though. Here are some cool things it does:</p>

<ul>
	<li>The comments the pre-processor reads can be nested the same way brackets are nested in most programming languages. It&#39;s possible to have comments inside comments. For example, the following code block has an outer level of comments that should be removed by the comment pre-processor. The block contains two inner comments.
	<pre>
printf(&quot;Hello /* a comment /* a comment inside comment */ 
        inside /* another comment inside comment */ 
        string */ world&quot;);
</pre>
	After the pre-process step, it becomes:

	<pre>
printf(&quot;Hello  world&quot;);
</pre>
	</li>
	<li>Igor recognizes comments can appear anywhere in the text, including inside a string&nbsp;<code>&quot;/*...*/&quot;</code>, a constant number&nbsp;<code>12/*...*/34</code>&nbsp;or even in a character escape&nbsp;<code>\/*...*/n</code>
	<p>Or more formally:</p>

	<pre>
text:
  text-piece
  text-piece remaining-text
text-piece:
  char-sequence-without-/*
  empty-string
remaining-text:
  comment-block text

comment-block:
  /* comment-content */
comment-content:
  comment-piece
  comment-piece remaining-comment
comment-piece:
  char-sequence-without-/*-or-*/
  empty-string
remaining-comment:
  comment-block comment-content

char:
  letters
  digits
  punctuations
  whitespaces
</pre>
	</li>
</ul>

<p>Our pre-processor, given a&nbsp;<code><b>text</b></code>, removes all&nbsp;<code><b>comment-block</b></code>&nbsp;instances as specified.</p>

### 입력

<p>A text document with comment blocks in&nbsp;<b><code>/*</code></b>&nbsp;and&nbsp;<b><code>*/</code></b>. The input file is valid. It follows the specification of&nbsp;<b><code>text</code></b>&nbsp;in the problem statement. The input file always terminates with a newline symbol.</p>

### 출력

<p>We only have one test case for this problem. First we need to output the following line.</p>

<pre>
Case #1:
</pre>

<p>Then, print the document with all comments removed, in the way specified in the problem statements. Don&#39;t remove any spaces or empty lines outside comments.</p>

### 제한

<p>The large input contains a program of less than 100k bytes.</p>

<p>The input program contains only:</p>

<ul>
	<li>Letters:&nbsp;<code>a-z, A-Z,</code></li>
	<li>Digits:&nbsp;<code>0-9</code></li>
	<li>Punctuation:&nbsp;<code>~ ! @ # % ^ &amp; * ( ) - + = : ; &quot; &#39; &lt; &gt; , . ? | / \ { } [ ] _</code></li>
	<li>Whitespace characters: space, newline</li>
</ul>

### 힌트

<ul>
	<li>Igor only needs to remove the comment in one pass. He doesn&#39;t remove additional comment blocks created as a result of the removal of any comment block. For example:
	<pre>
//*no recursion*/* file header */</pre>
	should generate:

	<pre>
/* file header */</pre>
	</li>
	<li>The&nbsp;<b><code>*</code></b>&nbsp;character in any&nbsp;<b><code>/*</code></b>&nbsp;or&nbsp;<b><code>/*</code></b>cannot be re-used in another&nbsp;<b><code>/*</code></b>&nbsp;or&nbsp;<b><code>*/</code></b>. For example the following does&nbsp;<b>NOT</b>&nbsp;form a proper comment block
	<pre>
/*/
</pre>
	</li>
</ul>