# [Gold I] Travel Card - 10456

[문제 링크](https://www.acmicpc.net/problem/10456)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 855, 정답: 104, 맞힌 사람: 54, 정답 비율: 13.300%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You correctly think that owning a car can cost a lot of money and can be a great trouble due to congestion. The public transportation system of your city is made up of buses and trains. The fare rule is as follows.</p>

<ol>
	<li>Each bus ride costs \$1, and each train ride costs \$2.</li>
	<li>No free transfer: if you want to transfer between buses/trains, you are supposed to buy a new ticket.</li>
	<li>A daily bus card costs \$3 and gives you limitless bus rides within a day (but you need to pay for train rides).</li>
	<li>A daily travel card costs \$6 and gives you limitless bus and train rides within a day.</li>
	<li>A 7 days bus card costs \$18 and gives you limitless bus rides for seven days (but you need to pay for train rides).</li>
	<li>A 7 days travel card costs \$36 and gives you limitless bus and train rides for seven days.</li>
	<li>A 30 days bus card costs \$45 and gives you limitless bus rides 30 days (but you need to pay for train rides).</li>
	<li>A 30 days travel card costs \$90 and gives you limitless bus and train rides for 30 days.</li>
</ol>

<p>You thought that the rule was too complicated and you did not know how many times you would ride buses or trains. Instead of buying bus card or travel card, you paid single ride fare each time. Now you think that if you bought travel cards, then you would have spent less money.</p>

<p>For example, suppose your travel log for three days is as follows.</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th>Day</th>
			<th>Number of bus rides</th>
			<th>Number of train rides</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>2</td>
			<td>5</td>
			<td>0</td>
		</tr>
		<tr>
			<td>3</td>
			<td>0</td>
			<td>2</td>
		</tr>
	</tbody>
</table>

<p>If you do not buy any travel card, you will spend \$10 in total as you spend \$1 on day 1, \$5 on day 2, and \$4 on day 3. However, you can spend \$1 on day 1, \$3 on day 2 by buying a daily bus card, and \$4 on day 3. In total, you will spend \$8, which is smaller than \$10 and optimal.</p>

<p>Given the travel logs of n days, write a program which calculates the minimum amount of fare.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing one integers n (1 &le; n &le; 10,000), where n is the number of days. Each of the following n lines contains two integers a and b where a is the number of bus rides and b is that of train rides on that day (0 &le; a, b &le; 100,000). There is a single space between two integers in the same line.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain the minimum amount of fare.&nbsp;</p>