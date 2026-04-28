# [Platinum IV] Multiplication Game - 15274

[문제 링크](https://www.acmicpc.net/problem/15274)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 89, 정답: 42, 맞힌 사람: 36, 정답 비율: 48.000%

### 분류

수학, 정수론, 많은 조건 분기, 게임 이론, 소인수분해

### 문제 설명

<p>Alice and Bob are in their class doing drills on multiplication and division. They quickly get bored and instead decide to play a game they invented.</p>

<p>The game starts with a target integer N &ge; 2, and an integer M = 1. Alice and Bob take alternate turns. At each turn, the player chooses a prime divisor p of N, and multiply M by p. If the player&rsquo;s move makes the value of M equal to the target N, the player wins. If M &gt; N, the game is a tie.</p>

<p>Assuming that both players play optimally, who (if any) is going to win?</p>

### 입력

<p>The first line of input contains T (1 &le; T &le; 10000), the number of cases to follow. Each of the next T lines describe a case. Each case is specified by N (2 &le; N &le; 2<sup>31</sup> &minus; 1) followed by the name of the player making the first turn. The name is either Alice or Bob.</p>

### 출력

<p>For each case, print the name of the winner (Alice or Bob) assuming optimal play, or tie if there is no winner.</p>