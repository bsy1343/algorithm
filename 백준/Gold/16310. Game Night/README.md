# [Gold II] Game Night - 16310

[문제 링크](https://www.acmicpc.net/problem/16310)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 135, 정답: 93, 맞힌 사람: 90, 정답 비율: 76.923%

### 분류

브루트포스 알고리즘, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>It is finally Bobby&rsquo;s birthday, and all of his Acquaintances, Buddies and Colleagues have gathered for a board game night. They are going to play a board game which is played in up to three big teams. Bobby decided to split his guests into how well he knows them: the Acquaintances on team A, the Buddies on team B, and the Colleagues on team C.</p>

<p>While Bobby was busy explaining the rules to everyone, all his guests already took seats around his large, circular living room table. However, for the game it is crucial that all people sitting on a team are sitting next to each other. Otherwise, members of other teams could easily eavesdrop on their planning, ruining the game. So some people may need to change seats to avoid this from happening.</p>

<p>Bobby wants to start playing the game as soon as possible, so he wants people to switch seats as efficiently as possible. Given the current arrangement around the circular table, can you figure out the minimal number of people that must switch seats so that the teams are lined up correctly?</p>

### 입력

<ul>
	<li>The first line of the input contains the integer n, where 1 &le; n &le; 10<sup>5</sup> is the number of players (as well as seats).</li>
	<li>The second line contains a string of length n, consisting only of the characters in ABC. This indicates the teams of the people sitting around the table in order.</li>
</ul>

### 출력

<p>Print a single integer: the minimal number of people you have to ask to move seats to make sure the teams sit together.</p>