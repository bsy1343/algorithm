# [Silver III] Vote (Small) - 14298

[문제 링크](https://www.acmicpc.net/problem/14298)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 58, 맞힌 사람: 50, 정답 비율: 60.241%

### 분류

브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 확률론

### 문제 설명

<p>A and B are the only two candidates competing in a certain election. We know from polls that exactly&nbsp;N&nbsp;voters support A, and exactly&nbsp;M&nbsp;voters support B. We also know that&nbsp;N&nbsp;is greater than&nbsp;M, so A will win.</p>

<p>Voters will show up at the polling place one at a time, in an order chosen uniformly at random from all possible (N&nbsp;+&nbsp;M)! orders. After each voter casts their vote, the polling place worker will update the results and note which candidate (if any) is winning so far. (If the votes are tied, neither candidate is considered to be winning.)</p>

<p>What is the probability that A stays in the lead the entire time -- that is, that A will always be winning after every vote?</p>

### 입력

<p>The input starts with one line containing one integer&nbsp;T, which is the number of test cases. Each test case consists of one line with two integers&nbsp;N&nbsp;and&nbsp;M: the numbers of voters supporting A and B, respectively.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;M&nbsp;&lt;&nbsp;N&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the probability that A will always be winning after every vote.</p>

<p><code>y</code>&nbsp;will be considered correct if&nbsp;<code>y</code>&nbsp;is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.&nbsp;</p>

### 힌트

<p>In sample case #1, there are 3 voters. Two of them support A -- we will call them A1 and A2 -- and one of them supports B. They can come to vote in six possible orders: A1 A2 B, A2 A1 B, A1 B A2, A2 B A1, B A1 A2, B A2 A1. Only the first two of those orders guarantee that Candidate A is winning after every vote. (For example, if the order is A1 B A2, then Candidate A is winning after the first vote but tied after the second vote.) So the answer is 2/6 = 0.333333...</p>

<p>In sample case #2, there is only 1 voter, and that voter supports A. There is only one possible order of arrival, and A will be winning after the one and only vote.</p>