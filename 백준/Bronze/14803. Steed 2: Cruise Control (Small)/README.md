# [Bronze II] Steed 2: Cruise Control (Small) - 14803

[문제 링크](https://www.acmicpc.net/problem/14803)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 229, 정답: 177, 맞힌 사람: 157, 정답 비율: 78.109%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Annie is a bus driver with a high-stress job. She tried to unwind by going on a Caribbean cruise, but that also turned out to be stressful, so she has recently taken up horseback riding.</p>

<p>Today, Annie is riding her horse to the east along a long and narrow one-way road that runs west to east. She is currently at kilometer 0 of the road, and her destination is at kilometer&nbsp;<strong>D</strong>; kilometers along the road are numbered from west to east.</p>

<p>There are&nbsp;<strong>N</strong>&nbsp;other horses traveling east on the same road; all of them will go on traveling forever, and all of them are currently between Annie&#39;s horse and her destination. The i-th of these horses is initially at kilometer&nbsp;<strong>K<sub>i</sub></strong>&nbsp;and is traveling at its maximum speed of&nbsp;<strong>S<sub>i</sub></strong>kilometers per hour.</p>

<p>Horses are very polite, and a horse H<sub>1</sub>&nbsp;will not pass (move ahead of) another horse H<sub>2</sub>that started off ahead of H<sub>1</sub>. (Two or more horses can share the same position for any amount of time; you may consider the horses to be single points.) Horses (other than Annie&#39;s) travel at their maximum speeds, except that whenever a horse H<sub>1</sub>&nbsp;catches up to another slower horse H<sub>2</sub>, H<sub>1</sub>&nbsp;reduces its speed to match the speed of H<sub>2</sub>.</p>

<p>Annie&#39;s horse, on the other hand, does not have a maximum speed and can travel at any speed that Annie chooses, as long as it does not pass another horse. To ensure a smooth ride for her and her horse, Annie wants to choose a single constant &quot;cruise control&quot; speed for her horse for the entire trip, from her current position to the destination, such that her horse will not pass any other horses. What is the maximum such speed that she can choose?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with two integers&nbsp;<strong>D</strong>&nbsp;and&nbsp;<strong>N</strong>: the destination position of all of the horses (in kilometers) and the number of other horses on the road. Then,&nbsp;<strong>N</strong>&nbsp;lines follow. The i-th of those lines has two integers&nbsp;<strong>K<sub>i</sub></strong>&nbsp;and&nbsp;<strong>S<sub>i</sub></strong>: the initial position (in kilometers) and maximum speed (in kilometers per hour) of the i-th of the other horses on the road.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &lt;&nbsp;<strong>K<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>D</strong>&nbsp;&le; 10<sup>9</sup>, for all i.</li>
	<li><strong>K<sub>i</sub></strong>&nbsp;&ne;&nbsp;<strong>K<sub>j</sub></strong>, for all i &ne; j. (No two horses start in the same position.)</li>
	<li>1 &le;&nbsp;<strong>S<sub>i</sub></strong>&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum constant speed (in kilometers per hour) that Annie can use without colliding with other horses.&nbsp;<code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>In sample case #1, there is one other (very slow!) horse on the road; it will reach Annie&#39;s destination after 25 hours. Anything faster than 101 kilometers per hour would cause Annie to pass the horse before reaching the destination.</p>

<p>In sample case #2, there are two other horses on the road. The faster horse will catch up to the slower horse at kilometer 240 after 2 hours. Both horses will then go at the slower horse&#39;s speed for 1 more hour, until the horses reach Annie&#39;s destination at kilometer 300. The maximum speed that Annie can choose without passing another horse is 100 kilometers per hour.</p>