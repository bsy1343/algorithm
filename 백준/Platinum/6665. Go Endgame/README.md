# [Platinum IV] Go Endgame - 6665

[문제 링크](https://www.acmicpc.net/problem/6665)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

구현, 그리디 알고리즘, 시뮬레이션, 게임 이론

### 문제 설명

<p>Go is an oriental board game. The goal in this game is to surround as much territory as possible by stones of your color. This game is very difficult to play for computers -- the best available programs are beaten easily by a human with just a few months of practice. Some parts of the game however can be managed easily under some assumptions. This task is about the endgame stage of the go match, when boarders of all the territories are almost completely finished and the players try to squeeze last few points. Even this stage of the game is very difficult, thus we only concentrate on much simplified model. As usual, the game is played by Alice and Bob, and the alternate on the move.</p>

<p>We assume that Alice has&nbsp;<em>a</em>&nbsp;points of territory and Bob has&nbsp;<em>b</em>&nbsp;points. There are&nbsp;<em>n</em>&nbsp;separated regions such that moves in each of the regions do not affect the moves in other regions. Suppose it is Alice&#39;s turn. The endgame proceeds as follows: Alice chooses a region and plays there. Bob responds to this move in the same region, then Alice responds to the Bob&#39;s move, and so on, until a settled state is reached. The player who is on turn then chooses another region and plays there, and the game proceeds in the same way until all regions are settled.</p>

<p>The player who starts to play in a region has an advantage and usually gains more points there than the other player. To model this, for the&nbsp;<em>i</em>-th region we know that if Alice starts playing there, she gains&nbsp;<em>a</em><sub>i</sub>&nbsp;points and Bob gains nothing, while if Bob starts playing there, he gains&nbsp;<em>b</em><sub>i</sub>&nbsp;points and Alice gains nothing.</p>

<p>Additionally, playing in this region may be&nbsp;<em>sente</em>&nbsp;for Alice or Bob. If region is sente for the player who starts playing there, he will be on turn after the region is settled, and thus he is the one to choose the next region to play in. If the region is not sente for the player who starts playing there, the other player is on turn when the region is settled. The region may be sente for both players, for only one of them, or for nobody.</p>

<p>Your task is, given the description of the regions, to determine the final score of the game, assuming that both players use the optimal strategy. Each player tries to have the score greater than the score of the other player by as much as possible (or smaller by as little as possible), and among the results with the same difference of scores, they prefer the one where they have the maximal score.</p>

### 입력

<p>The input consists of several instances, separated by single empty lines.</p>

<p>The first line of each instance consists of three integers&nbsp;<em>a</em>,&nbsp;<em>b</em>&nbsp;(0 &le;&nbsp;<em>a</em>,&nbsp;<em>b</em>&nbsp;and&nbsp;<em>a</em>&nbsp;+&nbsp;<em>b</em>&nbsp;&le;&nbsp;361) and&nbsp;<em>n</em>(0 &le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;361) separated by single spaces -- the current numbers of points of Alice and Bob, and the number of unresolved regions. Each of the following&nbsp;<em>n</em>&nbsp;lines describes a single region. The line describing the&nbsp;<em>i</em>-th region consists of two integers&nbsp;<em>a</em><sub>i</sub>&nbsp;and&nbsp;<em>b</em><sub>i</sub>&nbsp;(0 &le;&nbsp;<em>a</em><sub>i</sub>,&nbsp;<em>b</em><sub>i</sub>&nbsp;and 1 &le;&nbsp;<em>a</em><sub>i</sub>&nbsp;+&nbsp;<em>b</em><sub>i</sub>&nbsp;&le;&nbsp;361), and two characters&nbsp;<em>s</em><sub>i</sub>&nbsp;and&nbsp;<em>t</em><sub>i</sub>, separated by single spaces. The integers&nbsp;<em>a</em><sub>i</sub>&nbsp;and&nbsp;<em>b</em><sub>i</sub>are the numbers of points gained by Alice and Bob by starting to play in each region. The character&nbsp;<em>s</em><sub>i</sub>&nbsp;is &quot;S&quot; if the region is sente for Alice, and &quot;G&quot; otherwise. Similarly,&nbsp;<em>t</em><sub>i</sub>&nbsp;is &quot;S&quot; or &quot;G&quot;, depending on whether the region is sente for Bob or not.</p>

### 출력

<p>The output for each instance consists of a single line containing two integers&nbsp;<em>A</em>&nbsp;and&nbsp;<em>B</em>separated by a single space. These integers are the final number of points of Alice and Bob, assuming that they both play out the rest of the game using the optimal strategy, and Alice is on turn in the beginning. For all input instances,&nbsp;<em>A</em>&nbsp;+&nbsp;<em>B</em>&nbsp;&le;&nbsp;361.</p>