# [Gold V] Wi-fi Towers (Small) - 12615

[문제 링크](https://www.acmicpc.net/problem/12615)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 33, 맞힌 사람: 32, 정답 비율: 96.970%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>You are given a network of wireless towers. Each tower has a range and can send data to neighboring towers as long as the distance is less than or equal to the sending tower&#39;s range.</p>

<p>The towers are using an old communication protocol A, but there is a new, better protocol B available. We are thinking about upgrading some towers to send data using protocol B to achieve better bandwidth.</p>

<p>There is one important restriction: if a tower T is using the new protocol B, every tower within T&#39;s range must also be running protocol B, so that they can understand the data sent from T. The reverse is not necessary &mdash; towers running the new protocol B can be sent data from towers using the old protocol A.</p>

<p>Your task is to select the best set of towers to upgrade from protocol A to protocol B. There is some benefit to upgrading a tower, but there are also installation costs. So each tower will have a score, which can be positive or negative, which is the value of upgrading the tower. Choose the set of towers to upgrade in such a way that the total score of the upgraded towers is maximized.</p>

### 입력

<p>The first line contains the number of test cases,&nbsp;<strong>T</strong>. Each test case starts with the number of towers,&nbsp;<strong>n</strong>. The following&nbsp;<strong>n</strong>&nbsp;lines each contain 4 integers:&nbsp;<strong>x</strong>,&nbsp;<strong>y</strong>,&nbsp;<strong>r</strong>,&nbsp;<strong>s</strong>. They describe a tower at coordinates&nbsp;<strong>x</strong>,&nbsp;<strong>y</strong>&nbsp;having a range of&nbsp;<strong>r</strong>&nbsp;and a score (value of updating to the new protocol) of&nbsp;<strong>s</strong></p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 55</li>
	<li>-10 000 &le;&nbsp;<strong>x</strong>,&nbsp;<strong>y</strong>&nbsp;&le; 10 000</li>
	<li>1 &le;&nbsp;<strong>r</strong>&nbsp;&le; 20 000</li>
	<li>-1000 &le;&nbsp;<strong>s</strong>&nbsp;&le; 1000</li>
	<li>No two towers will have the same coordinates.</li>
	<li>1 &le;&nbsp;<strong>n</strong>&nbsp;&le; 15</li>
</ul>

### 출력

<p>For each test case, output:</p>

<pre>
Case #X: score</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>score</strong>&nbsp;is the total score for the best choice of towers.</p>

<div>&nbsp;</div>