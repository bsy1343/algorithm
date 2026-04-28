# [Platinum I] Flip a Coin - 19338

[문제 링크](https://www.acmicpc.net/problem/19338)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 119, 정답: 36, 맞힌 사람: 23, 정답 비율: 25.843%

### 분류

가우스 소거법, 선형대수학, 수학, 확률론

### 문제 설명

<p>Alice and Bob have each picked a string containing only heads and tails. &nbsp;Then a fair coin is flipped until a sequence of consecutive flips matches one or both of the strings. &nbsp;Alice wins if her string appears first, and Bob wins if his appears first. &nbsp;It&#39;s possible that both of their strings appear at the same time. &nbsp;In that case the game is a tie.</p>

<p>Given the two strings, what is the probability of these three outcomes?</p>

### 입력

<p>The first line of input is Alice&#39;s string, and the second line is Bob&#39;s. These strings contain only <code>H</code>s and <code>T</code>s, and their lengths are between 1 and 20, inclusive.</p>

### 출력

<p>The output consists of three lines, each of which contains a single real number. &nbsp;They should be the probability that Alice wins, the probability that Bob wins, and the probability of a tie.</p>

<p>An answer will be accepted if it differs from the correct answer by at most $10^{-8}$.</p>