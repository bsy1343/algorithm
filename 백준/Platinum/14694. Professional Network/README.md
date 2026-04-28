# [Platinum II] Professional Network - 14694

[문제 링크](https://www.acmicpc.net/problem/14694)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>Kevin is developing his professional network within a certain community. Unfortunately, he has not connected with anybody yet. But he has his eyes on N&nbsp;potentially valuable connections, numbered from 1 to N. He is determined to connect with them all.</p>

<p>However, few people in this community are willing to friend an outsider. Each of the N&nbsp;people Kevin wants to connect with has similar, but different criteria for determining who is an outsider and who isn&#39;t. Person i is willing to friend Kevin if he either has at least A<sub>i</sub> connections within the community already, or if Kevin gives this person B<sub>i</sub> Internet Points.</p>

<p>Kevin likes his Internet Points very much, and so he doesn&#39;t want to give away too many. Now it is your job to help Kevin give away the least number of Internet Points while still making connections with each of the N people.</p>

### 입력

<p>The first line will contain the integer N (1 &le; N &le; 200000). Each of the next N lines will contain integers A<sub>i</sub> and B<sub>i</sub> (1 &le; i &le; N; 0 &le; A<sub>i</sub> &le; N; 0 &le; B<sub>i</sub> &le; 10000).</p>

<p>For 2 of the 25 available marks, B<sub>i</sub> = 1 for all i.</p>

<p>For an additional 4 of the 25 available marks, N &le; 10.</p>

<p>For an additional 7 of the 25 available marks, N &le; 1000.</p>

### 출력

<p>Output one integer on a single line, the minimum number of Internet Points Kevin has to give away.</p>

### 힌트

<p>Explanation for Sample 1</p>

<p>Kevin can connect with person 3 immediately, and with this connection made, he can also connect with person 2. He doesn&#39;t have enough connections to connect with person 1 or person 4, so he gives 3 Internet Points to person 1 to acquire 3 total connections which enables him to connect with person 4.</p>

<p>Explanation for Sample 2</p>

<p>It is possible that Kevin can connect with everyone without giving away any Internet Points.</p>

<p>Explanation for Sample 3</p>

<p>Kevin should connect with person 1 immediately, then give 8 Internet Points to person 3 to connect with them, then connect with person 2.</p>