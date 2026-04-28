# [Platinum V] Keep it energized - 11551

[문제 링크](https://www.acmicpc.net/problem/11551)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 52, 정답: 34, 맞힌 사람: 34, 정답 비율: 66.667%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 누적 합, 우선순위 큐

### 문제 설명

<p>The Incredible Consoles Production Company (ICPC) is now designing its newest video game console model, the Super-Arcade Reloaded (SAR). The launch of the SAR will be accompanied by the release of a flagship game, which will only be available to its users. This game, which incidentally shall be called Adventures of Captain Mikado (ACM), even features an in-game currency which can be conveniently bought using real-world money!</p>

<p>The ACM is a very simple game consisting of N levels numbered 1, 2, . . . , N, the i-th level requiring exactly E<sub>i</sub> units of energy to be completed. This means that in order to complete that level, the user&rsquo;s energy should be at least E<sub>i</sub>, and after doing so it will decrease in exactly that amount. To win the game the user should complete all the levels in increasing order, starting at level 1 and continuing until level N without ever going back to some already-completed level.</p>

<p>Initially the user starts with no energy, and in order to get some he must buy energy packs from the in-game shops distributed among the N levels. There are M such shops. Each shop sells an energy pack having a strength S and a cost C that depend on the shop. The user can only buy energy packs from the shops in the level he is currently in, before starting to complete that level. The effect of buying an energy pack of strength S is that the user&rsquo;s energy immediately turns into S, regardless of which value it had before.</p>

<p>In order to increase even further its sales, the ICPC has thought of a revolutionary promotion: it will reimburse the full cost of the SAR to whoever completes the ACM game using the minimum amount of in-game cash. Given the description of the game, can you help them find out what is the minimum amount of in-game cash required to finish the game?</p>

### 입력

<p>The first line contains two integers N and M, representing respectively the number of levels and the number of shops in the game (1 &le; N, M &le; 10<sup>5</sup>). The second line contains N integers E<sub>1</sub>, E<sub>2</sub>, . . . , E<sub>N</sub>, where E<sub>i</sub> is the energy required to complete the i-th level (1 &le; E<sub>i</sub> &le; 10<sup>4</sup> for i = 1, 2, . . . , N). Each of the next M lines describes a shop with three integers L, S and C, representing respectively the level where the shop is located, and the strength and cost of the energy pack it sells (1 &le; L &le; N, 1 &le; S &le; 10<sup>9</sup> and 1 &le; C &le; 10<sup>4</sup>).</p>

### 출력

<p>Output a line with an integer representing the minimum amount of in-game cash that is required to complete all N levels in the game. If it is impossible to complete all the levels, write the value &minus;1.</p>