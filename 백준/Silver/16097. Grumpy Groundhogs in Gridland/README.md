# [Silver I] Grumpy Groundhogs in Gridland - 16097

[문제 링크](https://www.acmicpc.net/problem/16097)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 14, 맞힌 사람: 12, 정답 비율: 100.000%

### 분류

자료 구조, 정렬, 스택

### 문제 설명

<p>The wonderful forest of Gridland is home to the world&rsquo;s cutest population of groundhogs. During the exceptionally hot summer of this year, the groundhogs have merrily frolicked in the blossoming shrubs, and each of them has found their one true love among the other groundhogs.</p>

<p>However, winter has come, and the groundhogs are now all back to their separate burrows for winter. Of course, they are all very grumpy and lonely: they desire nothing more than to be be reunited with their one true love. Fortunately, the groundhogs have requested help from the Subterranean Way Excavation Research Company. As a representative of the company, your task is to build a tunnel network that will allow our enamored groundhogs to pay regular visits to each other. If you can do this, imagine how grateful the Gridland groundhogs would be!</p>

<p>Your preliminary survey has revealed that the Gridland soil consists of square cells labeled by pairs of nonnegative integer coordinates. The first integer represents the position on the x-axis, i.e., the distance to the origin (the leftmost point); and the second integer represents the depth. Each groundhog lives in a burrow on a cell with depth 0. Your excavation tools can empty any cell of the Gridland soil of depth 1 or more (the burrows themselves do not need to be excavated): the result is called a tunnel network. A path in the tunnel network is a sequence of excavated cells where each cell is either horizontally or vertically adjacent to the previous one (indeed, as any biologist would tell you, the Gridland groundhog is too fat to move between two diagonally adjacent cells). Your tunnel network should ensure that, for every groundhog couple, there is a path of excavated cells that connects the two burrows of that couple. However, to preserve the privacy of the groundhogs, it is extremely important that there be no path connecting two burrows whose inhabitants do not form a couple!</p>

<p>Your job is to resolve two questions. First, is it even possible to construct a tunnel network satisfying these conditions? Second, if it is possible, what is the maximum depth to which you will need to dig?</p>

### 입력

<p>The input consists of several test cases. The first line consists of an integer indicating the number of test cases. Each test case follows. The first line of a test case consists of a positive integer N indicating the number of groundhog couples, with 1 &le; N &le; 10<sup>6</sup>. This is followed by N lines describing each couple: each line consists of two positive integers 0 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; 10<sup>9</sup> separated by a single space, indicating the position of the burrow of the first and second member of the couple (starting with the leftmost one). There are never two groundhogs living in the same burrow, and there are never two adjacent burrows (i.e., the absolute difference between the position of any two burrows is no smaller than 2).</p>

### 출력

<p>For each test case in the input, your program should produce one line. If there is no tunnel network that satisfies the conditions, the contents of the line should be IMPOSSIBLE. Otherwise, the contents of the line should be a positive integer d &gt; 0, which is the smallest possible depth such that there be a tunnel network that satisfies the conditions and where the depth of every excavated cell is no greater than d. There should be no blank lines in your output.</p>

### 힌트

<p>In the left diagram of Figure 3, there are four couples of groundhogs: the burrows of the members of each couple are labeled A, B, C, and D. The diagram illustrates a network of tunnels of depth 5, where excavated cells are hatched: in fact, 5 is the lowest possible maximum depth for a suitable tunnel network in this example.</p>

<p>Of course, it can be the case that no suitable tunnel network exists at all! For instance, in the right diagram of Figure 3, there are two groundhog couples A and B. It is not possible to connect the couple members with tunnels that do not intersect, so the poor groundhogs will remain grumpy all winter!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/16097.%E2%80%85Grumpy%E2%80%85Groundhogs%E2%80%85in%E2%80%85Gridland/779e12f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/16097.%E2%80%85Grumpy%E2%80%85Groundhogs%E2%80%85in%E2%80%85Gridland/779e12f0.png" data-original-src="https://upload.acmicpc.net/62ac4466-5e4f-480a-8bf2-97f27896bab0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 564px; height: 155px;" /></p>

<p style="text-align: center;">Figure 3: Illustration of the first two inputs from the Sample Input</p>