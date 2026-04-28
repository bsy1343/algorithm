# [Platinum II] ACM Computer Factory - 7845

[문제 링크](https://www.acmicpc.net/problem/7845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>As you know, all the computers used for ACM contests must be identical, so the participants compete on equal terms. That is why all these computers are historically produced at the same factory.</p>

<p>Every ACM computer consists of $P$ parts. When all these parts are present, the computer is ready and can be shipped to one of the numerous ACM contests.</p>

<p>Computer manufacturing is fully automated by using $N$ various machines. Each machine removes some parts from a half-finished computer and adds some new parts (removing of parts is sometimes necessary as the parts cannot be added to a computer in arbitrary order). Each machine is described by its performance (measured in computers per hour), input and output specification.</p>

<p>Input specification describes which parts must be present in a half-finished computer for the machine to be able to operate on it. The specification is a set of $P$ numbers 0, 1 or 2 (one number for each part), where 0 means that corresponding part must not be present, 1 -- the part is required, 2 -- presence of the part doesn&#39;t matter.</p>

<p>Output specification describes the result of the operation, and is a set of $P$ numbers 0 or 1, where 0 means that the part is absent, 1 -- the part is present.</p>

<p>The machines are connected by very fast production lines so that delivery time is negligibly small compared to production time.</p>

<p>After many years of operation the overall performance of the ACM Computer Factory became insufficient for satisfying the growing contest needs. That is why ACM directorate decided to upgrade the factory.</p>

<p>As different machines were installed in different time periods, they were often not optimally connected to the existing factory machines. It was noted that the easiest way to upgrade the factory is to rearrange production lines. ACM directorate decided to entrust you with solving this problem.</p>

### 입력

<p>Input file contains integers $P, N$, then $N$ descriptions of the machines. The description of $i$th machine is represented as by $2P + 1$ integers $Q_i, S_{i,1}, S_{i,2}, \dots , S_{i,P}, D_{i,1}, D_{i,2}, \dots , D_{i,P}$, where $Q_i$ specifies performance, $S_{i, j}$ -- input specification for part $j$, $D_{i, k}$ -- output specification for part $k$.&nbsp;</p>

### 출력

<p>Output the maximum possible overall performance, then $M$ -- number of connections that must be made, then $M$ descriptions of the connections. Each connection between machines $A$ and $B$ must be described by three positive numbers $A$ $B$ $W$, where $W$ is the number of computers delivered from $A$ to $B$ per hour.</p>

<p>If several solutions exist, output any of them.</p>

### 제한

<ul>
	<li>$1 \le P \le 10, 1 \le N \le 50, 1 \le Q_i \le 10000$</li>
</ul>