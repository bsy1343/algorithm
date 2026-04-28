# [Gold I] Domino - 9898

[문제 링크](https://www.acmicpc.net/problem/9898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 34, 맞힌 사람: 32, 정답 비율: 64.000%

### 분류

다이나믹 프로그래밍, 비트마스킹

### 문제 설명

<p>You are given a set of 2<i>n</i>&nbsp;dominos, where&nbsp;<i>n</i>&nbsp;&lt; 1000 is an integer. The dominos have width 1 and length 2. It is possible to arrange these dominos in such a way that they form a 4 &times;&nbsp;<i>n</i>&nbsp;rectangle. For instance, in Figure 1, we have arranged 12 dominos to form a 4 &times; 6 rectangle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9898.%E2%80%85Domino/265cd76d.png" data-original-src="https://upload.acmicpc.net/35708222-5e94-48f8-b769-6f71d10877b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 171px; height: 120px;" /></p>

<p style="text-align: center;">Figure 1: Example with&nbsp;<i>n</i>&nbsp;= 6.</p>

<p>In fact, where&nbsp;<i>n</i>&nbsp;&gt; 1, there are several ways of arranging dominos to form a 4 &times;&nbsp;<i>n</i>&nbsp;rectangle. For instance, in Figure 2, you can see the 5 different ways of forming a 4 &times; 2 rectangle:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9898.%E2%80%85Domino/1d5d2011.png" data-original-src="https://upload.acmicpc.net/91bd45fa-782b-4d79-b011-2fc4db202635/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 389px; height: 120px;" /></p>

<p style="text-align: center;">Figure 2: The 5 different ways of forming a 4 &times; 2 rectangle.</p>

<p>We denote by&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;the number of different ways of forming a 4 &times;&nbsp;<i>n</i>&nbsp;rectangle with 2<i>n</i>&nbsp;dominos. For instance,&nbsp;<i>R</i><sub>2</sub>&nbsp;= 5, as you can see in Figure 2. As&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;can be quite large, even for small values of&nbsp;<i>n</i>, you are only asked to compute the last three digits of&nbsp;<i>R</i><sub><i>n</i></sub>. Your program should output the value of the last three digits of&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;without leading zeros. For instance,&nbsp;<i>R</i><sub>17</sub>&nbsp;= 26915305, so when&nbsp;<i>n</i>&nbsp;= 17, your program should output 305 (the last three digits). Another example,&nbsp;<i>R</i><sub>2</sub>&nbsp;= 5 (or 005), so when&nbsp;<i>n</i>&nbsp;= 2, your program should output 5. Should the last three digits be zeros for some&nbsp;<i>R</i><sub><i>n</i></sub>, your program should simply output 0.</p>

### 입력

<p>The input&nbsp;contains the integer&nbsp;<i>n</i>. Remember that&nbsp;<i>n</i>&nbsp;&lt; 1000.</p>

### 출력

<p>You should write an integer giving the value of the last three digits of&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;without leading zeros in the output. (Note that the output value is simply the value&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;mod 1000; that is, the remainder of&nbsp;<i>R</i><sub><i>n</i></sub>&nbsp;divided by 1000.)</p>