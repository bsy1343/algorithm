# [Silver III] Senate Evacuation (Small) - 14363

[문제 링크](https://www.acmicpc.net/problem/14363)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 45, 맞힌 사람: 37, 정답 비율: 71.154%

### 분류

해 구성하기, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>A small fire started in the senate room, and it needs to be evacuated!</p>

<p>There are some senators in the senate room, each of whom belongs to of one of&nbsp;N&nbsp;political parties. Those parties are named after the first&nbsp;N&nbsp;(uppercase) letters of the English alphabet.</p>

<p>The emergency door is wide enough for up to two senators, so in each step of the evacuation, you may choose to remove either one or two senators from the room.</p>

<p>The senate rules indicate the senators in the room may vote on any bill at any time, even in the middle of an evacuation! So, the senators must be evacuated in a way that ensures that no party ever has an absolute majority. That is, it can never be the case after any evacuation step that more than half of the senators in the senate room belong to the same party.</p>

<p>Can you construct an evacuation plan? The senate is counting on you!</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of two lines. The first line contains a single integer&nbsp;N, the number of parties. The second line contains&nbsp;N&nbsp;integers,&nbsp;P<sub>1</sub>,&nbsp;P<sub>2</sub>, ...,&nbsp;P<sub>N</sub>, where&nbsp;P<sub>i</sub>&nbsp;represents the number of senators of the party named after the i-th letter of the alphabet.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 50.</li>
	<li>No party will have an absolute majority before the start of the evacuation.</li>
	<li>1 &le;&nbsp;P<sub>i</sub>&nbsp;&le; 1000, for all i.</li>
	<li>2 &le;&nbsp;N&nbsp;&le; 3.</li>
	<li>sum of all&nbsp;P<sub>i</sub>&nbsp;&le; 9.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the evacuation plan. The plan must be a space-separated list of instructions, in the order in which they are to be carried out, where each instruction is either one or two characters, representing the parties of the senators to evacuate in each step.</p>

<p>It is guaranteed that at least one valid evacuation plan will exist. If multiple evacuation plans are valid, you may output any of them.</p>

### 힌트

<p>The sample output displays one set of answers to the sample cases. Other answers may be possible.</p>

<p>In Case #1, there are two senators from each of the parties A and B. If we remove one from each party every time, the perfect balance is maintained until evacuation is complete.</p>

<p>Case #2 proceeds as follows:</p>

<p>Initially in the room: 3 A, 2 B, 2 C.<br />
Evacuate AA. Still in the room: 1 A, 2 B, 2 C.<br />
Evacuate BC. Still in the room: 1 A, 1 B, 1 C.<br />
Evacuate C. Still in the room: 1 A, 1 B.<br />
Evacuate AB. Evacuation complete!</p>

<p>Note that it would not be valid to begin the evacuation with BC, which would leave 3 A, 1 B, and 1 C in the room; party A would have an absolute majority (3 out of 5 = 60%).</p>

<p>For Case #3, note that&nbsp;<code>CC AB</code>&nbsp;would also be a valid answer, and&nbsp;<code>C C AB</code>&nbsp;is also valid even though it requires three evacuation steps instead of two.</p>