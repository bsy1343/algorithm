# [Gold II] Instruens Fabulam - 4663

[문제 링크](https://www.acmicpc.net/problem/4663)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>Instruens Fabulam means drawing a chart (or table) in Latin. That&#39;s what you will do for this problem..</p>

### 입력

<p>The input consists of one or more table descriptions, followed by a line whose first character is &#39;*&#39;, which signals the end of the file. Each description begins with a header line containing one or more characters that define the number and alignment of columns in the table. Each character in the header line is either &#39;&lt;&#39;, &#39;=&#39;, or &#39;&gt;&#39;, and indicates a left-justified, centered, or right-justified column. Following the header are at least two and at most 21 data lines that contain the entries for each row. Each data line consists of one or more nonempty entries separated by an ampersand (&#39;&amp;&#39;), where the number of entries is equal to the number of columns defined in the header line. The first data line contains entries for the column titles, and the remaining data lines contain entries for the body of the table. Spaces may appear within an entry, but never at the beginning or end of an entry. The characters &#39;&lt;&#39;, &#39;=&#39;, &#39;&gt;&#39;, &#39;&amp;&#39;, and &#39;*&#39; will not appear in the input except where indicated above.</p>

### 출력

<p>For each table description, output the table using the exact format shown in the examples. Note that</p>

<ul>
	<li>The total width of the table will never exceed 79 characters (not counting end-of-line).</li>
	<li>Dashes (&#39;-&#39;) are used to draw horizontal lines, not underscores (&#39;_&#39;). &#39;At&#39; signs (&#39;@&#39;) appear at each of the four outer corners. Plus signs (&#39;+&#39;) appear at intersections within the line separating the title from the body.</li>
	<li>The largest entry in a column is always separated from the enclosing bars (&#39;|&#39;) by exactly one space.</li>
	<li>If a centered entry cannot be exactly centered within a column, the extra space goes on the right of the entry.</li>
</ul>

<p>Input and correct output files satisfy all the requirements listed in Notes to Teams, except that the output may contain two or more consecutive spaces. There are no spaces at the beginning or end of lines, and only spaces are used (never tabs).</p>