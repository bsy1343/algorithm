# [Platinum I] Numbers Generator - 16344

[문제 링크](https://www.acmicpc.net/problem/16344)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 13, 맞힌 사람: 7, 정답 비율: 25.926%

### 분류

아호-코라식, 자료 구조, 가우스 소거법, 선형대수학, 수학, 트리, 트라이

### 문제 설명

<p>Among the most popular games in Binary casino is a game called &ldquo;The Binary Generator&rdquo;. It is played by multiple players and with a single coin. Each player first chooses a sequence of heads and tails of a given length. After that, players or the casino start flipping the coin and the winner is the player whose sequence first appears as a contiguous subsequence of the flip results.</p>

<p>You believe all sequences chosen by players are equally good and so the choice of the sequence does not matter. However, after losing all of your money, you became somewhat doubtful of that. Write a program to prove you wrong. For a given list of sequences of heads and tails of the same length, write the expected number of coin flips which have to be performed until one of the players&rsquo; chosen sequences appears as a contiguous subsequence in the flip sequence. The expected number of coin flips is the average length of a flip sequence over all possible flip sequences resulting in some player&rsquo;s victory, where each flip sequence is weighted by its probability.</p>

### 입력

<p>The first line of input contains two integers W and B (1 &le; W &le; 10, 1 &le; B &le; 30), the number of players&rsquo; sequences and the length of players&rsquo; sequences, respectively. Next, W lines follow, each consisting of a sequence of B letters. Each letter is either &ldquo;H&rdquo; for heads or &ldquo;T&rdquo; for tails.</p>

### 출력

<p>Output a single number &ndash; the expected number of flips. The output will be considered correct if it differs by at most 0.1 from the correct answer.</p>