# [Gold III] Checkerboard Matrix (Large) - 12215

[문제 링크](https://www.acmicpc.net/problem/12215)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

수학, 애드 혹

### 문제 설명

<p>When she is bored, Mija sometimes likes to play a game with matrices. She tries to transform one matrix into another with the fewest moves. For Mija, one move is swapping any two rows of the matrix or any two columns of the matrix.</p>

<p>Today, Mija has a very special matrix <strong>M</strong>. <strong>M</strong> is a 2<strong>N</strong> by 2<strong>N</strong> matrix where every entry is either a 0 or a 1. Mija decides to try and transform <strong>M</strong> into a <em>checkerboard matrix</em> where the entries alternate between 0 and 1 along each row and column. Can you help Mija find the minimum number of moves to transform <strong>M</strong> into a <em>checkerboard matrix</em>?</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with a line containing a single integer: <strong>N</strong>. The next 2<strong>N</strong> lines each contain 2<strong>N</strong> characters which are the rows of <strong>M</strong>; each character is a 0 or 1.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 10</span><sup style="line-height:1.6em">3</sup><span style="line-height:1.6em">.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of row swaps and column swaps required to turn <strong>M</strong> into a <em>checkerboard matrix</em>. If it is impossible to turn <strong>M</strong> into a checkerboard matrix, y should be &quot;IMPOSSIBLE&quot;.</p>

### 힌트

<p>In the first sample case, <strong>M</strong> is already a <em>checkerboard matrix</em>.</p>

<p>In the second sample case, Mija can turn <strong>M</strong> into a <em>checkerboard matrix</em> by swapping columns 1 and 2 and then swapping rows 1 and 2.</p>

<p>In the third sample case, Mija can never turn <strong>M</strong> into a <em>checkerboard matrix</em>; it doesn&#39;t have enough 1s.</p>