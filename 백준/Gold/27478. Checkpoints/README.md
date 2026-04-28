# [Gold I] Checkpoints - 27478

[문제 링크](https://www.acmicpc.net/problem/27478)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 30, 맞힌 사람: 29, 정답 비율: 90.625%

### 분류

수학, 그리디 알고리즘, 해 구성하기, 확률론

### 문제 설명

<p>Gildong is developing a game consisting of $n$ stages numbered from $1$ to $n$. The player starts the game from the $1$-st stage and should beat the stages in increasing order of the stage number. The player wins the game after beating the $n$-th stage.</p>

<p>There is at most one checkpoint on each stage, and there is always a checkpoint on the $1$-st stage. At the beginning of the game, only the checkpoint on the $1$-st stage is activated, and all other checkpoints are deactivated. When the player gets to the $i$-th stage that has a checkpoint, that checkpoint is activated.</p>

<p>For each try of a stage, the player can either beat the stage or fail the stage. If they beat the $i$-th stage, the player is moved to the $i+1$-st stage. If they fail the $i$-th stage, the player is moved to the most recent checkpoint they activated, and they have to beat the stages after that checkpoint again.</p>

<p>For example, assume that $n=4$ and the checkpoints are on the $1$-st and $3$-rd stages. The player starts at the $1$-st stage. If they fail on the $1$-st stage, they need to retry the $1$-st stage because the checkpoint on the $1$-st stage is the most recent checkpoint they activated. If the player beats the $1$-st stage, they&rsquo;re moved to the $2$-nd stage. If they fail it, they&rsquo;re sent back to the $1$-st stage again. If they beat both the $1$-st stage and the $2$-nd stage, they get to the $3$-rd stage and the checkpoint on the $3$-rd stage is activated. Now whenever they fail on the $3$-rd stage, or the $4$-th stage after beating the $3$-rd stage, they&rsquo;re sent back to the $3$-rd stage. If they beat both the $3$-rd stage and the $4$-th stage, they win the game.</p>

<p>Gildong is going to build the stages to have equal difficulty. He wants you to find any series of stages and checkpoints using at most $2000$ stages, where the <a href="https://en.wikipedia.org/wiki/Expected_value">expected number</a> of tries over all stages is exactly $k$, for a player whose probability of beating each stage is exactly $\cfrac{1}{2}$.</p>

### 입력

<p>Each test contains one or more test cases. The first line contains the number of test cases $t$ ($1\le t\le 50$).</p>

<p>Each test case contains exactly one line. The line consists of a single integer $k$ ($1\le k\le 10^{18}$) --- the expected number of tries over all stages Gildong wants to set for a player whose probability of beating each stage is exactly $\cfrac{1}{2}$.</p>

### 출력

<p>For each test case, print $-1$ if it&rsquo;s impossible to construct such a series of stages and checkpoints using at most $2000$ stages.</p>

<p>Otherwise, print two lines. The first line should contain a single integer $n$ ($1\le n\le 2000$) -- the number of stages. The second line should contain $n$ integers, where the $i$-th integer represents whether the $i$-th stage has a checkpoint. The $i$-th integer should be $0$ if the $i$-th stage doesn&rsquo;t have a checkpoint, and $1$ if it has a checkpoint. Note that the first integer must be $1$ according to the description.</p>

### 힌트

<p>In the first and the second case, we can see that the &lsquo;easiest&rsquo; series of stages is to have $1$ stage with a checkpoint. This already requires $2$ tries in expectation, so it is impossible to make it to require only $1$ try.</p>

<p>In the third case, it takes $2$ tries in expectation to beat each stage, and the player can always retry that stage without falling back to one of the previous stages if they fail it. Therefore the total expected number of tries is $8$. Note that there exists an answer with fewer stages, but you are not required to minimize the number of stages used.</p>