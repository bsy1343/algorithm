# [Silver III] Stretch Rope (Small) - 14304

[문제 링크](https://www.acmicpc.net/problem/14304)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 32, 맞힌 사람: 28, 정답 비율: 71.795%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Mary likes playing with rubber bands. It&#39;s her birthday today, and you have gone to the rubber band shop to buy her a gift.</p>

<p>There are&nbsp;N&nbsp;rubber bands available in the shop. The i-th of these bands can be stretched to have any length in the range&nbsp;[A<sub>i</sub>, B<sub>i</sub>], inclusive. Two rubber bands of range [a, b] and [c, d] can be connected to form one rubber band that can have any length in the range [a+c, b+d]. These new rubber bands can themselves be connected to other rubber bands, and so on.</p>

<p>You want to give Mary a rubber band that can be stretched to a length of&nbsp;exactly&nbsp;L. This can be either a single rubber band or a combination of rubber bands. You have&nbsp;M&nbsp;dollars available. What is the smallest amount you can spend? If it is impossible to accomplish your goal, output&nbsp;<code>IMPOSSIBLE</code>&nbsp;instead.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with 3 integers&nbsp;N,&nbsp;M,&nbsp;L, the number of rubber bands available in the shop, the number of dollars you have and the desired rubber band length. Then&nbsp;N&nbsp;lines follow. Each line represents one rubber band and consists of 3 integers,&nbsp;A<sub>i</sub>, B<sub>i</sub>, and P<sub>i</sub>.&nbsp;[A<sub>i</sub>, B<sub>i</sub>]&nbsp;is the inclusive range of lengths that the i-th rubber band can stretch to, and&nbsp;P<sub>i</sub>&nbsp;is the price of the i-th rubber band in dollars.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>IMPOSSIBLE</code>&nbsp;if you cannot buy rubber bands to satisfy the goal described above, or otherwise an integer: the minimum price you can pay.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;P<sub>i</sub>&nbsp;&le;&nbsp;M.</li>
	<li>1 &le;&nbsp;L&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;A<sub>i</sub>&nbsp;&le;&nbsp;B<sub>i</sub>&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;M&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In sample case #1, none of the rubber bands in the shop are long enough on their own. It will not work to buy the two cheapest rubber bands and stick them together, because the new band would have a stretch range of [7, 9], which does not include 6. (Remember, the rubber band must be able to stretch to a length of&nbsp;<em>exactly</em>&nbsp;<strong>L</strong>.) The optimal solution is to buy the rubber bands costing 2 and 5 and stick them together; the new band has a stretch range of [4, 7], which does include 6. You have 8 dollars, so you can afford the total cost of 7 dollars.</p>

<p>In sample case #2, you need to buy all of the rubber bands to be able to stretch to length 14. That would cost 12 dollars, but you only have 11, so this case is&nbsp;<code>IMPOSSIBLE</code>.</p>