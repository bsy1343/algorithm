# [Gold III] TUTOR - 9832

[문제 링크](https://www.acmicpc.net/problem/9832)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

수학, 구현, 다이나믹 프로그래밍, 브루트포스 알고리즘, 조합론

### 문제 설명

<p>You need to compute a <em>sequence of actions</em> in order to maximize <code>cash</code> earned in a tutor simulation game. The actions involve earning <code>cash</code> from tuition (<strong>TEACH</strong>), studying in college to increase your <code>knowledge</code> (<strong>TRAIN</strong>), and buying books (<strong>BUY</strong>). The <strong>TRAIN</strong> action allows you to increase tuition income. The <strong>BUY</strong> action allows you to reduce time units consumed for each <strong>TRAIN</strong> action. Each of these actions consumes time units and there are only <code>maxTimeUnits</code> available for work.</p>

<p>Like all games, the puzzle difficulty depends on the game variables and certain rules. For this task, there are 4 game variables and 5 game rules. Value ranges are provided where appropriate.</p>

<p>Game Variables</p>

<ol>
	<li><code>maxTimeUnits</code> (10 - 1000): The maximum number of time units in the simulation game.</li>
	<li><code>learningRate</code> (1, 2, 4, or 8): Scales down the time units consumed by a <strong>TRAIN</strong> action, based on the number of <code>book</code> in your possession.</li>
	<li><code>paybackRate</code> (5, 10, or 20): Scales up the tuition <code>income</code> earned from a <strong>TEACH</strong> action, based on the <code>knowledge</code> level.</li>
	<li><code>bookCost</code>: An array of 4 integers in non decreasing order where the i-th integer is the cost of the i-th book. (The cost of each book is in the range of \$5 - \$500).</li>
</ol>

<p>Game Rules</p>

<ol>
	<li>Before the start of the simulation, you have <code>maxTimeUnits</code> left; your <code>cash</code> is 0; your <code>knowledge</code> is 0; and you have 0 <code>book</code>.</li>
	<li>The simulation game lasts for <code>maxTimeUnits</code>. Your aim is to obtain as much <code>cash</code> as possible.</li>
	<li>Every <strong>TEACH</strong> action spends 2 time units. The formula below gives the tuition <code>income</code> per <strong>TEACH</strong> action. That is, the more <code>knowledge</code> that you have, the higher your income will be.<br />
	<code>income = 10 + min(20, knowledge) * paybackRate</code></li>
	<li>Every <strong>TRAIN</strong> action costs 20 dollars and it will increase the <code>knowledge</code> level by 1 unit. The formula below gives the <code>trainingTime</code> per <strong>TRAIN</strong> action. That is, the more <code>book</code> or the higher <code>learningRate</code> that you have, the lower your <code>trainingTime</code> will be.<br />
	<code>trainingTime = max(1, (int)(8 / max(1, book * learningRate))) </code></li>
	<li>There are 4 books in this game. The i-th <strong>BUY</strong> action will buy the i-th book. It takes i time units to buy the i-th book (0-based indexing, i.e. the first book can be bought with 0 time unit) and the cost of the i-th book is stated in <code>bookCost[i]</code>. As there are at most 4 books, you can perform at most 4 <strong>BUY</strong> actions.</li>
</ol>

<p>Write a program that reads in the game variable values (see sample input), and determines the best possible sequence of actions. You need to implement a planner so that your <code>cash</code> is maximum at a certain time unit <code>t</code> where <code>t &isin; [0 .. maxTimeUnits]</code>. However, you should not violate the following important constraints:</p>

<ol>
	<li>You cannot overshoot the <code>maxTimeUnits</code>, when choosing an action.</li>
	<li>You cannot incur negative <code>cash</code> at any point; i.e. you must be able to pay for any <strong>TRAIN</strong> or <strong>BUY</strong> action.</li>
</ol>

<p>For example, suppose <code>maxTimeUnits</code>, <code>learningRate</code>, and <code>paybackRate</code> are 13, 8, and 20, respectively. Assume the cost of the 4 books are \$5, \$50, \$100, and \$200.</p>

<p>Since you have 13 time units, a simple solution is to perform <strong>TEACH</strong> 6 times. You can already get 6&lowast;(10+min(20, 0)&lowast;20) = 6&lowast;10 = \$60. However, this is not the best answer (you will not get any marks by giving this answer). The optimal answer for this test case has <code>cash</code> = \$95 and shown below:</p>

<table class="table table-bordered" style="width:100%;">
	<tbody>
		<tr>
			<th style="text-align: center;"><code>t</code></th>
			<th style="text-align: center;"><code>cash</code></th>
			<th style="text-align: center;"><code>knowledge</code></th>
			<th style="text-align: center;"><code>book</code></th>
			<th style="text-align: center;">remarks</th>
		</tr>
		<tr>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">start of simulation</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 10)</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>BUY</strong> (the 0-th book, 5\$, no change in t)</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 10)</td>
		</tr>
		<tr>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 10)</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TRAIN</strong> (we have 1 book, <code>trainingTime</code> = 1)</td>
		</tr>
		<tr>
			<td style="text-align: center;">9</td>
			<td style="text-align: center;">35</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 30)</td>
		</tr>
		<tr>
			<td style="text-align: center;">11</td>
			<td style="text-align: center;">65</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 30)</td>
		</tr>
		<tr>
			<td style="text-align: center;">13</td>
			<td style="text-align: center;">95</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>TEACH</strong> (<code>income</code> = 30)</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input (from standard input) consists of two lines. The first line contains 3 integers, which are the <code>maxTimeUnits</code>, <code>learningRate</code>, and <code>paybackRate</code>. The second input line contains 4 integers where the i-th integer is the cost of the i-th book.</p>

### 출력

<p>The required output (to standard output), consists of a single number, specifying the maximum <code>cash</code> that you can gain.</p>