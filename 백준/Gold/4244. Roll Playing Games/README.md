# [Gold II] Roll Playing Games - 4244

[문제 링크](https://www.acmicpc.net/problem/4244)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Phil Kropotnik is a game maker, and one common problem he runs into is determining the set of dice to use in a game. In many current games, non-traditional dice are often required, that is, dice with more or fewer sides than the traditional 6-sided cube. Typically, Phil will pick random values for all but the last die, then try to determine specific values to put on the last die so that certain sums can be rolled with certain probabilities (actually, instead of dealing with probabilities, Phil just deals with the total number of different ways a given sum can be obtained by rolling all the dice). Currently he makes this determination by hand, but needless to say he would love to see this process automated. That is your task.</p>

<p>For example, suppose Phil starts with a 4-sided die with face values 1, 10, 15, and 20 and he wishes to determine how to label a 5-sided die so that there are a) 3 ways to obtain a sum of 2, b) 1 way to obtain a sum of 3, c) 3 ways to obtain 11, d) 4 ways to obtain 16, and e)1 way to obtain 26. To get these results he should label the faces of his 5-sided die with the values 1, 1, 1, 2, and 6. (For instance, the sum 16 may be obtained as 10 + 6 or as 15 + 1, with three different &ldquo;1&rdquo; faces to choose from on the second die, for a total of 4 different ways.)</p>

### 입력

<p>Input will consist of multiple input sets. Each input set will start with a single line containing an integer n indicating the number of dice that are already specified. Each of the next n lines describes one of these dice. Each of these lines will start with an integer f (indicating the number of faces on the die) followed by f integers indicating the value of each face. The last line of each problem instance will have the form</p>

<pre>
r m v<sub>1</sub> c<sub>1</sub> v<sub>2</sub> c<sub>2</sub> v<sub>3</sub> c<sub>3</sub> &middot;&middot;&middot; v<sub>m</sub> c<sub>m</sub></pre>

<p>where r is the number of faces required on the unspecified die, m is the number of sums of interest, v<sub>1</sub>,...,v<sub>m</sub> are these sums, and c<sub>1</sub>,...,c<sub>m</sub> are the counts of the desired number of different ways in which to achieve each of the respective sums.</p>

<p>Input values will satisfy the following constraints: 1 &le; n &le; 20, 3 &le; f &le; 20, 1 &le; m &le; 10, and 4 &le; r &le; 6. Values on the faces of all dice, both the specified ones and the unknown die, will be integers in the range 1 ... 50, and values for the v<sub>i</sub>&rsquo;s and c<sub>i</sub>&rsquo;s are all non-negative and are strictly less than the maximum value of a 32-bit signed integer.</p>

<p>The last input set is followed by a line containing a single 0; it should not be processed.</p>

### 출력

<p>For each input set, output a single line containing either the phrase &ldquo;Final die face values are&rdquo; followed by the r face values in non-descending order, or the phrase &ldquo;Impossible&rdquo; if no die can be found meeting the specifications of the problem. If there are multiple dice which will solve the problem, choose the one whose lowest face value is the smallest; if there is still a tie, choose the one whose second-lowest face value is smallest, etc.</p>