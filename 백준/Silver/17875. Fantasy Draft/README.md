# [Silver I] Fantasy Draft - 17875

[문제 링크](https://www.acmicpc.net/problem/17875)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 38, 맞힌 사람: 31, 정답 비율: 50.000%

### 분류

구현, 자료 구조, 시뮬레이션, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>In fantasy hockey, there are n team owners that each selects k hockey players. To determine which owner gets which players, the owners hold a draft.</p>

<p>The draft proceeds as follows: the first owner may select any player, then the second owner can select any player except the player taken first and so on. In general, the current owner may take any player that has not been taken previously. Once all owners have selected one player, they repeat this process until all owners have selected k players. No player may be selected by multiple teams.</p>

<p>Initially, all players are given a ranking based on how well they played in the previous year. However, the owners may not agree with this order. For example, the first owner may believe that the player which was ranked third in the previous year is the best player and would prefer to take them.</p>

<p>Each owner has a preference list. On their turn, the owner selects the player that is the highest available player on their own preference list. If all players on their preference list are taken, then they resort to using the ordering from the previous year.</p>

<p>Given the preference list of each owner and the rankings from the previous year, which players did each owner get?</p>

### 입력

<p>The first line of the input contains two integers n (1 &le; n &le; 60), the number of owners, and k (1 &le; k &le; 1 000), the size of each team.</p>

<p>The next n lines contain owners&rsquo; preferences in the order of drafting. Each line starts with an integer q<sub>i</sub> (0 &le; q<sub>i</sub> &le; 1 500), the size of the i<sup>th</sup> owners&rsquo; preference list. q<sub>i</sub> names follow, separated by spaces, in order of i<sup>th</sup> owner&rsquo;s preference. No name appears more than once in the i<sup>th</sup> owners&rsquo; list.</p>

<p>The next line contains a single integer p (n &middot; k &le; p &le; 65 000), indicating the number of players in the draft.</p>

<p>The next p lines each contain a single name, they are ordered by their previous year&rsquo;s ranking. Each player name is unique and comprised of at most 12 letters of English alphabet.</p>

<p>The names in owners&rsquo; preference lists are guaranteed to appear in the player list.</p>

### 출력

<p>Display n lines. The i<sup>th</sup> of which contains the k names of the players that were selected by the i<sup>th</sup> owner. The n teams should be in the original order of owners and players should be listed in the order in which they were drafted following the rules above.</p>