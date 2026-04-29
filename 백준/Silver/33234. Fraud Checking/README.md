# [Silver II] Fraud Checking - 33234

[문제 링크](https://www.acmicpc.net/problem/33234)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

문자열, 자료 구조, 정렬, 파싱, 해시를 사용한 집합과 맵

### 문제 설명

<p>The exam of the First Programming Course (FPC) was a success: all students have passed, with excellent grades! In fact, they have done so well, that it is somewhat suspicious. It is time to do a fraud check, but nobody has time to sift through the hundreds of code submissions manually. Therefore, you have been tasked with finding code submissions that are similar in structure: you should make a fraud report if the only difference between two pieces of code is the renaming of some variables.</p>

<p>More precisely, one piece of code is <em>similar</em> to another when it is possible to make the two pieces of code identical to each other by processing a sequence of word replacements. When, after processing all word replacements, the first piece of code is identical to the second piece of code, and this also applies vice versa, then the two pieces of code are similar.</p>

<p>Each word replacement should replace <em>all</em> occurrences of a word. A word replacement can only replace a <em>complete</em> word. Spaces between words or at the start/end of a line should be ignored, but newlines cannot be ignored: for two pieces of code to be similar, each line of the first piece should have the same number of words as the same line in the second piece.</p>

<p>Given two pieces of code, check whether they <em>similar</em>. If they are similar, print a fraud report that gives the sorted list of word replacements.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with one integer $n$ ($1\leq n\leq 1000$), the number of lines of each code submission.</li>
	<li>$n$ lines of code for the first submission.</li>
	<li>$n$ lines of code for the second submission.</li>
</ul>

<p>The lines of code consist of only spaces ('<code> </code>'), letters from the English alphabet ('<code>A-Z</code>' and '<code>a-z</code>'), numbers ('<code>0-9</code>'), and underscores ('<code>\_</code>'). The lines of code are at least $1$ and at most $120$ characters long, excluding the newline character.</p>

### 출력

<p>If the two pieces of code are not similar, output "<code>-1</code>".</p>

<p>If the two pieces of code are similar, output:</p>

<ul>
	<li>A line containing a non-negative number $r$, indicating the number of word replacements.</li>
	<li>$r$ lines, each containing a word replacement. A word replacement consists of two words, separated by a space. The list should be lexicographically ordered by ASCII values.</li>
</ul>