# [Platinum II] Sixth Sense - 16749

[문제 링크](https://www.acmicpc.net/problem/16749)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 72, 맞힌 사람: 61, 정답 비율: 57.547%

### 분류

이분 탐색, 그리디 알고리즘

### 문제 설명

<p>Ms. Future is gifted with precognition. Naturally, she is excellent at some card games since she can correctly foresee every player&rsquo;s actions, except her own. Today, she accepted a challenge from a reckless gambler Mr. Past. They agreed to play a simple two-player trick-taking card game.</p>

<p>Cards for the game have a number printed on one side, leaving the other side blank making indistinguishable from other cards.</p>

<p>A game starts with the same number, say n, of cards being handed out to both players, without revealing the printed number to the opponent.</p>

<p>A game consists of n tricks. In each trick, both players pull one card out of her/his hand. The player pulling out the card with the larger number takes this trick. Because Ms. Future is extremely good at this game, they have agreed to give tricks to Mr. Past when both pull out cards with the same number. Once a card is used, it can never be used later in the same game. The game continues until all the cards in the hands are used up. The objective of the game is to take as many tricks as possible.</p>

<p>Your mission of this problem is to help Ms. Future by providing a computer program to determine the best playing order of the cards in her hand. Since she has the sixth sense, your program can utilize information that is not available to ordinary people before the game.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n
p<sub>1</sub> &middot; &middot; &middot; p<sub>n</sub>
f<sub>1</sub> &middot; &middot; &middot; f<sub>n</sub></pre>

<p>n in the first line is the number of tricks, which is an integer between 2 and 5000, inclusive. The second line represents the Mr. Past&rsquo;s playing order of the cards in his hand. In the i-th trick, he will pull out a card with the number p<sub>i</sub> (1 &le; i &le; n). The third line represents the Ms. Future&rsquo;s hand. f<sub>i</sub> (1 &le; i &le; n) is the number that she will see on the i-th received card from the dealer. Every number in the second or third line is an integer between 1 and 10 000, inclusive. These lines may have duplicate numbers.</p>

### 출력

<p>The output should be a single line containing n integers a<sub>1</sub> &middot; &middot; &middot; a<sub>n</sub> separated by a space, where a<sub>i</sub> (1 &le; i &le; n) is the number on the card she should play at the i-th trick for maximizing the number of taken tricks. If there are two or more such sequences of numbers, output the lexicographically greatest one among them.</p>