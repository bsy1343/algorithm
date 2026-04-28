# [Gold IV] Encryption System - 10236

[문제 링크](https://www.acmicpc.net/problem/10236)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 41, 정답: 10, 맞힌 사람: 10, 정답 비율: 24.390%

### 분류

정렬, 백트래킹

### 문제 설명

<p>A programmer developed a new encryption system. However, his system has an issue that two or more distinct strings are &#39;encrypted&#39; to the same string.</p>

<p>We have a string encrypted by his system. To decode the original string, we want to enumerate all the candidates of the string before the encryption. Your mission is to write a program for this task.</p>

<p>The encryption is performed taking the following steps. Given a string that consists only of lowercase letters (&#39;a&#39; to &#39;z&#39;).</p>

<ol>
	<li>Change the first &#39;b&#39; to &#39;a&#39;. If there is no &#39;b&#39;, do nothing.</li>
	<li>Change the first &#39;c&#39; to &#39;b&#39;. If there is no &#39;c&#39;, do nothing.</li>
	<li style="list-style:none;">...</li>
	<li value="25">Change the first &#39;z&#39; to &#39;y&#39;. If there is no &#39;z&#39;, do nothing.</li>
</ol>

### 입력

<p>The input consists of at most 100 datasets. Each dataset is a line containing an encrypted string. The encrypted string consists only of lowercase letters, and contains at least 1 and at most 20 characters.</p>

<p>The input ends with a line with a single &#39;#&#39; symbol.</p>

### 출력

<p>For each dataset, the number of candidates <i>n</i> of the string before encryption should be printed in a line first, followed by lines each containing a candidate of the string before encryption. If <i>n</i> does not exceed 10, print all candidates in dictionary order; otherwise, print the first five and the last five candidates in dictionary order.</p>

<p>Here, dictionary order is recursively defined as follows. The empty string comes the first in dictionary order. For two nonempty strings <i>x</i> = <i>x</i><sub>1</sub> ... <i>x</i><sub>k</sub> and <i>y</i> = <i>y</i><sub>1</sub> ... <i>y</i><sub>l</sub>, the string <i>x</i> precedes the string <i>y</i> in dictionary order if</p>

<ul>
	<li><i>x</i><sub>1</sub> precedes <i>y</i><sub>1</sub> in alphabetical order (&#39;a&#39; to &#39;z&#39;), or</li>
	<li><i>x</i><sub>1</sub> and <i>y</i><sub>1</sub> are the same character and <i>x</i><sub>2</sub> ... <i>x</i><sub>k</sub> precedes <i>y</i><sub>2</sub> ... <i>y</i><sub>l</sub> in dictionary order.</li>
</ul>