# [Gold IV] Bartering - 5128

[문제 링크](https://www.acmicpc.net/problem/5128)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 11, 맞힌 사람: 9, 정답 비율: 34.615%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Recently, Tim has discovered a time period in the future in which Medieval artifacts, particularly those associated with the various armies of the time period, are the most valuable. So Tim plans to travel to the Middle Ages, find some chainmail, lances, etc., and then make a fortune off of them. The only problem is that he&rsquo;s not likely to have an acceptable currency, so in order to acquire the things he needs, he must barter for them. In the interest of time, Tim wants to determine how many trades he will need to make before he actually executes those trades. That way, he can spend his time acquiring other items which require less trades.</p>

<p>Note: The time-machine can only hold at most 5 items. This means that Tim will not make a trade if he will even temporarily have to carry more than 5 items.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains four integers 1 &le; M &le; 20, the maximum number of trades Tim is willing to make, 1 &le; H &le; 5, the number of items Tim has to start with, 1 &le; W &le; 5, the number of items Tim wants, 1 &le; T &le; 20, the number of different trades.</p>

<p>This is followed by one line containing H words, the names of the items Tim has. Then one line containing W words, the names of the items Tim wants.</p>

<p>This is followed by T pairs of lines, each pair specifying a possible trade. The first line of a pair contains a number 1 &le; g<sub>t</sub> &le; 5, the number of items Tim will give away in the trade, followed by the names of the g<sub>t</sub> items. The second line contains a number 1 &le; a<sub>t</sub> &le; 5, the number of items Tim will acquire in the trade, followed by the names of the at items.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. If it is possible to acquire all of the wanted items by only making M trades or less, output the fewest number of trades that Tim will have to make. Otherwise, output &ldquo;Impossible.&rdquo;. Each data set should be followed by a blank line.</p>