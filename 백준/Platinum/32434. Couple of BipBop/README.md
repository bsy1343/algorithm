# [Platinum II] Couple of BipBop - 32434

[문제 링크](https://www.acmicpc.net/problem/32434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 10, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

문자열, 스택, 자료 구조, 접미사 배열과 lcp 배열

### 문제 설명

<p>It’s time for Bob and Charlie to go on a new couple-hyperfocus: BipBop trends. This social network specialized in short videos is going viral more than ever before. As a consequence, couples now measure how much they love each other in terms of how well they can dance together. In theory, the BipBop dancing style is simple and can be used to perform pretty much every song existent. Usually, it consists in a sequence of moves, one for each verse, represented by an integer number, as the moves are kinda generic, really.</p>

<p>Always late, the couple just got to a party, the song is already playing, but they still want to impress and show that they can dance BipBop even without knowing in what verse the song is currently at. Then, each of them starts dancing in a random verse and keep following the coreography until one of them reaches the end of the song or when they unmatch a move (they execute different moves).</p>

<p>There is no popular song that Bob and Charlie don’t know how to dance, so given a song represented as a sequence of movements, one for each verse, calculate the expected number of verses they will be dancing in sync, if each of them initially thinks that the song is playing on a random verse with uniform probability.</p>

### 입력

<p>The first line of the input contains an integer $N$ ($1 ≤ N ≤ 10^5$), the number of verses in the song. The second line contains $N$ integers, $V_1, V_2, \dots , V_N$ ($1 ≤ V_i ≤ N$), corresponding to the movement associated with each of the verses in the sequence.</p>

### 출력

<p>Output the expected number of verses (moves) the couple will dance in sync, if each one of them chose a verse uniformly at random to start the dance. Output the answer as a irreducible fraction $P/Q$, such that $\gcd(P, Q) = 1$. It can be proven that it is always possible to express the answer in this way.</p>