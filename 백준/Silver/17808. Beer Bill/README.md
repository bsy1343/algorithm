# [Silver V] Beer Bill - 17808

[문제 링크](https://www.acmicpc.net/problem/17808)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 37, 맞힌 사람: 31, 정답 비율: 46.970%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Pub bills were introduced into daily life long before computers even existed. People tend to think that once a bill has been paid, it is no more than a pathetic paper scrap not worthy of any more attention. The fact, completely overlooked by established computer science streams, is that the scribblings on the bill represent highly formalized and often quite nontrivial text suitable for many formal language applications and analyses.</p>

<p>A bill consists of lines of characters. Each line is either a priced line or a rake line. A priced line begins with a positive integer &mdash; the price of a food or drink item &mdash; which is optionally followed by some number of vertical bars. The price of the line is calculated as follows: If the bars are present, the price of the line is equal to the item price multiplied by the number of bars. Otherwise, the price of the line is equal to the price of the item. A rake line contains only vertical bars (similar to rake dents, hence the name rake line), each bar stands for one beer bought by the bill holder. The price of the rake line is the price of one beer multiplied by the number of the bars on the line. The beer price, in this problem, is equal to 42 monetary units. The bill total is the total of prices of all lines on the bill.</p>

<p>We present you with a formal definition of the so-called Raked bill language, as far as we know, the first of its kind in the whole history of computer science. The bills in this problem are expressed in the Raked bill language.</p>

<pre>
&lt;BILL&gt;        ::=  &lt;LINE&gt; | &lt;LINE&gt;&lt;BILL&gt;
&lt;LINE&gt;        ::=  &lt;PRICED_LINE&gt;&lt;line_break&gt; | &lt;RAKE_LINE&gt;&lt;line_break&gt;
&lt;PRICED_LINE&gt; ::=  &lt;PRICE_SPEC&gt; | &lt;PRICE_SPEC&gt;&lt;RAKE&gt;
&lt;RAKE_LINE&gt;   ::=  &lt;RAKE&gt;
&lt;PRICE_SPEC&gt;  ::=  &lt;PUB_INTEGER&gt;&lt;comma&gt;&lt;hyphen&gt;
&lt;RAKE&gt;        ::=  &lt;rake_dent&gt; | &lt;rake_dent&gt;&lt;RAKE&gt;
&lt;PUB_INTEGER&gt; ::=  &lt;dig_1_9&gt; | &lt;dig_1_9&gt;&lt;DIG_SEQ&gt;
&lt;DIG_SEQ&gt;     ::=  &lt;dig_0_9&gt; | &lt;dig_0_9&gt;&lt;DIG_SEQ&gt;
&lt;dig_1_9&gt;     ::=  &#39;1&#39; | &#39;2&#39; | &#39;3&#39; | &#39;4&#39; | &#39;5&#39; | &#39;6&#39; | &#39;7&#39; | &#39;8&#39; | &#39;9&#39;
&lt;dig_0_9&gt;     ::=  &#39;0&#39; | &lt;dig_1_9&gt;
&lt;rake_dent&gt;   ::=  &#39;|&#39; // ascii character 124
&lt;comma&gt;       ::=  &#39;,&#39; // ascii character 44
&lt;hyphen&gt;      ::=  &#39;-&#39; // ascii character 45
&lt;line_break&gt;  ::=  LF // ascii character 10, line feed</pre>

<p>In the language specification above, the actual characters which appear on the bill are enclosed in single quotation marks to distinguish them from the other parts of the specification. The symbol // introduces a single line comment, it is not part of the language definition.</p>

### 입력

<p>The input contains a nonempty sequence of lines which specify a bill. Each input line is either a priced line or a rake line. A priced line starts with a positive integer, not exceeding 1 000, followed immediately by a comma and a minus sign. Optionally, the minus sign is followed by a nonzero number of vertical bars. A rake line contains nonzero number of vertical bars and no other symbols. In the whole bill, the vertical bar is represented as &rsquo;|&rsquo;, ascii character 124. Each line contains at most 1 000 characters, there are no blanks on the line. There are at most 1 000 input lines. The input does not contain any empty line. All prices are expressed in the same monetary units.</p>

### 출력

<p>Output a single number &mdash; the bill total rounded up to the nearest 10s. The number should be in the format, that is, it should be immediately followed by a comma and a minus sign.</p>