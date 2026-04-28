# [Silver I] Parenting Partnering (Small) - 14811

[문제 링크](https://www.acmicpc.net/problem/14811)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 38, 맞힌 사람: 36, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>Cameron and Jamie are longtime life partners and have recently become parents! Being in charge of a baby, exciting as it is, is not without challenges. Given that both parents have a scientific mind, they have decided to take a scientific approach to baby care.</p>

<p>Cameron and Jamie are establishing a daily routine and need to decide who will be the main person in charge of the baby at each given time. They have been equal partners their whole relationship, and they do not want to stop now, so they decided that each of them will be in charge for exactly 12 hours (720 minutes) per day.</p>

<p>Cameron and Jamie have other activities that they either need or want to do on their own. Cameron has&nbsp;<strong>A<sub>C</sub></strong>&nbsp;of these and Jamie has&nbsp;<strong>A<sub>J</sub></strong>. These activities always take place at the same times each day. None of Cameron&#39;s activities overlap with Jamie&#39;s activities, so at least one of the parents will always be free to take care of the baby.</p>

<p>Cameron and Jamie want to come up with a daily baby care schedule such that:</p>

<ul>
	<li>Scheduled baby time must not interfere with a scheduled activity. That is, during Cameron&#39;s activities, Jamie has to be in charge of the baby, and vice versa.</li>
	<li>Each of Cameron and Jamie must have exactly 720 minutes assigned to them.</li>
	<li>The number of exchanges &mdash; that is, the number of times the person in charge of the baby changes from one partner to the other &mdash; must be as small as possible.</li>
</ul>

<p>For example, suppose that Jamie and Cameron have a single activity each: Jamie has a morning activity from 9 am to 10 am, and Cameron has an afternoon activity from 2 pm to 3 pm. One possible but suboptimal schedule would be for Jamie to take care of the baby from midnight to 6 am and from noon to 6 pm, and for Cameron to take care of the baby from 6 am to noon and 6 pm to midnight. That fulfills the first two conditions, and requires a total of 4 exchanges, which happen at midnight, 6 am, noon and 6 pm. If there is an exchange happening at midnight, it is counted exactly once, not zero or two times.</p>

<p>A better option would be for Cameron to take care of the baby from midnight to noon, and Jamie to take care of the baby from noon to midnight. This schedule also fulfills the first two conditions, but it uses only 2 exchanges, which is the minimum possible.</p>

<p>Given Cameron&#39;s and Jamie&#39;s lists of activities, and the restrictions above, what is the minimum possible number of exchanges in a daily schedule?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a line containing two integers&nbsp;<strong>A<sub>C</sub></strong>&nbsp;and&nbsp;<strong>A<sub>J</sub></strong>, the number of activities that Cameron and Jamie have, respectively. Then,&nbsp;<strong>A<sub>C</sub></strong>&nbsp;+&nbsp;<strong>A<sub>J</sub></strong>&nbsp;lines follow. The first&nbsp;<strong>A<sub>C</sub></strong>&nbsp;of these lines contain two integers&nbsp;<strong>C<sub>i</sub></strong>&nbsp;and&nbsp;<strong>D<sub>i</sub></strong>&nbsp;each. The i-th of Cameron&#39;s activities starts exactly&nbsp;<strong>C<sub>i</sub></strong>minutes after the start of the day at midnight and ends exactly&nbsp;<strong>D<sub>i</sub></strong>&nbsp;minutes after the start of the day at midnight (taking exactly&nbsp;<strong>D<sub>i</sub></strong>&nbsp;-&nbsp;<strong>C<sub>i</sub></strong>&nbsp;minutes). The last&nbsp;<strong>A<sub>J</sub></strong>&nbsp;of these lines contain two integers&nbsp;<strong>J<sub>i</sub></strong>&nbsp;and&nbsp;<strong>K<sub>i</sub></strong>&nbsp;each, representing the starting and ending time of one of Jamie&#39;s activities, in minutes counting from the start of the day at midnight (same format as Cameron&#39;s). No activity spans two days, and no two activities overlap (except that one might end exactly as another starts, but an exchange can still occur at that time).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>C<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>D<sub>i</sub></strong>&nbsp;&le; 24 &times; 60, for all i.</li>
	<li>0 &le;&nbsp;<strong>J<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>K<sub>i</sub></strong>&nbsp;&le; 24 &times; 60, for all i.</li>
	<li>Any two of the intervals of {[<strong>C<sub>i</sub></strong>,&nbsp;<strong>D<sub>i</sub></strong>) for all i} union {[<strong>J<sub>i</sub></strong>,&nbsp;<strong>K<sub>i</sub></strong>) for all i} have an empty intersection. (The intervals are closed on the left and open on the right, which ensures that two exactly consecutive intervals have nothing in between but do not overlap.)</li>
	<li>sum of {<strong>D<sub>i</sub></strong>&nbsp;-&nbsp;<strong>C<sub>i</sub></strong>&nbsp;for all i} &le; 720.</li>
	<li>sum of {<strong>K<sub>i</sub></strong>&nbsp;-&nbsp;<strong>J<sub>i</sub></strong>&nbsp;for all i} &le; 720.</li>
	<li>0 &le;&nbsp;<strong>A<sub>C</sub></strong>&nbsp;&le; 2.</li>
	<li>0 &le;&nbsp;<strong>A<sub>J</sub></strong>&nbsp;&le; 2.</li>
	<li>1 &le;&nbsp;<strong>A<sub>C</sub></strong>&nbsp;+&nbsp;<strong>A<sub>J</sub></strong>&nbsp;&le; 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;the minimum possible number of exchanges, as described in the statement.</p>

### 힌트

<p>Note that Sample Cases #4 and #5 would not appear in the Small dataset.</p>

<p>Sample Case #1 is the one described in the problem statement.</p>

<p>In Sample Case #2, Jamie must cover for all of Cameron&#39;s activity time, and then Cameron must cover all the remaining time. This schedule entails four exchanges.</p>

<p>In Sample Case #3, there is an exchange at midnight, from Cameron to Jamie. No matter how the parents divide up the remaining 1438 non-activity minutes of the day, there must be at least one exchange from Jamie to Cameron, and there is no reason to add more exchanges than that.</p>

<p>In Sample Case #4, note that back-to-back activities can exist for the same partner or different partners. There is no exchange at midnight because Cameron has activities both right before and right after that time. However, the schedule needs to add some time for Cameron in between Jamie&#39;s activities, requiring a total of 4 exchanges. Notice that it is optimal to add a single interval for Cameron of length 718 somewhere between minutes 2 and 1438, but the exact position of that added interval does not impact the number of exchanges, so there are multiple optimal schedules.</p>

<p>In Sample Case #5, a possible optimal schedule is to assign Cameron to the intervals (in minutes) 100-200, 500-620, and 900-1400.</p>