# [Bronze II] Is It Even? - 24927

[문제 링크](https://www.acmicpc.net/problem/24927)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 452, 정답: 252, 맞힌 사람: 192, 정답 비율: 53.933%

### 분류

수학, 구현

### 문제 설명

<p>You are a leading programmer at Company<sup>TM</sup>, and have been given the following task. Given a list of $N$&nbsp;integers&nbsp;$x_1, \dots ,x_N$, is their product&nbsp;$x_1&sdot;x_2&sdot; \dots &sdot;x_N$&nbsp;even? You plug away at the problem using every trick in the book, and come up with a very elegant solution. Lo and behold, your supervisor&nbsp;<i>then</i>&nbsp;informs you that the task has changed! It turns out the higher ups want you to find out if the product&nbsp;$x_1&sdot;x_2&sdot; \dots &sdot;x_N$&nbsp;is divisible by&nbsp;$2^K$&nbsp;for some integer&nbsp;$K&ge;0$.</p>

<p>You just can&rsquo;t catch a break!</p>

### 입력

<p>The input consists of two integers&nbsp;$N,K$&nbsp;($1&le;N&le;100000$&nbsp;and&nbsp;$0&le;K&le;1000$). These are followed by&nbsp;$N$&nbsp;lines, each with a single value&nbsp;$x_1, \dots ,x_N$&nbsp;respectively ($1&le;x_i&le;10^9$&nbsp;for each&nbsp;$1&le;i&le;N$) which form the product.</p>

### 출력

<p>Display&nbsp;<code>1</code>&nbsp;if $2^K$&nbsp;divides&nbsp;$x_1&sdot;x_2&sdot; \dots &sdot;x_N$, otherwise display&nbsp;<code>0</code>.</p>