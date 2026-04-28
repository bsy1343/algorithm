# [Platinum III] Jubeat - 28334

[문제 링크](https://www.acmicpc.net/problem/28334)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 9, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

다이나믹 프로그래밍, 애드 혹

### 문제 설명

<p>Recently, Nana is spending a lot of time playing &ldquo;Jubeat&rdquo;, the latest arcade music game from Konami. The game consists of a $4 \times 4$ grid. When a note pops up in some of the cells, the player must push that cell following the rhythm of the music.</p>

<p>For each note pushed, the player is awarded points. If a song contains $N$ notes, a player will receive $\frac{900\,000}{N}$ points if the timing of the push is perfect. For notes where the timing was less perfect, she can receive either $70$%, $30$%, or $0$% of this score. After the song is over, the sum of all the points will be rounded down to the nearest integer.</p>

<p>Nana just played a song and received a score of $S$: however he doesn&rsquo;t know the number of notes $N$ in the song. However, he suspects $N$ lies in an interval $[a, b]$. Write a program that calculates the sum of all possible $N$s in that range.</p>

### 입력

<p>The input consists of $T$ test cases. The number of test cases $T$ is given in the first line of the input. Each test case consists of a single line with three integers: $S$ ($0 &le; S &le; 900\,000$), $a$ and $b$ ($1 &le; a &le; b &le; 10^9$).</p>

### 출력

<p>Print exactly one line for each test case. The line should contain an integer indicating the sum of all possible $N$ in the given range.</p>