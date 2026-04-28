# [Gold I] Linear world - 3772

[문제 링크](https://www.acmicpc.net/problem/3772)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

애드 혹

### 문제 설명

<p>The Disc, being flat, has no real horizon. Any adventurous sailors who get funny ideas from staring at eggs and oranges for too long and set out for the antipodes soon learned that the reason why distant ships sometimes looked as though they were disappearing over the edge of the world was that they were disappearing over the edge of the world. (Terry Pratchett - Colour of Magic)</p>

<p>Not so long time ago people used to believe that they live on 2-D world and if they will travel long enough in one direction, they will fall down over the edge. Even when it was proved that the Earth is rounded some of them were still afraid to travel to the southern hemisphere.</p>

<p>Try to imagine one 1-D (linear) world. On such world there are only two possible directions (left and right). All inhabitants of such world were created exactly at the same time and suddenly all of them start to move (all with same constant velocity) in one or the other direction. If two inhabitants encounter each other, they politely exchange greetings and then they turn around and start to move in an opposite direction. When an inhabitant reaches the end of the world he falls away and disappears.</p>

<p>Your task is to determine, for a given scenario of creation, which inhabitant and when (counting from the moment of creation) will be the last one to fall away. You can assume that the time required to exchange greetings and turn around is 0.</p>

### 입력

<p>The input file consists of multiple descriptions (data sets) of the creation moment. File structure is as follows:</p>

<pre>
N
L V
DIR POS NAME
...</pre>

<p>The first line defines the number of inhabitants (N&lt;32000). Data set starting with value N=0 represents the end of the input file. The second line contains length of the world L(float) and velocity of inhabitants V(float). Both values are always positive. In next N lines the data about inhabitants are given in an order of increasing POS (positive direction):</p>

<ul>
	<li>DIR &ndash; initial direction (&lsquo;p&rsquo; or &lsquo;P&rsquo; for positive and &lsquo;n&rsquo; or &lsquo;N&rsquo; for negative)</li>
	<li>POS &ndash; position in the time of creation (0&lt;=POS&lt;=L)</li>
	<li>NAME &ndash; name of inhabitant (string up to 250 characters)</li>
</ul>

<p>Input values within one line are separated with at least one space and there will be no empty lines in input. You may assume that input is always correct and that each data set has only one unique solution.</p>

### 출력

<p>The output consists of one line per each input data set. The first value should be the time when the last inhabitant will fall of the linear world counting from the moment of creation. Value should be printed truncated to two decimal places in a field 13 characters wide. The second value should be the name of the inhabitant. Values should be separated with single space character.</p>