# [Platinum II] Fantastic compression - 18047

[문제 링크](https://www.acmicpc.net/problem/18047)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 23, 맞힌 사람: 21, 정답 비율: 25.610%

### 분류

백트래킹, 브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Franek had one job: to memorize a permutation <em>P</em> of the sequence (1, 2, . . . , <em>n</em>). This, however, proved too boring. Instead, he compressed the numbers in a new, fantastic way he devised: he took a small integer <em>k</em> and memorized only the sums of all connected <em>k</em>-length fragments of <em>P</em>. In other words, Franek now has a sequence <em>S</em> = (<em>S</em><sub>1</sub>, <em>S</em><sub>2</sub>,&nbsp;. . . , <em>S</em><sub><em>n</em>-<em>k</em>+1</sub>), where:</p>

<ul>
	<li><em>S</em><sub>1</sub> = <em>P</em><sub>1</sub> + <em>P</em><sub>2</sub> + . . . + <em>P<sub>k</sub></em>,</li>
	<li><em>S</em><sub>2</sub> = <em>P</em><sub>2</sub> + <em>P</em><sub>3</sub> + . . . + <em>P</em><sub><em>k</em>+1</sub>,</li>
	<li>. . .</li>
	<li><em>S</em><sub><em>n</em>-<em>k</em>+1</sub> = <em>P</em><sub><em>n</em>-<em>k</em>+1</sub> + <em>P</em><sub><em>n</em>-<em>k</em>+2</sub> + . . . + <em>P<sub>n</sub></em>.</li>
</ul>

<p>The method swiftly proved not-so-fantastic, though. First, Franek discovered, to his horror, that sometimes there are several permutations which all compress to the same sequence. Also, he is not sure anymore if he remembered the compressed sequence correctly &ndash; the initial permutation may now be lost forever!</p>

<p>Given a compressed sequence <em>S</em>, help Franek find all permutations <em>P</em> which correspond to <em>S</em>.</p>

### 입력

<p>The first line of input contains the number of test cases <em>z</em> (1 &le; <em>z</em> &le; 1000). The test cases follow, each one in the following format:</p>

<p>The first line of a test case contains the length of the permutation <em>n</em> and the small integer <em>k</em> chosen by Franek (2 &le; <em>n</em> &le; 25 000; 2 &le; <em>k</em> &le; min(<em>n</em>, 6)). The second line contains <em>n</em> &minus; <em>k</em> + 1 integers: the elements of the compressed sequence <em>S</em>&nbsp;(1 &le; <em>S<sub>i</sub></em>&nbsp;&le; 1 000 000).</p>

<p>The total length of permutations in all testcases does not exceed 250 000.</p>

### 출력

<p>For every test case, output first the number <em>c</em> of permutations that correspond to the given sequence <em>S</em>. In the next <em>c</em> lines, output these permutations in lexicographic order. Every permutation should be given as <em>n</em> integers in a single line, separated by spaces.</p>

<p>Assume that for the given tests, <em>c</em> is never greater than 1 000.</p>