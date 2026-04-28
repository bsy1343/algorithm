# [Platinum II] Toll - 22198

[문제 링크](https://www.acmicpc.net/problem/22198)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 89, 정답: 26, 맞힌 사람: 24, 정답 비율: 51.064%

### 분류

자료 구조, 희소 배열

### 문제 설명

<p>A trucking company wants to optimize its internal processes&mdash;which mainly means saving money. The company serves a region where a toll must be paid for every single street. Each street connects two places (cities, villages etc.) directly. The company serves a set of orders; each order tells them to carry goods from one place to another. When serving an order, the company wants to pay the minimum overall toll. As the region&rsquo;s street network can be modeled by a graph where each edge has a specific cost (the toll for the respective street), the company actually wants to know (the cost of) the cheapest path between two nodes in this graph.</p>

<p>However, the region&rsquo;s street network graph has an interesting property: it is directed (i.e. all streets are oneway), and there can only be an edge from a to b if &lfloor;b/K&rfloor; = 1 + &lfloor;a/K&rfloor; (for some constant K).</p>

<p>Write a program that for each of a given list of orders outputs the minimum toll the company has to pay to serve the respective order.</p>

### 입력

<p>The first line contains four integers: K (with the meaning described above), N (the number of places), M (the number of streets), and O (the number of orders).</p>

<p>Each of the next M lines contains three integers a, b, t (0 &le; a, b &lt; N). This means that there is a (oneway) street from a to b with toll t. You are guaranteed that &lfloor;b/K&rfloor; = 1 + &lfloor;a/K&rfloor; is satisfied, and that no two locations are connected by more than one street.</p>

<p>Finally O lines follow, each containing two integers a, b: this means that there is an order to carry goods from place a to place b.</p>

### 출력

<p>Your output should consist of O lines, each with one integer. The i-th line should contain the toll on a cheapest path between the two places in order i. If no such path exists, output &minus;1 in this line.</p>

### 제한

<p>We always have 1 &le; N &le; 50 000, 1 &le; O &le; 10 000 and K &le; 5. Moreover, we have 0 &le; a &lt; b &lt; N for all orders a, b and 1 &le; t &le; 10 000 for all tolls t. For subcases, the inputs have these further restrictions.</p>