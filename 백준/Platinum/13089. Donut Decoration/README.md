# [Platinum II] Donut Decoration - 13089

[문제 링크](https://www.acmicpc.net/problem/13089)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 34, 맞힌 사람: 21, 정답 비율: 63.636%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Donut maker&#39;s morning is early. Mr. D, who is also called Mr. Donuts, is an awesome donut maker. Also today, he goes to his kitchen and prepares to make donuts before sunrise.</p>

<p>In a twinkling, Mr. D finishes frying NN donuts with a practiced hand. But these donuts as they are must not be displayed in a showcase. Filling cream, dipping in chocolate, topping somehow cute, colorful things, etc., several decoration tasks are needed. There are K tasks numbered 1 through K, and each of them must be done exactly once in the order 1,2,&hellip;,K to finish the donuts as items on sale.</p>

<p>Instantly, Mr. D arranges the N donuts in a row. He seems to intend to accomplish each decoration tasks sequentially at once. However, what in the world is he doing? Mr. D, who stayed up late at yesterday night, decorates only a part of the donuts in a consecutive interval for each task. It&#39;s clearly a mistake! Not only that, he does some tasks zero or several times, and the order of tasks is also disordered. The donuts which are not decorated by correct process cannot be provided as items on sale, so he should trash them.</p>

<p>Fortunately, there are data recording a sequence of tasks he did. The data contain the following information: for each task, the consecutive interval [l,r] of the decorated donuts and the ID x of the task. Please write a program enumerating the number of the donuts which can be displayed in a showcase as items on sale for given recorded data.</p>

### 입력

<p>The input consists of a single test case. The test case is formatted as follows.</p>

<pre>
N K
T
l<sub>1</sub> r<sub>1</sub> x<sub>1</sub>
:
:
l<sub>T</sub> r<sub>T</sub> x<sub>T</sub></pre>

<p>The first line contains two integers N and K, where N (1 &le; N &le; 200,000) is the number of the donuts fried by Mr. D, and K (1 &le; K &le; 200,000) is the number of decoration tasks should be applied to the donuts. The second line contains a single integer T (1 &le; T &le; 200,000), which means the number of information about tasks Mr. D did. Each of next T lines contains three integers l<sub>i</sub>, r<sub>i</sub>, and x<sub>i</sub> representing the i-th task Mr. D did: the i-th task was applied to the interval [l<sub>i</sub>,r<sub>i</sub>] (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le;N) of the donuts inclusive, and has ID x<sub>i</sub> (1 &le; x<sub>i</sub> &le; K).</p>

### 출력

<p>Output the number of the donuts that can be provided as items on sale.</p>