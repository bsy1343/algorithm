# [Platinum II] Find Fame in Disc Arena - 5234

[문제 링크](https://www.acmicpc.net/problem/5234)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>In Grid World, the Disc Arena is a location where programs play gladiator disc games against other programs. There are k games in the disc arena. By winning each game, you gain fame and become popular in the Grid World. Of course, if you lose a game, you are deleted. The amount of fame you gain by winning the i<sup>th</sup> game is f<sub>i</sub> (which may not necessary be positive). Furthermore, to be able to play in the i<sup>th</sup> game, you are required to have first played and won a specified subset S<sub>i</sub> of the games (known in advance) &ndash; the games in set S<sub>i</sub> are also called prerequisites. There are no cycles in the prerequisites structure, e.g., it can not happen that a game a is required for game b, b is required for game c, and c is required for playing game a. Note that, the only reason you would play a game with negative fame is because it is a prerequisite to a game with higher positive fame.</p>

<p>A set C of games is called feasible if for any game i &isin; C, all the prerequisites S<sub>i</sub> are also included in C, i.e., if i &isin; C, then S<sub>i</sub> &sub; C. The fame associated with C is simply the sum of the fames of all games in C.</p>

<p>The goal is of course to become as famous as possible !! Given the fames and the prerequisites for a set of games, your goal is to find a feasible set of games with maximum fame.</p>

<p>For instance, consider the following sets of disc arena games. The prerequisites for each game are indicated using arrows between games. For the first set of games, game 1 has games 2 and 3 as prerequisites, and game 3 has game 2 as a prerequisite. The maximum possible fame is 2, achieved by selecting the set of games {1,2,3}. Game 3 must be selected even though it has a negative fame value, because it is a prerequisite for game 1. For the second set of games, the maximum fame is 3, achieved by selecting the set of games {1,2,4,6}. For the third set of games, the maximum fame is 0, achieved by selecting no games.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5234.%E2%80%85Find%E2%80%85Fame%E2%80%85in%E2%80%85Disc%E2%80%85Arena/d1fe796a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5234.%E2%80%85Find%E2%80%85Fame%E2%80%85in%E2%80%85Disc%E2%80%85Arena/d1fe796a.png" data-original-src="https://upload.acmicpc.net/9a7a5109-ebd4-462e-b64f-967a0ec9b3ae/-/crop/998x745/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 499px; height: 373px;" /></p>

### 입력

<p>The first line of the input is the number of test cases (&le; 100).</p>

<p>The first line in each test case lists k, the number of games (k &le; 1000). The games are labeled 1 to k. The next k lines contain the information about the games. The (i + 1)<sup>th</sup> line is in the form &ldquo;f<sub>i</sub>d<sub>i</sub>u<sub>1</sub>u<sub>2</sub>&middot;&middot;&middot;u<sub>d<sub>i</sub></sub>&rdquo;. The first number is the fame you gain by playing game i, the second number is S<sub>i</sub> &ndash; the number of prerequisites, and the remaining numbers are members of S<sub>i</sub>.</p>

<p>Assume that in each scenario, the total number of prerequisites of all games, i.e., &Sigma;<sub>i</sub>|S<sub>i</sub>|, is &le; 6000.</p>

### 출력

<p>For each scenario, print the maximum fame you can gain by playing a feasible set of games as shown below in the example.</p>