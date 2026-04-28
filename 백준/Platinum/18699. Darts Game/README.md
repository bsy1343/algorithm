# [Platinum II] Darts Game - 18699

[문제 링크](https://www.acmicpc.net/problem/18699)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 3, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

기하학, 정렬, 스위핑

### 문제 설명

<p>Darts is a fun game, in the game you shoot several darts on a board and you get a score for each dart based on its location. The game in this problem is a bit different.</p>

<p>The board in this problem can be considered as an infinite 2-dimensional plane, and you have already shot N darts. For each dart, you are given its location on the board as a point (X, Y ), and also for each dart you are given a score which you will get if we count this dart, this score can be negative or positive, and multiple darts can be at the exact same location with even different scores.</p>

<p>Here&rsquo;s how the scoring happens. After shooting the N darts, you are required to draw a square on this plane, the length of the square side must be L, also the point (0, 0) must be exactly at the center of the square, but you can rotate the square in any way you want. Then you will get the score for each dart which is inside that square or on its boundaries.</p>

<p>Note that you can rotate the square only once before considering any darts.</p>

<p>Given the location and the score for each dart and the value of L, your task is to draw a square that gives you the maximum possible score (it&rsquo;s okay if the square doesn&rsquo;t contain any darts).</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T (1 &le; T &le; 100) representing the number of test cases. Followed by T test cases.</p>

<p>Each test case starts with a line containing an integer N (1 &le; N &le; 10<sup>5</sup>) representing the number of darts, followed by a space then an integer L (1 &le; L &le; 10<sup>5</sup>) which is the length of the square side.</p>

<p>Followed by N lines, each line will contain 3 integers separated by a space, &lsquo;X Y S&rsquo;, which means there&rsquo;s a dart at point (X, Y) and will give you score S if it&rsquo;s counted (&minus;10<sup>5</sup> &le; X, Y, S &le; 10<sup>5</sup>).</p>

### 출력

<p>For each test case print a single line containing the maximum score you can get after drawing the square.</p>

### 힌트

<p>The following image represents the first sample test case, there&rsquo;s no way to take the point which gives score 100, but we can rotate the square little bit such that it no longer includes the point which gives score -101.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18699.%E2%80%85Darts%E2%80%85Game/71854d43.png" data-original-src="https://upload.acmicpc.net/937f2be0-a550-407f-8e70-c4a33ee252d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 399px; height: 383px;" /></p>