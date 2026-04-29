# [Platinum I] Brazilian FootXOR - 34733

[문제 링크](https://www.acmicpc.net/problem/34733)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 21, 맞힌 사람: 18, 정답 비율: 100.000%

### 분류

가우스 소거법, 배타적 논리합 기저 (gf(2)), 선형대수학, 수학, 역추적

### 문제 설명

<p>Alex is coaching the famous Brazilian FootXOR Club. For today’s training, they want to organize a match between two teams selected from the $N$ club members. To ensure a fair match, the two teams must be balanced.</p>

<p>Each club member has a set of abilities represented as a $K$-digit binary string. Each digit corresponds to a characteristic that the player may or may not have. Surprisingly, it is not the quantity of players having each characteristic that matters when deciding whether two teams are balanced: the important thing is the parity of that quantity.</p>

<p>Two teams are considered balanced if they have the same number of players and the bitwise XOR of the ability strings of all players in the first team is equal to the bitwise XOR of the ability strings of all players in the second team. Of course, each club member can only be assigned to at most one team and, for a match to happen, teams cannot be empty.</p>

<p>Alex is really busy right now. As their coaching assistant, you must determine how to assign players to the two teams. If it is impossible to fulfill the coach’s conditions, you must inform the coach accordingly.</p>

### 입력

<p>The first line contains two integers $N$ and $K$ ($1 ≤ N, K ≤ 1500$), indicating respectively the number of club members and the number of binary digits used to represent their abilities. Each club member is identified by a distinct integer from $1$ to $N$.</p>

<p>The $i$-th of the next $N$ lines contains a $K$-digit binary string $A_i$, representing the abilities of club member $i$. Note that $A_i$ has a fixed length and so it may contain leading zeros.</p>

### 출력

<p>Output a single line with a string of length $N$ if it is possible to fulfill the coach’s conditions. In this case, the $i$-th character of the string must be a digit “<code>1</code>”, “<code>2</code>” or “<code>0</code>”, indicating respectively that club member $i$ is assigned to the first team, to the second team, or to none of the two teams. If there are multiple solutions, output any of them.</p>

<p>If the coach’s conditions cannot be honored, output the character “<code>*</code>” (asterisk) instead.</p>