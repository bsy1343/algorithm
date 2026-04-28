# [Platinum I] Scouts - 25003

[문제 링크](https://www.acmicpc.net/problem/25003)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 256 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 세그먼트 트리

### 문제 설명

<p>Johnny&#39;s boy scout team is facing a change of its command structure. The team has $n$ scouts, numbered from $1$ to $n$. The command structure is defined as follows:</p>

<ul>
	<li>The command structure has a commander.</li>
	<li>Scouts with numbers lower than their commander&#39;s comprise the first subteam, and those with numbers higher than their commander&#39;s comprise the second subteam; one or both subteams may be empty.</li>
	<li>Nonempty subteams have their own command structures.</li>
	<li>The commander of a team is the supervisor of commanders of its subteams.</li>
</ul>

<p>The command structure will be used to convey one, very important message: the message is communicated from outside to one of the scouts, who reads it and then passes it on to his supervisor; this procedure is repeated until the message reaches the supervisor of the whole team. Different scouts take different amounts of time to read the message: the $i$-th scout takes $a_i$ time. The time it takes to handle the message is the sum of times it takes for the message to be read by all the scouts who passed it (including the commander of the entire team).</p>

<p>Unfortunately, it is not known which scout is going to receive the message. Johnny should reorganize the command structure of the team so as to minimize the maximum possible time of handling the message. Help him. Write a program which reads the number of scouts and the time it takes each of them to read the message, computes the minimum possible maximum time of handling the message and writes the result to standard output.</p>

### 입력

<p>The first line of input contains one integer $n$ ($1 \le n \le 2\,000$) --- the number of scouts. The second line of input contains a description of the team. It consists of $n$ space-separated integers $a_i$ ($1 \le a_i \le 1\,000\,000\,000$), which are the times of reading the message by the respective scouts.</p>

### 출력

<p>Your program should write one integer --- the minimum possible maximum time it can take to handle the message.</p>

### 힌트

<p>In sample 1, optimum command structure is shown below at the left. The numbers in vertices correspond to reading times for the respective scouts. The maximum time of handling the message is $13$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25003.%E2%80%85Scouts/47f10ed7.png" data-original-src="https://upload.acmicpc.net/5267594b-d996-4fe2-8123-44ec32b13966/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 157px; height: 110px;" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25003.%E2%80%85Scouts/cf17447f.png" data-original-src="https://upload.acmicpc.net/fbd6d978-63b5-43b2-9c87-6c77ae59ff79/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 156px; height: 110px;" /></p>

<p>In sample 2, an optimum command structure is shown above at the right. The numbers in vertices correspond to reading times for the respective scouts. The maximum time of handling the message is $4$.</p>