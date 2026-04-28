# [Platinum I] Networking Company - 22721

[문제 링크](https://www.acmicpc.net/problem/22721)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 4, 맞힌 사람: 3, 정답 비율: 15.000%

### 분류

자료 구조, 그래프 이론, 트리, 해 구성하기, 분리 집합, 최소 스패닝 트리, 최소 공통 조상

### 문제 설명

<p>Suppose you are a consultant for the networking company CluNet, and they have the following problem. The network that they are currently working on is modeled by a connected graph G = (V, E) with N nodes and M edges. Each edge e is a fiber-optic cable that is owned by one of two companies&mdash;creatively named X and Y&mdash;and leased to CluNet. Their plan is to choose a spanning tree T of G and upgrade the links corresponding to the edges of T. They have already concluded an agreement with companies X and Y stipulating a number of K so that in the tree T that is chosen, K of the edges will be owned by X and N &minus; K &minus; 1 of the edges will be owned by Y.</p>

<p>CluNet management now faces the following problem. It is not at all clear to them whether there even exists a spanning tree meeting these conditions, or how to find one if it exists. So this is the problem they put to you.</p>

### 입력

<p>The input contains a series of test cases.</p>

<p>Each test case begins with a line containing three integers N (1 &le; N &le; 1000), M (1 &le; M &le; 3000) and K (0 &le; K &le; N &minus; 1).</p>

<p>The following M lines describe the edges. The i-th line contains three integers x<sub>i</sub>, y<sub>i</sub> and c<sub>i</sub>. The i-th edge connects the x<sub>i</sub>-th and y<sub>i</sub>-th vertices. c<sub>i</sub> indicates the company that owns the i-th edge. c<sub>i</sub> is either 0 or 1; 0 means X and 1 means Y.</p>

<p>The input ends with a line containing three zeros. This line should not be processed.</p>

### 출력

<p>For each test case, output the answer as shown in the sample output. The first line of each output should indicate the test case number starting from 1.</p>

<p>In the next line, print &ldquo;possible&rdquo; or &ldquo;impossible&rdquo;. If you can construct the spanning tree satisfying the condition, print &ldquo;possible&rdquo;. Otherwise, print &ldquo;impossible&rdquo;.</p>

<p>If you can construct the spanning tree, print in the following line the numbers of the edges (beginning at 1) that you used. Each number should be separated by a single space.</p>

<p>You should print a blank line after each test case.</p>