# [Gold V] Election of Evil - 14481

[문제 링크](https://www.acmicpc.net/problem/14481)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 36, 맞힌 사람: 30, 정답 비율: 60.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>Dylan is a corrupt politician trying to steal an election. He has already used a mind-control technique to enslave some set U of government representatives. However, the representatives who will be choosing the winner of the election is a different set V . Dylan is hoping that he does not need to use his mind-control device again, so he is wondering which representatives from V can be convinced to vote for him by representatives from U.</p>

<p>Luckily, representatives can be persuasive people. You have a list of pairs (A, B) of represenatives, which indicate that A can convice B to vote for Dylan. These can work in chains; for instance, if Dylan has mind-controlled A, A can convince B, and B can convince C, then A can effectively convince C as well.</p>

### 입력

<p>The first line contains a single integer T (1 &le; T &le; 10), the number of test cases. The first line of each test case contains three space-separated integers, u, v, and m (1 &le; u, v, m &le; 10,000). The second line contains a space-separated list of the u names of representatives in U. The third line contains a space-separated list of the v names of representatives from V . Each of the next m lines contains a pair of the form A B, where A and B are names of two representatives such that A can convince B to vote for Dylan. Names are strings of length between 1 and 10 that only consists of lowercase letters (a to z).</p>

### 출력

<p>For each test case, output a space-separated list of the names of representatives from T who can be convinced to vote for Dylan via a chain from S, in alphabetical order.</p>

### 힌트

<p>In the second test case, Jill can convince Saul via Jack, and Peter was already mind-controlled.</p>