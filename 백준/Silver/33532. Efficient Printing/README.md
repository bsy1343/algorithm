# [Silver II] Efficient Printing - 33532

[문제 링크](https://www.acmicpc.net/problem/33532)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 72, 정답: 51, 맞힌 사람: 45, 정답 비율: 75.000%

### 분류

수학, 정수론

### 문제 설명

<p>The Factorial Poster Company (FPC) prints posters that display the result of any factorial that their customers wish for. Recently, they got an order from Professor D.R. Ingenious, who wants to do an experiment with very large factorial numbers. The FPC want to be as efficient with printing as possible, and therefore they decided on a way to save paper. Since the larger factorial numbers end in a lot of zeroes, they decide to cut off this number of zeroes $z$ and replace it with "$\cdot 10^z$".</p>

<p>You are given the task to calculate, for every order of Prof. Ingenious, how many zeroes $z$ can be cut off from the poster, so that the FPC know how much poster paper they will save.</p>

### 입력

<p>One line containing one integer $n$, with $0 \leq n \leq 10^{18}$.</p>

### 출력

<p>One line containing one integer $z$, the amount of trailing zeroes of $n!$. Note that any other zeroes in the result of $n!$ do not count, see the second example.</p>