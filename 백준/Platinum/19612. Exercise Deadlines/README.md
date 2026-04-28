# [Platinum II] Exercise Deadlines - 19612

[문제 링크](https://www.acmicpc.net/problem/19612)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 32, 맞힌 사람: 31, 정답 비율: 72.093%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 세그먼트 트리

### 문제 설명

<p>Bob has N programming exercises that he needs to complete before their deadlines. Exercise i only takes one time unit to complete, but has a deadline d<sub>i</sub> (1 &le; d<sub>i</sub> &le; N) time units from now.</p>

<p>Bob will solve the exercises in an order described by a sequence a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>N</sub>, such that a<sub>1</sub> is the first exercise he solves, a<sub>2</sub> is the second exercise he solves, and so on. Bob&rsquo;s original plan is described by the sequence 1, 2, . . . , N. With one swap operation, Bob can exchange two adjacent numbers in this sequence. What is the minimum number of swaps required to change this sequence into one that completes all exercises on time?</p>

### 입력

<p>The first line consists of a single integer N (1 &le; N &le; 200 000). The next line contains N spaceseparated integers d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>N</sub> (1 &le; d<sub>i</sub> &le; N).</p>

### 출력

<p>Output a single integer, the minimum number of swaps required for Bob to solve all exercises on time, or -1 if this is impossible.</p>