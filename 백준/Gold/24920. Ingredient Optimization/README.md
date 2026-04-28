# [Gold IV] Ingredient Optimization - 24920

[문제 링크](https://www.acmicpc.net/problem/24920)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 23, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

구현, 자료 구조, 정렬, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>Hathai is proud that her catering service provides the freshest food in town. To accomplish that, she gets fresh ingredients with no preservatives delivered constantly. This brings about the challenge of preventing the ingredients from spoiling. Her current special uses exactly $U$ leaves of Thai basil, that need special care.</p>

<p>Hathai has the schedule of the deliveries of Thai basil. The $i$-th delivery comes at the beginning of time&nbsp;$M_i$&nbsp;(in minutes since opening time), and brings exactly&nbsp;$L_i$&nbsp;leaves of Thai basil that can be stored for at most&nbsp;$E_i$&nbsp;minutes since arriving. Hathai has orders to prepare her specialty dish at times&nbsp;$O_1,O_2, \dots ,O_N$. Order&nbsp;$i$&nbsp;can only be fulfilled if she has&nbsp;$U$&nbsp;unspoiled leaves of Thai basil at time&nbsp;$O_i$. Note that if leaves would spoil at the same time an order comes in, those leaves cannot be used to fulfill that order. If an order is fulfilled,&nbsp;$U$&nbsp;of the leaves available have to be used and cannot be used for future orders. Once Hathai gets an order that she cannot fulfill, all of the remaining orders will also be canceled because she needs to close her kitchen and think about how to improve the fulfillment schedule.</p>

<p>For example, suppose Hathai&#39;s schedule has the following&nbsp;$4$&nbsp;deliveries:</p>

<ul>
	<li>Delivery time:&nbsp;$1$. Amount:&nbsp;$10$. Time remaining until spoiled:&nbsp;$2$.</li>
	<li>Delivery time:&nbsp;$3$. Amount:&nbsp;$4$. Time remaining until spoiled:&nbsp;$2$.</li>
	<li>Delivery time:&nbsp;$5$. Amount:&nbsp;$1$. Time remaining until spoiled:&nbsp;$4$.</li>
	<li>Delivery time:&nbsp;$10$. Amount:&nbsp;$6$. Time remaining until spoiled:&nbsp;$3$.</li>
</ul>

<p>And also suppose she has&nbsp;$4$&nbsp;orders placed at times&nbsp;$3$,&nbsp;$4$,&nbsp;$6$&nbsp;and&nbsp;$10$. Each order requires using&nbsp;$U=2$&nbsp;leaves in this example.</p>

<p>The first delivery become spoiled at time&nbsp;$3$, so it cannot be used on any order. Then the first order and the second order at time&nbsp;$3$&nbsp;and time&nbsp;$4$&nbsp;can be fulfilled and use up the&nbsp;$4$&nbsp;leaves from the second delivery. For the third order at time&nbsp;$6$, there is only&nbsp;$1$&nbsp;leaf in the storage, so Hathai cannot fulfill this order. Note that although there is a delivery at time&nbsp;$10$, she still cannot fulfill the fourth order at time&nbsp;$10$&nbsp;because she has already closed her kitchen. In this example, Hathai managed to fulfill&nbsp;$2$&nbsp;orders in total.</p>

<p>Given the delivery and order schedules, find out the maximum number of orders Hathai can fulfill if she optimizes the use of the Thai basil leaves.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case starts with a line containing three integers&nbsp;$D$,&nbsp;$N$, and&nbsp;$U$: the number of deliveries, the number of orders and the amount of leaves needed for each order, respectively. Then,&nbsp;$D$&nbsp;lines follow. The&nbsp;$i$-th of these lines contains three integers&nbsp;$M_i$,&nbsp;$L_i$, and&nbsp;$E_i$: the time of the delivery in minutes since opening time, the amount of Thai basil leaves delivered, and the number of minutes those leaves can be stored and remain fresh, respectively, of the&nbsp;$i$-th delivery. Then, the last line contains&nbsp;$N$&nbsp;integers&nbsp;$O_1,O_2, \dots ,O_N$, where&nbsp;$O_j$&nbsp;is the time, in minutes since opening time, at which the&nbsp;$j$-th order must be prepared.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$ is the test case number (starting from 1) and&nbsp;$y$ is an integer representing the maximum number of orders Hathai can fulfill.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;D&le;100$.</li>
	<li>$1&le;N&le;100$.</li>
	<li>$1&le;U&le;100$.</li>
	<li>$1&le;M_i&le;10^9$, for all&nbsp;$i$.</li>
	<li>$M_i&lt;M_{i+1}$, for all $i$. (Deliveries are given in increasing order of time.)</li>
	<li>$1&le;L_i&le;100$, for all&nbsp;$i$.</li>
	<li>$1&le;O_j&le;10^9$, for all&nbsp;$j$.</li>
	<li>$O_j&lt;O_{j+1}$, for all $j$. (Orders are given in increasing order of time.)</li>
</ul>