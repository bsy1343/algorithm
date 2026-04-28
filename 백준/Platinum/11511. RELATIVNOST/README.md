# [Platinum I] RELATIVNOST - 11511

[문제 링크](https://www.acmicpc.net/problem/11511)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 32 MB

### 통계

제출: 301, 정답: 87, 맞힌 사람: 62, 정답 비율: 24.800%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리

### 문제 설명

<p>Young Luka is an art dealer. He has N clients and sells artistic paintings to each client.</p>

<p>Each client can purchase either colored paintings or black and white paintings, but not both.</p>

<p>The client denoted with i wants to purchase at most ai colored paintings and at most bi black and white paintings.</p>

<p>The client will always purchase at least one paintings. Luka has an almost unlimited amount of paintings, so the number of paintings required from the clients is never a problem.</p>

<p>Luka doesn&rsquo;t like selling black and white paintings and knows that if less than C people get colored paintings, it will make him feel sad.</p>

<p>His clients constantly keep changing their requests or, in other words, the number of paintings they want to purchase. Because of this, Luka is often troubled by the question: &ldquo;How many different purchases are there, so that at least C clients get at least one colored painting?&rdquo; Help Luka and save him from his worries.&nbsp;</p>

### 입력

<p>The first line of input contains two integers N, C (1 &le; N &le; 100 000, 1 &le; C &le; 20).</p>

<p>The second line of input contains N integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 1 000 000 000).</p>

<p>The third line of input contains N integers b<sub>i</sub> (1 &le; b<sub>i</sub> &le; 1 000 000 000).</p>

<p>The fourth line of input contains the number of requirement changes Q (1 &le; Q &le; 100 000).</p>

<p>Each of the following Q lines contains three integers, the label of the person changing the requirements P (1 &le; P &le; N), the maximal number of colored paintings they want to purchase a<sub>P</sub> (1 &le; a<sub>P</sub> &le; 1 000 000 000) and the maximal number of black and white paintings they want to purchase b<sub>P</sub> (1 &le; b<sub>P</sub> &le; 1 000 000 000).&nbsp;</p>

### 출력

<p>The output must consist of Q lines where each line contains the number of different purchases modulo 10 007.</p>

### 힌트

<p>Clarification of the first example: After the first client changes his request from (1, 1) to (1, 1) - nothing really changes, the number of ways to sell paintings is 1. The one and only way to sell paintings is to sell the first client one colored painting, and the second client should be sold one colored painting as well. Every client is required to get at least one colored painting because C=2, which means that there should be at least 2 clients with colored paintings.</p>