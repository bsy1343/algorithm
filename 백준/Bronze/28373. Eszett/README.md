# [Bronze II] Eszett - 28373

[문제 링크](https://www.acmicpc.net/problem/28373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 237, 정답: 176, 맞힌 사람: 165, 정답 비율: 76.037%

### 분류

구현, 문자열

### 문제 설명

<p>For those trying to learn German, the letter &#39;&szlig;&#39;, called <em>Eszett</em> or <em>sharp S</em>, is usually a source of great confusion. This letter is unique to the German language and it looks similar to a &#39;b&#39; but is pronounced like an &#39;s&#39;.</p>

<p>Adding to the confusion is the fact that, until a few years ago, only a lowercase version of &#39;&szlig;&#39; existed in standard German orthography. Wherever an uppercase &#39;&szlig;&#39; was needed, for example in legal documents and shop signs, it was (and usually still is) replaced by capital double letters &#39;SS&#39;. In 2017, the capital &#39;ẞ&#39; was officially introduced into the German language and may now be used in those scenarios, instead.</p>

<p>Other than being confusing for foreigners, the practice of replacing &#39;&szlig;&#39; with &#39;SS&#39; also introduces some ambiguity because a given uppercase word featuring one or more occurrences of &#39;SS&#39; may correspond to multiple different lowercase words, depending on whether each &#39;SS&#39; is a capitalized &#39;&szlig;&#39; or &#39;ss&#39;.</p>

<p>Given one uppercase word, find all the lowercase words that it could be derived from. As the letter &#39;&szlig;&#39; is not part of the ASCII range, please write an uppercase &#39;B&#39;, instead.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with a string $s$ ($1 \le |s| \le 20$) consisting of uppercase letters.</li>
</ul>

<p>It is guaranteed that the letter <code>S</code> occurs at most three times in $s$. Note that $s$ need not be an actual German word.</p>

### 출력

<p>Output all the possible lowercase strings corresponding to $s$. Any order will be accepted, but each string must occur exactly once.</p>