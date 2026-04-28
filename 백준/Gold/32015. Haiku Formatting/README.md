# [Gold III] Haiku Formatting - 32015

[문제 링크](https://www.acmicpc.net/problem/32015)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

많은 조건 분기, 구현, 문자열

### 문제 설명

<p>A haiku is a three-line poem in which the first and third lines contain $5$ syllables each, and the second line contains $7$ syllables.</p>

<p>An example of a haiku is:</p>

<pre>
Blue Ridge mountain road.
Leaves, glowing in autumn sun,
fall in Virginia.</pre>

<p>Write a program to examine a line of English text and and attempt to render it as a haiku. This will require counting the syllables in the words of the text, which should be done according to the following rules:</p>

<ul>
	<li>
	<p>A word consists of a non-empty, maximal string of zero or more alphabetic characters (upper and/or lower-case) followed by zero or more non-blank, non-alphabetic characters.</p>

	<ul>
		<li>
		<p>Upper/lower case distinctions are ignored for the purpose of counting syllables, but must be retained in the final output.</p>
		</li>
		<li>
		<p>Non-alphabetic characters are ignored for the purpose of counting syllables, but must be retained in the final output.</p>
		</li>
	</ul>
	</li>
	<li>
	<p>The characters &#39;A&#39;, &#39;E&#39;, &#39;I&#39;, &#39;O&#39;, &#39;U&#39;, and &#39;Y&#39; are vowels. All other alphabetic characters are consonants.</p>

	<p>Exceptions to this rule:</p>

	<ul>
		<li>
		<p>The character sequence &quot;QU&quot; is considered to be a single consonant.</p>
		</li>
		<li>
		<p>The letter &#39;Y&#39; is considered to be a consonant if it is immediately followed by one of the other vowels.</p>
		</li>
	</ul>
	</li>
	<li>
	<p>Every word has at least one syllable.</p>

	<p>For example, &quot;Fly&quot;,&quot;I&quot;, &quot;!?&quot;, and &quot;Ssshhh!&quot; are words of one syllable.</p>
	</li>
	<li>
	<p>Each (maximal) string of one or more consonants with at least one vowel to either side indicates a division into separate syllables.</p>

	<p>For example, &quot;strong&quot; has one syllable, &quot;stronger&quot; has $2$, and &quot;bookkeeper&quot; has $3$. &quot;player&quot; has two syllables (because the &#39;y&#39;, being followed by an &#39;e&#39;, is considered a consonant).</p>

	<p>Exceptions to this rule are:</p>

	<ul>
		<li>
		<p>An &#39;E&#39; appearing as the last alphabetic character in a word is silent and should be ignored unless the next-to-last alphabetic character is an &#39;L&#39; and the character immediately before that is another consonant.</p>

		<p>For example, &quot;cake&quot;, &quot;ale&quot; and &quot;pale&quot; have one syllable. &quot;able&quot; has two.</p>
		</li>
		<li>
		<p>An &#39;ES&#39; sequence at the end of the alphabetic sequence in a word does not add a syllable unless immediately preceded by two or more consonants.</p>

		<p>For example, &quot;ales&quot; and &quot;pales&quot; have one syllable. &quot;witches&quot; and &quot;verses&quot; have two.</p>
		</li>
	</ul>
	</li>
</ul>

### 입력

<p>Input will consist of a single line of text consisting of a sequence of one or more words (as defined above) separated by single blanks.</p>

<p>The total line length will not exceed $200$ characters.</p>

### 출력

<p>If the words in the input line can be divided into a haiku, then print the haiku as three lines of output.</p>

<ul>
	<li>Each line should be left-justified.</li>
	<li>A single space should separate each pair of words within a line.</li>
	<li>Upper/lower casing from the input should be preserved.</li>
	<li>Non-alphabetic characters terminating each word should be preserved.</li>
	<li>A word cannot be split across multiple lines.</li>
</ul>

<p>If the words in the input cannot be divided into a haiku, print the line of input with no changes.</p>