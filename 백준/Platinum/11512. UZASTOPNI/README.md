# [Platinum I] UZASTOPNI - 11512

[문제 링크](https://www.acmicpc.net/problem/11512)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 76, 정답: 32, 맞힌 사람: 25, 정답 비율: 47.170%

### 분류

비트 집합, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Petar is throwing a birthday party and he decided to invite some of the employees of his company where he is the CEO.</p>

<p>Each employee, including Petar, has a unique label from 1 to N, and an accompanying type of jokes they tell V<sub>i</sub>. Also, each employee of the company except Petar has exactly one supervisor.</p>

<p>Since Petar is the CEO of the company, he has the label 1 and is directly or indirectly superordinate to all the employees.</p>

<p>At the birthday party, there are certain rules that all people present (including Petar) must follow.</p>

<ul>
	<li>At the party, there shouldn&rsquo;t be two people that tell the same type of jokes.</li>
	<li>Person X cannot be invited if their direct supervisor is not invited.</li>
	<li>Person X cannot be invited if the set of jokes the invitees that person X is superior to (directly or indirectly) tell and person X don&rsquo;t form a set of consecutive numbers.</li>
</ul>

<p>The numbers in the set are consecutive if the difference between adjacent elements is exactly 1 when the set is sorted ascendingly. For example, (3, 1, 2) and (5, 1, 2, 4, 3).</p>

<p>Petar wants to know how many different sets of jokes he can see at his party with the listed constraints.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N, (1 &le; N &le; 10 000).</p>

<p>The second line of input contains N integers, the types of jokes person i tells, V<sub>i</sub>, (1 &le; V<sub>i</sub> &le; 100).</p>

<p>Each of the following N-1 lines contains two integers A and B, (1 &le; A, B &le; N), denoting that person A is directly superior to person B.&nbsp;</p>

### 출력

<p>The first and only line of output must contain the number of different sets of jokes that comply to the previously listed constraints.</p>

### 힌트

<p>Clarification of the first example: It is possible to have the following sets of jokes at the party: {2}, {2, 3}, {2, 3, 4}, {1, 2, 3, 4}, {1, 2}, {1, 2, 3}.</p>

<p>Clarification of the second example: The only possible sets of jokes are: {3}, {3, 4}, {3, 4, 5}. Notice that the person telling joke 6 cannot be at the party because, in that case, the set of jokes {4, 6} is not a set of consecutive numbers.&nbsp;</p>