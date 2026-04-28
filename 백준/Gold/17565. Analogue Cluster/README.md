# [Gold III] Analogue Cluster - 17565

[문제 링크](https://www.acmicpc.net/problem/17565)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 29, 맞힌 사람: 29, 정답 비율: 70.732%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>For his thesis in distributed systems, Drew is focusing on an underserved market ripe for disruption: the player piano, a genus of analogue device which, given a piece of paper of appropriate style and width, can play whatever song is copied onto it.</p>

<p>Drew is going to network these devices; they will communicate using their native medium of long pieces of paper.</p>

<p>He hit a snag immediately: pianos can only communicate directly if they take the same width of paper, and not all of the pianos in the computer science department take the same width of paper. Some will need to be retrofitted if his plans are to succeed.</p>

<p>Time is valuable and, in particular, the time of the expensive technician Drew has hired to carry out the work is eye-wateringly valuable. What is the smallest number of pianos he can get away with modifying to make his project work?</p>

### 입력

<ul>
	<li>One line containing the number of pianos, n (1 &le; n &le; 1000), followed by the number of connections between pianos, c (1 &le; c &le; 10<sup>5</sup>).</li>
	<li>One line containing the n integer widths of each piano&rsquo;s paper intake in centimetres, in order, w<sub>1</sub> to w<sub>n</sub> (1 &le; w &le; 10<sup>6</sup>).</li>
	<li>Each of the following c lines are all distinct, and each contains two integers a and b (1 &le; a &lt; b &le; n) indicating that pianos a and b need to become compatible.</li>
</ul>

### 출력

<p>Output the minimum number of pianos that can be modified in order for all of the connections to become possible.</p>