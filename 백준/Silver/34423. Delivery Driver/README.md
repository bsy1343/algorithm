# [Silver I] Delivery Driver - 34423

[문제 링크](https://www.acmicpc.net/problem/34423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>As a delivery driver for a food delivery service, you can work in one of three different cities each day: Denver, Ft. Collins, or Colorado Springs.</p>

<p>While working for the past few years, you have collected data on your net profit from working in each city and applied a predictive machine learning model that allows you to know exactly how much net profit you can make from working in each city for the next $N$ days.</p>

<p>The model shows that you can make different amounts of money on each day, depending on the location. Naturally, you want to work in the city where you can make the most money each day. However, driving from one city to the next is not without cost, so in some cases it may be better to stay where you are and make slightly less but not have to drive to a different city.</p>

<p>The cost to drive between cities ($c_1$ and $c_2$) is given by $T(c_1, c_2)$, a constant representing how costly it is to drive from $c_1$ to $c_2$. Note that $T(c_1, c_2)$ is always equivalent to $T(c_2, c_1)$.</p>

<p>You want to determine which city to work in on each of the next $N$ days such that your total net profit across all of the days is maximized. (Net profit is calculated by taking the total earnings and subtracting both the operating costs for each day as well as any transition costs incurred by driving between cities.)</p>

<p>Consider the following example (which describes the first sample input). You are planning for the next $3$ days and have calculated the profit you could make in each of the cities as shown in the table below:</p>

<table class="table table-bordered table-center-30">
	<tbody>
		<tr>
			<th>City</th>
			<th>Day 1</th>
			<th>Day 2</th>
			<th>Day 3</th>
		</tr>
		<tr>
			<td>Denver</td>
			<td>$\$251$</td>
			<td>$\$78$</td>
			<td>$\$398$</td>
		</tr>
		<tr>
			<td>Ft. Collins</td>
			<td>$\$174$</td>
			<td>$\$92$</td>
			<td>$\$410$</td>
		</tr>
		<tr>
			<td>Colorado Springs</td>
			<td>$\$148$</td>
			<td>$\$151$</td>
			<td>$\$402$</td>
		</tr>
	</tbody>
</table>

<p>Further, assuming that \begin{align*} T(\text{Denver}, \text{Ft. Collins}) &amp;= \$20, \\ T(\text{Denver}, \text{Colorado Springs}) &amp;= \$17, \text{and} \\ T(\text{Colorado Springs}, \text{Ft. Collins}) &amp;= \$34, \end{align*} if you choose to work from Denver on day $1$, Colorado Springs on day $2$ and day $3$, then your total net profit would be: \begin{align*} P_\text{total} &amp;= \underbrace{\$251}_\text{Day $1$ profit} - \underbrace{\$17}_\text{Denver to Colorado Springs} + \underbrace{\$151}_\text{Day $2$ profit} + \underbrace{\$402}_\text{Day $3$ profit} = \$787 \end{align*} whereas if you chose to work from Denver on day $1$, Colorado Springs on day $2$, and Ft. Collins on day $3$, then your total net profit would be: \begin{align*} P_\text{total} &amp;= \underbrace{\$251}_\text{Day $1$ profit} - \underbrace{\$17}_\text{Denver to Colorado Springs} + \underbrace{\$151}_\text{Day $2$ profit} - \underbrace{\$34}_\text{Colorado Springs to Ft. Collins} + \underbrace{\$410}_\text{Day $3$ profit} = \$761. \end{align*}</p>

<p>Clearly, the first option is better! Even though it may be tempting to go to Ft. Collins on Day $3$, the cost of driving there from Colorado Springs is too great.</p>

<p>Can you write a program which tells you which city to work from for each of the next $N$ days such that total net profit $P$ across all of the days is maximized? Note that you can start and end in any city you wish, and the start and end cities do not have to be the same.</p>

### 입력

<p>The first line contains three, space-separated integers representing the values of $T (\text{Denver}, \text{Ft. Collins})$, $T (\text{Denver}, \text{Colorado Springs})$, and $T (\text{Colorado Springs}, \text{Ft. Collins})$, respectively.</p>

<p>The next line contains a single integer $2 \leq N \leq 100$, the number of days that you have to plan for.</p>

<p>The next $3$ lines contain a list of $N$ space-separated integers representing the potential profit for the next $N$ days in Denver, Ft. Collins, and Colorado Springs, respectively.</p>

<p>All monetary numbers will be integers between $0$ and $100\,000$.</p>

### 출력

<p>The first and only line of output is the maximum total net profit $P$ across all $N$ days in dollars.</p>