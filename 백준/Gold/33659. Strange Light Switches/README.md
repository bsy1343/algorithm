# [Gold II] Strange Light Switches - 33659

[문제 링크](https://www.acmicpc.net/problem/33659)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 8, 맞힌 사람: 7, 정답 비율: 29.167%

### 분류

많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<p>You are the best electrician around and are now working on understanding the wiring in a customer’s house. But you aren’t able tomake heads or tails of it, or even turn them all off! You really want to turn them off so you can start rewiring the place.</p>

<p>All lights in the customer’s house are arranged in a circle. After working on it for a while, you notice a pattern; whenever you flip a switch, the light may or may not change its on/off status - it depends on it’s direct neighbours. That is, whenever the two neighbours of a light are in different on/off states, the switched light turns on (or reamins on if it was already on), and when the two neighbours are both on or both off, the switched light turns off (or remains off if it was already off). You recall is exactly the exclusive or (<code>XOR</code>) function.</p>

<p>Looking for a programmatic solution, you first represent the light switches as a binary string $a$ of length $N$ where each digit corresponds to a light. A <code>1</code> at index $i$ means light $i$ is initially on and a <code>0</code> at index $i$ means light $i$ is initially off. Now, you can characterize the switching behavior with performing the following operation on the string. For any index $0≤i&lt;N$, when you flip switch $i$ the following update occurs:</p>

<p>$$a[i]=a[i-1] \text{ XOR } a[i+1]$$</p>

<p>Here, the indexing is “wrap-around”, i.e. for $i=0$ we have that $a[i-1]$ really means $a[N-1]$ and for $i=N-1$ we have that $a[i+1]$ really means $a[0]$.</p>

<p>Your task is to write a program to determine if you can zero the string or not, and report the steps of a solution it is possible.</p>

### 입력

<p>The first line of input contains the integer $N$ ($3≤N≤10^3$), the number of lights in the house. The following line consists of a string of $N$ binary digits the initial on/off state of all the lights. A <code>1</code> denotes the light being on, and a <code>0</code> denotes the light being off. At least one light will initially be on.</p>

### 출력

<p>If it is possible to turn off all lights, you should output two lines. The first contains a single integer $M$ (at most $3\cdot N$) indicating the number of steps in your solution. The second contains the space-separated indices $b_1,b_2,\dots ,b_M$ of the sequence of switches you flip. It must be that $0≤b_i≤N-1$ for each index $b_i$ you output. This means you first flip $b_1$, then $b_2$, then $b_3$, etc to turn off all lights. You are guaranteed that if there is a solution, there is one that uses at most $3\cdot N$ steps. If there are multiple solutions, you may output any.</p>

<p>If it is not possible to turn off all lights, you should output just a single line containing the integer $-1$.</p>