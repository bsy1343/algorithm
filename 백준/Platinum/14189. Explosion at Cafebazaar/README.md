# [Platinum I] Explosion at Cafebazaar - 14189

[문제 링크](https://www.acmicpc.net/problem/14189)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 105, 정답: 17, 맞힌 사람: 17, 정답 비율: 20.732%

### 분류

방향 비순환 그래프, 그래프 이론, 강한 연결 요소, 위상 정렬

### 문제 설명

<p>You are an engineer at Cafebazaar and your specialty is understanding networks and their behaviors. Your colleagues have designed a network of n switches with m directed links that connect pairs of these switches. Each switch has a buffer where it stores the data and two modes, called sending mode and receiving mode. In the sending mode, a switch sends the data stored in its buffer to each of its outgoing links simultaneously and at the end clears its buffer. In the receiving mode, a switch concatenates the data from all its incoming links and stores them in its buffer, so at the end, the length of the data stored in its buffer is equal to the sum of the lengths of all the data on the incoming links.</p>

<p>Assume that at time t = 0, all the switches are in sending mode and have an empty buffer except switch i which stores a 1-bit package of data in its buffer. Also, all the switches change their modes after each second, so at time t = 1 all the switches change to receiving mode, at time t = 2 they change to sending mode, and so on. Switch i is called explosive if the maximum length of data stored in the buffers of switches is not bounded as t goes to infinity.</p>

<p>Your task is to calculate the number of explosive switches in the network.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two space-separated integers n and m, where n indicates the number of switches and m indicates the number of directed links (1 &le; n, m &le; 50, 000). Each of the next m lines contains two space-separated integers u, v where (u, v) indicates a directed link from switch u to switch v (1 &le; u, v &le; n, u &ne;&nbsp;v). The input terminates with a line containing 0 0 which should not be processed.</p>

### 출력

<p>For each test case, output a single line containing the number of explosive switches.</p>