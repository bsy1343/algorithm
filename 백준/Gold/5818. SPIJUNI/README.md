# [Gold II] SPIJUNI - 5818

[문제 링크](https://www.acmicpc.net/problem/5818)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 66, 맞힌 사람: 64, 정답 비율: 73.563%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>You are M, the head of the intelligence agency which employs N spies with codenames from 1 to N.&nbsp;</p>

<p>Each of the spies has been assigned a different country and obtained an important piece of informationthere. Your task is the following:&nbsp;</p>

<ol>
	<li>Organize meetings between some of the spies. In each meeting, exactly two spies meet and exchange all information that they have obtained themselves or learned from other spies in previous meetings. Organizing a top-secret meeting between two spies in different countries is difficult, so each potential meeting has a price.&nbsp;</li>
	<li>After all the meetings have concluded, select a subset of spies and send them together on the world-saving (and woman-romancing) assignment. Sending a spy k on the assignment costs M<sub>k</sub>. For the assignment to succeed, it is important that the spies together know all the information obtained by the remaining spies.&nbsp;</li>
</ol>

<p>Find the minimum total price of preparing and executing this assignment.&nbsp;</p>

### 입력

<p>The first line of input contains the positive integer N, the number of spies (2 &le; N &le; 1000).&nbsp;</p>

<p>Each of the following N lines contains N positive integers not exceeding 10<sup>6</sup>. The number in row k and column m represents the price of a meeting between spies k and m and, of course, equals the number in row m and column k (for k = m the number will be 0).&nbsp;</p>

<p>The following line contains N positive integers M<sub>k</sub> (1 &le; M<sub>k</sub> &le; 10<sup>6</sup>), the prices of sending each spy on the assignment, in order for spies 1, 2, ..., N.&nbsp;</p>

### 출력

<p>The first and only line of output must contain the required minimum total price.&nbsp;</p>

### 힌트

<p>Clarification of the first example: We will organize meetings between spies 1 and 2, then 2 and 3, and send spy 2 on the assignment.</p>

<p>Clarification of the second example: We will organize a meeting between spies 2 and 3, and send spies 1 and 2 on the assignment.</p>

<p>Clarification of the third example: We will organize meetings between spies 2 and 4, then 1 and 2, then 3 and 5, and send spies 1 and 3 (or 1 and 5) on the assignment.</p>