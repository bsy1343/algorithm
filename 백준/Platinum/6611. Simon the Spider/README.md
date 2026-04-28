# [Platinum IV] Simon the Spider - 6611

[문제 링크](https://www.acmicpc.net/problem/6611)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 12, 맞힌 사람: 12, 정답 비율: 31.579%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 깊이 우선 탐색, 해시를 사용한 집합과 맵, 분리 집합, 우선순위 큐, 최소 스패닝 트리, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>In the problem 6609, you have seen that the potential reproductive capabilities of insects are very high. Fortunately for us humans, the insects also have natural enemies that help to reduce their population. Spiders belong among the best known insect predators, so there is no wonder we included them in this problem set.</p>

<p>Simon the Spider ate many insects this summer and got fat. The threads of his web will soon be too thin to carry him and so he needs to reinforce them. Since fat spiders are also lazy, Simon wants to use as little material as possible &mdash; well, you know that spiders have to produce the material for building webs by themselves. Finally, he decided to reinforce only some of the threads, but it is important that every node of his web must be reachable over the reinforced links.</p>

<p>Additionally, Simon plans to spend his free time on one of the reinforced links and he wants this one link to be long. Therefore, when calculating the total length of all reinforced links, the length of the longest reinforced link will be subtracted instead of added. Help Simon to decide which links should be reinforced to have the lowest possible total length under these circumstances.</p>

### 입력

<p>The input consists of descriptions of several webs. The first line of each description contains two numbers: the number N (2 &le; N &le; 2000) of nodes in the web and the number M (0 &le; M &le; 1 000 000) of the links between pairs of nodes. Each of the following M lines describes one link. The description of each link contains three positive integers u<sub>i</sub>, v<sub>i</sub>, ℓ<sub>i</sub>, where u<sub>i</sub> and v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; N and u<sub>i</sub> &ne; v<sub>i</sub>) are the two nodes connected by the link and ℓi is its length (1 &le; ℓ<sub>i</sub> &le; 100 000).</p>

### 출력

<p>For each web, print a single line with the minimum possible total length of reinforced links under all given conditions. Remember that the total length is the sum of the lengths of all reinforced links minus twice the length of the longest reinforced link.</p>

<p>If it is not possible to reach every node from every other node through a sequence of links, then print &ldquo;disconnected&rdquo; instead of the cost.</p>