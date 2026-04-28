# [Platinum IV] Motorways - 8411

[문제 링크](https://www.acmicpc.net/problem/8411)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Byteland is covered with a developed network of payable bi-directional motorways. Each motorway connects two cities. The tolls change on every day. The toll depends on the motorway taken and the direction. The cost of driving along the motorway changes in a linear manner. In other words, for each motorway and the direction there exists a constant <em>p</em>, so that each day the toll for driving this motorway in this direction changes by&nbsp;<em>p</em>&nbsp;(the constant&nbsp;<em>p</em>&nbsp;can be negative, which means that the toll decreases;&nbsp;<em>p</em>&nbsp;can be equal to 0, i.e. the toll does not change,&nbsp;<em>p</em>&nbsp;can also be greater than zero - the toll increases). The change of all tolls occurs at midnight.</p>

<p>ByteGuy lives in the city <em>a</em>. He wishes to visit his friend, who lives in the city <em>b</em>. ByteGuy needs to drive from <em>a</em>&nbsp;to&nbsp;<em>b</em>&nbsp;and go back to <em>a</em>&nbsp;on the same day. He is a thrifty guy, so he wants to take this trip, when the cost of travelling along motorways is as low as possible. ByteGuy has to visit his friend not later than on the <em>d</em>-th day.</p>

<p>The network of motorways in Byteland is so developed, that it is possible to travel between any pair of cities. Between each pair of cities there is at most one direct connection. Byteland is a small country. Thus, if ByteGuy uses the cheapest route, he will be able to travel to the city <em>b</em>&nbsp;and then return home during a single day. It is guaranteed that during first <em>d</em>&nbsp;days the toll for each motorway is positive.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads the description of motorways, the home cities of ByteGuy (<em>a</em>) and his friend (<em>b</em>), as well as the number of days <em>d</em>,</li>
	<li>finds the minimal cost of travelling from <em>a</em>&nbsp;to&nbsp;<em>b</em>&nbsp;and back during one of <em>d</em>&nbsp;first days,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains five integers <em>n</em>, <em>m</em>, <em>a</em>, <em>b</em>, <em>d</em>, 2 &le; <em>n</em> &le; 100 000, 1 &le; <em>m</em> &le; 100 000, 2 &le; <em>d</em> &le; 10 000, where <em>n</em> is the number of cities, <em>m</em> is the number of motorways, <em>a</em> is the label of the home city of ByteGuy, <em>b</em> is the label of the home city of ByteGuy&#39;s friend, <em>d</em> is the number of days, during which ByteGuy has to do his trip. The cities are labelled with numbers from 1 to <em>n</em>. You may assume that ByteGuy and his friend live in different cities. Following <em>n</em> lines contain descriptions of consecutive motorways. Each line consists of six integers: <em>n</em><sub>1</sub>, <em>n</em><sub>2</sub>, <em>c</em><sub>1</sub>, <em>p</em><sub>1</sub>, <em>c</em><sub>2</sub>, <em>p</em><sub>2</sub>. The numbers <em>n</em><sub>1</sub> and <em>n</em><sub>2</sub> are the labels of cities connected with this motorway. The numbers <em>c</em><sub>1</sub> and <em>c</em><sub>2</sub> represent the tolls for driving from <em>n</em><sub>1</sub> to <em>n</em><sub>2</sub> and from <em>n</em><sub>2</sub> to <em>n</em><sub>1</sub> during the first day. Each of the following days, the first toll changes by <em>p</em><sub>1</sub>, while the second toll changes by <em>p</em><sub>2</sub>. It is known, that during the considered days (1 till <em>d</em>) each of the tolls will be positive and not greater than 10 000.</p>

### 출력

<p>The first and only one line of the standard output should contain exactly one integer, i.e. the minimal cost of the trip from&nbsp;&nbsp;to&nbsp;&nbsp;and back, during one of the first&nbsp;&nbsp;days.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8411.%E2%80%85Motorways/c394c5fe.png" data-original-src="https://upload.acmicpc.net/46bc26ea-7d0d-49ed-95b0-b59f21f18dfc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In order to distinguish the costs of travelling in particular directions, each motorway is represented by a pair of edges on the figure above. A pair of numbers next to every edge represents the toll for the first day and the change of the toll which happens on every day.</p>

<p>The route 1&nbsp;&rarr; 2&nbsp;&rarr; 3&nbsp;&rarr; 4&nbsp;&rarr; 1&nbsp;taken on the second day costs 23.</p>