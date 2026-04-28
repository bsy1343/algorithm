# [Gold III] Roller Coaster Scheduling (Small) - 14817

[문제 링크](https://www.acmicpc.net/problem/14817)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 37, 맞힌 사람: 34, 정답 비율: 85.000%

### 분류

수학

### 문제 설명

<p>You created a new roller coaster that is about to open. Its train consists of a single row of&nbsp;<strong>N</strong>&nbsp;seats numbered 1 through&nbsp;<strong>N</strong>&nbsp;from front to back. Of course, seats closer to the front are more valuable. Customers have already purchased opening-day tickets. Each ticket allows a specific customer to take one ride on the coaster in a particular seat. Some customers may have bought more than one ticket, and they expect to go on one ride for each ticket.</p>

<p>You need to decide how many roller coaster rides there will be on opening day. On each ride, one customer can sit in each seat; some seats on a ride might be left empty. You cannot assign a customer to more than one seat in the same ride, nor can you put two customers on the same seat in any given ride.</p>

<p>You wish to minimize the number of rides required to honor all tickets, to reduce operational costs. To reduce the required number of rides, you can&nbsp;<em>promote</em>&nbsp;any number of tickets. Promoting a ticket means taking a customer&#39;s ticket and giving that customer a new ticket for a seat closer to the front of the train (that is, a seat with a lower number). You would prefer to promote as few tickets as possible, since too many promotions might cause customers to get greedy and ask for more promotions in the future.</p>

<p>Given the positions and buyers of all the tickets that have been sold, what is the minimum number of rides needed to honor all tickets, using as many promotions as needed and scheduling the rides optimally? And what is the minimum number of ticket promotions necessary to attain that number of rides? Note that promoting a given customer on a given ride from seat 4 to seat 2, for example, counts as only one promotion, not two separate ones.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a single line with three integers&nbsp;<strong>N</strong>, the number of seats in the roller coaster,&nbsp;<strong>C</strong>, the number of potential customers, and&nbsp;<strong>M</strong>, the number of tickets sold. The customers are identified with numbers between 1 and&nbsp;<strong>C</strong>. Then,&nbsp;<strong>M</strong>&nbsp;lines follow, each containing two integers:&nbsp;<strong>P</strong><sub>i</sub>, the position in the roller coaster assigned to the i-th ticket, and<strong>B</strong><sub>i</sub>, the identifier of the buyer of that ticket.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>P</strong><sub>i</sub>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>B</strong><sub>i</sub>&nbsp;&le;&nbsp;<strong>C</strong>.</li>
	<li><strong>C</strong>&nbsp;= 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y z</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1),&nbsp;<code>y</code>&nbsp;is the minimum number of rides you need to honor all tickets if you use the promotions and schedule the rides optimally, and&nbsp;<code>z</code>&nbsp;is the minimum number of promotions you need to make be able to honor all tickets with&nbsp;<code>y</code>&nbsp;rides.</p>

### 힌트

<p>Note that the last two sample cases would not appear in the Small dataset.</p>

<p>In Case #1, both customers purchased a ticket for position 2. It is impossible to honor both tickets with a single ride, but promoting either ticket to position 1 allows you to accommodate both tickets on the same round.</p>

<p>Case #2 is a similar story, except both tickets are for position 1. Since you cannot promote those tickets or exchange them for inferior tickets, you are forced to run 2 separate rides, one per customer.</p>

<p>Case #3 features the same customer purchasing both positions. Since you are forced to have 2 rides for that customer, there is no reason to give out any promotions.</p>

<p>In Case #4, notice that there may be both customers and positions with no tickets assigned. In this case, there are three tickets sold for position three. If you promote customer 2 to position 2, for instance, you can have one ride with customer 1 sitting in position 2 and customer 3 sitting in position 3, and a second ride with customer 2 in position 2 and customer 1 in position 3. Additional promotions will not allow you to decrease the number of rides, because customer 1 has two tickets and you need to honor those in different rides, regardless of position.</p>

<p>In Case #5, one optimal solution is to promote one of the&nbsp;<code>3 1</code>&nbsp;tickets to&nbsp;<code>1 1</code>.</p>