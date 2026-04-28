# [Gold III] Fix Wiring - 20026

[문제 링크](https://www.acmicpc.net/problem/20026)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 207, 정답: 113, 맞힌 사람: 106, 정답 비율: 62.353%

### 분류

그래프 이론, 그리디 알고리즘, 최소 스패닝 트리

### 문제 설명

<p>You are in the spaceship <em>The Skeld</em>&nbsp;with your fellow crewmates. However, while checking the central power system,&nbsp;<br />
you found out that one crucial wiring installation of the central power system has been sabotaged.&nbsp;To prevent an engine failure, you should quickly fix the installation.</p>

<p>The installation consists of $N$ nodes and $M=\frac{N(N-1)}{2}$ wires.&nbsp;All possible pairs of distinct nodes in the installation are connected with a wire.&nbsp;Originally, each of the $M$ wires had exactly one tag attached to it.&nbsp;Each tag has a positive integer value, and different tags may have the same value.&nbsp;However, due to the sabotage, all the tags were removed from the wires and left on the floor.&nbsp;Fortunately, you gathered all $M$ tags from the ground.&nbsp;Now, in order to fix the installation, you have to trigger the reboot sequence&nbsp;by re-attaching all the tags back to the wires twice.</p>

<p>For an installation where all wires have a tag on them,&nbsp;let&#39;s define&nbsp;<strong>the cost of an installation&nbsp;</strong>as the cost of its minimum spanning tree, that is, the minimum cost of a subset of wires such that all nodes are connected using only the given subset of wires. Here, the cost of the set of wires is defined as the sum of the tag values of all wires in the set.</p>

<p>The reboot sequence is triggered in two steps:<br />
First, you should attach the tags to <strong>minimize</strong>&nbsp;the cost of the installation.<br />
Then, after detaching all tags, you should attach the tags to&nbsp;<strong>maximize</strong>&nbsp;the cost of the installation.</p>

<p>Please compute the cost of each installation.</p>

### 입력

<p>The first line of the input contains an integer $N$,&nbsp;representing the number of nodes. ($2 \le N \le 100$)</p>

<p>The second line of the input contains $M=\frac{N(N-1)}{2}$ positive integers $C_1, C_2, \cdots C_M$,&nbsp;representing the integer values of $M$ tags. ($1 \le C_i \le 2 \cdot 10^9$)</p>

### 출력

<p>Output a single line containing two integers. The first should be the&nbsp;<strong>minimum</strong>&nbsp;possible cost of the installation, the second should be the <strong>maximum</strong>&nbsp;possible cost of the installation.</p>