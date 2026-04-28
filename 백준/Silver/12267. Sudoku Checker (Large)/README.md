# [Silver III] Sudoku Checker (Large) - 12267

[문제 링크](https://www.acmicpc.net/problem/12267)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 181, 정답: 130, 맞힌 사람: 120, 정답 비율: 70.588%

### 분류

구현

### 문제 설명

<p><strong>Sudoku</strong> is a popular single player game. The objective is to fill a 9x9 matrix with digits so that each column, each row, and all 9 non-overlapping 3x3 sub-matrices contain all of the digits from 1 through 9. Each 9x9 matrix is partially completed at the start of game play and typically has a unique solution.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12267.%E2%80%85Sudoku%E2%80%85Checker%E2%80%85(Large)/ee0eb329.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12266/images-59.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:250px; width:250px" /></p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12267.%E2%80%85Sudoku%E2%80%85Checker%E2%80%85(Large)/cf9e4a48.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12266/images-60.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:250px; width:250px" /></p>

<p>Given a completed <strong>N</strong><strong><sup>2</sup></strong>x<strong>N</strong><strong><sup>2</sup></strong> Sudoku matrix, your task is to determine whether it is a <em>valid</em> solution. A <em>valid</em> solution must satisfy the following criteria:</p>

<ul>
	<li>Each row contains each number from <strong>1</strong> to <strong>N</strong><strong><sup>2</sup></strong>, once each.</li>
	<li>Each column contains each number from <strong>1</strong> to <strong>N</strong><strong><sup>2</sup></strong>, once each.</li>
	<li>Divide the <strong>N</strong><strong><sup>2</sup></strong>x<strong>N</strong><strong><sup>2</sup></strong> matrix into <strong>N</strong><strong><sup>2</sup></strong> non-overlapping <strong>N</strong>x<strong>N</strong> sub-matrices. Each sub-matrix contains each number from <strong>1</strong> to <strong>N</strong><strong><sup>2</sup></strong>, once each.</li>
</ul>

<p>You don&#39;t need to worry about the uniqueness of the problem. Just check if the given matrix is a valid solution.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with an integer <strong>N</strong>. The next <strong>N</strong><strong><sup>2</sup></strong> lines describe a completed Sudoku solution, with each line contains exactly <strong>N</strong><strong><sup>2</sup></strong> integers. All input integers are positive and less than 1000.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">3 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 6.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is &quot;Yes&quot; (quotes for clarity only) if it is a valid solution, or &quot;No&quot; (quotes for clarity only) if it is invalid. Note that the judge is case-sensitive, so answers of &quot;yes&quot; and &quot;no&quot; will not be accepted.</p>