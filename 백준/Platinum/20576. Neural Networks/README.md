# [Platinum III] Neural Networks - 20576

[문제 링크](https://www.acmicpc.net/problem/20576)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>Art is a computer science student at UT. Over the last two semesters, he has applied for dozens of internships, and he&#39;s finally landed his dream job: designing neural networks for a hot new machine learning startup in Austin.</p>

<p>A neural network is a directed graph whose nodes are partitioned into <em>layers</em>. If $A_i$ is the number of nodes in the $i$-th layer and there are $N$ layers in total, then the graph has $\sum_{i=1}^N A_i$ nodes. All the edges in the graph go from a node in the $i$-th layer to a node in the $(i+1)$-th layer. These graphs are used for computation in the following manner: input is provided to the nodes in layer $1$, information flows magically along the edges of the graph, and output is read from the nodes in layer $N$.</p>

<p>On Art&#39;s first day of work, his manager gives him an array $A$ of length $N$ specifying the number of nodes in each layer of a neural network, and asks him to add some edges to make it <em>interesting</em>. A neural network is said to be interesting if, for every node $u$ in the graph (including those in layer $1$ and layer $N$), there exists a path along which information can flow from layer $1$ to layer $N$ that passes through $u$.</p>

<p>Art realizes that there may be many possible interesting networks he could build using the given specification. Before he complains to his manager about the ill-defined nature of his task, though, he wants you to help him determine just how many such networks there are. Since the answer may be very large, output its remainder modulo the prime $998\,244\,353$.</p>

<p>Note that the nodes in the graph are labeled. Nodes $1, \dots, A_1$ belong to layer $1$; nodes $A_1+1,\dots,A_1+A_2$ belong to layer $2$, and so on. Two networks are considered different if there is an edge that exists in one network but not in the other.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($2 \leq N \leq 5 \cdot 10^5$), the number of layers in the network. The second line of input contains $N$ space-separated integers: the $i$-th integer is $A_i$, the number of nodes in layer $i$. (For each $i$, $1 \leq A_i \leq 5 \cdot 10^5$; futhermore, $\sum_{i=1}^N A_i \leq 5 \cdot 10^5$. That is, the total number of nodes is at most $5 \cdot 10^5$, and each layer has at least one node.)</p>

### 출력

<p>Output a single integer, the number of distinct interesting neural networks corresponding to the given specification modulo $998\,244\,353$.</p>