# [Silver V] Rhyming Slang - 13527

[문제 링크](https://www.acmicpc.net/problem/13527)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 40, 맞힌 사람: 32, 정답 비율: 82.051%

### 분류

구현, 문자열

### 문제 설명

<p>Rhyming slang involves replacing a common word with a phrase of two or three words, the last&nbsp;of which rhymes with the original word. For example,</p>

<ul>
	<li>replacing the word &ldquo;stairs&rdquo; with the rhyming phrase &ldquo;apples and pears&rdquo;,</li>
	<li>or replacing &ldquo;rotten&rdquo; with the phrase &ldquo;bales of cotton&rdquo;.</li>
</ul>

<p>English has such a wide variety of spellings and pronunciations that for any non-native speaker&nbsp;telling what rhymes isn&rsquo;t always easy. Perhaps you can help?</p>

<p>Typically, two words rhyme (or can be forced to rhyme) if both of their endings can be found on&nbsp;the same list of word endings that sound the same.</p>

<p>Given a common word, a number of lists, each containing word endings that sound the same,&nbsp;and a number of phrases, determine if those phrases could be rhyming slang.</p>

### 입력

<ul>
	<li>One line containing the single common word S (1 &le; |S| &le; 20).</li>
	<li>One line containing an integer E (1 &le; E &le; 10), the number of lists of word endings that&nbsp;sound the same.</li>
	<li>E lines, each no more than 100 characters long. Each a list of space-separated word&nbsp;endings.</li>
	<li>One line containing an integer P (1 &le; P &le; 10), the number of phrases to test.</li>
	<li>P lines, each no more than 100 characters long, containing a phrase p<sub>i</sub> of two or three&nbsp;words that might rhyme with the common word.</li>
</ul>

<p>All words and letters will be in lower case. The common word&rsquo;s ending will appear in at least&nbsp;one ending list.</p>

### 출력

<ul>
	<li>P lines, each consisting of either:
	<ul>
		<li>&rsquo;YES&rsquo;: The phrase p<sub>i</sub> rhymes with the common word.</li>
		<li>&rsquo;NO&rsquo;: The phrase p<sub>i</sub> does not rhyme with the common word.</li>
	</ul>
	</li>
</ul>