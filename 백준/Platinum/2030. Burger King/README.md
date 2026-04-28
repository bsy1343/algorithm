# [Platinum V] Burger King - 2030

[문제 링크](https://www.acmicpc.net/problem/2030)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

자료 구조, 구현, 큐, 시뮬레이션

### 문제 설명

<p>After the programming contest team MSX decides to grab a bite at the Burger King. It turns out it&#39;s a rather busy evening there: each counter has a queue of people waiting to order their meals and more people keep pouring in. Since they&#39;re rather hungry from a long day of programming, team MSX wants to order food as soon as possible.</p>

<p>Team member Menno suggests that, in order to get their food as fast as possible, they should join the shortest queue. Team member Sarah disagrees: she notices that some employees are considerably slower than their colleagues, hence the team should join the queue of the fastest employee. Team member Xenon, however, notices that every now and then, some employees switch with their colleagues. If a customer was being helped during the change, this takes time, since the new employee has to start all over again in helping the customer. If the customer&#39;s order would have been&nbsp;finished at the moment of the change, though, the customer&#39;s order is finished first and the new employee immediately continues serving the next customer without delay. Besides that, the service speed is also dependent on the type of customer: a family takes considerably more time to help than a middle-aged man.</p>

<p>Team MSX decides it&#39;s best to work dynamically. All team members have a strong predictive ability, which allows them to know how much time an employee will need to help a certain customer. As they enter the Burger King, they calculate for each queue hoe long it will take until all customers in that queue have been helped. They then join the queue that will be the first one to be empty. When the situation changes, for example when the employee at a counter changes, they reevaluate which queue they should join to be able to order as soon as possible. If it turns out it&#39;s more effective to join another queue, they will not hesitate. If team MSX has to choose from multiple queues that would be equally effective, they choose the queue with the lowest identification number, unless they&#39;re in one of those queues themselves, in which case they will not switch queues. Of course, when the team switches queues, they join the end of the new queue. The switching itself takes no time at all.</p>

<p>Given a set of employees, queues of customers and a schedule of events, figure out how many minutes it takes before the team can order their well-earned diner if they choose their queues optimally.</p>

### 입력

<ul>
	<li>The&nbsp;first line of input consists of the integer number n (0 &lt; n &le; 10000), the number of test cases;</li>
	<li>Then, for each test case:
	<ul>
		<li>A line with one positive integer m (1 &le; m &le; 10): the number of queues;</li>
		<li>For each queue two lines:
		<ul>
			<li>A line with three positive integer numbers i (0 &le; i &lt; m): the (identification-) number of the queue, i<sub>c</sub> (0 &lt; i<sub>c</sub> &le; 30): the number of customers in the queue at the moment that team MSX enters the Burger King, and e<sub>c</sub> (0 &le; e<sub>c</sub> &le; 10): the minimum amount of minutes that the employee for queue i takes to help a customer. The numbers are separated by a space;</li>
			<li>A line with i<sub>c</sub> positive integer numbers, separated by spaces, where each number represents a customer in queue i and the value (0 &le; value &le; 15) represents the amount of extra minutes it takes for an employee to help this customer. The first customer in the list is the one that is standing in front of the employee (and will immediately be helped by the employee) while the last one is at the end of the queue.</li>
		</ul>
		</li>
		<li>A line with one positive integer v (0 &le; v &le; 100): the number of events taking place;</li>
		<li>Then for each event a line containing one of the following:
		<ul>
			<li>For the event of a new customer joining a queue: The string &quot;join&quot; and three positive integer numbers t<sub>v </sub>(0 &lt; t<sub>v</sub> &le; 300), the moment (beginning of the minute) at which the event occurs, i<sub>v</sub> (0 &le; i<sub>v</sub> &lt; m), the queue at which a new customer joins and c<sub>v</sub> (0 &le; c<sub>v </sub>&le; 15), the amount of extra minutes it takes for an employee to help this customer. The string and numbers are separated by spaces. A new customer always takes place last in line;</li>
			<li>For the event of an employee being replaced by another: the string &quot;change&quot; and three positive integer numbers t<sub>v</sub> (1 &le; t<sub>v</sub> &le; 300), the moment (beginning of the minute) at which the event occurs, i<sub>v</sub> (0 &le; i<sub>v </sub>&lt; m), the queue at which the employee will be replaced by a new one and e<sub>v </sub>(0 &le; e<sub>v</sub> &le; 10), the minimum amount of minutes that the new employee for queue iv takes to help a customer.</li>
			<li>The string and numbers are separated by spaces.</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

<p>No more than one event takes place in the same minute. In addition, there will never be more than 30 customers in a queue (excluding team MSX) at any time.</p>

### 출력

<p>For each test case the output contains one line with a single integer: the number of minutes team MSX needs to wait before they can order their food.</p>