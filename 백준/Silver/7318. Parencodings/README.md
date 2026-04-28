# [Silver II] Parencodings - 7318

[문제 링크](https://www.acmicpc.net/problem/7318)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 30, 맞힌 사람: 27, 정답 비율: 96.429%

### 분류

자료 구조, 스택

### 문제 설명

<p>Let S = s<sub>1</sub>s<sub>2</sub>...s<sub>2n</sub> be a well-formed string of parentheses. S can be encoded in two different ways:</p>

<ol>
	<li>By an integer sequence P = p<sub>1</sub>p<sub>2</sub>...p<sub>n</sub> where pi is the number of left parentheses before the i-th right parenthesis in S (P-sequence).</li>
	<li>By an integer sequence W = w<sub>1</sub>w<sub>2</sub> w<sub>n</sub> where for each right parenthesis, say a in S, we associate an integer which is the number of right parentheses counting from the matched left parenthesis of a up to a. (W-sequence).</li>
</ol>

<p>Following is an example of the above encodings:</p>

<p><br />
S&nbsp;&nbsp; &nbsp;(((()()())))<br />
P-sequence&nbsp;&nbsp; &nbsp;4 5 6666<br />
W-sequence&nbsp;&nbsp; &nbsp;1 1 1456</p>

<p>Write a program to convert P-sequence of a well-formed string to the W-sequence of the same string.</p>

### 입력

<p>The first line of the input file contains a single integer t ( 1 &le; t &le; 10), the number of test cases, followed by the input data for each test case. The first line of each test case is an integer n ( 1 &le; n &le; 20), and the second line is the P-sequence of a well-formed string. It contains n positive integers, separated with blanks, representing the P-sequence.</p>

<p>&nbsp;</p>

### 출력

<p>The output file consists of exactly t lines corresponding to test cases. For each test case, the output line should contain n integers describing the W-sequence of the string corresponding to its given P-sequence.</p>