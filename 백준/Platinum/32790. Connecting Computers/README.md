# [Platinum II] Connecting Computers - 32790

[문제 링크](https://www.acmicpc.net/problem/32790)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

그래프 이론, 단절점과 단절선, 브루트포스 알고리즘, 비트마스킹, 선인장, 정렬

### 문제 설명

<p>The tech team is gearing up for the PacNW Regional! There are $n$ computers that need to be connected together for the contest, isolated from the outside internet. There are $m$ bidirectional connections between computers, each connection requiring one of $k$ different types of cable (for example, CAT5, RS232, MIDI, etc.) Using all the possible cable types, every computer is reachable from every other computer by following some set of cables. In addition, each pair of computers participates in at most one connection. Finally, to minimize leakage, no two distinct simple cycles of connected computers can have more than one computer in common (a simple cycle is a cycle where each computer can appear at most once, and two cycles are distinct if there is at least one connection present in one but not the other).</p>

<p>The tech team needs to make sure that every computer can communicate with every other computer, but doesn't want to use all the cable types if they don't have to. Can you help them figure out the answers to two questions: what is the minimum number of cable types they need to connect all of the computers, and how many subsets of cable types would allow every computer to communicate with every other computer?</p>

### 입력

<p>The first line contains three integers $n$, $m$, and $k$ ($1\le n\le 2\cdot 10^5$, $n - 1\le m\le 3\cdot 10^5$, $1\le k\le 24$) --- the number of computers, the number of connections, and the number of cable types respectively.</p>

<p>The next line contains $k$ strings: the $i^{\text{th}}$ string is the name of the $i^{\text{th}}$ cable type. Each cable name is made up of between $1$ and $10$ alphanumeric characters. It is guaranteed that the cable names are distinct.</p>

<p>The next $m$ lines describe the connections between the computers. The $i^{\text{th}}$ line contains two integers $x$ and $y$ ($1\le x &lt; y\le n$) and a string $s$ (guaranteed to be one of the cable types).</p>

### 출력

<p>Output two lines, each containing a single integer. The first line should contain the minimum number of cable types the tech team needs connect all the computers. The second line should contain the number of subsets of cable types such that only installing those types would connect all of the computers.</p>