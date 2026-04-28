# [Silver III] Oversized Pancake Flipper (Large) - 14789

[문제 링크](https://www.acmicpc.net/problem/14789)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 287, 정답: 205, 맞힌 사람: 193, 정답 비율: 73.384%

### 분류

그리디 알고리즘

### 문제 설명

<p>Last year, the Infinite House of Pancakes introduced a new kind of pancake. It has a happy face made of chocolate chips on one side (the &quot;happy side&quot;), and nothing on the other side (the &quot;blank side&quot;).</p>

<p>You are the head cook on duty. The pancakes are cooked in a single row over a hot surface. As part of its infinite efforts to maximize efficiency, the House has recently given you an oversized pancake flipper that flips exactly&nbsp;<strong>K</strong>&nbsp;consecutive pancakes. That is, in that range of&nbsp;<strong>K</strong>&nbsp;pancakes, it changes every happy-side pancake to a blank-side pancake, and vice versa; it does&nbsp;<em>not</em>&nbsp;change the left-to-right order of those pancakes.</p>

<p>You cannot flip fewer than&nbsp;<strong>K</strong>&nbsp;pancakes at a time with the flipper, even at the ends of the row (since there are raised borders on both sides of the cooking surface). For example, you can flip the first&nbsp;<strong>K</strong>&nbsp;pancakes, but not the first&nbsp;<strong>K</strong>&nbsp;- 1 pancakes.</p>

<p>Your apprentice cook, who is still learning the job, just used the old-fashioned single-pancake flipper to flip some individual pancakes and then ran to the restroom with it, right before the time when customers come to visit the kitchen. You only have the oversized pancake flipper left, and you need to use it quickly to leave all the cooking pancakes happy side up, so that the customers leave feeling happy with their visit.</p>

<p>Given the current state of the pancakes, calculate the minimum number of uses of the oversized pancake flipper needed to leave all pancakes happy side up, or state that there is no way to do it.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with a string&nbsp;<strong>S</strong>&nbsp;and an integer&nbsp;<strong>K</strong>.&nbsp;<strong>S</strong>&nbsp;represents the row of pancakes: each of its characters is either&nbsp;<code>+</code>&nbsp;(which represents a pancake that is initially happy side up) or&nbsp;<code>-</code>&nbsp;(which represents a pancake that is initially blank side up).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>Every character in&nbsp;<strong>S</strong>&nbsp;is either&nbsp;<code>+</code>&nbsp;or&nbsp;<code>-</code>.</li>
	<li>2 &le;&nbsp;<strong>K</strong>&nbsp;&le; length of&nbsp;<strong>S</strong>.</li>
	<li>2 &le; length of&nbsp;<strong>S</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is either&nbsp;<code>IMPOSSIBLE</code>&nbsp;if there is no way to get all the pancakes happy side up, or an integer representing the the minimum number of times you will need to use the oversized pancake flipper to do it.</p>

### 힌트

<p>In Case #1, you can get all the pancakes happy side up by first flipping the leftmost 3 pancakes, getting to&nbsp;<code>++++-++-</code>, then the rightmost 3, getting to&nbsp;<code>++++---+</code>, and finally the 3 pancakes that remain blank side up. There are other ways to do it with 3 flips or more, but none with fewer than 3 flips.</p>

<p>In Case #2, all of the pancakes are already happy side up, so there is no need to flip any of them.</p>

<p>In Case #3, there is no way to make the second and third pancakes from the left have the same side up, because any flip flips them both. Therefore, there is no way to make all of the pancakes happy side up.</p>