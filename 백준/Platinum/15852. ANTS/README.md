# [Platinum II] ANTS - 15852

[문제 링크](https://www.acmicpc.net/problem/15852)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 30, 맞힌 사람: 28, 정답 비율: 43.077%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 최소 공통 조상, 트리, 트리 압축

### 문제 설명

<p>ANTS (Agency for Nonsensical Technology Storage) is a leading company specialising in storage for any nonsensical technology. These technologies cannot just be thrown away as it can be hazardous or dangerous, thus they needed to be stored and managed with care.</p>

<p>ANTS owns N warehouses (numbered from 1 to N) which are operated by advanced robots and connected by special rails. One special rail connects exactly two different warehouses and can be used by the robot to move between those two connected warehouses. As the cost to build the special rail at the moment is very expensive, ANTS only built a minimum number of special rails such that it is sufficient for the robots to move between any two warehouses.</p>

<p>Once in a while, the warehouses&#39; manager needs to recalibrate some robots. In order to do this, all the affected robots need to assemble at any one warehouse altogether (the manager decided which warehouse he wants to use as the assembly point). As the cost to build one special rail is very expensive, the manager needs to minimise any unnecessary use of the special rails. In other words, the manager should choose a warehouse as the assembly point for the affected robots such that the number of special rail usage is as minimum as possible.</p>

<p>Consider the following example. Let there be 10 warehouses with the special rails are arranged in the following way (Figure 1).&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15852/1.png" style="width: 285px; height: 163px;" /></p>

<p style="text-align: center;">Figure 1.&nbsp;</p>

<p>Supposed the manager wants to recalibrate four robots which are located at warehouse number 4, 5, 7, and 9. If the manager chooses warehouse number 3 as the assembly point, then the special rails will be used 12 times (Figure 2). In this case, the special rail connecting warehouse 1 and 3 (1-3) in this case is used four times; 1-6 and 6-8 are used twice; 1-4, 1-7, 5-8, and 8-9 are used once. Thus, the total number of special rails usage is 1 * 4 + 2 * 2 + 4 * 1 = 12.</p>

<p>On the other hand, if the manager chooses warehouse number 6, then the special rails are used only 8 times (Figure 3), and this is the minimum possible for this example. Alternatively, the manager can choose warehouse number 1 or 8 as the assembly point as these choices will cause the special rails to be used 8 times as well.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15852/2.png" style="width: 280px; height: 166px;" /></p>

<p style="text-align: center;">Figure 2.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15852/3.png" style="width: 288px; height: 166px;" /></p>

<p style="text-align: center;">Figure 3.</p>

<p>Given the arrangement of N warehouses and Q queries where each query contains the location of K affected robots which are needed to be recalibrated altogether. For each query, determine the optimum assembly point for the affected robots such that the number of special rail usage is minimised (you only need to output the usage number).</p>

### 입력

<p>The first line contains an integer: N (1 &le; N &le; 100,000) denoting the number of warehouses. The following N - 1 lines, each contains two integers: a b (1 &le; a, b &le; N) in a line denoting a special rail connecting warehouse number a and b. You may safely assume that all the warehouses are connected to each other, i.e. there is a path from one warehouse to any other warehouse. The next line contains an integer: Q (1 &le; Q &le; 5000) denoting the number of queries. The next Q lines, each begins with an integer K (1 &le; K &le; 50) denoting the number of affected robots, followed by K integers: A<sub>1</sub> A<sub>2</sub> ... A<sub>K</sub> (1 &le; A<sub>i</sub> &le; N) in a line denoting the query (the warehouse location of the affected K robots).&nbsp;</p>

### 출력

<p>For each query, output in a line, the minimum number of special rail usage for that query.</p>