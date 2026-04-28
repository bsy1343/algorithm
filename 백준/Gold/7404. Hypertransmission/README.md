# [Gold III] Hypertransmission - 7404

[문제 링크](https://www.acmicpc.net/problem/7404)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

정렬, 스위핑

### 문제 설명

<p>The president of the Galactic Federation has recently decided that all planets of the galaxy must establish hyper-radio centers to broadcast their programs. To ensure the process, the government has signed the contract with well known hyper-radio equipment manufacturer Trojan Horse Ltd. By the terms of this contract the company has to provide $N$ hypertransmitters, one for each planet of the Federation.</p>

<p>It is known that there are two main political movements in the galaxy: industrialism and ecologism. On each planet of the galaxy one of these movements has the majority. It is clear that after establishing the hyper-radio station on the planet, the political programs of the station will support the movement that has the majority on this planet.&nbsp;</p>

<p>All transmitters supplied by Trojan Horse Ltd will have the same range, so hyper-radio programs from each planet will be heard at the distance not exceeding $R$ parsecs from it. Since the company director is actually the agent of the Dark Empire, he wants to choose $R$ in such a way, that it would destabilize the political situation in the Galactic Federation.</p>

<p>More precisely, for each planet $A$ let $N^+(A)$ be the number of planets where the same political movement as in $A$ has the majority and hyper-radio programs from $A$ are received, including $A$ itself. Similarly, let $N^-(A)$ be the number of planets where the other political movement has the majority and hyper-radio programs from $A$ are received. The planet $A$ is called <em>destabilizing</em> if $N^+(A) &lt; N^-(A)$.</p>

<p>Your task is to choose such $R$ that the number $D$ of destabilizing planets is maximal possible. Since increasing transmitter&#39;s range requires more resources for its manufacturing, you must find the smallest possible $R$ maximizing $D$.</p>

### 입력

<p>The first line of the input file contains $N$ --- the number of planets in the Galactic Federation ($1 \le N \le 1000$). Next $N$ lines contain four integer numbers $x_i$, $y_i$, $z_i$, and $p_i$ each and describe the planets: $x_i$, $y_i$, and $z_i$ specify the coordinates of the planet in space, $p_i = 0$ if the industrialists have the majority on the planet and $p_i = 1$ if the ecologists have the majority. All coordinates do not exceed $10\,000$ by their absolute value. No two planets occupy the same point.</p>

### 출력

<p>First output $D$ --- the maximal possible number of destabilizing planets. After that output non-negative real number $R$ --- the minimal range that hyper-radio transmitters must have so that the number of destabilizing planets is $D$. $R$ must be accurate within $10^{-4}$ of the correct answer.</p>