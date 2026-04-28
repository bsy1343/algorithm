# [Gold IV] Infinite House of Pancakes (Large) - 12169

[문제 링크](https://www.acmicpc.net/problem/12169)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 125, 정답: 55, 맞힌 사람: 51, 정답 비율: 48.571%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>At the Infinite House of Pancakes, there are only finitely many pancakes, but there are infinitely many diners who would be willing to eat them! When the restaurant opens for breakfast, among the infinitely many diners, exactly&nbsp;&nbsp;<strong>D</strong>&nbsp;have non-empty plates; the&nbsp;<strong>i</strong>th of these has&nbsp;<strong>P<sub>i</sub></strong>&nbsp;pancakes on his or her plate. Everyone else has an empty plate.<br />
<br />
Normally, every minute, every diner with a non-empty plate will eat one pancake from his or her plate. However, some minutes may be&nbsp;<em>special</em>. In a special minute, the head server asks for the diners&#39; attention, chooses a diner with a non-empty plate, and carefully lifts some number of pancakes off of that diner&#39;s plate and moves those pancakes onto one other diner&#39;s (empty or non-empty) plate. No diners eat during a special minute, because it would be rude.<br />
<br />
You are the head server on duty this morning, and it is your job to decide which minutes, if any, will be special, and which pancakes will move where. That is, every minute, you can decide to either do nothing and let the diners eat, or declare a special minute and interrupt the diners to make a single movement of one or more pancakes, as described above.<br />
<br />
Breakfast ends when there are no more pancakes left to eat. How quickly can you make that happen?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with&nbsp;<strong>D</strong>, the number of diners with non-empty plates, followed by another line with&nbsp;<strong>D</strong>&nbsp;space-separated integers representing the numbers of pancakes on those diners&#39; plates.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the smallest number of minutes needed to finish the breakfast.</p>

### 힌트

<p>In Case #1, one diner starts with 3 pancakes and everyone else&#39;s plate is empty. One optimal strategy is:<br />
<br />
Minute 1: Do nothing. The diner will eat one pancake.<br />
<br />
Minute 2 (special): Interrupt and move one pancake from that diner&#39;s stack onto another diner&#39;s empty plate. (Remember that there are always infinitely many diners with empty plates available, no matter how many diners start off with pancakes.) No pancakes are eaten during an interruption.<br />
<br />
Minute 3: Do nothing. Each of those two diners will eat one of the last two remaining pancakes.<br />
<br />
In Case #2, it is optimal to let the diners eat for 2 minutes, with no interruptions, during which time they will finish all the pancakes.<br />
<br />
In Case #3, one diner starts with 4 pancakes and everyone else&#39;s plate is empty. It is optimal to use the first minute as a special minute to move two pancakes from the diner&#39;s plate to another diner&#39;s empty plate, and then do nothing and let the diners eat for the second and third minutes.</p>