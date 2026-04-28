# [Gold II] Tournament ranking - 6723

[문제 링크](https://www.acmicpc.net/problem/6723)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

자료 구조, 그래프 이론, 우선순위 큐, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>You are given a number of teams and the results of games played by pairs of these teams in a tournament. The teams could be football teams, bowling teams, basketball teams, depending on your favorite sport. Each team will be identified by an upper case letter. The maximum number of teams is 26.</p>

<p>Your mission is to rank the teams if possible. For this you are given results from games played between the teams, i.e., you should produce a linearly ordered list starting with the best team, and progressing down to the worst one. We assume that if team A beats team B then team A is always better than team B and if team B in its turn beats team C then team A is also better than team C. Thus given the above results the teams would be ranked A B C. Note that it might not always be possible to produce a legal ranking: if team C again beats team A then it is not possible to rank the teams.</p>

<p>Your job is to produce a legal ranking or to determine that no such ranking exists. If you cannot determine the order of two teams then the lexicographically largest should be listed first, i.e. A should be listed before B, and the lexicographically largest ordering should be prefferred, i.e. B C A D should be prefferred before C A B D.</p>

### 입력

<p>First there will be a line containing the number of tournaments you are asked to rank. For each tournament there will first be a line containing the number of teams and the number of games played. You may assume that the teams are named consecutively starting from A. For each game there will be a line containing two upper case letters, separated by one blank space. The two letters on a line indicate the winner and loser (in that order) of a game played by the two teams.</p>

### 출력

<p>The output will list all teams on one line, with each team appearing only once in its correct position. There should be one blank space between adjacent letters representing the teams. If no ranking is possible your program should print No legal ranking possible.</p>

<p>&nbsp;</p>