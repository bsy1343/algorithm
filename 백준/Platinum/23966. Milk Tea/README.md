# [Platinum V] Milk Tea - 23966

[문제 링크](https://www.acmicpc.net/problem/23966)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 17, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 브루트포스 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>The milk tea in China is very delicious. There are many binary (&quot;either-or&quot;) options for customizing a milk tea order, such as &quot;with ice&quot;/&quot;no ice&quot;, &quot;with sugar&quot;/&quot;no sugar&quot;, &quot;with bubbles&quot;/&quot;no bubbles&quot;, &quot;with pudding&quot;/&quot;no pudding&quot;, and so on. A customer&#39;s preferences for their milk tea can be represented as a binary string. For example, using the four properties above (in the order they are given), the string&nbsp;<code>1100</code>&nbsp;means &quot;with ice, with sugar, no bubbles, no pudding&quot;.</p>

<p>Today, Shakti is on duty to buy each of his&nbsp;<b>N</b>&nbsp;friends a milk tea, at a shop that offers&nbsp;<b>P</b>&nbsp;binary options. But after collecting everyone&#39;s preferences, Shakti found that the order was getting too complicated, so Shakti has decided to buy the same type of milk tea for everyone. Shakti knows that for every friend, for every preference that is not satisfied, they will complain once. For example, if two of the friends have preferences for types&nbsp;<code>101</code>&nbsp;and&nbsp;<code>010</code>, and Shakti chooses type&nbsp;<code>001</code>, then the first friend will complain once and the second friend will complain twice, for a total of three complaints.</p>

<p>Moreover, there are&nbsp;<b>M</b>&nbsp;different forbidden types of milk tea that the shop will not make, and Shakti cannot choose any of those forbidden types.</p>

<p>What is the smallest number of complaints that Shakti can get?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing 3 integers&nbsp;<b>N</b>,&nbsp;<b>M</b>, and&nbsp;<b>P</b>, as described above. Then, there are&nbsp;<b>N</b>&nbsp;more lines, each of which contains a binary string; these represent the preferences of the&nbsp;<b>N</b>&nbsp;friends. Finally, there are&nbsp;<b>M</b>&nbsp;more lines, each of which contains a binary string; these represent the forbidden types of milk tea that the shop will not make. Binary strings consist only of&nbsp;<code>0</code>&nbsp;and/or&nbsp;<code>1</code>&nbsp;characters.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of complaints that Shakti can get, per the rules described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>All of the forbidden types of milk tea are different.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are 3 friends, and they want milk teas of types&nbsp;<code>1100</code>,&nbsp;<code>1010</code>, and&nbsp;<code>0000</code>. If Shakti could choose type&nbsp;<code>1000</code>, then each friend would complain once, for a total of 3 complaints. However, type&nbsp;<code>1000</code>&nbsp;is not available in the shop. So, given these constraints, an optimal solution is to choose type&nbsp;<code>1100</code>. Then, his friends will complain 0, 2, and 2 times, respectively, for a total of 4 complaints.</p>

<p>In Sample Case #2, Shakti&#39;s best option is to choose type&nbsp;<code>1110</code>. Each friend will complain once, for a total of 2 complaints. Notice that different friends might have the same preferences. Also notice that the limits for both the Small and Large datasets guarantee that there is always at least one possible type of milk tea that is not forbidden.</p>