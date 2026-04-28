# [Gold I] Miners - 5475

[문제 링크](https://www.acmicpc.net/problem/5475)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 251, 정답: 132, 맞힌 사람: 102, 정답 비율: 54.839%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There are two coal mines, each employing a group of miners. Mining coal is hard work, so miners need food to keep at it. Every time a shipment of food arrives at their mine, the miners produce some amount of coal. There are three types of food shipments: meat shipments, fish shipments and bread shipments.</p>

<p>Miners like variety in their diet and they will be more productive if their food supply is kept varied. More precisely, every time a new shipment arrives to their mine, they will consider the new shipment and the previous two shipments (or fewer if there haven&#39;t been that many) and then:</p>

<ul>
	<li>If all shipments were of the same type, they will produce one unit of coal.</li>
	<li>If there were two different types of food among the shipments, they will produce two units of coal.</li>
	<li>If there were three different types of food, they will produce three units of coal.</li>
</ul>

<p>We know in advance the types of food shipments and the order in which they will be sent. It is possible to influence the amount of coal that is produced by determining which shipment should go to which mine. Shipments cannot be divided; each shipment must be sent to one mine or the other in its entirety.</p>

<p>The two mines don&#39;t necessarily have to receive the same number of shipments (in fact, it is permitted to send all shipments to one mine).</p>

<p>Your program will be given the types of food shipments, in the order in which they are to be sent. Write a program that finds the largest total amount of coal that can be produced (in both mines) by deciding which shipments should be sent to mine 1 and which shipments should be sent to mine 2.&nbsp;</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 100 000), the number of food shipments.</p>

<p>The second line contains a string consisting of N characters, the types of shipments in the order in which they are to be distributed. Each character will be one of the uppercase letters &#39;M&#39; (for meat), &#39;F&#39; (for fish) or &#39;B&#39; (for bread).&nbsp;</p>

### 출력

<p>Output a single integer, the largest total amount of coal that can be produced.&nbsp;</p>

### 힌트

<p>In the sample 1, by distributing the shipments in this order: mine 1, mine 1, mine 2, mine 2, mine 1, mine 2, the shipments will result in 1, 2, 1, 2, 3 and 3 units of coal produced in that order, for a total of 12 units. There are other ways to achieve this largest amount.&nbsp;</p>