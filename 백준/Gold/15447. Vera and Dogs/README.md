# [Gold V] Vera and Dogs - 15447

[문제 링크](https://www.acmicpc.net/problem/15447)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 23, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

해 구성하기

### 문제 설명

<p>Vera owns N doghouses numbered from 1 to N and M = X&middot;N dogs numbered from 1 to M. Each doghouse should be the primary home of X dogs P<sub>i,1</sub>, . . . , P<sub>i,X</sub> and the secondary home of X dogs S<sub>i,1</sub>, . . . , S<sub>i,X</sub>. Each dog should have one primary home and one secondary home different from its primary home. Every night, at most one doghouse might be unavailable due to cleaning. Each dog will sleep in its primary home if it is available, otherwise it will sleep in its secondary home. Each doghouse should contain at most X + 1 sleeping dogs on any night.</p>

<p>Help Vera find a valid assignment of doghouses to dogs, or determine that it is impossible.</p>

### 입력

<p>Line 1 contains integers N and X (1 &le; N, X &le; 2017, X &middot; N &le; 50000).</p>

### 출력

<p>If it is impossible to find a valid assignment, print one line with &minus;1.</p>

<p>Otherwise print N lines. The i-th line should contain 2X integers P<sub>i,1</sub>, . . . , P<sub>i,X</sub>, S<sub>i,1</sub>, . . . , S<sub>i,X</sub>. If there are multiple possible assignments, print any of them.</p>

### 힌트

<p>For the first example:</p>

<p>Doghouse 1 is the primary home of dogs 5 and 1 and secondary home of dogs 6 and 4. If doghouse 1 is unavailable, then dog 1 will sleep in doghouse 3 and dog 5 will sleep in doghouse 2.</p>

<p>Doghouse 2 is the primary home of dogs 3 and 6 and secondary home of dogs 5 and 2. If doghouse 2 is unavailable, then dog 3 will sleep in doghouse 3 and dog 6 will sleep in doghouse 1.</p>

<p>Doghouse 3 is the primary home of dogs 4 and 2 and secondary home of dogs 1 and 3. If doghouse 3 is unavailable, then dog 4 will sleep in doghouse 1 and dog 2 will sleep in doghouse 2.</p>

<p>So it can be seen that no doghouse will ever contain more than 3 dogs.</p>