# [Platinum III] Glossary Arrangement - 23773

[문제 링크](https://www.acmicpc.net/problem/23773)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 41, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

구현, 다이나믹 프로그래밍, 문자열, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>In Unix based operating systems, one of the most frequently used commands is <code>ls</code>, which displays a list of all the files in a directory in lexicographic order. In the most basic form, <code>ls</code> prints each filename on a separate line, but to improve readability and save screen space, the list is usually split into multiple columns which are displayed side by side.</p>

<p>A friend of yours is writing a book about NWERC and has put you in charge of editing the glossary of relevant terms at the end of each chapter. Each glossary must use the same multi-column layout as <code>ls</code>, so you decided to go for the lazy option: For each word in the glossary, you created an empty file with that name, and simply let <code>ls</code> do the heavy lifting.</p>

<p>Unfortunately, your friend is not satisfied with your layouts and complains that some of them take up too much vertical space. The problem with your approach is that <code>ls</code> always forms columns of equal height, except for the last column, which may be shorter. This sometimes ends up using more lines than would be needed if the column heights could be chosen more freely:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23773.%E2%80%85Glossary%E2%80%85Arrangement/dfe9e18f.png" data-original-src="https://upload.acmicpc.net/777ce3b9-f1e1-49ec-8623-3529f40e8f70/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 381px; height: 100px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Saving two lines using variable column heights.</p>

<p>Begrudgingly, you decide to write your own improved version of <code>ls</code>, <code>ls--</code>, that also displays the contents of a directory in lexicographic order, but uses variable column heights to always achieve the lowest possible number of lines.</p>

<p>Columns have a fixed width, which is the length of the longest filename within the column, and are separated by a single space. The names in each column must be left-aligned and padded to the column width using spaces. Also, the terminal you are using has a fixed width of $w$ characters which the table may not exceed.</p>

<p>Given the contents of a directory as a list of filenames, find an optimal column layout that minimizes the number of lines needed to print the entire list.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $w$ ($1 \le n,w \le 5\,000$), the number of files and the width of the terminal.</li>
	<li>$n$ lines, each with one filename $s$ ($1 \le |s| \le w$, $s$ consists of lowercase English letters).</li>
</ul>

<p>The filenames are distinct and in lexicographic order. The total number of letters is at most $10^6$.</p>

### 출력

<p>Output an optimal way of listing the given filenames: \begin{itemize}</p>

<ul>
	<li>One line with two integers $r$ and $c$, the number of lines and the number of columns used.</li>
	<li>One line with $c$ positive integers $a_1, a_2, \ldots, a_c$, the widths of the columns.</li>
	<li>The table of filenames, subject to the following formatting:
	<ul>
		<li>There are $c$ columns, where column $i$ has width $a_i$ for each $i$, and within each column there are at most $r$ filenames that are aligned on the left and grouped at the top.</li>
		<li>The filenames are aligned using spaces, with exactly one space between columns.</li>
		<li>The total width of the table is at most $w$.</li>
		<li>When reading column by column, the filenames appear in lexicographic order.</li>
	</ul>
	</li>
</ul>

<p>Note that unlike in other problems, you strictly need to follow the above formatting rules for whitespace. However, we still allow trailing whitespace at the end of each line, even if this whitespace exceeds the width $w$.</p>