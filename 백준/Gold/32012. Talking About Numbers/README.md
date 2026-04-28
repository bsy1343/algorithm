# [Gold V] Talking About Numbers - 32012

[문제 링크](https://www.acmicpc.net/problem/32012)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>The programmers of a TTS (text-to-speech) program have discovered that their product does a poor job of reading numbers written in conventional numeric form. Currently, it just announces each digit in the number, one after the other, which gets confusing to the listener after a few digits have gone by.</p>

<p>They would prefer to have a more natural reading of numbers, and one of them has suggested that, if they convert numeric strings into the appropriate text equivalent, e.g., convert &quot;$1023$&quot; into &quot;one thousand and twenty three&quot;, then their speech engine will be able to handle the reading with no further modification.</p>

<p>Write a program to carry out the transformation of non-negative integers into conventional English wording:</p>

<ul>
	<li>English has unique names for the numbers $0$-$19$: &quot;zero&quot;, &quot;one&quot;, &quot;two&quot;, &quot;three&quot;, &quot;four&quot;, &quot;five&quot;, &quot;six&quot;, &quot;seven&quot;, &quot;eight&quot;, &quot;nine&quot;, &quot;ten&quot;, &quot;eleven&quot;, &quot;twelve&quot;, &quot;thirteen&quot;, &quot;fourteen&quot;, &quot;fifteen&quot;, &quot;sixteen&quot;, &quot;seventeen&quot;, &quot;eighteen&quot;, &quot;nineteen&quot;.</li>
	<li>The subsequent multiples of $10$ are named &quot;twenty&quot;, &quot;thirty&quot;, &quot;forty&quot;, &quot;fifty&quot;, &quot;sixty&quot;, &quot;seventy&quot;, &quot;eighty&quot;, &quot;ninety&quot;.</li>
	<li>The combination of one of those multiples of ten with a digit $1$-$9$ is always hyphenated: e.g., $31 \Rightarrow$ &quot;thirty-one&quot;, $77 \Rightarrow$ &quot;seventy-seven&quot;.</li>
	<li>Multiples of $100$ are counted $1$-$9$ and set off from any following non-zero digits by &#39;and&#39;: e.g., $200 \Rightarrow$ &quot;two hundred&quot;, $412 \Rightarrow$ &quot;four hundred and twelve&quot;, $777 \Rightarrow$ &quot;seven hundred and seventy-seven&quot;.</li>
	<li>Thousands and millions are counted off using the above rules to form numbers $1$-$999$, and are set off from any non-zero remainder by a comma: e.g., $1\,253\,101 \Rightarrow$ &quot;one million, two hundred and fifty-three thousand, one hundred and one&quot;.</li>
	<li>If a number with a non-empty thousands or millions component is followed by a remainder of $1$-$99$, then instead of a comma the parts are separated by &quot;and&quot;: e.g., $1\,000\,011 \Rightarrow$ &quot;one million and eleven&quot;, $20\,222\,043 \Rightarrow$ &quot;twenty million, two hundred and twenty-two thousand and forty-three&quot;.</li>
</ul>

### 입력

<p>Input will consist of one or more datasets. Each dataset will consist of a single line containing a non-negative integer in the range $0\ldots 999\,999\,999$. Although we have used commas within digit strings for clarity in this problem description, there will be no commas in the input. There will be no leading zeros on positive input numbers.</p>

<p>A line with a negative value signals the end of input.</p>

### 출력

<p>For each dataset, print a single line containing the spelled-out equivalent of the number, according to the rules above.</p>

<p>Formatting requirements:</p>

<ul>
	<li>The output must be left-justified.</li>
	<li>All alphabetic characters must be in lower-case.</li>
	<li>Exactly one blank must separate adjacent words, except when a hyphen or comma is called for.</li>
	<li>When a comma is used, it must be followed by exactly one blank.</li>
	<li>When a hyphen is used, no blank space appears to either side of the hyphen.</li>
</ul>