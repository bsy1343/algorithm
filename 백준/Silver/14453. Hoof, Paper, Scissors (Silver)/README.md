# [Silver II] Hoof, Paper, Scissors (Silver) - 14453

[문제 링크](https://www.acmicpc.net/problem/14453)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1358, 정답: 805, 맞힌 사람: 672, 정답 비율: 59.786%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>You have probably heard of the game &quot;Rock, Paper, Scissors&quot;. The cows like to play a similar game they call &quot;Hoof, Paper, Scissors&quot;.</p>

<p>The rules of &quot;Hoof, Paper, Scissors&quot; are simple. Two cows play against each-other. They both count to three and then each simultaneously makes a gesture that represents either a hoof, a piece of paper, or a pair of scissors. Hoof beats scissors (since a hoof can smash a pair of scissors), scissors beats paper (since scissors can cut paper), and paper beats hoof (since the hoof can get a papercut). For example, if the first cow makes a &quot;hoof&quot; gesture and the second a &quot;paper&quot; gesture, then the second cow wins. Of course, it is also possible to tie, if both cows make the same gesture.</p>

<p>Farmer John wants to play against his prize cow, Bessie, at&nbsp;N&nbsp;games of &quot;Hoof, Paper, Scissors&quot; (1 &le; N &le; 100,000). Bessie, being an expert at the game, can predict each of FJ&#39;s gestures before he makes it. Unfortunately, Bessie, being a cow, is also very lazy. As a result, she tends to play the same gesture multiple times in a row. In fact, she is only willing to switch gestures at most once over the entire set of games. For example, she might play &quot;hoof&quot; for the first&nbsp;x&nbsp;games, then switch to &quot;paper&quot; for the remaining&nbsp;N&minus;x games.</p>

<p>Given the sequence of gestures FJ will be playing, please determine the maximum number of games that Bessie can win.</p>

### 입력

<p>The first line of the input file contains&nbsp;N.</p>

<p>The remaining&nbsp;N&nbsp;lines contains FJ&#39;s gestures, each either H, P, or S.</p>

<p>&nbsp;</p>

### 출력

<p>Print the maximum number of games Bessie can win, given that she can only change gestures at most once.</p>