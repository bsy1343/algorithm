# [Platinum II] Campinatorics (Large) - 12120

[문제 링크](https://www.acmicpc.net/problem/12120)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 31, 맞힌 사람: 24, 정답 비율: 55.814%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 조합론, 모듈로 곱셈 역원

### 문제 설명

<p>&quot;Summer is finally here: time to relax, have some fun, go outside and enjoy the nice weather!&quot; says Alice, a very dedicated Ranger working in a popular National Park. During the summer, lots of families take some time off to camp there and have a good time, and it is Alice&#39;s job to accommodate the visitors.<br />
<br />
Alice is in charge of one of the many camps around the park. The camp can be described as a matrix of size&nbsp;<strong>N</strong>&nbsp;x&nbsp;<strong>N</strong>, where each cell has enough space for at most one tent. In order to arrange the families in the camp, there are several regulations that Alice needs to follow:</p>

<ul>
	<li>Only families with&nbsp;<strong>1, 2 or 3</strong>&nbsp;members are allowed in the camp. Also, each tent can contain members of only one family, and families cannot be split across multiple tents.</li>
	<li>For security reasons, Alice doesn&#39;t want the rows or columns to be too crowded or too empty, so she wants exactly&nbsp;<strong>3</strong>&nbsp;members in each row and column.</li>
	<li>Also, according to the park&#39;s safety policies, there shouldn&#39;t be more than&nbsp;<strong>2</strong>&nbsp;tents in any row or column.</li>
</ul>

<p><br />
Additionally, Alice knows in advance that at least&nbsp;<strong>X</strong>&nbsp;three-member families will be visiting the camp, and that there will be enough one- or two-member families to fill the rest of the camp.<br />
<br />
For example, these are valid arrangements for N = 3 and X = 0:</p>

<pre>
1  2  0  |  3  0  0
0  1  2  |  0  1  2
2  0  1  |  0  2  1
</pre>

<p>These are not valid arrangements for N = 3 and X = 1:</p>

<pre>
1  2  0  |  0  3  0  |  1  2  0  |  1  1  1
0  1  2  |  3  0  0  |  0  2  0  |  1  1  1
2  0  1  |  0  0  0  |  2  0  1  |  1  1  1
</pre>

<ul>
	<li>The first one is not valid because there should be at least one three-member family.</li>
	<li>The second example is not valid because the number of persons in the third row (and column) is not three.</li>
	<li>The third one is invalid because there are more than three members in the second column (and fewer than three in the second row).</li>
	<li>The last example contains more than two tents per row or column.</li>
</ul>

<p>Finally, Alice likes to keep things interesting. She would like to know how many different arrangements are possible given&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>X</strong>.&nbsp;<br />
<br />
Two arrangements A and B are considered different, if a cell in one arrangement contains a tent, but the same cell in the other arrangement doesn&#39;t; or if there is a tent in the same cell of both arrangements, but the number of members in that cell in A is different than the number of members in the same cell in B.</p>

<p>&nbsp;</p>

<div>&nbsp;</div>

### 입력

<p>The first line of the input contains&nbsp;<strong>T</strong>, the number of test cases.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of exactly one line with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>X</strong>&nbsp;corresponding to the number of rows (and columns) in Alice&#39;s camp and the minimum number of three-member families, respectively.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 200.</li>
	<li>0 &le;&nbsp;<strong>X</strong>&nbsp;&le; N.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>6</sup>.</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>For each test case, output one line containing &quot;Case #X: Y&quot;, where X is the test case number (starting from 1) and Y is the number of possible arrangements.<br />
<br />
The answer may be huge, so output the answer&nbsp;<strong>modulo 10<sup>9</sup>&nbsp;+ 7</strong>.</p>

### 힌트

<p>In case #1, you have two different valid arrangements:</p>

<pre>
0 3  |  3 0
3 0  |  0 3</pre>