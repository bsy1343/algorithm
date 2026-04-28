# [Platinum IV] Trucks - 30249

[문제 링크](https://www.acmicpc.net/problem/30249)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

자료 구조, 정렬, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>A worldwide logistics company is called Loners since all of the drivers ride alone. It is very important to the managers of the company to be able to answer their clients quickly and accurately about whether or not the drivers are going to deliver their goods safely from city a to city b.</p>

<p>The driver&rsquo;s job demands responsibility and alertness. For this reason, they are required to rest at a hotel no less frequently than every p amount of hours. The are hotels located at every city. Using the information you have about cities and roads that connect them, write a program that would answer to the queries of the managers.</p>

### 입력

<p>On the first line three integers separated by spaces are presented: N &ndash; number of cities, M &ndash; number of roads, U &ndash; number of manager queries. The cities are numbered from 1 to N.</p>

<p>On the following M lines, there is information about the roads presented. On each of the lines there are three integers separated by spaces: x, y and t. These integers describe that it takes t time to drive from city x to city y. The roads are always two-way and it always takes the same amount of time to ride both ways. Therefore, the the condition x &lt; y is always valid in this data. The two cities can only have one direct way between them.</p>

<p>On the remaining U amount of lines, the queries of the managers are presented. On each of the U lines, three integers are presented: a &ndash; the number of the initial city, b &ndash; the number of the end city, p &ndash; maximum amount of time that the driver can drive without rest. The condition a &lt; b will be valid.</p>

### 출력

<p>For each query, your program has to output <code>TAIP</code> (Lithuanian for yes) on a separate line in case the driver can safely deliver the goods between cities a ir b. If he cannot do that, the program has to output <code>NE</code> (Lithuanian for no).</p>

### 제한

<ul>
	<li>1 &le; N, M, U &le; 200 000</li>
	<li>1 &le; x, y, a, b &le; N</li>
	<li>1 &le; t, p &le; 10<sup>9</sup></li>
</ul>