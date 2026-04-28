# [Gold II] Agamemnon's Odyssey - 21168

[문제 링크](https://www.acmicpc.net/problem/21168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 22, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리의 지름

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21168.%E2%80%85Agamemnon's%E2%80%85Odyssey/e5f3fd77.png" data-original-src="https://upload.acmicpc.net/6bb806c2-0635-4cd2-adc9-523a6ad118b5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 451px; height: 300px;" /></p>

<p style="text-align: center;">Example map</p>

<p>Agamemnon, the great king of Mycenae, was assembling his troops in Aulis to sail to the shores of Troy, when he had a vision of goddess Artemis. In this vision, Agamemnon found out that he had accidentally slain a deer that was sacred to Artemis, and now the goddess swore to make Agamemnon suffer on his voyage to Troy.</p>

<p>Along his route to Troy, Agamemnon was planning to stop at the islands of Crete to gather resources for his formidable army. If Artemis were to find out about the sea routes Agamemnon took, she would use her powers to stop the wind along those routes, leaving Agamemnon and his crew stranded. As the trusty advisor of Agamemnon, you now have to help him devise a path between the islands of Crete that provides the army the maximum amount of resources, without letting Artemis discover the routes you take.</p>

<p>The $N$ islands of Crete are connected to each other via $N-1$ sea routes. Along each route, Agamemnon can acquire a certain amount of resources. However, if a route is used more than $k$ times, Artemis will detect the presence of Agamemnon along that route and stop the wind along that route. So, a feasible plan cannot use any route more than $k$ times.</p>

<p>Given that Agamemnon can start and end at any of the islands of Crete, come up with a feasible plan that maximises Agamemnon&#39;s resource earnings. Note that Agamemnon can only collect resources along a sea route during its first use. He does not earn extra resources from a route on reusing it.</p>

### 입력

<p>The first line of input will contain two integers, $N$ ($1 \leq N \leq 2 \cdot 10^5$) and $k$ ($1 \leq k \leq 10^9$), the number of islands of Crete, and the maximum number of times a single route may be used without being discovered by Artemis. The islands of Crete are guaranteed to be connected by the sea routes.</p>

<p>The following $N-1$ lines describe the sea routes. Each line contains $3$ integers each, $u, v$ ($1 \leq u, v \leq N, u \neq v$) and $c$ ($1 \leq c \leq 10^9$), explaining that the sea route connects islands $u$ and $v$ and Agamemnon can acquire $c$ units of resources along this route. All sea routes are bidirectional, i.e. they can be used to travel from island $u$ to $v$, or from island $v$ to $u$.</p>

### 출력

<p>Output a single value, the maximum amount of resources Agamemnon can acquire with a feasible plan, as described in the statement.</p>

### 힌트

<p>There are $5$ islands in Crete, connected to each other via $4$ routes, as shown in the figure: the first connecting island $1$ and $2$ and allowing Agamemnon to acquire $3$ units of resources and so on. In this archipelago, the best plan for Agamemnon is to start at island $4$, visit island $1$ (acquiring $5$ units of resources along the $4\to1$ route), and then end his path at island $5$ (acquiring another $9$ units of resources along the $1\to5$ route), having earned a total of $14$ units of resources.</p>