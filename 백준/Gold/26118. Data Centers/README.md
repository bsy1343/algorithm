# [Gold V] Data Centers - 26118

[문제 링크](https://www.acmicpc.net/problem/26118)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 13, 맞힌 사람: 13, 정답 비율: 41.935%

### 분류

정렬

### 문제 설명

<p>GoncaSoft is an internet company that runs many services and has n data centers worldwide. Each data center has a number of available machines. For security and redundancy reasons, one or more copies of each service are running at the same time. Each copy runs in a separate data center, and requires a number of machines to run on. All the copies of a given service require the same number of machines.</p>

<p>When GoncaSoft plans to launch a new service i that requires c<sub>i</sub> copies, each running on m<sub>i</sub> machines, it sorts the data centers in descending order by their current available machines, and then uses m<sub>i</sub> machines in each of the top c<sub>i</sub> data centers.</p>

<p>Please calculate the remaining available machines in the data centers after launching s services in a given order.</p>

### 입력

<p>The first line of the input contains two space-separated integers n and s, representing the number of data centers GoncaSoft has and the number of new services GoncaSoft wants to launch.</p>

<p>The next line contains n space-separated integers, representing the number of available machines in each of the n data centers, before any services are launched.</p>

<p>The next s lines describe the services that will be launched: the i<sup>th</sup> line contains two space-separated integers m<sub>i</sub> and c<sub>i</sub>, representing the number of machines and the number of copies the i<sup>th</sup> service requires.</p>

### 출력

<p>Output one line containing n space-separated integers sorted in descending order, representing the number of remaining available machines in the data centers after all services have launched.</p>

### 제한

<ul>
	<li>1 &le; n &le; 100 000 and 0 &le; s &le; 5 000.</li>
	<li>Each data center has at most 10<sup>9</sup> machines initially.</li>
	<li>1 &le; m<sub>i</sub> &le; 10<sup>9</sup> for each service i such that 1 &le; i &le; s.</li>
	<li>1 &le; c<sub>i</sub> &le; n, for each service i such that 1 &le; i &le; s.</li>
	<li>The data centers will always have enough machines for the new services.</li>
</ul>