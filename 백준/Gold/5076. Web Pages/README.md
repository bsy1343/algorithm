# [Gold IV] Web Pages - 5076

[문제 링크](https://www.acmicpc.net/problem/5076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1245, 정답: 547, 맞힌 사람: 422, 정답 비율: 43.685%

### 분류

자료 구조, 문자열, 파싱, 스택

### 문제 설명

<p>You probably know about HTML, the mark up language used to create Web pages. HTML code contains a number of tags which are expected to follow certain rules.</p>

<p>In this problem we will be concerned with two of these rules:</p>

<ol>
	<li>Every opening tag has to have a corresponding closing tag</li>
	<li>All tags must be properly nested.</li>
</ol>

<p>Tags are marked by angled brackets which contain a keyword, such as <code>&lt;body&gt;</code> or <code>&lt;strong&gt;</code>. These are opening tags, the corresponding closing tags having <code>/</code> before the keyword, ie <code>&lt;/body&gt;</code> and <code>&lt;/strong&gt;</code>. It is possible for a tag to be both opening and closing, such as <code>&lt;br /&gt;</code>, which complies with rule 1.</p>

<p>To be properly nested, if a tag is opened inside another tag, it must be closed before the other tag closes. For example</p>

<ul>
	<li><code>&lt;body&gt; &lt;strong&gt; &lt;/strong&gt; &lt;/body&gt;</code> is properly nested</li>
	<li><code>&lt;body&gt; &lt;strong&gt; &lt;/body&gt; &lt;/strong&gt;</code> is not, and breaks rule 2.</li>
</ul>

<p>If there are no tags present, the text complies with both rules.</p>

<p>Attributes may be present within an opening tag, such as</p>

<p><code>&lt;a href=&quot;http://www.nzprogcontest.org.nz&quot;&gt;This is a link&lt;/a&gt;</code></p>

<p>The closing tag has only to match the keyword, not the attributes.</p>

### 입력

<p>Input will consist of a number of lines of HTML code, each line containing from 0 to 255 characters. The last line will contain a single # character &ndash; do not process this line. Within the text of each line will be zero or more tags. No angle bracket will be present unless it is part of a properly formed tag.</p>

<p>Determine whether or not the HTML meets the rules specified above.</p>

### 출력

<p>Output will consist of a single line for each line of input. The line will contain either the word legal, or the word illegal.</p>