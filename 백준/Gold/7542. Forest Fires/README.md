# [Gold III] Forest Fires - 7542

[문제 링크](https://www.acmicpc.net/problem/7542)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

그래프 이론, 기하학, 최단 경로, 데이크스트라, 격자 그래프, 피타고라스 정리

### 문제 설명

<p>One big problem with a drought is that it drastically increases the risk of forest fires. There are plenty of those in California as is: we have hot and dry summers, and come Fall, most forests and other plants have turned into nice tinder that can burn very fast when lit by lightning or &mdash; more often &mdash; careless campers or arsonists. When it&rsquo;s particularly dry (as right now), this risk is much exacerbated, and we should anticipate a very dangerous Fall.</p>

<p>Forest fires can be somewhat contained if there are large gaps between the wooded areas: while sparks can fly and eventually set ablaze more distant areas of growth, this is much rarer than fire just traveling a short distance, and hence, fire takes much longer to cross large swaths without growth. In this problem, you are to simulate the spread of fire, and calculate how long it takes for an entire area to be burning.</p>

<p>The area will be represented as a 2-D map of 3 types of characters. The character &lsquo;P&rsquo; will indicate a square at which there is some (dried) plant growth. &lsquo;.&rsquo; will indicate a square at which there is no plant. &lsquo;F&rsquo; indicates a place where the fire starts (of which there will be one or more on the map). We assume that to travel a straight-line (Euclidean) distance of d will take a spark d<sup>2</sup> units of time. Notice that this makes it faster for fire to take d steps of 1 unit of distance each &mdash; that corresponds to our intuition that fire races through forests that have very dense growth, but takes longer if it has to rely on sparks &ldquo;lucking out&rdquo; to fly a long distance.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains two integers h, w, the height and width of the map. These satisfy that 1 &le; h, w &le; 20.</p>

<p>This is followed by h lines, each consisting of exactly w characters. Each character will be either the letter &lsquo;P&rsquo;, the letter &lsquo;F&rsquo;, or a &lsquo;.&rsquo;.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, output the earliest time at which all squares not marked &lsquo;.&rsquo; are burning.</p>

<p>Each data set should be followed by a blank line.</p>