# [Gold III] Road Network - 18680

[문제 링크](https://www.acmicpc.net/problem/18680)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 15, 맞힌 사람: 13, 정답 비율: 46.429%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>After a fierce battle with his opponent, Bruce Wayne finally won the elections and became the mayor of Gotham. Like every other politician, he had an agenda with lots of projects for the sake of Gotham&rsquo;s prosperity, but he was met with the same problem, lack of fund.</p>

<p>He decided to tackle the problem from a different perspective; he will allow companies to buy roads in the city (roads in the city are undirected). The city will get the money needed for the projects and the companies can use the roads for advertisements (or so he thought).</p>

<p>After the deal was done, the companies were more cunning than he expected. They started to threaten that they will block exactly one road in the city and prevent people from getting to their work, in the hope that people will revolt against Mayor Wayne. The problem was that the city is designed as a tree of connected zones, where there is only one unique path between any two zones. Hence, blocking a road means that some zones are not reachable from others anymore.</p>

<p>Mayor Wayne discussed the problem with his council and identified what they called vulnerable roads. A road is vulnerable if blocking it can disconnect two zones from each other. Mayor Wayne wants to prevent this from happening by building more roads but his budget could afford building only one extra road. Can you help him figure out which road he should build, such that he minimizes the number of vulnerable roads?</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100) followed by T test cases. The first line of each test case will contain one integer N, the number of zones in the city (1 &le; N &le; 10, 000). The following N &minus; 1 lines will each contain a pair of integers x and y separated by a single space (1 &le; x, y &le; N) which means that zone x is connected to zone y. It&rsquo;s guaranteed that the edges will form a tree.</p>

### 출력

<p>For each test case, print a single line containing an integer, the minimum number of vulnerable roads in the city after building the new road.</p>