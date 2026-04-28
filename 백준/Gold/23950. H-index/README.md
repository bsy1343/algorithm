# [Gold IV] H-index - 23950

[문제 링크](https://www.acmicpc.net/problem/23950)

### 성능 요약

시간 제한: 50 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 68, 맞힌 사람: 49, 정답 비율: 71.014%

### 분류

자료 구조, 애드 혹, 우선순위 큐

### 문제 설명

<p>It is important for researchers to write many high quality academic papers. Jorge has recently discovered a way to measure how impactful a researcher&#39;s papers are: the&nbsp;<a href="https://en.wikipedia.org/wiki/H-index" target="_blank">H-index</a>.</p>

<p>The&nbsp;<i>H-index score</i>&nbsp;of a researcher is the largest integer h such that the researcher has h papers with at least h citations each.</p>

<p>Jorge has written&nbsp;<b>N</b>&nbsp;papers in his lifetime. The i-th paper has&nbsp;<b>A<sub>i</sub></b>&nbsp;citations. The number of citations that each paper has will never change after it is written. Please help Jorge determine his H-index score after each paper he wrote.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing&nbsp;<b>N</b>, the number of papers Jorge wrote.</p>

<p>The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>A<sub>i</sub></b>, the number of citations the i-th paper has.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a space-separated list of integers. The i-th integer is the H-index score after Jorge wrote his i-th paper.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>5</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, Jorge wrote&nbsp;<b>N</b>&nbsp;= 3 papers.</p>

<ul>
	<li>After the 1st paper, Jorge&#39;s H-index score is 1, since he has 1 paper with at least 1 citation.</li>
	<li>After the 2nd paper, Jorge&#39;s H-index score is still 1.</li>
	<li>After the 3rd paper, Jorge&#39;s H-index score is 2, since he has 2 papers with at least 2 citations (the 1st and 3rd papers).</li>
</ul>

<p>In Sample Case #2, Jorge wrote&nbsp;<b>N</b>&nbsp;= 6 papers.</p>

<ul>
	<li>After the 1st paper, Jorge&#39;s H-index score is 1, since he has 1 paper with at least 1 citation.</li>
	<li>After the 2nd paper, Jorge&#39;s H-index score is still 1.</li>
	<li>After the 3rd paper, Jorge&#39;s H-index score is 2, since he has 2 papers with at least 2 citations (the 2nd and 3rd papers).</li>
	<li>After the 4th paper, Jorge&#39;s H-index score is still 2.</li>
	<li>After the 5th paper, Jorge&#39;s H-index score is still 2.</li>
	<li>After the 6th paper, Jorge&#39;s H-index score is 3, since he has 3 papers with at least 3 citations (the 2nd, 3rd and 6th papers).</li>
</ul>