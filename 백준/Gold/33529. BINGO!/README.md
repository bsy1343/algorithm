# [Gold V] BINGO! - 33529

[문제 링크](https://www.acmicpc.net/problem/33529)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 50, 정답: 23, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

구현

### 문제 설명

<p>A common activity for students during a lecture is playing BINGO. However, they don't play the regular boring game with the numbered balls. Instead, their BINGO sheets contain in every square an event that might (or might not) happen during a lecture, and once the event happens, this square can be crossed off.</p>

<p>Since you'd also like to pay attention during the lecture while playing this game, you decide to build a program that automatically plays BINGO for you. Given a BINGO sheet with a grid of $n \times n$ squares, and a list of events that happen during the lecture, how many events will pass before you can shout "BINGO!"?</p>

<p>Note that you may shout "BINGO!" whenever you crossed off all squares in any row, column, or diagonal of the grid. The middle square in your grid can always be crossed off for free.</p>

### 입력

<p>One line containing two integers: one odd integer $n$, with $1 \leq n \leq 10^3$, and one integer $m$, with $0 \leq m \leq 10^6$. $n$ lines, each containing $n$ space-separated events. Event names consist of only alphanumeric characters, and every event only happens at most once. $m$ lines, with on every line an event that happens during the lecture.</p>

### 출력

<p>One integer, indicating after how many events you can shout "BINGO!". If you cannot shout "BINGO!" during this lecture, output a sad smiley face: <code>:-(</code></p>