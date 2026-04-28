# [Silver IV] Revenge of the Pancakes (Small) - 14383

[문제 링크](https://www.acmicpc.net/problem/14383)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 123, 맞힌 사람: 111, 정답 비율: 83.459%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>The Infinite House of Pancakes has just introduced a new kind of pancake! It has a happy face made of chocolate chips on one side (the &quot;happy side&quot;), and nothing on the other side (the &quot;blank side&quot;).</p>

<p>You are the head waiter on duty, and the kitchen has just given you a stack of pancakes to serve to a customer. Like any good pancake server, you have X-ray pancake vision, and you can see whether each pancake in the stack has the happy side up or the blank side up. You think the customer will be happiest if every pancake is happy side up when you serve them.</p>

<p>You know the following maneuver: carefully lift up some number of pancakes (possibly all of them) from the top of the stack, flip that entire group over, and then put the group back down on top of any pancakes that you did not lift up. When flipping a group of pancakes, you flip the entire group in one motion; you do&nbsp;not&nbsp;individually flip each pancake. Formally: if we number the pancakes 1, 2, ...,&nbsp;N&nbsp;from top to bottom, you choose the top&nbsp;i&nbsp;pancakes to flip. Then, after the flip, the stack is&nbsp;i,&nbsp;i-1, ..., 2, 1,&nbsp;i+1,&nbsp;i+2, ...,&nbsp;N. Pancakes 1, 2, ...,&nbsp;i now have the opposite side up, whereas pancakes&nbsp;i+1,&nbsp;i+2, ...,&nbsp;N&nbsp;have the same side up that they had up before.</p>

<p>For example, let&#39;s denote the happy side as&nbsp;<code>+</code>&nbsp;and the blank side as&nbsp;<code>-</code>. Suppose that the stack, starting from the top, is&nbsp;<code>--+-</code>. One valid way to execute the maneuver would be to pick up the top three, flip the entire group, and put them back down on the remaining fourth pancake (which would stay where it is and remain unchanged). The new state of the stack would then be&nbsp;<code>-++-</code>. The other valid ways would be to pick up and flip the top one, the top two, or all four. It would not be valid to choose and flip the middle two or the bottom one, for example; you can only take some number off the top.</p>

<p>You will not serve the customer until every pancake is happy side up, but you don&#39;t want the pancakes to get cold, so you have to act fast! What is the smallest number of times you will need to execute the maneuver to get all the pancakes happy side up, if you make optimal choices?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with a string&nbsp;S, each character of which is either&nbsp;<code>+</code>&nbsp;(which represents a pancake that is initially happy side up) or&nbsp;<code>-</code>&nbsp;(which represents a pancake that is initially blank side up). The string, when read left to right, represents the stack when viewed from top to bottom.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>Every character in&nbsp;S&nbsp;is either&nbsp;<code>+</code>&nbsp;or&nbsp;<code>-</code>.</li>
	<li>1 &le; length of&nbsp;S&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of times you will need to execute the maneuver to get all the pancakes happy side up.</p>

### 힌트

<p>In Case #1, you only need to execute the maneuver once, flipping the first (and only) pancake.</p>

<p>In Case #2, you only need to execute the maneuver once, flipping only the first pancake.</p>

<p>In Case #3, you must execute the maneuver twice. One optimal solution is to flip only the first pancake, changing the stack to&nbsp;<code>--</code>, and then flip both pancakes, changing the stack to&nbsp;<code>++</code>. Notice that you cannot just flip the bottom pancake individually to get a one-move solution; every time you execute the maneuver, you must select a stack starting from the top.</p>

<p>In Case #4, all of the pancakes are already happy side up, so there is no need to do anything.</p>

<p>In Case #5, one valid solution is to first flip the entire stack of pancakes to get&nbsp;<code>+-++</code>, then flip the top pancake to get&nbsp;<code>--++</code>, then finally flip the top two pancakes to get&nbsp;<code>++++</code>.</p>