# [Platinum V] Adversarial Memory - 20213

[문제 링크](https://www.acmicpc.net/problem/20213)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 140, 정답: 31, 맞힌 사람: 31, 정답 비율: 25.620%

### 분류

구현, 그리디 알고리즘, 해 구성하기, 시뮬레이션

### 문제 설명

<p>Charlie is playing a game of <em>memory</em> (also known as <em>concentration</em>) on his own. The game consists of $2n$ cards, where each of the numbers from $1$ to $n$ is written on exactly two cards. The cards are upside down on the table. In a turn, Charlie turns over one card, looks at it, and then turns over another card. If the cards have the same number, they are removed from the game. Otherwise, they are turned back over and placed back. The goal of the game is to remove all the cards from the game in as few moves as possible.</p>

<p>You are a magician, and hence you are able to change the numbers on upside down cards seamlessly. If Charlie turns over the same card twice, you need to make sure that he sees the same number both times, or else Charlie would notice something is wrong. You also need to make sure that for each number there will be exactly two cards on which Charlie will see that number. Your goal is to force Charlie to need at least $2n-1$ turns to finish the game.</p>

<p>More formally, there are $2n$ indices from $1$ to $2n$. In a turn, Charlie chooses an index $i$ and turns over the card at index $i$. You can then decide what number Charlie will see when he turns over the card. Then Charlie will choose a different index $j$ and turn over the card at index $j$. You can then decide what number Charlie will see when he turns over that card. The only restrictions are that Charlie must always see the same number when he turns over the same card, and that for each number there will be exactly two cards on which Charlie will see that number. Note that Charlie will never choose the index of a card that is already out of the game.</p>

### 입력



### 출력

