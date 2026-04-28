# [Gold IV] MANAGER - 3802

[문제 링크](https://www.acmicpc.net/problem/3802)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 18, 맞힌 사람: 16, 정답 비율: 32.000%

### 분류

자료 구조, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>One of the programming paradigm in parallel processing is the producer/consumer paradigm that can be implemented using a system with a &quot;manager&quot; process and several &quot;client&quot; processes. The clients can be producers, consumers, etc. The manager keeps a trace of client processes. Each process is identified by its cost that is a strictly positive integer in the range 1 .. 10000. The number of processes with the same cost cannot exceed 10000. The queue is managed according to three types of requests, as follows:</p>

<ul>
	<li>a x - add to the queue the process with the cost x;</li>
	<li>r - remove a process, if possible, from the queue according to the current manager policy;</li>
	<li>p i - enforce the policy i of the manager, where i is 1 or 2. The default manager policy is 1</li>
	<li>e - ends the list of requests.</li>
</ul>

<p>There are two manager policies:</p>

<ul>
	<li>1 - remove the minimum cost process</li>
	<li>2 - remove the maximum cost process</li>
</ul>

<p>The manager will print the cost of a removed process only if the ordinal number of the removed process is in the removal list.</p>

<p>Your job is to write a program that simulates the manager process.</p>

### 입력

<p>Each data set in the input has the following format:</p>

<ul>
	<li>the maximum cost of the processes</li>
	<li>the length of the removal list</li>
	<li>the removal list - the list of ordinal numbers of the removed processes that will be displayed; for example 1 4 means that the cost of the first and fourth removed processes will be displayed</li>
	<li>the list of requests each on a separate line.</li>
</ul>

<p>Each data set ends with an e request. The data sets are separated by empty lines.</p>

### 출력

<p>The program prints on standard output the cost of each process that is removed, provided that the ordinal number of the remove request is in the list and the queue is not empty at that moment. If the queue is empty the program prints -1. The results are printed on separate lines. An empty line separates the results of different data sets.</p>