# [Platinum V] General Bytor - 8521

[문제 링크](https://www.acmicpc.net/problem/8521)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

자료 구조, 중간에서 만나기, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Qbits are coming!</p>

<p>General Bytor, the commander-in-chief of Fort Bytemore, suddenly woke up, quickly went to the headquarters and checked the operational plan. Unfortunately, the situation didn&#39;t look well. At every important strategic position of the fort there was one army unit; however, some units were located at incorrect positions. Even worse, it turned out that there would be essential difficulties with giving orders. The reason for that was that Qbits&#39; secret agents used quantum teleportation techniques to kidnap all cryptographers from the fort! Without them, Bytor wouldn&#39;t be able to give all orders that he would like to give but only just a few of them that he remebered from recent training. Each of them refered to a &#39;line&#39; leading through a sequence of important strategic positions; if such an order is given, then each army unit in the line moves forward to the next position along the line. Every line is really a cycle, so after the movement is performed there is also a single army unit in every strategic position.</p>

<p>Bytor ordered his spies to find the locations of the Qbits&#39; army units. When the spies come back, there will be only about half an hour to the start of the battle. During this period of time, Bytor will need to give all necessary orders to get all his army units to proper positions. This amount of time will be enough for a moment of thought and performing at most 10 orders. Bytor called for his computer scientists and asked them to write a program that, given the initial and requested army arrangements, checks whether there exists a sequence of orders that is short enough and leads from the initial to the final arrangement.</p>

### 입력

<p>The first line of the input contains two integers n and m (2 &le; n &le; 75, 1 &le; m &le; 10), separated by a single space. n represents the number of strategic positions and m is equal to the number of lines.</p>

<p>The second line contains a single m-letter word composed only of small English letters. The i-th letter describes the type of unit located in the i-th strategic point due to the old Bytean military code. There can be several units having the same code in the fort.</p>

<p>The third line also contains an n-letter word. It describes the unit types that should be located in strategic positions 1, 2, &hellip;, n after the movement. This word will be different from the previous one.</p>

<p>Each of the following m lines contains a description of a line having the form: c, a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>c</sub> (the numbers separated by single spaces). The first number (c) denotes the number of strategic positions in the line. The number a<sub>1</sub> (1 &le; a<sub>i</sub> &le; n for 1 &le; i &le; c) describes the number of the i-th strategic point in the line. All numbers &nbsp;in a single line will be different. Performing such an order causes the following movement of army units: a<sub>1</sub> -&gt; a<sub>2</sub>, a<sub>2</sub> -&gt; a<sub>3</sub>, ..., a<sub>c-1</sub> -&gt; a<sub>c</sub>, a<sub>c</sub> -&gt; a<sub>1</sub>.</p>

### 출력

<p>If it is impossible to obtain the final arrangement within 10 orders, your program should output one word NIE (Polish for no). In the opposite case your program should output at most 10 space-separated numbers of lines (between 1 and m), that Bytor should move in his respective orders. If there are multiple correct solutions, your program should output the one that requires the least number of orders. If there are still multiple solutions, your program should output the lexicographically first (if t is the first position where two solutions of equal length differ, then the first of them is lexicographically smaller than the second one if the t-th order in the first solution has smaller line number than the t-th order in the second solution).</p>

<p>&nbsp;</p>