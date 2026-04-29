# [Gold II] Bingo for the Win! - 32421

[문제 링크](https://www.acmicpc.net/problem/32421)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 21, 맞힌 사람: 21, 정답 비율: 58.333%

### 분류

수학, 확률론

### 문제 설명

<p>Bingo is a game of chance for multiple players. Each player receives a sheet with some numbers, and a game master then calls out these numbers in a random order. Players cross off the numbers that they have heard, and the first player to cross off all their numbers wins the game. This basic version of the game has a reputation for being, well, a bit sedate. No particular action is required of the players except for not falling asleep.</p>

<p>In this problem we will analyze a more dynamic version of Bingo that requires quick thinking. In our version, called Speed Bingo, the game master also calls out the numbers from the sheets in a random order. However, whenever a number is called out, only the first player to signal that he or she has the number is allowed to cross it off their sheet. If a player has the same number multiple times, only one copy may be crossed off at a time. When multiple players have the same number(s) on their sheets, whoever has the fastest reaction time has an advantage in winning Speed Bingo. But how big an advantage? That’s what we need your help to find out.</p>

<p>Formally, there are $n$ players, each receiving a (possibly) different sheet of $k$ (not necessarily distinct) numbers. Player $1$ is faster to react than player $2$, who in turn is faster than player $3$, and so on, with player $n$ being the slowest. Consider the following example, corresponding to the first sample input, where three players receive four numbers each:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32421.%E2%80%85Bingo%E2%80%85for%E2%80%85the%E2%80%85Win!/7a43cf6a.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32421-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 233px; height: 75px;"></p>

<p>When number “1” is called for the first time, player $1$—being faster—will get to cross it off their sheet. The second time “1” is called, player $2$ will get to cross it off. So on average, we would expect player $1$ to do better than players $2$ and $3$, since both of them will need some numbers that player $1$ will get to first. However, since players $2$ and $3$ have no numbers in common, their performances will be independent of each other, even though player $2$ is faster than player $3$.</p>

<p>Suppose the game is played until all players have crossed off all of their numbers, that is, until all $n \cdot k$ numbers on all of the sheets (including appropriate repetitions) have been read. Assuming the order of the numbers is uniformly random, how likely is it for each player to finish last?</p>

### 입력

<p>The input describes a single game of Speed Bingo. The first line contains two integers $n$ and $k$, the number of players and number of numbers on each sheet ($1 ≤ n ≤ 100$, $1 ≤ k ≤ 1\, 000$). This is followed by $n$ lines containing $k$ integers each, where the $i$th line gives the numbers on the sheet for the $i$th player. All those numbers are between $1$ and $10^9$, inclusive.</p>

### 출력

<p>Output $n$ lines, one for each player. The $i$th line should contain the probability that player $i$ finishes last. All values must be accurate to an absolute error of at most $10^{-6}$.</p>