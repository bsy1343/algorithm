# [Platinum II] Circular Barn - 26973

[문제 링크](https://www.acmicpc.net/problem/26973)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 421, 정답: 124, 맞힌 사람: 100, 정답 비율: 29.070%

### 분류

수학, 다이나믹 프로그래밍, 애드 혹, 정수론, 게임 이론, 소수 판정, 에라토스테네스의 체

### 문제 설명

Farmer John and his archnemesis Farmer Nhoj are playing a game in a circular
barn. There are $N$ ($1 \leq N \leq 10^5$) rooms in the barn, and the $i$th room
initially contains  $a_i$ cows ($1 \leq a_i \leq 5\cdot 10^6$). The game is
played as follows:

<p><ul><li>Both farmers will always be in the same room. After entering a room, each
farmer takes exactly one turn, with Farmer John going first. Both farmers
initially enter room $1$.</li><li>If there are zero cows in the current room, then the farmer to go loses.
Otherwise, the farmer to go chooses an integer $P$, where $P$ must either be $1$
or a prime number at most the number of cows in the current room, and removes
$P$ cows from the current room.</li><li>After both farmers have taken turns, both farmers move to the next room  in
the circular barn. That is, if the farmers are in room $i$, then they move to
room $i+1$, unless they are in room $N$, in which case they move to room
$1$.</li></ul>

<p>Determine the farmer that wins the game if both farmers play optimally.

### 입력

The input contains $T$ test cases. The first line contains  $T$
($1 \leq T \leq 1000$).  Each of the $T$ test cases follow.

<p>Each test case starts with a line containing $N$, followed by a line containing
$a_1,\dots,a_N$. 

<p>It is guaranteed that the sum of all $N$ is at most
$2\cdot 10^5$.

### 출력

For each test case, output the farmer that wins the game, either "Farmer John"
or "Farmer Nhoj."

### 힌트

<p>For the first test case, Farmer John can remove $1$, $2$, or $3$ cows from the first room. Whichever number he removes, Nhoj can remove the remaining cow(s), forcing FJ to lose when they circle back to the first room.</p>

<p>For the second test case, FJ can remove $5$ cows, forcing Nhoj to work with only $4$ cows remaining. Now, Nhoj can either remove $1$, $2$, or $3$ cows. This is now similar to the first test case.</p>

<p>For the third and fourth test cases, FJ can immediately remove all the cows from the first room, forcing Nhoj to lose.</p>

<p>For the fifth test case, FJ can remove $1$, $2$, or $3$, cows from the first room, and Nhoj can remove the rest right after. When they circle back around to the first room, FJ will lose.</p>