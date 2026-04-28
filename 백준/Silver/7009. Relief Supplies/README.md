# [Silver IV] Relief Supplies - 7009

[문제 링크](https://www.acmicpc.net/problem/7009)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 17, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Due to the snowstorm, you and your family are cold, hungry, and miserable. To make things worse, you have no electricity and can&rsquo;t drive anywhere. Fortunately, you found a nearby relief shelter which distributes supplies like food and blankets a few times each day. You&rsquo;ve noticed that the supplies get distributed in a very particular way, and you&rsquo;d like to take advantage of this in order to obtain the items that your family needs most.</p>

<p>Specifically, a line of N people forms to receive supplies. The shelter has T different types of supplies and exactly B boxes of each type. The first person in line receives a box of the first type, the second person receives a box of the second type, and so on. When the distributors give out a box of the last type, they start again with the first type. If they reach the end of the line, they begin again with the first person in line, being careful to keep track of which type they had just given out. This process continues until there are no more boxes.</p>

<p>Knowing the single type of supply S that your family needs most, you want to figure out where in line you should stand in order to obtain the second-most boxes of that type. After all, it would look suspicious if you were to always receive the most. Although if there are multiple positions in line which receive the most of that type, then you&rsquo;re okay with receiving the most, and of those positions you&rsquo;d like the one closest to the end of the line since it&rsquo;s easier to get. Same for the case of multiple positions receiving second-most.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each a single line containing the integers N, T , B, and S. Each integer is at least 1 and at most 100. In addition, N &ge; 2 and S &le; T .</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the position in line at which you should stand. Each data set should be followed by a blank line.</p>