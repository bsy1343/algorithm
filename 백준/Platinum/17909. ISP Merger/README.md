# [Platinum II] ISP Merger - 17909

[문제 링크](https://www.acmicpc.net/problem/17909)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 7, 맞힌 사람: 5, 정답 비율: 20.000%

### 분류

자료 구조, 그리디 알고리즘, 애드 혹, 많은 조건 분기, 분리 집합, 우선순위 큐

### 문제 설명

<p>A number of regional Internet Service Providers (ISPs), both big and small have recently been forced into a merger by the government, in an effort to improve service for all. Of course this has been decided without consulting you, the chief network infrastructure officer, and a deadline for when the ISPs should be merged have already been set.</p>

<p>You have a set of n servers, each with a limited number of network sockets that can be used for connecting physically to other servers. Some servers are already linked up in the existing network architecture, and if server 0 is linked to server 2, then 2 is also linked to server 0 (as you use full duplex ethernet Cat6 cables). No server is directly connected to itself, and no two servers are directly linked with more than one connection.</p>

<p>You want to connect the servers to form a single network, such that all servers can reach each other through some sequence of connections. To make the set deadline, you have estimated that you only have time to make k edits to the existing network infrastructure. An edit is either to remove an existing connection between two servers, or to add a new connection between two servers.</p>

<p>Can you connect all the servers to the same network using at most k edits, within the limitations on the number of network sockets in each server?</p>

### 입력

<p>The first line of the input is three space separated integers n (1 &le; n &le; 100 000), the number of servers, m (0 &le; m &le; 200 000), the number of existing connections and k (0 &le; k &le; 50 000), the number of edits you have time to make. Then follows a line with n integers c<sub>0</sub>, c<sub>1</sub>, . . . , c<sub>i</sub>, . . . , c<sub>n&minus;1</sub>, with the i&rsquo;th number giving the number of network sockets for the i&rsquo;th server (for all i the capacity is bounded by 1 &le; c<sub>i</sub> &lt; n). Then m lines follow, with two integers uj and vj each, giving the id&rsquo;s of two servers that are connected in the old network architecture. Servers are 0-indexed, i.e. for every j, it holds that 0 &le; u<sub>j</sub>, v<sub>j</sub> &lt; n. A server will never be connected to more servers than it has connection sockets.</p>

### 출력

<p>Output &ldquo;yes&rdquo; on a single line if the servers can be connected to one network by making k or less edits, and &ldquo;no&rdquo; if it is not possible.</p>