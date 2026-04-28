# [Platinum III] Railways - 8011

[문제 링크](https://www.acmicpc.net/problem/8011)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 11, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Byteotian State Railways decided to keep up with the times and introduce to their offer an InterCity connection. Because of lack of efficient engines, clean carriages and straight tracks it was possible to establish only one such a connection. The lack of any computer system for seat reservation was another obstacle. Writing the main part of this system is your task.</p>

<p>For simplicity we assume that the InterCity connection runs through &nbsp;cities numbered successively from 1 to c (the starting city has the number 1, and c is the number of the ending city). There are s seats in the train and transporting more passengers between any two successive stations is not allowed.</p>

<p>The computer system is to receive successive requests and determine whether they may be fulfilled. A request is accepted when in the given section of the railway line there is enough vacant seats in the train. Otherwise it is rejected. Partial accepting of a request is not allowed, e.g. for a part of a route or for less passengers. After accepting a request, the number of vacant seats in the train is updated. The requests are processed successively in the order of coming.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the connection and a list of requested reservations,</li>
	<li>computes which requests will be accepted, and which will be rejected,</li>
	<li>writes to the standard output the answers to all the requests.</li>
</ul>

### 입력

<p>In the first line of the standard input there are three integers c, s and r (1 &le; c &le; 60,000, 1 &le; s &le; 60,000, 1 &le; r &le; 60,000) separated by single spaces. The numbers denote respectively: the number of cities on the railway line, the number of seats in the train, and the number of requests. In the following r lines there are consecutive requests written. In the line of number i+1 there is the i-th request described. The description consists of three integers o, d and n (1 &le; o &lt; d &le; c, 1 &le; n &le; s) separated by single spaces. They denote: the number of the station of origin, the number of the destination station and the requested number of seats, respectively.</p>

### 출력

<p>Your program should write r lines to the standard output. In the i-th line there should be exactly one character:</p>

<ul>
	<li>T (for &quot;yes&quot;) - if the i-th request is accepted,</li>
	<li>N (for &quot;no&quot;) - otherwise.</li>
</ul>