# [Gold V] gFiles (Large) - 12061

[문제 링크](https://www.acmicpc.net/problem/12061)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 40, 맞힌 사람: 29, 정답 비율: 36.709%

### 분류

이분 탐색, 많은 조건 분기, 수학, 매개 변수 탐색, 스위핑

### 문제 설명

<p>Alien tech company G has a very old file transfer tool that is still in use today. While the tool is running, it reassures users by giving status updates on both the percentage of files transferred so far and the number of files transferred so far. The status updates during the process might look like this:</p>

<pre>
 20% |==&gt;-------|     1 files transferred
100% |==========|     5 files transferred
</pre>

<p>But the percentage isn&#39;t precise; it is simply truncated before the decimal point (i.e. floored to the next lowest or equal 1%). That is, both 1.2% and 1.7% would be displayed as 1%.</p>

<p>Some users may want to know the exact total number of files, so you want to modify the tool so that the status updates look like this:</p>

<pre>
 20% |==&gt;-------|     1 out of <strong>5</strong> files transferred
100% |==========|     5 out of <strong>5</strong> files transferred
</pre>

<p>But you&#39;ve realized that it may or may not be possible to know the number of files. Given the status updates that the tool displays, either figure out how many files there are, or determine that it can&#39;t be done (i.e., there are multiple possible values for the number of files). The status updates are not guaranteed to occur at regular intervals and are not guaranteed to occur whenever a file is transferred.</p>

### 입력

<p>The first line contains&nbsp;<strong>T</strong>, the number of test cases.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of one line with an integer&nbsp;<strong>N</strong>, the number of status updates output by the tool, followed by&nbsp;<strong>N</strong>&nbsp;lines with the format P<sub>i</sub>&nbsp;K<sub>i</sub>, where P<sub>i</sub>&nbsp;and K<sub>i</sub>&nbsp;are integers representing the percentage and number of files transferred at some point in the process. The updates are given listed in chronological order -- that is, both the P<sub>i</sub>&nbsp;values and the K<sub>i</sub>&nbsp;values are nondecreasing throughout a test case.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>0 &le; P<sub>i</sub>&nbsp;&le; 100</li>
	<li>0 &le; K<sub>i</sub>&nbsp;&le; 10<sup>15</sup></li>
	<li>The answer is guaranteed not to exceed 10<sup>15</sup>.</li>
</ul>

### 출력

<p>For each case, output a line starts with &quot;Case #x: y&quot;, where x is the number of the case (starting from 1), and y is either the total number of files, or&nbsp;<code>-1</code>&nbsp;if that number is ambiguous.</p>