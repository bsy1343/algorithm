# [Platinum V] Railway - 7742

[문제 링크](https://www.acmicpc.net/problem/7742)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 357, 정답: 139, 맞힌 사람: 109, 정답 비율: 40.977%

### 분류

자료 구조, 트리, 최소 공통 조상, 희소 배열

### 문제 설명

<p>Several years ago, the government of the well-known country Byteland decided to build a railway network to make public transport in the country a little bit easier. However, due to insufficient funds, the minister of the transport wanted the &quot;network&quot; to be as simple as possible. Hence, the following requirements needed to be met:</p>

<ul>
	<li>Every train connects directly two cities, there are no stops in between.</li>
	<li>Every train operates in both directions (i.e., the train going from A to B goes from B to A as well) and the prices for the two directions are the same.</li>
	<li>It is possible to go from every city to every other city (possibly with some changes).</li>
	<li>The number of trains is the minimum possible.</li>
</ul>

<p>Now, the railway network has been finished and the first customers can enjoy the speed and the reliability of the Byteland railway. The only problem is the issuing of tickets: When the customer travels from A to B using 42 trains, the assistant has to sum up the prices of the trains, which is really anoying. What is more, the assistant can make a mistake. To solve the problem, the director of the Byteland Railway Corporation hired you. Your task is to write a program which calculates the price of the tickets.</p>

<p>First, the program reads the description of the railway and the prices of the trains. Then, the program is given several queries to answer: each query is a pair of cities x<sub>i</sub> and y<sub>i</sub> and the answer is the price of the ticket from x<sub>i</sub> to y<sub>i</sub>.</p>

### 입력

<p>The first line of the input contains the integers N and Q (in this order) separated by a single space. N is the number of cities, 1 &le; N &le; 100 000, and Q is the number of queries, 1 &le; Q &le; 2 000 000 000. For simplicity, the cities are numbered by the integers 1, ..., N. The following N-1&nbsp;lines describe the trains: each line contains three space-separated integers a<sub>i</sub>, b<sub>i</sub> and c<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N, 0 &le; c<sub>i</sub> &le; 2 000 000 000) meaning that there is a train from the city a<sub>i</sub> to the city b<sub>i</sub> and its cost is c<sub>i</sub>. You may assume that the railway is correct, i.e., it really forms a tree. The following Q lines describe the queries: each line contains two integers x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; N, x<sub>i</sub> &ne;&nbsp;y<sub>i</sub>) &mdash; the cities for which we want to calculate the price of the ticket.</p>

### 출력

<p>The output should contain exactly Q lines. The i-th line should contain a single integer &mdash; the price of the ticket from x<sub>i</sub> to y<sub>i</sub>. You may assume that the price of a ticket from any city to any other city will fit into 32-bit signed integer, i.e., it will fit into int in C/C++ and into longint in Pascal.</p>