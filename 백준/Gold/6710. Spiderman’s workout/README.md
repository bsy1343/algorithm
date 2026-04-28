# [Gold IV] Spiderman’s workout - 6710

[문제 링크](https://www.acmicpc.net/problem/6710)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 22, 맞힌 사람: 16, 정답 비율: 64.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Staying fit is important for every super hero, and Spiderman is no exception. Every day he undertakes a climbing exercise in which he climbs a certain distance, rests for a minute, then climbs again, rests again, and so on. The exercise is described by a sequence of distances d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>m</sub> telling how many meters he is to climb before the first first break, before the second break, and so on. From an exercise perspective it does not really matter if he climbs up or down at the i:th climbing stage, but it is practical to sometimes climb up and sometimes climb down so that he both starts and finishes at street level. Obviously, he can never be below street level. Also, he would like to use as low a building as possible (he does not like to admit it, but he is actually afraid of heights). The building must be at least 2 meters higher than the highest point his feet reach during the workout.</p>

<p>He wants your help in determining when he should go up and when he should go down. The answer must be legal: it must start and end at street level (0 meters above ground) and it may never go below street level. Among the legal solutions he wants one that minimizes the required building height. When looking for a solution, you may not reorder the distances.</p>

<p>If the distances are 20 20 20 20 he can either climb up, up, down, down or up, down, up, down. Both are legal, but the second one is better (in fact optimal) because it only requires a building of height 22, whereas the first one requires a building of height 42. If the distances are 3 2 5 3 1 2, an optimal legal solution is to go up, up, down, up, down, down. Note that for some distance sequences there is no legal solution at all (e.g., for 3 4 2 1 6 4 5).</p>

### 입력

<p>The first line of the input contains an integer N giving the number of test scenarios. The following 2N lines specify the test scenarios, two lines per scenario: the first line gives a positive integer M &le; 40 which is the number of distances, and the following line contains the M positive integer distances. For any scenario, the total distance climbed (the sum of the distances in that scenario) is at most 1000.</p>

### 출력

<p>For each input scenario a single line should be output. This line should either be the string &ldquo;IMPOSSIBLE&rdquo; if no legal solution exists, or it should be a string of length M containing only the characters &ldquo;U&rdquo; and &ldquo;D&rdquo;, where the i:th character indicates if Spiderman should climb up or down at the i:th stage. If there are several different legal and optimal solutions, output one of them (it does not matter which one as long as it is optimal).</p>

<p> </p>