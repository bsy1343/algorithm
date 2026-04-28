# [Platinum V] Hexer - 8178

[문제 링크](https://www.acmicpc.net/problem/8178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 16, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

비트마스킹, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Byteasar has become a hexer - a conqueror of monsters. Currently he is to return to his hometown Byteburg. The way home, alas, leads through a land full of beasts. Fortunately the habitants, forced to fight the monsters for centuries, have mastered the art of blacksmithery - they are now capable of making special swords that are very efficient against the beasts. The land Byteasar wanders through is quite vast: many towns lie there, and many roads connect them. These roads do not cross outside the towns (mostly because some of them are underground passages).</p>

<p>Byteasar has gathered all practical information about the land (all hexers like to know these things). He knows what kind of monsters he may come across each of the roads and how much time he needs to walk it down. He also knows in which villages there are blacksmiths and against what kinds of monsters the swords that they make work. Byteasar wants to get back to Byteburg as soon as possible. As a hexer he is quite ashamed that he does not know the best route, and that he has no sword on him at the moment. Help him find the shortest path to Byteburg such that whenever he could meet some king of monster, previously he would have a chance to get an appropriate sword to fight the beast. You need not worry about the number or weight of the swords - every hexer is as strong as an ox, so he can carry (virtually) unlimited number of equipment, swords in particular.</p>

### 입력

<p>The first line of the standard input holds four integers: n, m, p and k (1 &le; n &le; 200, 0 &le; m &le; 3000, 1 &le; p &le; 13, 0 &le; k &le; n), separated by single spaces, that denote respectively: the number of towns, the number of roads connecting them, the number of different kinds of monsters and the number of blacksmiths. The towns are numbered from 1 to n in such a way that n is Byteburg&#39;s number and 1 is the number of the village which Byteasar starts in. The monster kinds are numbered from 1 to p.</p>

<p>In the following k lines the profiles of successive blacksmiths are given, one per line. The (i+1)-st line holds the integers w<sub>i</sub>, q<sub>i</sub>, r<sub>i.1</sub> &lt; r<sub>i.2</sub> &lt; &hellip; &lt; r<sub>i.qi</sub> (1 &le; w<sub>i</sub> &le; n, 1 &le; q<sub>i</sub> &le; p, 1 &le; r<sub>ij</sub> &le; p), separated by single spaces, that denote respectively: the number of town in which the blacksmith lives, the number of different kinds of monsters against which his swords are efficient, and the kinds of monsters themselves (in increasing order). Note that a town may have more than one blacksmith.</p>

<p>Then &nbsp;lines with roads&#39; descriptions follow. The (k+i+1)-th line holds the integers v<sub>i</sub>, w<sub>i</sub>, t<sub>i</sub>, s<sub>i</sub>, u<sub>i.1</sub> &lt; u<sub>i.2</sub> &lt; &hellip; &lt; u<sub>i.si</sub> (1 &le; v<sub>i</sub> &lt; w<sub>i</sub> &le; n, 1 &le; t<sub>i</sub> &le; 500, 0 &le; s<sub>i</sub> &le; p, 1 &le; u<sub>ij</sub> &le; p) separated by single spaces, that denote respectively: the towns that the road connects, the time needed to walk down the road (same in both directions), the number of different kinds of monsters that may appear on that road, and finally the kinds of monsters themselves (in increasing order). No two roads connect the same pair of towns.</p>

### 출력

<p>Your programme is to print out one integer to the standard output - the minimum summary time required to reach Byteburg. Should reaching Byteburg be impossible, the number should be -1.</p>

<p>&nbsp;</p>

### 힌트

<p>The discs in the figures represent towns; the numbers inside are the towns&#39; numbers. The edges represent the roads; the numbers above them - the time needed to walk down the road. The numbers next to the discs (in italics) denote the kinds of monsters which the swords made the town&#39;s blacksmith(s) work against. The numbers below the edges (in italics) denote the kinds of monsters one can come across on the road.</p>

<p>Byteasar the hexer should first go to town no. 2, acquire a sword against the monster of kind 2, go back to town 1, then proceed to town 4 and from there finally go to Byteburg.</p>

<p>In the second example Byteasar is unable to acquire a sword against the monster of kind 1, which makes reaching Byteburg impossible.</p>