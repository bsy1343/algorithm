# [Bronze II] Voting - 4581

[문제 링크](https://www.acmicpc.net/problem/4581)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 446, 정답: 359, 맞힌 사람: 328, 정답 비율: 80.988%

### 분류

구현, 문자열

### 문제 설명

<p>A committee clerk is good at recording votes, but not so good at counting and figuring the outcome correctly. &nbsp;As a roll call vote proceeds, the clerk records votes as a sequence of letters, with one letter for every member of the committee:</p>

<ul>
	<li>Y means a yes vote</li>
	<li>N means a no vote</li>
	<li>P means present, but choosing not to vote</li>
	<li>A indicates a member who was absent from the meeting</li>
</ul>

<p>Your job is to take this recorded list of votes and determine the outcome.</p>

<p>Rules: There must be a quorum. &nbsp;If at least half of the members were absent, respond &quot;need quorum&quot;. &nbsp;Otherwise votes are counted. &nbsp; If there are more yes than no votes, respond &quot;yes&quot;. &nbsp; If there are more no than yes votes, respond &quot;no&quot;. &nbsp; If there are the same number of yes and no votes, respond &quot;tie&quot;.&nbsp;</p>

### 입력

<p>The input contains of a series of votes, one per line, followed by a single line with the # character. Each vote consists entirely of the uppercase letters discussed above. Each vote will contain at least two letters and no more than 70 letters.</p>

### 출력

<p>For each vote, the output is one line with the correct choice &quot;need quorum&quot;, &quot;yes&quot;, &quot;no&quot; or &quot;tie&quot;.</p>