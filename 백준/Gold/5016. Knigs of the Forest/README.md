# [Gold V] Knigs of the Forest - 5016

[문제 링크](https://www.acmicpc.net/problem/5016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 36, 맞힌 사람: 30, 정답 비율: 35.294%

### 분류

구현, 자료 구조, 정렬, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>All moose are knigs of the forest, but your latest moose-friend, Karl-&Auml;lgtav, is more interesting than most. In part because of his fondness of fermented blueberries, and in part because of the tribe he lives in. Each year his tribe holds a tournament to determine that year&rsquo;s alphamoose. The winner gets to mate with all the moose-chicks, and then permanently leaves the tribe. The pool of contenders stays constant over the years, apart from the old alpha-moose being replaced by a newcomer in each tournament.</p>

<p>Karl-&Auml;lgtav has recently begun to wonder when it will be his turn to win all the chicks, and has asked you to help him determine this. He has supplied a list of the strength of each of the other male moose in his tribe that will compete during the next n&minus;1 years, along with their time of entry into the tournament. Assuming that the winner each year is the moose with greatest strength, determine when Karl-Algtav &uml; becomes the alpha-moose.</p>

### 입력

<p>The first line of input contains two space separated integers k (1 &le; k &le; 10<sup>5</sup>) and n (1 &le; n &le; 10<sup>5</sup>), denoting the size of the tournament pool and the number of years for which you have been supplied sufficient information.</p>

<p>Next is a single line describing Karl-&Auml;lgtav, containing the two integers&nbsp;y (2011 &le; y &le; 2011 + n &minus; 1) and p (0 &le; p &le; 2<sup>31</sup> &minus; 1). These are his year of entry into the tournament and his strength, respectively.</p>

<p>Then follow n + k &minus; 2 lines describing each of the other moose, in the same format as for Karl-&Auml;lgtav.</p>

<p>Note that exactly k of the moose will have 2011 as their year of entry, and that the remaining n &minus; 1 moose will have unique years of entry.</p>

<p>You may assume that the strength of each moose is unique.</p>

### 출력

<p>The year Karl-&Auml;lgtav wins the tournament, or unknown if the given data is insufficient for determining this.</p>