# [Platinum I] Random Number Generator - 17311

[문제 링크](https://www.acmicpc.net/problem/17311)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 109, 정답: 16, 맞힌 사람: 11, 정답 비율: 11.579%

### 분류

누적 합

### 문제 설명

<p>Little H has recently been studying randomized algorithms. Randomized algorithms often use random number generation functions (e.g.&nbsp;<code>random</code>&nbsp;from Pascal and&nbsp;<code>rand</code>&nbsp;from C/C++) to obtain their randomness. In reality, random number functions are not truly &quot;random.&quot; Instead, they work off of some specific algorithms.</p>

<p>As such, the following recursive quadratic polynomial is one method:</p>

<p>The algorithm selects nonnegative integers&nbsp;<var>x</var><sub>0</sub>,&nbsp;<var>a</var>,&nbsp;<var>b</var>,&nbsp;<var>c</var>, and&nbsp;<var>d</var>&nbsp;as its seed values and uses the following recursive calculations to generate a random number.</p>

<p>For any&nbsp;<var>i</var>&nbsp;&ge; 1, $x_i = (a \times x_{i-1}^2 + b \times x_{i-1} + c) \mod d$</p>

<p>This way, a sequence of nonnegative integers x<sub>i</sub> of arbitrary length can be obtained. Typically, we can consider this sequence to be random. Using the sequence&nbsp;x<sub>i</sub>, we can use the following algorithm to produce T<sub>i</sub>, a random permutation of the numbers 1 to&nbsp;<var>K</var>.</p>

<ol>
	<li>Initialize&nbsp;<var>T</var>&nbsp;to the sequence of integers from 1 to&nbsp;<var>K</var>.</li>
	<li>Perform&nbsp;<var>K</var>&nbsp;swaps on the sequence&nbsp;<var>T</var>. The&nbsp;<var>i</var>-th swap will swap the value of&nbsp;<var>T<sub>i</sub></var>&nbsp;with the value of&nbsp;<var>T</var><sub>(<var>x<sub>i</sub></var>&nbsp;mod&nbsp;<var>i</var>) + 1</sub>.</li>
</ol>

<p>Outside of this base number of&nbsp;<var>K</var>&nbsp;swaps, little H has made&nbsp;<b>an additional</b>&nbsp;<var>Q</var>&nbsp;swaps. For the&nbsp;<var>i</var>-th additional swap, little H will choose two positions&nbsp;<var>u<sub>i</sub></var>&nbsp;and&nbsp;<var>v<sub>i</sub></var>&nbsp;and swap the values of&nbsp;<var>T<sub>u<sub>i</sub></sub></var>&nbsp;and&nbsp;<var>T<sub>v<sub>i</sub></sub></var>.</p>

<p>To check the effectiveness of the random permutation generator, little H designed the following problem:</p>

<p>Little H has an&nbsp;<var>N</var>&nbsp;row by&nbsp;<var>M</var>&nbsp;column grid. She initially follows the above process, producing a random permutation&nbsp;T<sub>i</sub>&nbsp;of the integers from 1 to&nbsp;<var>N</var>&times;<var>M</var>&nbsp;after&nbsp;<var>N</var>&times;<var>M</var>&nbsp;+&nbsp;<var>Q</var>&nbsp;swaps. Then these&nbsp;<var>N</var>&times;<var>M</var>&nbsp;values are then placed back into the grid, row for row, column for column. That is, the cell at column&nbsp;<var>j</var>&nbsp;of row&nbsp;<var>i</var>&nbsp;in the original grid will now take on the value of&nbsp;<var>T</var><sub>(<var>i</var>&minus;1)&middot;<var>M</var>+<var>j</var></sub>.</p>

<p>Afterwards, little H wishes to start from the top-left corner of the grid (i.e. row 1, column 1),&nbsp;<b>each step moving either right or down under the precondition that she does not move outside of the grid,</b>&nbsp;and reach the bottom-right corner (i.e. row&nbsp;<var>N</var>, column&nbsp;<var>M</var>).</p>

<p>Little H writes down the value of every cell she travels through,&nbsp;<b>ordered from least to greatest</b>. This way, for any valid path, little H can obtain an increasing sequence of length&nbsp;<var>N</var>&nbsp;+&nbsp;<var>M</var>&nbsp;&minus; 1 which we will call the&nbsp;<b>path sequence</b>. Little H wishes to know the&nbsp;<b>lexicographically smallest</b>&nbsp;path sequence that she can obtain.</p>

### 입력

<p>Line 1 of input consists of five integers&nbsp;<var>x</var><sub>0</sub>,&nbsp;<var>a</var>,&nbsp;<var>b</var>,&nbsp;<var>c</var>, and&nbsp;<var>d</var>, representing the seed values to little H&#39;s random number generator.</p>

<p>Line 2 of input consists of three integers&nbsp;<var>N</var>,&nbsp;<var>M</var>, and&nbsp;<var>Q</var>, indicating that little H generates a permutation from 1 to&nbsp;<var>N</var>&times;<var>M</var>&nbsp;to fill her&nbsp;<var>N</var>&times;<var>M</var>&nbsp;grid. Also, after little H performs her&nbsp;<var>N</var>&nbsp;&times;&nbsp;<var>M</var>&nbsp;swaps, she will perform an additional&nbsp;<var>Q</var>&nbsp;swaps.</p>

<p>The final&nbsp;<var>Q</var>&nbsp;lines will each contain two integers&nbsp;<var>u<sub>i</sub></var>&nbsp;and&nbsp;<var>v<sub>i</sub></var>, indicating that the&nbsp;<var>i</var>-th additional swap involves swapping&nbsp;<var>T<sub>u<sub>i</sub></sub></var>&nbsp;and&nbsp;<var>T<sub>v<sub>i</sub></sub></var>.</p>

### 출력

<p>The output should consist of one line containing&nbsp;<var>N</var>&nbsp;+&nbsp;<var>M</var>&nbsp;&minus; 1 space-separated positive integers, representing the lexicographically smallest path sequence that little H can obtain.</p>

### 제한

<ul>
	<li>2 &le; N, M&nbsp;&le; 5000</li>
	<li>0 &le; Q &le; 50000</li>
	<li>0 &le;&nbsp;<var>a</var>&nbsp;&le; 300</li>
	<li>0 &le;&nbsp;<var>b</var>,&nbsp;<var>c</var>&nbsp;&le; 10<sup>8</sup></li>
	<li>0 &le;&nbsp;<var>x</var><sub>0</sub>&nbsp;&lt;&nbsp;<var>d</var>&nbsp;&le; 10<sup>8</sup></li>
	<li>1 &le;&nbsp;<var>u<sub>i</sub></var>,&nbsp;<var>v<sub>i</sub></var>&nbsp;&le;&nbsp;<var>N</var>&nbsp;&times;&nbsp;<var>M</var></li>
</ul>