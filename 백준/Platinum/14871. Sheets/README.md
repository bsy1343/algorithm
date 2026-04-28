# [Platinum IV] Sheets - 14871

[문제 링크](https://www.acmicpc.net/problem/14871)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 22, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

구현, 재귀

### 문제 설명

<p>You are given a sheet of grid paper of squares with the total size of N &times; N cells. The number N is a power of 2.</p>

<p>The cells are consecutively numbered from left to right, from top to bottom. In each cell is entered only its number.</p>

<p>The sheet is iteratively folded in half, first - the bottom half over the top half, then the right half over the left half, until the size of the folded sheet becomes equal to 1 &times; 1.</p>

<p>Obviously, the cells of the folded sheet make up a column with the size of 1 &times; 1 &times; N<sup>2</sup>.</p>

<p>We denote by S = &lt;S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>P</sub>, ... S<sub>N</sub><sup>2</sup>&gt; the string consisting of the numbers in the cells of the obtained column, from the back to front, where P indicates the position of the number in the string.</p>

<p>An IT specialist, who is attending a boring meeting, in order to have fun, is folding the sheet of paper and is building up similar columns to those described above. To occupy his mind, the IT specialist decided to find answers to the following questions:</p>

<ul>
	<li>Question type 1. You are given a certain number X. What is the P-position of this number in the string S?</li>
	<li>Question type 2. You are given a certain P-position in the string S. What is the number X in this position?</li>
</ul>

<p>Develop a program to calculate, depending on the type of the question, the number X or the P-position.</p>

### 입력

<p>The standard input contains on the first line the integer Q &ndash; the number of questions. Each of the following Q lines of the standard input contain three integers T, K, V, separated by a space:</p>

<ul>
	<li>T - indicates the type of the question (T = 1 or T = 2);</li>
	<li>K - is the exponent of the power that defines the size of the sheet of paper (N = 2<sup>K</sup>);</li>
	<li>V - is the number X, if the question is of type 1 (T = 1) or the position P, if the question is of type 2 (T = 2).</li>
</ul>

### 출력

<p>The standard output shall contain Q lines, one for each of the standard input questions. Each of these lines shall contain a single integer P or X, depending on the type of the question.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;Q &le;&nbsp;10000</li>
	<li>1 &le;&nbsp;T &le;&nbsp;2.</li>
	<li>0 &le;&nbsp;K &le;&nbsp;31.</li>
	<li>1 &le;&nbsp;X, P &le; N<sup>2</sup>, where N = 2<sup>K</sup>.</li>
</ul>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14871/1.png" style="height:79px; width:106px" />S = &lt; 1, 3, 4, 2 &gt;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14871/2.png" style="height:130px; width:176px" />S = &lt; 1, 13, 16, 4, 8, 12, 9, 5, 6, 10, 11, 7, 3, 15, 14, 2 &gt;</p>