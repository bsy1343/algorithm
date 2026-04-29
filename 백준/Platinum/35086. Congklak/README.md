# [Platinum I] Congklak - 35086

[문제 링크](https://www.acmicpc.net/problem/35086)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

(분류 없음)

### 문제 설명

<p>Alice and Bill really enjoy playing board games, and they are always looking for new challenges. Recently, they discovered the Indonesian game <em>Congklak</em> which is played with a game board made up of several holes containing some number of stones. After playing some games, Alice quickly got the hang of it and won every game, so Bill did not want to play any more. Instead, inspired by the rules of the game, he came up with the following challenge for Alice:</p>

<p>There is a game board with $n$ holes arranged in a long row. These holes are numbered from $1$ to $n$ from left to right. Initially the $i$th hole contains $a_i$ stones. Note that this setup differs from the usual Congklak game, where the game board consists of two rows and one large hole at each end.</p>

<p>Now Bill will play $t$ games where each game goes as follows:</p>

<p>Bill starts the game at the first hole, holding one new stone in his hand. He then moves along the game board from hole $1$ to hole $n$. At each hole $i$, he first checks how many stones are currently in the hole, and depending on the result he performs exactly one of the following two actions:</p>

<ul style="list-style-type:lower-roman;">
<li>If the hole is empty, he drops one stone into it. Next, he checks how many stones are still in his hand. If his hand is empty, the game stops. Otherwise, he moves his hand to hole $i+1$ next and repeats the steps.</li>
<li>If there is at least one stone in the hole, he also drops one stone into it. Next, he checks how many stones are still in his hand. If his hand is empty, he takes out all the stones from hole $i$ into his hand. Regardless of whether or not his hand was empty, he moves his hand to hole $i+1$ next and repeats the steps.</li>
</ul>

<p>When Bill moves his hand past hole $n$, the game stops and Bill discards any stones that he still holds in his hand.</p>

<p>Bill challenges Alice to predict in advance the number of stones in every hole after playing exactly $t$ games. Note that the game board is <strong>not</strong> reset after playing a game, i.e.\ the initial configuration of the second game is the same as the configuration when the first game ends.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $n$ and $t$ ($1 \leq n \leq 10^5$, $1 \leq t \leq 10^{12}$), the number of holes and the number of games.</li>
<li>One line with $n$ integers $a_1, \ldots, a_n$ ($0 \leq a_i \leq 10^{12}$), where $a_i$ describes the initial number of stones in the $i$th hole.</li>
</ul>

### 출력

<p>Output $n$ integers, the $i$th of which is the number of stones in hole $i$ after playing $t$ games.</p>