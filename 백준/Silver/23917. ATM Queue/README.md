# [Silver III] ATM Queue - 23917

[문제 링크](https://www.acmicpc.net/problem/23917)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 111, 정답: 66, 맞힌 사람: 62, 정답 비율: 60.784%

### 분류

수학, 정렬

### 문제 설명

<p>There are&nbsp;<b>N</b>&nbsp;people numbered from 1 to&nbsp;<b>N</b>, standing in a queue to withdraw money from an ATM. The queue is formed in ascending order of their number. The person numbered&nbsp;<b>i</b>&nbsp;wants to withdraw amount&nbsp;<b>A<sub>i</sub></b>. The maximum amount a person can withdraw at a time is&nbsp;<b>X</b>. If they need more money than&nbsp;<b>X</b>, they need to go stand at the end of the queue and wait for their turn in line. A person leaves the queue once they have withdrawn the required amount.</p>

<p>You need to find the order in which all the people leave the queue.</p>

### 입력

<p>The first line of the input gives the number of test cases&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>The first line of each test case gives two space separated integers: the number of people standing in the queue,&nbsp;<b>N</b>&nbsp;and the maximum amount&nbsp;<b>X</b>&nbsp;that can be withdrawn in one turn.</p>

<p>The next line contains&nbsp;<b>N</b>&nbsp;space separated integers&nbsp;<b>A<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the space separated list of integers that denote the order in which the people leave the queue.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are 3 people and the limit to withdraw in one turn is 3. Below is step-by-step description of how the process will look like:</p>

<ol>
	<li>The queue initially looks like [1, 2, 3]. The first person withdraws an amount of 2 in their first attempt and leaves the queue.</li>
	<li>The queue now looks like [2, 3]. The second person wants to withdraw an amount of 7, but they can withdraw only 3 in their first turn. Since they still need to withdraw an amount of 4, they have to rejoin the queue at the end of the line.</li>
	<li>The queue now looks like [3, 2]. The third person needs to withdraw an amount of 4 but they can only withdraw 3 in their first turn so, they rejoin the queue at the end of the line to withdraw amount of 1 later.</li>
	<li>The queue now looks like [2, 3]. The second person still needs to withdraw an amount of 4. They withdraw an amount of 3 in their second turn and waits for their next turn to arrive to withdraw the remaining amount of 1.</li>
	<li>The queue now looks like [3, 2]. The third person withdraws the remaining amount of 1 and leaves the queue.</li>
	<li>The queue now looks like [2]. The second person withdraws the remaining amount of 1 and leaves the queue.</li>
	<li>The queue is now empty.</li>
</ol>

<p>The order in which people leave the queue is [1, 3, 2].</p>

<p>In Sample Case #2, there are 5 people and the limit to withdraw in one turn is 6. Below is step-by-step description of how the process will look like:</p>

<ol>
	<li>The queue initially looks like [1, 2, 3, 4, 5]. The first person withdraws an amount of 6, and joins at the end again to withdraw the remaining amount of 3 later.</li>
	<li>The queue looks like [2, 3, 4, 5, 1]. The second person similarly withdraws an amount of 6 and waits for his next turn to withdraw an amount of 4.</li>
	<li>The queue looks like [3, 4, 5, 1, 2]. The third person withdraws an amount of 4 and leaves the queue.</li>
	<li>The queue now looks like [4, 5, 1, 2]. The fourth person withdraws 6 and waits for his next turn.</li>
	<li>The queue looks like [5, 1, 2, 4]. The fifth person withdraws amount of 2 and leaves the queue.</li>
	<li>The queue looks like, [1, 2, 4]. All other people now leave the queue after their second turn one by one.</li>
</ol>

<p>The order in which people leave the queue is [3, 5, 1, 2, 4].</p>