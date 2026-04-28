# [Platinum II] Sacred Scarecrows - 15856

[문제 링크](https://www.acmicpc.net/problem/15856)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 35, 맞힌 사람: 28, 정답 비율: 32.184%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 포함 배제의 원리

### 문제 설명

<p>Nerissa owns a rectangular-shaped paddy field which is divided into R &times; C small squares (R rows and C columns) of the same size. Each square is either an empty soil (empty square, which can be used for any purpose) or a rice-planted soil (specifically to plant rice).</p>

<p>To prevent birds like crows or sparrows from disturbing the crops, Nerissa decides to put some scarecrows on the field. Each scarecrow can only be placed on an empty square. Furthermore, to prevent other humans from stealing the crops, the scarecrow arrangement must be sacred. An arrangement is said to be sacred if all the following conditions are satisfied:</p>

<ul>
	<li>Each row contains at least one scarecrow,</li>
	<li>Each consecutive two columns contain at least one scarecrow.</li>
</ul>

<p>Now Nerissa wonders, how many different sacred arrangements are there? Two arrangement are different if there is a square that contains a scarecrow in one arrangement but not in the other arrangement. Help Nerissa to compute this number.</p>

### 입력

<p>The first line contains two integers: R C (1 &le; R &le; 14; 1 &le; C &le; 1000) in a line denoting the size of paddy field in term of the number of squares (number of rows and columns, respectively). The paddy field is given in the next R lines where each line contains a string of length C. Each square is represented by either &#39;<code>.</code>&#39; which denotes an empty soil, or &#39;<code>v</code>&#39; which denotes a rice-planted soil.&nbsp;</p>

### 출력

<p>The output contains an integer representing the number of different sacred arrangement, in a line. As the output can be very large, modulo the output by 1,000,000,007.</p>

### 힌트

<p>Explanation for the 2nd sample case</p>

<p>For the second sample, the following are all 5 sacred arrangements (the scarecrows are denoted by character &#39;<code>*</code>&#39;):</p>

<pre>
***    *.*&nbsp; &nbsp;&nbsp;**.&nbsp; &nbsp;&nbsp;.**&nbsp; &nbsp;&nbsp;.*.</pre>

<p>Explanation for the 3rd sample case</p>

<p>Notice that, for the third sample, we cannot put any scarecrow in the first row. As a sacred arrangement requires at least one scarecrow in each row, thus, in this case, there is no possible sacred arrangement.</p>

<p>Explanation for the 5th sample case</p>

<p>For the fifth sample, the following are all 5 sacred arrangements (the scarecrows are denoted by character &#39;<code>*</code>&#39;):</p>

<pre>
*vv*&nbsp; &nbsp;&nbsp;*vv*&nbsp; &nbsp;&nbsp;*vv.&nbsp; &nbsp;&nbsp;*vv.&nbsp; &nbsp;&nbsp;.vv*
*v*v&nbsp; &nbsp;&nbsp;.v*v&nbsp; &nbsp;&nbsp;.v*v&nbsp; &nbsp;&nbsp;*v*v&nbsp; &nbsp;&nbsp;*v*v</pre>