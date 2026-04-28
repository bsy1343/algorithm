# [Silver II] Strange String Manipulation - 22624

[문제 링크](https://www.acmicpc.net/problem/22624)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 23, 맞힌 사람: 20, 정답 비율: 44.444%

### 분류

사칙연산, 브루트포스 알고리즘, 수학

### 문제 설명

<p>A linear congruential generator produces a series $R(&middot;)$ of pseudo-random numbers by the following formulas:</p>

<p style="text-align: center;">$R(0) = S$, $R(i) = (A &middot; R(i - 1) + C) \bmod M$ (for $i = 1, 2, \dots$),</p>

<p>where $S$, $A$, $C$, and $M$ are all parameters. In this problem, $0 \le S, A, C \le 15$ and $M = 256$.</p>

<p>Now suppose we have some input string $I(&middot;)$, where each character in the string is an integer between $0$ and $(M - 1)$. Then, using the pseudo-random number series $R(&middot;)$, we obtain another string $O(&middot;)$ as the output by the following formula:</p>

<p style="text-align: center;">$O(i) = (I(i) + R(i)) \bmod M$ (for $i = 1, 2, \dots$),</p>

<p>Your task is to write a program that shows the parameters $S$, $A$, and $C$ such that the information entropy of the output string $O(&middot;)$ is minimized. Here, the information entropy $H$ is given by the following formula:</p>

<p>$$H = -\sum_{x}{\frac{\text{#}(x)}{N}\log{\frac{\text{#}(x)}{N}} }$$</p>

<p>where $N$ is the length of the string and $\text{#}(x)$ is the number of occurences of the alphabet $x$.</p>

### 입력

<p>The input has the following format:</p>

<blockquote>
<p>$N$</p>

<p>$I(1) I(2) \dots&nbsp;I(N)$</p>
</blockquote>

<p>$N$ does not exceed 256.</p>

### 출력

<p>Print in a line the values of the three parameters $S$, $A$, and $C$ separated by a single space. If more than one solution gives the same minimum entropy, choose the solution with the smallest $S$, $A$, and then $C$.</p>