# [Bronze I] Another Goose Goose Duck Problem - 28173

[문제 링크](https://www.acmicpc.net/problem/28173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 278, 정답: 132, 맞힌 사람: 106, 정답 비율: 48.624%

### 분류

수학, 사칙연산

### 문제 설명

<p>Teacher Rice likes playing the famous game &#39;Goose Goose Duck&#39;. In the game, Teacher Rice plays a duck and his goal is to kill the geese. Every time he kills a goose, he should wait $a$ seconds for his killing skill to cool down. Since Teacher Rice&#39;s role is the Serial Killer, the time Teacher Rice waits depends on which type of goose he kills. Because Teacher Rice is a skilled killer, he can make the waiting time $a$ to be an arbitrary integer in $[\ell,r]$.</p>

<p>Teacher Rice meets a goose every $b$ seconds. Once Teacher Rice meets a goose, he can choose to kill the goose if his killing skill is ready, otherwise the goose runs away immediately and he can not kill this goose.</p>

<p>Teacher Rice wants to know the minimum time he needs to kill $k$ geese.</p>

<p><span style="display: none;"> </span> </p>

### 입력

<p>There are four integers in one line: $\ell$, $r$, $b$, $k$ ($1\leq \ell\leq r\leq 10^9$, $1\leq b,k\leq 10^9$).</p>

### 출력

<p>Output one integer denotes the time Teacher Rice needs to kill $k$ geese.</p>