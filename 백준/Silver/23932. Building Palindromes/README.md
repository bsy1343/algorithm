# [Silver I] Building Palindromes - 23932

[문제 링크](https://www.acmicpc.net/problem/23932)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 62, 맞힌 사람: 44, 정답 비율: 75.862%

### 분류

문자열, 애드 혹, 누적 합

### 문제 설명

<p>Anna has a row of&nbsp;<b>N</b>&nbsp;blocks, each with exactly one letter from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>&nbsp;written on it. The blocks are numbered 1, 2, ...,&nbsp;<b>N</b>&nbsp;from left to right.</p>

<p>Today, she is learning about palindromes. A palindrome is a string that is the same written forwards and backwards. For example,&nbsp;<code>ANNA</code>,&nbsp;<code>RACECAR</code>,&nbsp;<code>AAA</code>&nbsp;and&nbsp;<code>X</code>&nbsp;are all palindromes, while&nbsp;<code>AB</code>,&nbsp;<code>FROG</code>&nbsp;and&nbsp;<code>YOYO</code>&nbsp;are not.</p>

<p>Bob wants to test how well Anna understands palindromes, and will ask her&nbsp;<b>Q</b>&nbsp;questions. The i-th question is: can Anna use all of the blocks numbered from&nbsp;<b>L<sub>i</sub></b>&nbsp;to&nbsp;<b>R<sub>i</sub></b>, inclusive, rearranging them if necessary, to form a palindrome? After each question, Anna puts the blocks back in their original positions.</p>

<p>Please help Anna by finding out how many of Bob&#39;s questions she can answer &quot;yes&quot; to.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>Q</b>, the number of blocks and the number of questions, respectively. Then, another line follows, containing a string of&nbsp;<b>N</b>&nbsp;uppercase characters (<code>A</code>&nbsp;to&nbsp;<code>Z</code>). Then,&nbsp;<b>Q</b>&nbsp;lines follow. The i-th line contains the two integers&nbsp;<b>L<sub>i</sub></b>&nbsp;to&nbsp;<b>R<sub>i</sub></b>, describing the i-th question.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of questions Anna can answer &quot;yes&quot; to.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>L<sub>i</sub></b>&nbsp;&le;&nbsp;<b>R<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1,&nbsp;<b>N</b>&nbsp;= 7 and&nbsp;<b>Q</b>&nbsp;= 5.</p>

<ul>
	<li>For the first question, Anna must use the blocks&nbsp;<code>AACC</code>. She can rearrange these blocks into the palindrome&nbsp;<code>ACCA</code>&nbsp;(or&nbsp;<code>CAAC</code>).</li>
	<li>For the second question, Anna must use the blocks&nbsp;<code>A</code>. This is already a palindrome, so she does not need to rearrange them.</li>
	<li>For the third question, Anna must use the blocks&nbsp;<code>BAAC</code>. These blocks cannot be rearranged into a palindrome.</li>
	<li>For the fourth question, Anna must use the blocks&nbsp;<code>CA</code>. These blocks cannot be rearranged into a palindrome.</li>
	<li>For the fifth question, Anna must use the blocks&nbsp;<code>AACCA</code>. She can rearrange these blocks to form the palindrome&nbsp;<code>ACACA</code>&nbsp;(or&nbsp;<code>CAAAC</code>).</li>
</ul>

<p>In total, she is able to answer &quot;yes&quot; to 3 of Bob&#39;s questions, so the answer is 3.</p>

<p>In Sample Case #2,&nbsp;<b>N</b>&nbsp;= 3 and&nbsp;<b>Q</b>&nbsp;= 5. For the first question, Anna must use the blocks&nbsp;<code>XYZ</code>&nbsp;to create a palindrome. This is impossible, and since the rest of Bob&#39;s questions are the same as the first one, the answer is 0.</p>