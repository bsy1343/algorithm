# [Silver IV] To Tell the Truth - 16423

[문제 링크](https://www.acmicpc.net/problem/16423)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 85, 맞힌 사람: 78, 정답 비율: 81.250%

### 분류

브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>There are n people in a room, each of whom always tells the truth, or always lies. Each of them makes a statement of the form: &ldquo;Some number between a and b (inclusive) of us are telling the truth.&rdquo; What is the maximum number of truth-tellers in the room?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will begin with a line containing an integer n (1 &le; n &le; 1,000) which is the number of people in the room.</p>

<p>Each of the next n lines will have two space-separated integers, a and b (0 &le; a &le; b &le; n). Each line represents the statement of one person that &ldquo;Some number between a and b (inclusive) of us are telling the truth.&rdquo;</p>

### 출력

<p>Output a single integer, which is the largest possible number of truth-tellers, or -1 if the statements are inconsistent.</p>