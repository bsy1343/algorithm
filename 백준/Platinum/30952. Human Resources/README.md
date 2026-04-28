# [Platinum IV] Human Resources - 30952

[문제 링크](https://www.acmicpc.net/problem/30952)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 111, 정답: 31, 맞힌 사람: 26, 정답 비율: 29.885%

### 분류

그래프 이론, 문자열, 그래프 탐색, 해 구성하기, 깊이 우선 탐색, 비트마스킹, 파싱

### 문제 설명

<p>You work at ECorp and your Human Resources department is migrating employee data from an on-premise system provided by Hooli to a new Cloud Native solution provided by a fresh startup Pied Piper. Sadly the new system does not yet have feature parity with the old one and they need your help to store and display the entire management structure. The system is lean and conscious of resource usage so they can only afford to increase their storage by two kilobits.</p>

### 입력

<p>The first line of the input will be a command to execute either <code>ENCODE</code> or <code>DECODE</code>.</p>

<p><strong>Encode</strong></p>

<p>You will receive lines describing managers and their direct reports/subordinates. All lines will start with the name of the manager, followed by a colon, followed by a space-separated list of their direct reports ordered from their most to least favorite. Colons have a trailing space. No manager is listed before their manager, if they have one.</p>

<p><strong>Decode</strong></p>

<p>In the decode case you will be given the output that your program printed in the encode case: a list of all employee names in an arbitrary order, one per line, followed by a single line with a binary string $B$.</p>

### 출력

<p><strong>Encode</strong></p>

<p>Your program must first output the names of all the employees, one per line in an arbitrary order (this was a requirement from upper management). One additional line is dedicated for your encoding string $B$ which must consist of ones and zeros and not exceed 2048 characters.</p>

<p><strong>Decode</strong></p>

<p>Output the original structure in the same format as it was originally given. The order of manager definitions does not have to be the same, but every one must come after their manager if they have one. However, the order of reports for any specific manager has to remain the same (from their most to least favorite).</p>

### 제한

<ul>
	<li>$2 \leq$ number of all employees at ECorp $\leq 600$</li>
	<li>$|B| \leq 2048$</li>
	<li>Employee names are at most 10 characters long and consist of upper and lower case letters of the English alphabet.</li>
	<li>There is exactly one employee without a manager (the company CEO) and no employee has more than one manager.</li>
</ul>

### 힌트

<p>The encoding in the example above uses two consecutive characters for every person as they are ordered in the list. 11 denotes the CEO (Janez). 00 denotes a person at the second level of hierarchy. Their order in the CEO&#39;s list of direct reports is the same as in the encoded list of names (Josip and Zofia). Luckily, there are just two in this case. 10 denotes Zofia&#39;s report and 01 would denote Josip&#39;s reports, which he does not have.</p>