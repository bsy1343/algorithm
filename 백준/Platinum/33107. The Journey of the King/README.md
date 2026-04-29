# [Platinum II] The Journey of the King - 33107

[문제 링크](https://www.acmicpc.net/problem/33107)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

이분 매칭, 해싱

### 문제 설명

<p>You are very close to becoming the King of Games. The only thing left to do is to win in a card game against the incarnation of the King of Nusantara, <em>Anda</em>, whose soul resides inside you as your split personality.</p>

<p>Each player has a deck of cards, each card contains a word. <strong>Within each deck</strong>, there are no two cards containing the same word. There is also a dictionary consisting of $D$ <strong>distinct</strong> words: $[W_1, W_2, \dots , W_D]$.</p>

<p>The game consists of $N$ turns. In turn $i$, Anda will play a card with the word $A_i$. Then, you can either match his card with one of your remaining cards or skip this turn. Two cards, $a$ and $b$, match if either the words $a + b$ or $b + a$ exist in the dictionary. The operator $+$ represents the concatenation operation. For instance, the concatenation of words <code>AU</code> and <code>RA</code> is <code>AU</code> $+$ <code>RA</code> $=$ <code>AURA</code>. Once you match a card, you cannot use that card for the rest of the game.</p>

<p>Your deck has $M$ cards (numbered from $1$ to $M$); card $j$ contains word $B_j$. You want to maximize the number of turns in which you successfully match Anda’s card.</p>

### 입력

<p>The first line consists of an integer $D$ ($1 ≤ D ≤ 200\, 000$).</p>

<p>Each of the next $D$ lines consists of a string $W_k$. String $W_k$ consists of only uppercase English letters. The sum of length of $W_k$ does not exceed $200\, 000$. It is guaranteed that $W_k \ne W_{k'}$ for $1 ≤ k &lt; k' ≤ D$.</p>

<p>The following line consists of an integer $N$ ($1 ≤ N ≤ 100\, 000$).</p>

<p>Each of the next $N$ lines consists of a string $A_i$. String $A_i$ consists of only uppercase English letters. The sum of length of $A_i$ does not exceed $100\, 000$. It is guaranteed that $A_i \ne A_{i'}$ for $1 ≤ i &lt; i' ≤ N$.</p>

<p>The following line consists of an integer $M$ ($1 ≤ M ≤ 100\, 000$).</p>

<p>Each of the next $M$ lines consists of a string $B_j$. String $B_j$ consists of only uppercase English letters. The sum of length of $B_j$ does not exceed $100\, 000$. It is guaranteed that $B_j \ne B_{j'}$ for $1 ≤ j &lt; j' ≤ M$.</p>

### 출력

<p>Output a single integer representing the maximum number of turns you match Anda’s card.</p>