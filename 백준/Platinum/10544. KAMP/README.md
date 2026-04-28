# [Platinum I] KAMP - 10544

[문제 링크](https://www.acmicpc.net/problem/10544)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 33, 맞힌 사람: 29, 정답 비율: 72.500%

### 분류

다이나믹 프로그래밍, 그래프 이론, 트리, 트리에서의 다이나믹 프로그래밍, 트리의 지름

### 문제 설명

<p>In a certain flooded village, a secret superhuman humanitarian camp is being opened as we speak. The village consists of N houses marked with integers from 1 to N. The house are connected to each other with N-1 roads so that there is a unique way between each two houses. For each road, we know the time it takes for a truck to pass it. The camp should be put up in some house&#39;s garden, but the camp manager still hasn&#39;t decided which house it is going to be.</p>

<p>Mirko has been appointed as the driver. His job is to drive around teams of volunteers in his super truck from the camp to the house where that certain team is going to work. His van is super because all teams at once can drive in it! In total, there are K teams and all the teams are&nbsp;going to a different house.</p>

<p>All K teams board into Mirko&#39;s truck initially, and then he drives them to house in the sequence he determined for himself. After he drives around all teams, Mirko stays and helps the last team (he doesn&#39;t go back to camp).</p>

<p>In order for the camp manager to determine where to put up the camp, he wants to know, for each house, the minimal time it takes for Mirko to drive around all teams if that house is the headquarters. Write a programme that will determine the number Mirko&#39;s boss wants to see!</p>

### 입력

<p>The first line of input contains the integers N (1 &le; N &le; 500 000), and K (1 &le; K &le; N).</p>

<p>Each of the following N-1 lines contains integers Ai, Bi, Ci (1 &le; Ai, Bi &le; N, 1 &le; Ci &le; 1 000 000), where Ci is the time it takes to pass a two-way road between houses Ai and Bi.</p>

<p>Each of the following K lines contains the integers that mark the house where the ith team is going, respectively.</p>

### 출력

<p>Output N lines. The ith line of output must contain the minimal times it takes Mirko to drive around all the teams if the camp headquarters is located in the ith house.</p>

### 힌트

<p>Clarification of the first sample test: If Mirko starts off at house 1, he can drop off volunteers at houses 1-2-4-2-5, respectively. If he starts off at house 2, the possible sequence is 2-5-2-4.</p>

<p>&nbsp;</p>