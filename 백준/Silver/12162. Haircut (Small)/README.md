# [Silver I] Haircut (Small) - 12162

[문제 링크](https://www.acmicpc.net/problem/12162)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 119, 정답: 64, 맞힌 사람: 55, 정답 비율: 55.556%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You are waiting in a long line to get a haircut at a trendy barber shop. The shop has&nbsp;<strong>B</strong>barbers on duty, and they are numbered 1 through&nbsp;<strong>B</strong>. It always takes the&nbsp;<strong>k</strong>th barber exactly&nbsp;<strong>M<sub>k</sub></strong>&nbsp;minutes to cut a customer&#39;s hair, and a barber can only cut one customer&#39;s hair at a time. Once a barber finishes cutting hair, he is immediately free to help another customer.<br />
<br />
While the shop is open, the customer at the head of the queue always goes to the lowest-numbered barber who is available. When no barber is available, that customer waits until at least one becomes available.<br />
<br />
You are the&nbsp;<strong>N</strong>th person in line, and the shop has just opened. Which barber will cut your hair?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of two lines. The first contains two space-separated integers&nbsp;<strong>B</strong>&nbsp;and&nbsp;<strong>N</strong>&nbsp;-- the number of barbers and your place in line. The customer at the head of the line is number 1, the next one is number 2, and so on. The second line contains&nbsp;<strong>M<sub>1</sub></strong>,&nbsp;<strong>M<sub>2</sub></strong>, ...,&nbsp;<strong>M<sub>B</sub></strong>.</p>

<div>
<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>B</strong>&nbsp;&le; 5.</li>
	<li>1 &le;&nbsp;<strong>M<sub>k</sub></strong>&nbsp;&le; 25.</li>
</ul>
</div>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of the barber who will cut your hair.</p>

### 힌트

<p>In Case #1, you are the fourth person in line, and barbers 1 and 2 take 10 and 5 minutes, respectively, to cut hair. When the shop opens, the first customer immediately has the choice of barbers 1 and 2, and she will choose the lowest-numbered barber, 1. The second customer will immediately be served by barber 2. The third customer will wait since there are no more free barbers. After 5 minutes, barber 2 will finish cutting the second customer&#39;s hair, and will serve the third customer. After 10 minutes, both barbers 1 and 2 will finish; you are next in line, and you will have the choice of barbers 1 and 2, and will choose 1.</p>