# [Silver V] Olympiad Pizza - 15235

[문제 링크](https://www.acmicpc.net/problem/15235)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1363, 정답: 984, 맞힌 사람: 881, 정답 비율: 73.051%

### 분류

구현, 자료 구조, 시뮬레이션, 큐

### 문제 설명

<p>During the Olympiad finals we usually serve pizza for the contestants. When the food arrives, the contestants to queue to get some pizza. Each student will be given a single slice of pizza when his/her turn arrives. The problem is that some people need more than one slice of pizza to be well fed so they need to queue again for more pizza after they get the first one.</p>

<p>Given a list of slices needed to fed each of the contestants, compute how long it will take to fed all of them. We can give a slice of pizza every second and when a contestant is well fed he does not return to the queue.</p>

### 입력

<p>The first line will contain an integer N. The number of contestants.</p>

<p>The second line will contain N integers separated by spaces. The number of slices of pizza needed to feed each contestant.</p>

<p>N &lt;= 1000</p>

<p>The numbers in the sequence will be between 1 and 1000.</p>

<p>Each contestant will need at least 1 and at most 100 slices of pizza.</p>

### 출력

<p>A line containing N integers separated by spaces. The time in which each of the contestant get all the slices he/she needs.</p>

### 힌트

<p>The contestants that get a slice are, in order: 1, 2, 3, 4, 2, 4, 2, 4, 4.</p>

<p>So at t=1s the first contestant get all slices, at t=3s the third contestant gets a slice, at t=7s the second student finishes and finally at t=9s the fourth student gets the last slice.</p>