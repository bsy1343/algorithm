# [Silver II] Nimionese - 11488

[문제 링크](https://www.acmicpc.net/problem/11488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 62, 정답: 46, 맞힌 사람: 34, 정답 비율: 79.070%

### 분류

구현, 파싱, 시뮬레이션, 문자열

### 문제 설명

<p>Nimions speak a funny form of language.</p>

<p>Whichever word they are trying to say, from which ever language, it doesn&rsquo;t quite come out the same. There are several rules for converting words, from any language, to nimionese.</p>

<p>For any word:</p>

<ul>
	<li>All nimion words start with &lsquo;hard&rsquo; consonants &mdash; [b, c, d, g, k, n, p, t], so you must replace each first letter with the nearest one (choose the option nearest to &lsquo;A&rsquo; if there is a tie).
	<ul>
		<li>&ldquo;Each&rdquo; becomes &ldquo;Dach&rdquo;.</li>
	</ul>
	</li>
	<li>Any hard consonant in subsequent syllables after the first one is remarkably better if it is replaced with the same consonant as the one at the start of the word.
	<ul>
		<li>&ldquo;Hip-po&rdquo; becomes &ldquo;Gip-go&rdquo;.</li>
	</ul>
	</li>
	<li>No word ends in a hard consonant. You must add an &lsquo;ah&rsquo;, &lsquo;oh&rsquo; or &lsquo;uh&rsquo; at the end, whichever is nearest, rounding toward &lsquo;A&rsquo; in the case of a tie, to the last hard consonant in the word.
	<ul>
		<li>&ldquo;Dog&rdquo; becomes &ldquo;Dogah&rdquo;</li>
		<li>&ldquo;Hip&rdquo; becomes &ldquo;Gipoh&rdquo;.</li>
	</ul>
	</li>
</ul>

### 입력

<p>The only line of input contains a sentence of between 1 and 50 words and up to 10<sup>4</sup> symbols, including single whitespace characters (&lsquo; &rsquo;) between words and the dashes (&lsquo;-&rsquo;) between each syllable.</p>

<p>Apart from dashes, the sentence will contain solely lower-and-upper-case Latin letters &mdash; and only the first letters of words can be upper-case.</p>

### 출력

<p>Write to standard output the same sentence from the input, translated to nimionese. Remove any dashes before printing.</p>

<p>It is guaranteed that the output will fit within 5 &middot; 10<sup>4</sup> characters</p>