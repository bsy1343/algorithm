# [Platinum V] Observation Wheel (Small) - 12307

[문제 링크](https://www.acmicpc.net/problem/12307)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 6, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>An <em>observation wheel</em> consists of <strong>N</strong> passenger <em>gondolas</em> arranged in a circle, which is slowly rotating. Gondolas pass the entrance one by one, and when a gondola passes the entrance, a person may enter that gondola.</p>

<p>In this problem, the gondolas are so small that they can take just one person each, so if the gondola passing by the entrance is already occupied, the person waiting at the entrance will have to wait for the next one to arrive. If that gondola is also occupied, the person will have to wait for the next one after that, and so on, until a free gondola arrives. For simplicity, we will not consider people exiting the gondolas in this problem&nbsp;&mdash; let&#39;s assume that all people do is enter the gondolas, and then rotate with the wheel for an arbitrarily long time.</p>

<p>We want to make sure people are not disappointed because of long waiting times, and so we have introduced a flexible pricing scheme: when a person approaches the wheel, and the first gondola passing by the entrance is free, she pays <strong>N</strong> dollars for the ride. If the first gondola is occupied and she has to wait for the second one, she pays <strong>N</strong>-1 dollars for the ride. If the first two gondolas are occupied and she has to wait for the third one, she pays <strong>N</strong>-2 dollars for the ride. Generally, if she has to wait for <strong>K</strong> occupied gondolas to pass by, she pays <strong>N</strong>-<strong>K</strong> dollars. In the worst case, when she has to wait for all but one gondola to pass, she will pay just 1 dollar.</p>

<p>Let&#39;s assume that people approach our wheel at random moments in time, so for each person approaching the wheel, the first gondola to pass the entrance is picked uniformly and independently. Let&#39;s also assume that nobody will come to the wheel while there&#39;s already at least one person waiting to enter, so that we don&#39;t have to deal with queueing. A person will always take the first free gondola that passes the entrance.</p>

<p>You are given the number of gondolas and which gondolas are already occupied. How much money are we going to make, on average, until all gondolas become occupied?</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line describes one test case and contains only &#39;.&#39; (dot) or &#39;X&#39; (capital letter X) characters. The number of characters in this line gives you <strong>N</strong>. The <strong>i</strong>-th character is &#39;X&#39; when the <strong>i</strong>-th gondola is already occupied, and &#39;.&#39; when it&#39;s still free. The gondolas are numbered in the order they pass the entrance, so the 1st gondola is followed by the 2nd gondola, and so on, starting over from the beginning after the last gondola passes.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 50.</li>
	<li>1 &le; <strong>N</strong> &le; 20.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the average amount of money we will get, in dollars. Answers with absolute or relative error no larger than 10<sup>-9</sup> will be accepted.</p>

### 힌트

<p>Notes</p>

<p>Here&#39;s how the first example works. There are nine possibilities, each with probability 1/9:</p>

<p>The first person comes. If the next gondola to pass the entrance is:</p>

<ul>
	<li>The 1st gondola, which is free, the first person enters it and pays 3 dollars. Then, some time later, the second person comes. If the next gondola to pass the entrance is:
	<ul>
		<li>The 1st gondola, which is occupied, and so is the 2nd gondola, the second person has to wait until the 3rd gondola, and thus she pays just 1 dollar before entering it. In total, we&#39;ve earned 4 dollars.</li>
		<li>The 2nd gondola, which is occupied, the second person has to skip it and enter the 3rd gondola and thus pays 2 dollars. In total, we&#39;ve earned 5 dollars.</li>
		<li>The 3rd gondola, which is free, so the second person pays 3 dollars. In total, we&#39;ve earned 6 dollars.</li>
	</ul>
	</li>
	<li>The 2nd gondola, which is occupied, the first person has to skip it and enter the 3rd gondola, paying 2 dollars. Then, some time later, the second person comes. If the next gondola to pass the entrance is:
	<ul>
		<li>The 1st gondola, which is free, the second person pays 3 dollars. In total, we&#39;ve earned 5 dollars.</li>
		<li>The 2nd gondola, which is occupied (as is the 3rd gondola), the second person has to wait until the 1st gondola, and thus she pays just 1 dollar before entering it. In total, we&#39;ve earned 3 dollars.</li>
		<li>The 3rd gondola, which is occupied, the second person has to skip it and enter the 1st gondola and thus pays 2 dollars. In total, we&#39;ve earned 4 dollars.</li>
	</ul>
	</li>
	<li>The 3rd gondola, which is free, the first person enters it and pays 3 dollars. Then, some time later, the second person comes. If the next gondola to pass the entrance is:
	<ul>
		<li>The 1st gondola, which is free, the second person pays 3 dollars. In total, we&#39;ve earned 6 dollars.</li>
		<li>The 2nd gondola, which is occupied (as is the 3rd gondola), the second person has to wait until the 1st gondola, and thus she pays just 1 dollar before entering it. In total, we&#39;ve earned 4 dollars.</li>
		<li>The 3rd gondola, which is occupied, the second person has to skip it and enter the 1st gondola and thus pays 2 dollars. In total, we&#39;ve earned 5 dollars.</li>
	</ul>
	</li>
</ul>

<p>&nbsp;</p>

<p>We have nine possibilities, earning 3 dollars in one of them, 4 dollars in three of them, 5 dollars in three of them, and 6 dollars in two of them. On average, we earn (1*3+3*4+3*5+2*6)/9=42/9=4.6666666666... dollars.</p>