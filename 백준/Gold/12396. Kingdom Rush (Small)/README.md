# [Gold IV] Kingdom Rush (Small) - 12396

[문제 링크](https://www.acmicpc.net/problem/12396)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 26, 맞힌 사람: 25, 정답 비율: 75.758%

### 분류

그리디 알고리즘

### 문제 설명

<p>Ryan is playing Kingdom Rush, a single-player tower defense game developed by Ironhide Game Studio. In Kingdom Rush, players earn stars by completing levels, in a way described below. Having more stars makes the player more powerful; so while Ryan might not be able to complete level 2 right away, he might be able to complete it after earning stars from level 1.</p>

<p>The real game Kingdom Rush doesn&#39;t work in quite the same way as this problem. It isn&#39;t important to have played the game in order to solve the problem.</p>

<p>In this problem&#39;s version of Kingdom Rush, when a player completes a level, he or she is given a 1-star rating or a 2-star rating. That rating might allow the player to earn stars as follows:</p>

<ul>
	<li>If the player has never completed the level before and completes it with a 1-star rating, that player earns 1 star.</li>
	<li>If the player has never completed the level before and completes it with a 2-star rating, that player earns 2 stars.</li>
	<li>If the player has only completed the level before with a 1-star rating and completes it this time with a 2-star rating, the player earns 1 more star.</li>
</ul>

<p>Otherwise there is no way for a player to earn stars.</p>

<p>Ryan might not be able to complete every level right away. For each level, before he can complete it with a 1-star rating, he needs to have earned a certain number of stars; and he will need a larger or equal number of stars to complete that level with a 2-star rating.</p>

<p>For example, suppose there are two levels:</p>

<ul>
	<li>Level 1 requires 0 stars to complete with a 1-star rating, and 1 star to complete with a 2-star rating.</li>
	<li>Level 2 requires 0 stars to complete with a 1-star rating, and 2 stars to complete with a 2-star rating.</li>
</ul>

<p>Here&#39;s a possible series of events for Ryan:</p>

<ol>
	<li>Ryan starts with 0 stars. He can choose to complete either level 1 or level 2 with a 1-star rating. He chooses to complete level 1 with a 1-star rating. Now he has 1 star.</li>
	<li>Now Ryan can either complete level 2 with a 1-star rating, or level 1 with a 2-star rating. He chooses to complete level 1 with a 2-star rating. Now he has 2 stars.</li>
	<li>Now Ryan can complete level 2 with a 2-star rating. He does that, and now he has 4 stars.</li>
	<li>Now he is done, having completed all levels with 2-star ratings and earned 4 stars (2 per level). He has completed levels 3 times: level 1 twice, and level 2 once.</li>
</ol>

<p>Ryan is great at tower defense games, but he needs some help to beat Kingdom Rush as quickly as possible. Your job is to figure out how many times he needs to complete levels in order to earn a 2-star rating on every level.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a line containing a single integer&nbsp;<strong>N</strong>, indicating how many levels are in the game.&nbsp;&nbsp;<strong>N</strong>&nbsp;lines follow. The&nbsp;<code>i</code>th line contains two integers&nbsp;<strong>a<sub>i</sub></strong>&nbsp;and&nbsp;<strong>b<sub>i</sub></strong>: the number of stars it takes to earn a one-star rating or a two-star rating, respectively, on level&nbsp;<code>i</code>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>a<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>b<sub>i</sub></strong>&nbsp;&le; 2001.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where&nbsp;<code>x</code>&nbsp;is the case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of times Ryan must complete levels in order to have earned a 2-star rating on every level. If it is impossible for Ryan to earn a 2-star rating on every level,&nbsp;<code>y</code>&nbsp;should instead be the string &quot;Too Bad&quot; (without the &quot; characters, but with that exact capitalization). This indicates that Ryan is too bad at Kingdom Rush to finish the whole game.</p>