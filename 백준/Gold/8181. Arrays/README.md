# [Gold II] Arrays - 8181

[문제 링크](https://www.acmicpc.net/problem/8181)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 191, 정답: 65, 맞힌 사람: 36, 정답 비율: 27.907%

### 분류

자료 구조, 정렬, 애드 혹, 집합과 맵

### 문제 설명

<p>Let us consider an array of size n x m filled with pairwise different integers. The following operations are allowed on the array:</p>

<ol>
	<li>interchanging two rows,</li>
	<li>interchanging two columns.</li>
</ol>

<p>We call two arrays alike if one of them can be obtained from the other by a sequence of aforementioned operations.</p>

<p>Write a programme that for a given set of pairs of arrays tells which pairs are alike.</p>

### 입력

<p>The first line of the standard input contains one integer t (1 &le; t &le; 10) denoting the number of pairs of arrays. Then descriptions of successive array pairs follow in subsequent lines.</p>

<p>Each description starts with a line holding two integers n and m (1 &le; n,m &le; 1,000), separated by a single space, that denote the common number of rows and columns of the arrays, respectively.</p>

<p>The n lines that follow describe the first array. In the i-th of them there are m integers &nbsp;a<sub>ij</sub> (-1,000,000 &le; a<sub>ij</sub> &le; 1,000,000), separated by single spaces, that denote the numbers in the -th row of the first array.</p>

<p>The next n lines describe the second array. In the i-th of them there are m integers b<sub>ij</sub> (-1,000,000 &le; b<sub>ij</sub>&nbsp;&le; 1,000,000), separated by single spaces, that denote the numbers in the i-th row of the second array.</p>

<p>All the numbers occuring in either of the arrays are pairwise different.</p>

### 출력

<p>Your programme should print out t lines to the standard output. The k-th of these should hold one word: &quot;TAK&quot; (yes in Polish) if the arrays of the k-th pair are alike, or &quot;NIE&quot; (no in Polish) otherwise.</p>

<p>&nbsp;</p>

### 힌트

<p>The arrays forming the first pair are alike. To transform the first array into the other, it is enough to interchange the first two columns, and then the first row with last one and the second row with the third one.</p>

<p>The arrays forming the second pair are not alike. To see this, note that the sets of values in their cells are different.</p>