# [Silver III] Autići - 24469

[문제 링크](https://www.acmicpc.net/problem/24469)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 161, 정답: 72, 맞힌 사람: 63, 정답 비율: 43.448%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>There are $n$ friends. Each friend has a remote control toy car and a garage in which the car is stored. Every friend also has a pack of road parts used to build the track for the cars. All the road parts in the $i$-th friend&rsquo;s pack have the same length $d_i$.</p>

<p>Two different friends $a$ and $b$ may connect their garages with a road. To build this road, they will both take a road part from their pack and join them, obtaining a road of length $d_a+d_b$. Some pairs of friends are going to connect their garages in the described way, so that everyone&rsquo;s garages are connected. In other words, starting from any garage it should be possible to reach any other garage using the roads.</p>

<p>What is the minimum total road length needed to make a road network in which all the garages are connected?</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 &le; n &le; 100\,000$), the number of friends.</p>

<p>The next line contains $n$ positive integers $d_i$ ($1 &le; d_i &le; 10^9$), the length of the road parts in the $i$-th friend&rsquo;s pack.</p>

### 출력

<p>In the only line print the minimum total road length needed to make all the garages connected.</p>

### 힌트

<p>Clarification of the first example: Since there is only one friend, his garage is already connected to itself, so there is no need for building any roads.</p>

<p>Clarification of the third example: If roads are built between friends 1 and 2, 2 and 3, and between 3 and 4, everyone will be connected, and the total cost will be (7 + 3) + (3 + 3) + (3 + 5) = 24.</p>