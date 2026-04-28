# [Gold III] Regular Expression - 25651

[문제 링크](https://www.acmicpc.net/problem/25651)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 11, 정답 비율: 61.111%

### 분류

문자열, 애드 혹, 정규 표현식

### 문제 설명

<p>Grammy has recently been interested in regular expressions while focusing on cases where the alphabet consists of characters from &#39;<code>a</code>&#39; to &#39;<code>z</code>&#39;. Today she asks NIO some questions. Each question gives string $A$, asking the minimum length of an expression matching string $A$ according to the matching rules, and also the number of such shortest expressions.</p>

<p>To learn detailed rules about how regular expressions match strings, you can refer to <a href="https://en.wikipedia.org/wiki/Regular_expression">https://en.wikipedia.org/wiki/Regular_expression</a>.</p>

<p>Here we only consider characters from &#39;<code>a</code>&#39; to &#39;<code>z</code>&#39; and special characters &#39;<code>.</code>&#39;, &#39;<code>?</code>&#39;, &#39;<code>*</code>&#39;, &#39;<code>+</code>&#39;, &#39;<code>|</code>&#39;, &#39;<code>(</code>&#39;, &#39;<code>)</code>&#39;. It is assumed that the asterisk, the question mark and the plus sign have the highest priority, then follows concatenation and then alternation. Parentheses can be used to change the priority. For example, &quot;<code>a(b|c)</code>&quot; can match &quot;ab&quot; and &quot;ac&quot;. Parentheses may be omitted when they don&#39;t change the priority. For example, &quot;<code>(ab)c</code>&quot; can be written as &quot;<code>abc</code>&quot;, and &quot;<code>a|(b(c*))</code>&quot; can be written as &quot;<code>a|bc*</code>&quot;.</p>

<p>Here are some examples of matching:</p>

<ul>
	<li>(or): &quot;<code>gray|grey</code>&quot; can match &quot;gray&quot; or &quot;grey&quot;.</li>
	<li>(question mark): &quot;<code>colou?r</code>&quot; matches both &quot;color&quot; and &quot;colour&quot;.</li>
	<li>(asterisk): &quot;<code>ab*c</code>&quot; matches &quot;ac&quot;, &quot;abc&quot;, &quot;abbc&quot;, &quot;abbbc&quot;, and so on.</li>
	<li>(plus sign): &quot;<code>ab+c</code>&quot; matches &quot;abc&quot;, &quot;abbc&quot;, &quot;abbbc&quot;, and so on, but not &quot;ac&quot;.</li>
	<li>(wildcard): &quot;<code>a.b</code>&quot; matches any string that contains an &quot;a&quot;, then any single character, and then &quot;b&quot;; and &quot;<code>a.*b</code>&quot; matches any string that contains an &quot;a&quot;, and then the character &quot;b&quot; at some later point. More precisely, &quot;ab&quot; can be matched by &quot;<code>a.*b</code>&quot; but not by &quot;<code>a.b</code>&quot;.</li>
	<li>(concatenation): Consider expression $R =$ &quot;<code>(ab|c)</code>&quot; matching {&quot;ab&quot;, &quot;c&quot;}, and expression $S =$ &quot;<code>(d|ef)</code>&quot; matching {&quot;d&quot;, &quot;ef&quot;}. Then, $(RS) =$ &quot;<code>((ab|c)(d|ef))</code>&quot; matches {&quot;abd&quot;, &quot;abef&quot;, &quot;cd&quot;, &quot;cef&quot;}.</li>
</ul>

### 입력

<p>The input contains only a single case.</p>

<p>The first line contains a single integer $Q$ ($1\leq Q\leq 100\,000$) denoting the number of questions. The $i$-th line of the following $Q$ lines contains one string $A$ consisting of lowercase English letters ($1\leq |A|\leq 200\,000$) denoting the string $A$ of the $i$-th question. It is guaranteed that $\sum |A|\leq 1\,000\,000$.</p>

### 출력

<p>For each question, output a single line containing two integers: the minimum length of a matching expression and the number of matching expressions of such length. Note that the answers may be extremely large, so please print them modulo $998\,244\,353$.</p>