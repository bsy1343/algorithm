# [Platinum I] Servers - 6302

[문제 링크](https://www.acmicpc.net/problem/6302)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>The Kingdom of Byteland decided to develop a large computer network of servers offering various services.</p>

<p>The network is built of n servers connected by bidirectional wires. Two servers can be directly connected by at most one wire. Each server can be directly connected to at most 10 other servers and every two servers are connected with some path in the network. Each wire has a fixed positive data transmission time measured in milliseconds. The distance (in milliseconds) d(V,W) between two servers V and W is defined as the length of the shortest (transmission time-wise) path connecting V and W in the network. For convenience we let d(V,V)=0 for all V.</p>

<p>Some servers offer more services than others. Therefore each server V is marked with a natural number r(V), called a rank. The bigger the rank the more powerful a server is.</p>

<p>At each server, data about nearby servers should be stored. However, not all servers are interesting. The data about distant servers with low ranks do not have to be stored. More specifically, a server W is interesting for a server V if for every server U such that d(v,U) &le; d(V,W) we have r(U) &le; r(W).</p>

<p>For example, all servers of the maximal rank are interesting to all servers. If a server V has the maximal rank, then exactly the servers of the maximal rank are interesting for V. Let B(V) denote the set of servers interesting for a server V.</p>

<p>We want to compute the total amount of data about servers that need to be stored in the network being the total sum of sizes of all sets B(V). The Kingdom of Byteland wanted the data to be quite small so it built the network in such a way that this sum does not exceed 30n.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the description of a server network from the standard input,</li>
	<li>computes the total amount of data about servers that need to be stored in the network,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line there are two natural numbers n, m, where n is the number of servers in the network (1 &le; n &le; 30000) and m is the number of wires (1 &le; m &le; 5n)). The numbers are separated by single space.</p>

<p>In the next n lines the ranks of the servers are given. Line i contains one integer ri (1 &le; ri &le; 10) -- the rank of i-th server.</p>

<p>In the following m lines the wires are described. Each wire is described by three numbers a, b, t (11 &le; t &le; 1000, 1 &le; a, b &le; n, a &ne; b), where a and b are numbers of the servers connected by the wire and t is the transmission time of the wire in milliseconds.</p>

### 출력

<p>The output consists of a single integer equal to the total amount of data about servers that need to be stored in the network.</p>

### 힌트

<p>because B(1)={1,2}, B(2)={2}, B(3)={2,3}, B(4)={1,2,3,4}.</p>