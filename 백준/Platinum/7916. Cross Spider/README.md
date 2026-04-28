# [Platinum V] Cross Spider - 7916

[문제 링크](https://www.acmicpc.net/problem/7916)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 355, 정답: 79, 맞힌 사람: 70, 정답 비율: 23.973%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>The Bytean cross spider (Araneida baitoida) is known to have an amazing ability. Namely, it can instantly build an arbitrarily large spiderweb as long as it is contained in a single plane. This ability gives the spider an opportunity to use a fancy hunting strategy. It does not need to wait until a fly is caught in an already built spiderweb; if only the spider knows the current position of a fly, it can instantly build a spiderweb to catch the fly.</p>

<p>A cross spider has just spotted n flies in Byteasar&rsquo;s garden. Each fly is flying still in some point of a 3D space. The spider is wondering if it can catch all the flies with a single spiderweb. Write a program that answers the spider&rsquo;s question.</p>

### 입력

<p>The first line of the input contains an integer n (1 &le; n &le; 100 000). The following n lines contain a description of the flies in a 3D space: the i-th line contains three integers x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> (&minus;1 000 000 , x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> , 1 000 000) giving the coordinates of the i-th fly (a point in a 3-dimensional Euclidean space). No two flies are located in the same point.</p>

### 출력

<p>Your program should output a single word TAK (i.e., yes in Polish) if the spider can catch all the flies with a single spiderweb. Otherwise your program should output the word NIE (no in Polish).</p>