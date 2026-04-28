# [Gold I] Hiking Deer (Small2) - 12158

[문제 링크](https://www.acmicpc.net/problem/12158)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 24, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

자료 구조, 애드 혹, 우선순위 큐

### 문제 설명

<p>Herbert Hooves the deer is going for a hike: one clockwise loop around his favorite circular trail, starting at degree zero. Herbert has perfect control over his speed, which can be&nbsp;<em>any</em>&nbsp;nonnegative value (not necessarily an integer) at any time -- he can change his speed instantaneously whenever he wants. When Herbert reaches his starting point again, the hike is over.<br />
<br />
The trail is also used by human hikers, who also walk clockwise around the trail. Each hiker has a starting point and moves at her own constant speed. Humans continue to walk around and around the trail forever.<br />
<br />
Herbert is a skittish deer who is afraid of people. He does not like to have encounters with hikers. An encounter occurs whenever Herbert and a hiker are in exactly the same place at the same time. You should consider Herbert and the hikers to be points on the circumference of a circle.<br />
<br />
Herbert can have multiple separate encounters with the same hiker.<br />
<br />
If more than one hiker is encountered at the same instant, all of them count as separate encounters.<br />
<br />
Any encounter at the exact instant that Herbert finishes his hike still counts as an encounter.<br />
<br />
If Herbert were to have an encounter with a hiker and then change his speed to exactly match that hiker&#39;s speed and follow along, he would have infinitely many encounters! Of course, he must never do this.<br />
<br />
Encounters do not change the hikers&#39; behavior, and nothing happens when hikers encounter each other.<br />
<br />
Herbert knows the starting position and speed of each hiker. What is the minimum number of encounters with hikers that he can possibly have?</p>

<h3>Solving this problem</h3>

<p>Usually, Google Code Jam problems have 1 Small input and 1 Large input. This problem has 2 Small inputs and 1 Large input. You must solve the first Small input before you can attempt the second Small input; as usual, you will be able to retry the Small inputs (with a time penalty). Once you have solved both Small inputs, you will be able to download the Large input; as usual, you will get only one chance at the Large input.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with an integer&nbsp;<strong>N</strong>, and is followed by&nbsp;<strong>N</strong>&nbsp;lines, each of which represents a&nbsp;<em>group</em>&nbsp;of hikers starting at the same position on the trail. The&nbsp;<strong>i</strong>th of these lines has three space-separated integers: a starting position&nbsp;<strong>D<sub>i</sub></strong>&nbsp;(representing&nbsp;<strong>D<sub>i</sub></strong>/360ths of the way around the trail from the deer&#39;s starting point), the number&nbsp;<strong>H<sub>i</sub></strong>&nbsp;of hikers in the group, and&nbsp;<strong>M<sub>i</sub></strong>, the amount of time (in minutes) it takes for the fastest hiker in that group to make each complete revolution around the circle. The other hikers in that group each complete a revolution in&nbsp;<strong>M<sub>i</sub></strong>+1,&nbsp;<strong>M<sub>i</sub></strong>+2, ...,&nbsp;<strong>M<sub>i</sub></strong>+<strong>H<sub>i</sub></strong>-1 minutes. For example, the line<br />
<br />
<code>180 3 4</code><br />
<br />
would mean that three hikers begin halfway around the trail from the deer&#39;s starting point, and that they take 4, 5, and 6 minutes, respectively, to complete each full revolution around the trail.<br />
<br />
Herbert always starts at position 0 (0/360ths of the way around the circle), and no group of hikers does. Multiple groups of hikers may begin in the same place, but no two hikers will both begin in the same place and have the same speed.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>D<sub>i</sub></strong>&nbsp;&le; 359.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>H<sub>i</sub></strong>.</li>
	<li>1 &le;&nbsp;<strong>M<sub>i</sub></strong>&nbsp;&le; 10<sup>9</sup>. (Note that this only puts a cap on the time required for the&nbsp;<em>fastest</em>&nbsp;hiker in each group to complete a revolution. Slower hikers in the group will take longer.)</li>
	<li>The total number of hikers in each test case will not exceed 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of encounters with hikers that the deer can have.</p>

### 힌트

<p>In Case #1, the hikers all happen to be moving at the same speed, and one way for Herbert to avoid encountering any of them is to move exactly as fast as they do.<br />
<br />
In Case #2, the second hiker is moving much faster than the first, and if Herbert goes slowly enough to avoid overtaking the first hiker, he will have multiple encounters with the speedy second hiker. One optimal strategy for Herbert is to go exactly as fast as the second hiker, encountering the first hiker once and never encountering the second hiker at all.<br />
<br />
In Case #3, the two hikers start in the same place, but one is twice as fast as the other. One optimal strategy is for Herbert to immediately catch up to the slower hiker without overtaking him, follow just behind him until he passes the deer&#39;s starting position, and then finish quickly before the faster hiker can catch Herbert.</p>