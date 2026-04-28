# [Silver IV] Shortest Prefixes - 4865

[문제 링크](https://www.acmicpc.net/problem/4865)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 62, 맞힌 사람: 45, 정답 비율: 73.770%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>A prefix of a string is a substring starting at the beginning of the given string. The prefixes of &quot;carbon&quot; are: &quot;c&quot;, &quot;ca&quot;, &quot;car&quot;, &quot;carb&quot;, &quot;carbo&quot;, and &quot;carbon&quot;. Note that the empty string is not considered a prefix in this problem, but every non-empty string is considered to be a prefix of itself. In everyday language, we tend to abbreviate words by prefixes. For example, &quot;carbohydrate&quot; is commonly abbreviated by &quot;carb&quot;. In this problem, given a set of words, you will find for each word the shortest prefix that uniquely identifies the word it represents.</p>

<p>In the sample input below, &quot;carbohydrate&quot; can be abbreviated to &quot;carboh&quot;, but it cannot be abbreviated to &quot;carbo&quot; (or anything shorter) because there are other words in the list that begin with &quot;carbo&quot;.</p>

<p>An exact match will override a prefix match. For example, the prefix &quot;car&quot; matches the given word &quot;car&quot; exactly. Therefore, it is understood without ambiguity that &quot;car&quot; is an abbreviation for &quot;car&quot; , not for &quot;carriage&quot; or any of the other words in the list that begins with &quot;car&quot;.</p>

### 입력

<p>The input file contains at least two, but no more than 1000 lines. Each line contains one word consisting of 1 to 20 lower case letters.&nbsp;The words are unique, so you cannot have &quot;ab&quot; twice in the input.</p>

### 출력

<p>The output file contains the same number of lines as the input file. Each line of the output file contains the word from the corresponding line of the input file, followed by one blank space, and the shortest prefix that uniquely (without ambiguity) identifies this word.</p>