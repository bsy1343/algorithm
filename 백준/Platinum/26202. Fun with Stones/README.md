# [Platinum II] Fun with Stones - 26202

[문제 링크](https://www.acmicpc.net/problem/26202)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

수학, 정수론, 게임 이론, 분할 정복, 확률론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 스프라그–그런디 정리, 페르마의 소정리

### 문제 설명

<p>Alice and Bob will play a game with $3$ piles of stones. They take turns and, on each turn, a player must choose a pile that still has stones and remove a positive number of stones from it. Whoever removes the last stone from the last pile that still had stones wins. Alice makes the first move.</p>

<p>The $i$-th pile will have a random and uniformly distributed number of stones in the range $[L_i , R_i ]$. What is the probability that Alice wins given that they both play optimally?</p>

### 입력

<p>The input consists of a line with $6$ integers, respectively, $L_1$, $R_1$, $L_2$, $R_2$, $L_3$, $R_3$. For each $i$, $1 &le; L_i &le; R_i &le; 10^9$.</p>

### 출력

<p>Print an integer representing the probability that Alice wins modulo $10^9 + 7$.</p>

<p>It can be shown that the answer can be expressed as an irreducible fraction $\frac{p}{q}$, where $p$ and $q$ are integers and $q \not\equiv 0 \pmod{10^9 + 7}$, that is, we are interested in the integer $p &times; q^{-1} \pmod{10^9 + 7}$.</p>