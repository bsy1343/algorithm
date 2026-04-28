# [Platinum III] A Journey to Greece - 10849

[문제 링크](https://www.acmicpc.net/problem/10849)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 91, 맞힌 사람: 64, 정답 비율: 25.397%

### 분류

다이나믹 프로그래밍, 그래프 이론, 비트마스킹, 최단 경로, 데이크스트라, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>For a long time Tim wanted to visit Greece. He has already purchased his flight to and from Athens. Tim has a list of historical sites he wants to visit, e.g., Olympia and Delphi. However, due to recent political events in Greece, the public transport has gotten a little complicated. To make the Greek happy and content with their new government, many short-range bus and train lines have been created. They shall take the citizens around in their neighborhoods, to work or to their doctor. At the same time, long-range trains that are perfect for tourists have been closed down as they are too expensive. This is bad for people like Tim, who really likes to travel by train. Moreover, he has already purchased the Greece&rsquo; Card for Public Conveyance (GCPC) making all trains and buses free for him.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10849.%E2%80%85A%E2%80%85Journey%E2%80%85to%E2%80%85Greece/0593079c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10849.%E2%80%85A%E2%80%85Journey%E2%80%85to%E2%80%85Greece/0593079c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10849/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:266px; width:290px" /></p>

<p>Figure A.1: Visual representation of the Sample Input: Tim&rsquo;s tour has length 18.</p>

<p>Despite his preferred railway lines being closed down, he still wants to make his travel trough Greece. But taking all these local bus and train connections is slower than expected, so he wants to know whether he can still visit all his favorite sites in the timeframe given by his flights. He knows his schedule will be tight, but he has some emergency money to buy a single ticket for a special Greek taxi service. It promises to bring you from any point in Greece to any other in a certain amount of time.</p>

<p>For simplicity we assume, that Tim does never have to wait for the next bus or train at a station. Tell Tim, whether he can still visit all sites and if so, whether he needs to use this taxi ticket.</p>

### 입력

<p>The first line contains five integers N, P, M, G and T, where N denotes the number of places in Greece, P the number of sites Tim wants to visit, M the number of connections, G the total amount of time Tim can spend in Greece, and T the time the taxi ride takes (1 &le; N &le; 2&middot;10<sup>4</sup>; 1 &le; P &le; 15; 1 &le; M, G &le; 10<sup>5</sup>; 1 &le; T &le; 500).</p>

<p>Then follow P lines, each with two integers p<sub>i</sub> and t<sub>i</sub>, specifying the places Tim wants to visit and the time Tim spends at each site (0 &le; p<sub>i</sub> &lt; N; 1 &le; t<sub>i</sub> &le; 500). The sites p<sub>i</sub> are distinct from each other.</p>

<p>Then follow M lines, each describing one connection by three integers s<sub>i</sub>, d<sub>i</sub> and t<sub>i</sub>, where s<sub>i</sub> and d<sub>i</sub> specify the start and destination of the connection and t<sub>i</sub> the amount of time it takes (0 &le; s<sub>i</sub>, d<sub>i</sub> &lt; N; 1 &le; t<sub>i</sub> &le; 500).</p>

<p>All connections are bi-directional. Tim&rsquo;s journey starts and ends in Athens, which is always the place 0.</p>

### 출력

<p>Print either &ldquo;impossible&rdquo;, if Tim cannot visit all sites in time, &ldquo;possible without taxi&rdquo;, if he can visit all sites without his taxi ticket, or &ldquo;possible with taxi&rdquo;, if he needs the taxi ticket.</p>