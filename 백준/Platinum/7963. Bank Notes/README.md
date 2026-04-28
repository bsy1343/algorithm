# [Platinum II] Bank Notes - 7963

[문제 링크](https://www.acmicpc.net/problem/7963)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 다이나믹 프로그래밍, 덱을 이용한 다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>The Byteotian Bit Bank (BBB) has the largest network of cash dispensers in the whole Byteotia. The BBB have decided to improve their dispensers and have asked you for help. The legal tender in Byteotia are bank notes of denominations b<sub>1</sub>,b<sub>2</sub>,&hellip;,b<sub>n</sub>. The BBB have concluded that the cash dispensers are to pay every sum in the smallest possible total number of notes.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the description of the dispenser&#39;s notes stock and the sum to be paid off,</li>
	<li>determines the minimal total number of bank notes sufficient to pay the desired sum off, and finds some way of paying it off as well (using the determined minimal number of notes, of course)</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input the number of denominations is written n, 1 &le; n &le; 200. The second line contains n integers b<sub>1</sub>,b<sub>2</sub>,&hellip;,b<sub>n</sub>, 1 &le; b<sub>1</sub> &lt; b<sub>2</sub> &lt; &hellip; &lt; b<sub>n</sub> &le; 20,000, separated by single spaces. The third line contains n integers c<sub>1</sub>,c<sub>2</sub>,&hellip;,c<sub>n</sub>, 1 &le; c<sub>i</sub> &le; 20,000, also separated by single spaces; c<sub>i</sub> is the number of banknotes of denomination b<sub>i</sub> left in the cash dispenser. In the last, fourth line of input there is one integer k - the sum to be paid off, 1 &le; k &le; 20,000. For the test data, you are free to assume that the sum k can be paid off in the available banknotes.</p>

### 출력

<p>The first line of the standard output should contain one integer denoting the minimal total number of bank notes sufficient to pay the sum off k. The second line should contain n integers, separated by single spaces, denoting the numbers of notes of subsequent denominations used to pay off the sum k. If there are many solutions your programme should write any of them.</p>