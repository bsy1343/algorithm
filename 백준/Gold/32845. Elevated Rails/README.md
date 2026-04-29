# [Gold I] Elevated Rails - 32845

[문제 링크](https://www.acmicpc.net/problem/32845)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 21, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 트리, 트리의 지름

### 문제 설명

<p>Brandon and Geoffry like trains! They have been tasked with building a network of rails connecting $n$ train stations. Each of the stations is on one of three islands, and each island has at least one station on it.</p>

<p>Brandon has been working hard to establish connections between stations that are on the same island. Specifically, Brandon has set up enough connections that there is exactly one way to take a train between two stations on the same island without visiting the same station more than once. However, it is not yet possible to take a train between two stations on different islands.</p>

<p>Geoffry, looking at Brandon’s train network so far, asks him several questions. Each question picks two stations which are currently on different islands and asks what the maximum number of stations a path between these two stations could take if Brandon added exactly two more connections so that it was possible to reach every station from every other station.</p>

<p>Brandon is too busy dealing with rail signals to think about how to connect stations on different islands, and defers all of Geoffry’s questions to you to answer.</p>

### 입력

<p>The first line of input contains two integers $n$ and $q$ ($3 ≤ n ≤ 10^5$, $1 ≤ q ≤ 2 \cdot 10^5$), the number of train stations and the number of Geoffry’s questions.</p>

<p>The next $n - 3$ lines each contain two integers $x$ and $y$ ($1 ≤ x &lt; y ≤ n$), indicating that stations $x$ and $y$ are connected by a rail that can go in both directions.</p>

<p>It is guaranteed that the current rail connections satisfy the conditions given above – the $n$ stations can be grouped on three islands such that two stations are reachable from each other if and only if they are on the same island, and there is a unique path between the two stations that does not repeat any stations.</p>

<p>The next $q$ lines each contain two integers $a$ and $b$, asking for the maximum number of stations that could appear on a path between station $a$ and station $b$. It is guaranteed station $a$ and station $b$ are on different islands.</p>

<p>Each of the above questions are independent from each other.</p>

### 출력

<p>Output $q$ lines, one per question. The output for each question should be a single integer, the maximum number of stations that could appear on a path between station $a$ and station $b$.</p>