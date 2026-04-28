# [Gold IV] Super Phyllis - 9859

[문제 링크](https://www.acmicpc.net/problem/9859)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 14, 맞힌 사람: 14, 정답 비율: 45.161%

### 분류

자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Phyllis works for a large, multi-national corporation. She moves from department to department where her job is to uncover and remove any redundancies inherent in the day-to-day activities of the workers. And she is quite good at her job.</p>

<p>During her most recent assignment, she was given the following chart displaying the chain of command within the department:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9859.%E2%80%85Super%E2%80%85Phyllis/8b9111e2.png" data-original-src="https://www.acmicpc.net/upload/images2/phy.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:134px; width:159px" /></p>

<p>Figure 1</p>

<p>Whenever anyone needs to send a report to their bosses, they use the above chart, sending one report along each arrow. Phyllis realized almost instantly that there were redundancies here. Specifically, since D sends a report to B and B sends a report to A, there&rsquo;s really no need for D to send a report to A directly, since it will be summarized in the report B sends to A. Thus the connection from D to A can be removed. If there had also been a connection from C to B, then the connections from D to B and C to A could have been removed as well.</p>

<p>Phyllis would like your help with this. Given a description of a chart like the one above, she would like a program that identifies all connections that can be removed from the chart.</p>

### 입력

<p>The first line of each test case will contain a positive integer m indicating the number of connections in the chart. Following that will be m lines each containing two strings s<sub>1</sub> s<sub>2</sub> indicating that there is a connection from employee s<sub>1</sub> to his/her boss s2. In any test case there will be no more than 200 employees listed and no connection will appear more than once. A line containing a single 0 will terminate the input.</p>

### 출력

<p>For each test case, output the number of connections that should be removed followed by a list of the deleted connections in lexicographic order. Connection s<sub>1</sub> s<sub>2</sub> should be represented by the string <code>s1,s2</code>.</p>