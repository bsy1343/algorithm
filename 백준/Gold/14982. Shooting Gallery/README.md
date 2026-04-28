# [Gold III] Shooting Gallery - 14982

[문제 링크](https://www.acmicpc.net/problem/14982)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 138, 정답: 27, 맞힌 사람: 10, 정답 비율: 15.873%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The popular shooting gallery in the park is an attraction which is simple and intricate at the same time. It consists of a row of ducks sitting on one horizontal perch. The ducks are not necessarily all of the same kind, some of them may belong to different, albeit easily distinguishable, species.</p>

<p>The shooting proceeds in rounds. In each round, the shooter fires two shots. Each shot can hit at most one duck. A round is considered to be a good round if the shooter hits two ducks of the same species. A round is considered to be a bad round if the shooter either hits less than two ducks or if he/she hits two ducks of different species.</p>

<p>The shooter can ask for a round if and only if both following conditions are met:</p>

<ul>
	<li>There are at least two ducks of the same species on the perch.</li>
	<li>The shooter is either asking for his/her first round in the shooting (the perch is full of ducks) or his/her previous round in the current shooting was a good round.</li>
</ul>

<p>When the shooter cannot ask for another round, the shooting is terminated and the success of the shooting is evaluated and, maybe, rewarded.</p>

<p>To increase the much beloved acoustic effect of shooting and to complicate matters a bit further an additional and unique feature is added to the shooting process. Each time when a shooter fires a good round, the system immediately reduces the number of ducks on the perch. All ducks which were not sitting between the two ducks shot in the round are shot down by an automatic gun. Sometimes, this feature drastically reduces the number of ducks on the perch and makes it impossible for the shooter to ask for more rounds, and thus effectively terminates the shooting.</p>

<p>The goal of the shooting is to fire maximum possible number of subsequent good rounds. Obviously, a shooter with an excellent aim is also in need of a good strategy which would allow him/her to prolong the shooting as much as possible by picking suitable pairs of ducks to be shot down in each good round.</p>

### 입력

<p>There are more test cases. Each test case consists of two lines. The first line contains one integer N (1 &le; N &le; 5000) representing the number of ducks on the perch. The second line contains a sequence of N positive integers D<sub>i</sub> (1 &le; D<sub>i</sub> &le; 10<sup>4</sup>), separated by spaces. Each value in the sequence represents the species of one duck on the perch in order from left to right. Same species are marked by the same values, different species are marked by different values.</p>

### 출력

<p>For each test case, print a single line with one integer representing the maximum number of subsequent good rounds which can be fired at the ducks on the perch.</p>