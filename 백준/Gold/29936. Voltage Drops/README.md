# [Gold IV] Voltage Drops - 29936

[문제 링크](https://www.acmicpc.net/problem/29936)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Juku is learning about electricity and circuits in physics class. He needs to make several measurements in a circuit. It is late and Juku is tired, so he is afraid that he might make mistakes when writing down the results. Juku knows that he can check the validity of measurements using Kirchhoff&#39;s voltage law and wants a program that would help him do so.</p>

<p>Kirchhoff&#39;s voltage law states that the sum of voltage rises and drops around any closed path has to equal zero. More precisely this means the following. Let us have a circuit with various components, the terminals (ends) of which are connected to nodes. Any number of component terminals can be connected to each node. By connecting a measurement device&#39;s (voltmeter&#39;s) test probes to two nodes we find out the difference in electric potential (in other words, voltage) between the two nodes. If potential is greater at the node connected to the positive probe than at the node connected to the negative probe, then the device will show a positive number, if it is the other way around, then a negative number, and if electric potential is equal at the two nodes then the result is zero. Kirchhoff&#39;s voltage law states that if we form some path consisting of those nodes that ends at the same node it starts from and add up all the rises and falls of electric potential along this path, then the result must be $0$.</p>

<p>You&#39;re given a number of electric potential differences Juku measured between some number of pairs of nodes. Determine whether Juku&#39;s results agree with Kirchhoff&#39;s voltage law.</p>

### 입력

<p>The first line of the input contains two space-separated integers: number of nodes $N$ ($1 \le N \le 10^5$) and the number of Juku&#39;s measurements $M$ ($1 \le M \le 10^5$). Nodes are numbered $1 \ldots N$.</p>

<p>Each of the following $M$ lines contains three space-separated integers $i$, $j$ and $U$: $i$ and $j$ denote nodes ($1 \le i,j \le N$) and $U$ the voltage Juku measured between nodes $i$ and $j$ in volts ($-500\,000 \le U \le 500\,000$) when the positive test probe of the voltmeter was connected to node $i$ and negative one to node $j$.</p>

### 출력

<p>Write one line to output that contains a single word: <code>JAH</code> if Juku&#39;s measurements agree with Kirchhoff&#39;s voltage law (there are no contradictions) or <code>EI</code> if they do not agree.</p>