# [Platinum II] Red Tape Committee (Large) - 14358

[문제 링크](https://www.acmicpc.net/problem/14358)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 33, 맞힌 사람: 22, 정답 비율: 70.968%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 수학, 확률론

### 문제 설명

<p>You are the head of the Department of Redundancy Reduction and Superfluity Shrinkage. Currently, the department cannot agree on whether there is too much &quot;red tape&quot; (inefficiency) in the department itself. They have asked you to form a Red Tape Committee to vote on the issue.</p>

<p>The department has&nbsp;N&nbsp;members. For each member, you know the probability&nbsp;P<sub>i</sub>&nbsp;that that member will vote &quot;Yes&quot;. If a member does not vote &quot;Yes&quot;, they necessarily vote &quot;No&quot;; nobody abstains.</p>

<p>You must choose exactly&nbsp;K&nbsp;members to be on the committee. The department rules dictate that&nbsp;K&nbsp;must be an even number to allow for ties, which are seen as part of a healthy bureaucracy.</p>

<p>If you choose committee members to&nbsp;maximize&nbsp;the probability of a tie, what is that probability?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow; each consists of two lines. The first line of a test case consists of two integers&nbsp;N&nbsp;and&nbsp;K, the sizes of the department and the committee. The second line of a test case consists of&nbsp;Ndecimal&nbsp; values&nbsp;P<sub>i</sub>; each has exactly two decimal places of precision and represents the probability that the&nbsp;i-th department member will vote &quot;Yes&quot;.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;K&nbsp;&le;&nbsp;N.</li>
	<li>K&nbsp;is even.</li>
	<li>0.00 &le; each&nbsp;P<sub>i</sub>&nbsp;&le; 1.00.</li>
	<li>2 &le;&nbsp;N&nbsp;&le; 200.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a floating-point number: the maximum possible probability of a tie.&nbsp;<code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>In sample case #1, you must use the only two available department members to form the committee. That committee will tie only if the two committee members vote differently, which will happen half the time. (Without loss of generality, choose the vote of the first. Then the probability that the second will vote the other way is 0.5.)</p>

<p>In sample case #2, the best strategy is to pick one of the members with &quot;Yes&quot; probability 0.00 and one of the members with &quot;Yes&quot; probability 1.00. This guarantees a tie.</p>

<p>In sample case #3, suppose that we pick the two members with &quot;Yes&quot; probabilities of 0.50 and 0.75. A tie will happen if the first one votes &quot;Yes&quot; and the second one votes &quot;No&quot; (probability 0.5 * 0.25 = 0.125), or if the first one votes &quot;No&quot; and the second one votes &quot;Yes&quot; (probability 0.5 * 0.75 = 0.375). So the total probability of a tie is 0.125 + 0.375 = 0.5. Choosing the two members with &quot;Yes&quot; probabilities of 0.50 and 1.00 would also make the tie probability 0.5, since the 1.00 member will vote &quot;Yes&quot; and the 0.50 member must vote &quot;No&quot;. Choosing the two members with &quot;Yes&quot; probabilities of 0.75 and 1.00 would make the tie probability only 0.25, since the 1.00 member will vote &quot;Yes&quot; and the 0.75 member must vote &quot;No&quot;. So 0.5 is the best we can do.</p>