# [Platinum V] The Hungary Games - 6773

[문제 링크](https://www.acmicpc.net/problem/6773)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 18, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Welcome to the Hungary Games! The streets of Budapest form a twisted network of one-way streets. You have been forced to join a race as part of a &ldquo;Reality TV&rdquo; show where you race through these streets, starting at the Szechenyi thermal bath ( s for short) and ending at the Tomb of Gul&uml; Baba (t for short).</p>

<p>Naturally, you want to complete the race as quickly as possible, because you will get more promotional contracts the better you perform. However, there is a catch: any person who is smart enough to take a shortest s-t route will be thrown into the P&aacute;lv&ouml;lgyi cave system and kept as a national treasure. You would like to avoid this fate, but still be as fast as possible. Write a program that computes a strictly-second-shortest s-t route.</p>

<p>Sometimes the strictly-second-shortest route visits some nodes more than once; see Sample Input 2 for an example.</p>

### 입력

<p>The first line will have the format N M, where N is the number of nodes in Budapest and M is the number of edges. The nodes are 1, 2, . . . , N; node 1 represents s; node N represents t. Then there are M lines of the form A B L, indicating a one-way street from A to B of length L. You can assume that A &ne; B on these lines, and that the ordered pairs (A, B) are distinct.</p>

### 출력

<p>Output the length of a strictly-second-shortest route from s to t. If there are less than two possible lengths for routes from s to t, output &minus;1.</p>

### 제한

<p>Every length L will be a positive integer between 1 and 10000. For 50% of the test cases, we will have 2 &le; N &le; 40 and 0 &le; M &le; 1000. All test cases will have 2 &le; N &le; 20000 and 0 &le; M &le; 100000.</p>