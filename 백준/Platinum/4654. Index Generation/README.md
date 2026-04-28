# [Platinum V] Index Generation - 4654

[문제 링크](https://www.acmicpc.net/problem/4654)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

구현, 문자열, 정렬, 파싱

### 문제 설명

<p>Most nonfiction and reference books have an index to help readers find references to specific terms or concepts in the text. Here is a sample index.</p>

<p style="margin-left:40px">larch, 4, 237, 238, 414<br />
+ Monty Python and, 64, 65, 66<br />
+ planting of, 17<br />
Lenny Kravitz, 50<br />
+ going his way, 53<br />
lumbago, 107<br />
mango<br />
+ Chris Kattan, 380<br />
+ storage of, 87, 90<br />
+ use in Nethack, 500, 501<br />
+ Vitamin C content, 192</p>

<p>Each index entry contains a primary entry followed by zero or more secondary entries, which begin with a &#39;+&#39;. Entries will normally be followed by a list of page references, but a primary entry might not be if at least one secondary entry is present (as is the case with mango, above). Primary entries are sorted, and secondary entries following a primary entry are also sorted. Sorting is case-insensitive. Page references for an entry are in ascending order and do not include duplicates. (A duplicate could occur if there are two or more identical entries on the same page.)</p>

<p>Your task is to read a document that has index information embedded within it and produce the index. Documents consist of one or more lines of ASCII text. The page number starts at 1, and the character &#39;&amp;&#39; indicates the start of a new page (which adds 1 to the current page number). Index entries are indicated by a marker, which in its most elaborate form has the following syntax:</p>

<p style="margin-left:40px">{text%primary\$secondary}</p>

<p>Here text is the text to be indexed, primary is an alternative primary entry, and secondary is a secondary entry. Both &#39;%primary&#39; and &#39;\$secondary&#39; are optional, but if both are present they must appear in the order given. If primary is present then it is used as the primary entry, and if not then text is used as the primary entry. If secondary is present then the marker adds a page reference for that secondary entry; otherwise it adds a page reference for the primary entry. A single marker cannot add a page reference for both a primary and secondary entry. Here are examples of each of the four possible types of marker, which correspond to four of the entries in the sample index above.</p>

<p style="margin-left:40px">... his {lumbago} was acting up, so ...<br />
... {Lenny%Lenny Kravitz} lit up the crowd with his version of ...<br />
... Monty Python often used the {larch\$Monty Python and} in ...<br />
... when storing {mangos%mango\$storage of}, be sure to ...</p>

### 입력

<p>The input consists of one or more documents, followed by a line containing only &#39;**&#39; that signals the end of the input. Documents are implictly numbered starting with 1. Each document consists of one or more lines of text followed by a line containing only &#39;*&#39;. Each line of text will be at most 79 characters long, not counting end-of-line characters.</p>

### 출력

<p>For document i, output the line &#39;DOCUMENT i&#39; followed by the sorted index using the exact output format shown in the examples.</p>

### 힌트

<p>Be sure to read Notes to Teams, which has general formatting guidelines that pertain to all problem input files, including this one. Also note:</p>

<ul>
	<li>A document will contain at most 100 markers, with at most 20 primary entries.</li>
	<li>A primary entry will have at most 5 secondary entries.</li>
	<li>An entry will have at most 10 unique page references (not including duplicates).</li>
	<li>The character &#39;&amp;&#39; will not appear anywhere within a marker, and will appear at most 500 times within a document.</li>
	<li>The character &#39;*&#39; is used only to signal the end of a document or the end of the input.</li>
	<li>The characters &#39;{&#39;, &#39;}&#39;, &#39;%&#39;, and &#39;\$&#39; will only be used to define markers, and will not appear in any text or entries.</li>
	<li>A marker may span one or more lines. Every end-of-line within a marker must be converted to a single space.</li>
	<li>A space within a marker (including a converted end-of-line) is normally included in the text/entry, just like any other character. However, any space that immediately follows &#39;{&#39;, immediately precedes &#39;}&#39;, or is immediately adjacent to &#39;%&#39; or &#39;\$&#39; must be ignored.</li>
	<li>The total length of a marker, measured from the opening &#39;{&#39; to the closing &#39;}&#39;, and in which all embedded end-of-lines are converted to spaces, will be at most 79 characters.</li>
</ul>