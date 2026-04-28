# [Gold I] Exchange Rates - 4666

[문제 링크](https://www.acmicpc.net/problem/4666)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 유클리드 호제법, 그래프 이론, 그래프 탐색, 구현, 수학, 정수론

### 문제 설명

<p>Using money to pay for goods and services usually makes life easier, but sometimes people prefer to trade items directly without any money changing hands. In order to ensure a consistent &quot;price&quot;, traders set an exchange rate between items. The exchange rate between two items A and B is expressed as two positive integers m and n, and says that m of item A is worth n of item B. For example, 2 stoves might be worth 3 refrigerators. (Mathematically, 1 stove is worth 1.5 refrigerators, but since it&#39;s hard to find half a refrigerator, exchange rates are always expressed using integers.)</p>

<p>Your job is to write a program that, given a list of exchange rates, calculates the exchange rate between any two items.</p>

### 입력

<p>The input file contains one or more commands, followed by a line beginning with a period that signals the end of the file. Each command is on a line by itself and is either an assertion or a query. An assertion begins with an exclamation point and has the format</p>

<p style="margin-left: 40px;">! m itema = n itemb</p>

<p>where itema and itemb are distinct item names and m and n are both positive integers less than 100. This command says that m of itema are worth n of itemb. A query begins with a question mark, is of the form</p>

<p style="margin-left: 40px;">? itema = itemb</p>

<p>and asks for the exchange rate between itema and itemb, where itema and itemb are distinct items that have both appeared in previous assertions (although not necessarily the same assertion).&nbsp;</p>

### 출력

<p>For each query, output the exchange rate between itema and itemb based on all the assertions made up to that point. Exchange rates must be in integers and must be reduced to lowest terms. If no exchange rate can be determined at that point, use question marks instead of integers. Format all output exactly as shown in the example.</p>

### 힌트

<ul>
	<li>Item names will have length at most 20 and will contain only lowercase letters.</li>
	<li>Only the singular form of an item name will be used (no plurals).</li>
	<li>There will be at most 60 distinct items.</li>
	<li>There will be at most one assertion for any pair of distinct items.</li>
	<li>There will be no contradictory assertions. For example, &quot;2 pig = 1 cow&quot;, &quot;2 cow = 1 horse&quot;, and &quot;2 horse = 3 pig&quot; are contradictory.</li>
	<li>Assertions are not necessarily in lowest terms, but output must be.</li>
	<li>Although assertions use numbers less than 100, queries may result in larger numbers that will not exceed 10000 when reduced to lowest terms.</li>
</ul>

<p>&nbsp;</p>