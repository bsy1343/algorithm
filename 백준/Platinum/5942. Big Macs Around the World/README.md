# [Platinum V] Big Macs Around the World - 5942

[문제 링크](https://www.acmicpc.net/problem/5942)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 196, 정답: 73, 맞힌 사람: 40, 정답 비율: 27.972%

### 분류

그래프 이론, 최단 경로, 벨만–포드

### 문제 설명

<p>Bessie is studying her favorite subject, Macroeconomics, in cowllege. For her final project, she will be presenting research on exchange rates between countries around the world.</p>

<p>In order to make her presentation more lively, she would like to show the relative prices of Big Macs around the world, despite their rather unsavory contents. To illustrate, suppose that Bessie would like to find smallest value of a Big Mac in a country given its value in some initial country and exchange rates from which other country&#39;s values can be calculated (as illustrated below):</p>

<ul>
	<li>A Big Mac is worth 60 dollars in the United States</li>
	<li>The exchange rate from US dollars to Canadian dollars is 0.2 Canadian dollars per US dollar</li>
	<li>The exchange rate from US dollars to British Pounds is 5.00 British Pounds per US Dollar</li>
	<li>The exchange rate from British Pounds to Canadian dollars is 0.5 Canadian dollars per British Pound</li>
	<li>The exchange rate between Canadian dollars to US dollars is 5.00 US dollars per Canadian dollar</li>
</ul>

<p>and Bessie would like to find the smallest possible value of a Big Mac in Canada that can be obtained by exchanging currencies. There are two ways:</p>

<ul>
	<li>Going from US dollars directly to Canada dollars would yield a burger worth 60.00 US dollars * 0.2 Canadian dollars / US dollar = 12.00 Canadian dollars</li>
	<li>Going from US dollars to British Pounds to Canadian dollars would yield a burger worth 60.00 US\$ * 5.00 GBP / 1 US\$ * 0.5 C\$ / 1 GBP = 150.00 C\$ (Canadian dollars).</li>
</ul>

<p>Bessie would choose the former option, since she would much rather pay 12.00 Canadian dollars instead of 150.00 Canadian dollars for a Big Mac in Canada.</p>

<p>Bessie has N (1 &lt;= N &lt;= 2,000) countries conveniently labeled 1 to N that she would like to consider along with a list of M (1 &lt;= M &lt;= 25,000) exchange rates e_ij (0.1 &lt; e_ij &lt;= 10), each between countries i and j (1 &lt;= i &lt;= N; 1 &lt;= j &lt;= N).</p>

<p>Given the value V (1 &lt;= V &lt;= 1,000,000,000,000), which is not necessarily an integer, of the Big Mac in her starting country A (1 &lt;= A &lt;= N), help her find the smallest possible value of a Big Mac in country B (1 &lt;= B &lt;= N; B != A) after a series of currency conversions. If there is no minimum, output 0.</p>

<p>It is guaranteed that the answer is, if not 0, between 1 and 10^15.</p>

<p>It is also guaranteed that, for any country&#39;s currency, it is possible to get to any other country&#39;s currency.</p>

### 입력

<ul>
	<li>Line 1: Five space-separated numbers: N, M, V, A, B</li>
	<li>Lines 2..M+1: Three space-separated numbers: i, j, e_ij</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single positive number, the price of the Big Mac, with absolute or relative error at most 10^-6. If there is no minimum, output 0.</li>
</ul>

<p>&nbsp;</p>