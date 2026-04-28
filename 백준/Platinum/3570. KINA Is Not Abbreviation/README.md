# [Platinum I] KINA Is Not Abbreviation - 3570

[문제 링크](https://www.acmicpc.net/problem/3570)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 구현, 문자열

### 문제 설명

<p>When introducing new terms consisting of several words, it is useful to use abbreviations. An <em>abbreviation</em> is a word that consists of the first letters of several consecutive words.</p>

<p>An abbreviation is called <em>unambiguous</em> if the following two conditions are satisfied:</p>

<ul>
	<li>It corresponds to exactly one sequence of words in a given text (although this sequence can appear in the text more than once);</li>
	<li>It does not appear in the text by itself.</li>
</ul>

<p>For example, in the text &ldquo;<code>A recursive acronym KINA means &quot;KINA is not abbreviation&quot;</code>&rdquo;, strings &ldquo;<code>ARA</code>&rdquo; and &ldquo;<code>K</code>&rdquo; are unambiguous abbreviations, strings &ldquo;<code>A</code>&rdquo; and &ldquo;<code>KINA</code>&rdquo; are ambiguous abbreviations, and strings &ldquo;<code>RAA</code>&rdquo; and &ldquo;<code>KNA</code>&rdquo; are not abbreviations.</p>

<p>To introduce an abbreviation in a text, it is placed in parentheses right after the sequence of words it corresponds to. Future occurrences of this sequence of words can be replaced by the abbreviation. In the example text above, introduction of the abbreviation &ldquo;<code>K</code>&rdquo; produces the following text: &ldquo;<code>A recursive acronym KINA (K) means &quot;K is not abbreviation&quot;</code>&rdquo;.</p>

<p>If two occurrences of a sequence of words overlap, only one of them can be replaced by the abbreviation. Words in a sequence are separated by one or more non-alphabetic characters. Comparison of words is case-insensitive. For example, &ldquo;<code>i18n</code>&rdquo; is an occurrence of the word sequence &ldquo;<code>I n</code>&rdquo;.</p>

<p>The <em>effectiveness</em> of an abbreviation is the decrease in the number of letters after introduction of this abbreviation. Only letters are taken into account; spaces, parentheses and all other non-alphabetical characters do not count.</p>

<p>Given a text, find an unambiguous abbreviation with the maximum effectiveness.</p>

### 입력

<p>The input file contains a text with at most 4 000 characters. The text contains only characters with ASCII codes 32 (space) to 126 (&ldquo;<code>~</code>&rdquo;), 13 (carriage return), and 10 (line feed).</p>

### 출력

<p>If there is no unambiguous abbreviation with positive effectiveness, then the output file should contain the single number 0.</p>

<p>Otherwise, the first line of the output file should contain the effectiveness of the optimal abbreviation. The second line should contain the unambiguous abbreviation itself. If there are multiple unambiguous abbreviations with the maximum effectiveness, output any one of them.</p>

### 힌트

<p>In the first example, the optimal abbreviations are &ldquo;<code>NA</code>&rdquo; and &ldquo;<code>INA</code>&rdquo;.</p>

<p>In the third example, the optimal abbreviations are &ldquo;<code>JB</code>&rdquo; and &ldquo;<code>BJ</code>&rdquo;.</p>