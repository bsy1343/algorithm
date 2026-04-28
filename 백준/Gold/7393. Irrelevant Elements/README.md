# [Gold I] Irrelevant Elements - 7393

[문제 링크](https://www.acmicpc.net/problem/7393)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 32, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

수학, 정수론, 소인수분해

### 문제 설명

<p>Young cryptoanalyst Georgie is investigating different schemes of generating random integer numbers ranging from $0$ to $m - 1$. He thinks that standard random number generators are not good enough, so he has invented his own scheme that is intended to bring more randomness into the generated numbers.</p>

<p>First, Georgie chooses $n$ and generates $n$ random integer numbers ranging from $0$ to $m - 1$. Let the numbers generated be $a_1, a_2, \ldots, a_n$. After that Georgie calculates the sums of all pairs of adjacent numbers, and replaces the initial array with the array of sums, thus getting $n-1$ numbers:~$a_1 + a_2, a_2 + a_3, \ldots, a_{n - 1} + a_n$. Then he applies the same procedure to the new array, getting $n - 2$ numbers. The procedure is repeated until only one number is left. This number is then taken modulo $m$. That gives the result of the generating procedure.</p>

<p>Georgie has proudly presented this scheme to his computer science teacher, but was pointed out that the scheme has many drawbacks. One important drawback is the fact that the result of the procedure sometimes does not even depend on some of the initially generated numbers. For example, if $n = 3$ and $m = 2$, then the result does not depend on $a_2$.&nbsp;</p>

<p>Now Georgie wants to investigate this phenomenon. He calls the $i$-th element of the initial array <em>irrelevant</em> if the result of the generating procedure does not depend on $a_i$. He considers various $n$ and $m$ and wonders which elements are irrelevant for these parameters. Help him to find it out.</p>

### 입력

<p>Input file contains $n$ and $m$ ($1 \le n \le 100\,000$, $2 \le m \le 10^9$).</p>

### 출력

<p>On the first line of the output file print the number of irrelevant elements of the initial array for given $n$ and $m$. On the second line print all such $i$ that $i$-th element is irrelevant. Numbers on the second line must be printed in the ascending order and must be separated by spaces.</p>