# [Gold IV] SPF - 6383

[문제 링크](https://www.acmicpc.net/problem/6383)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 100, 정답: 40, 맞힌 사람: 30, 정답 비율: 45.455%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필, 단절점과 단절선

### 문제 설명

<p>Consider the two networks shown below. Assuming that data moves around these networks only between directly connected nodes on a peer-to-peer basis, a failure of a single node, 3, in the network on the left would prevent some of the still available nodes from communicating with each other. Nodes 1 and 2 could still communicate with each other as could nodes 4 and 5, but communication between any other pairs of nodes would no longer be possible. Node 3 is therefore a Single Point of Failure (SPF) for this network. Strictly, an SPF will be defined as any node that, if unavailable, would prevent at least one pair of available nodes from being able to communicate on what was previously a fully connected network. Note that the network on the right has no such node; there is no SPF in the network. At least two machines must fail before there are any pairs of available nodes which cannot communicate.&nbsp;</p>

<p><img alt="" src="/upload/images/spf.png" style="height:235px; width:552px" /></p>

### 입력

<p>The input will contain the description of several networks. A network description will consist of pairs of integers, one pair per line, that identify connected nodes. Ordering of the pairs is irrelevant; 1 2 and 2 1 specify the same connection. All node numbers will range from 1 to 1000. A line containing a single zero ends the list of connected nodes. An empty network description flags the end of the input. Blank lines in the input file should be ignored.&nbsp;</p>

### 출력

<p>For each network in the input, you will output its number in the file, followed by a list of any SPF nodes that exist. The first network in the file should be identified as &ldquo;Network #1&rdquo;, the second as &ldquo;Network #2&rdquo;, etc. For each SPF node, output a line, formatted as shown in the examples below, that identifies the node and the number of fully connected subnets that remain when that node fails. If the network has no SPF nodes, simply output the text &ldquo;No SPF nodes&rdquo; instead of a list of SPF nodes.</p>