# [Silver I] The Bored Traveling Salesman (Small) - 12252

[문제 링크](https://www.acmicpc.net/problem/12252)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Your boss is sending you out on an international sales trip. What joy!</p>

<p>You have <strong>N</strong> cities (numbered from 1 to <strong>N</strong>) to visit and can get to them using a set of bidirectional flights that go between the cities.</p>

<p>All of the cities must be visited at least once. To do this you can book any number of tickets, subject to the following conditions:</p>

<ul>
	<li>Each ticket consists of 2 flights, one from a specific city <strong>X</strong> to another specific city <strong>Y</strong> (this is called the <strong>outbound</strong> flight), and the other one from city <strong>Y</strong> to city <strong>X</strong> (this is called the <strong>return</strong> flight).</li>
	<li>You must use the outbound flight before the corresponding return flight (you can use other flights in between).</li>
	<li>At most 1 outbound flight going to each city, although there is no limit on the return flights (multiple return flights can go to the same city).</li>
	<li>You must use all flights which belong to the tickets you booked.</li>
	<li>You can otherwise visit the cities in any order you like.</li>
	<li>You can start your trip from any city you choose. You may not take an outbound flight to your starting city.</li>
</ul>

<p><span style="line-height:1.6em">Now you could try to minimize the total distance travelled, but you did that last time, so that would be boring. Instead you noticed that each city has a distinct 5 digit ZIP (postal) code. When you visit a city for the first time (this includes the city which you start from) you write down the zip code and concatenate these into one large number (concatenate them in the order which you visited each city for the first time). What is the smallest number you can achieve?</span></p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow.</p>

<p>Each test case starts with a single line containing two integers: the number of cities <strong>N</strong> and the number of possible bidirectional flights <strong>M</strong>.</p>

<p><strong>N</strong> lines then follow, with the i-th line containing the 5-digit zip code of the i-th city. No ZIP code will have leading zeros and all ZIP codes in each test case will be distinct.</p>

<p><strong>M</strong> lines then follow, each containing two integers <strong>i</strong> and <strong>j</strong> (1 &le; <strong>i</strong> &lt; <strong>j</strong> &le; <strong>N</strong>) indicating that a bidirectional flight exists between the <strong>i</strong>-th city and the <strong>j</strong>-th city. All flights will be distinct within each test case.</p>

<p>It is guaranteed that you can visit every city following the rules above.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>0 &le; <strong>M</strong> &le; <strong>N</strong> * (<strong>N</strong> - 1) / 2.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 8.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the smallest number you can achieve by concatenating the ZIP codes along your trip.</p>

### 힌트

<p>Explanation</p>

<p>In the last sample test case, the following is the sequence of what you should do to achieve the smallest number:</p>

<ol>
	<li>Start from city 1, write 10001.</li>
	<li>Outbound flight from 1 to 2, write 10002.</li>
	<li>Outbound flight from 2 to 3, write 10003.</li>
	<li>Return flight from 3 to 2.</li>
	<li>Outbound flight from 2 to 4, write 10004.</li>
	<li>Outbound flight from 4 to 5, write 10005.</li>
	<li>Return flight from 5 to 4.</li>
	<li>Return flight from 4 to 2.</li>
	<li>Return flight from 2 to 1.</li>
	<li>Outbound flight from 1 to 6, write 10006.</li>
	<li>Return flight from 6 to 1.</li>
</ol>