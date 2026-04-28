# [Gold II] Block Game - 13343

[문제 링크](https://www.acmicpc.net/problem/13343)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 360, 정답: 249, 맞힌 사람: 220, 정답 비율: 71.661%

### 분류

수학, 정수론, 게임 이론, 유클리드 호제법

### 문제 설명

<p>You are attending the International Construction by Preschoolers Contest. Unfortunately,&nbsp;you are too old to participate, but you still enjoy watching the competition.</p>

<p>In between rounds, you are walking around the contest area when you see a toddler, one of&nbsp;the contestants, playing with her blocks. Annoyed that she is having all the fun, you decide to challenge her to a game.</p>

<p>You set up two stacks of blocks of a certain height. Then, you and the toddler take turns&nbsp;removing some number of blocks from the stack which contains the largest number of blocks&nbsp;(if both stacks have the same number of blocks, the current player can choose either stack&nbsp;to remove blocks from). The number of blocks removed must be a positive multiple of the&nbsp;number of blocks in the smaller stack. For instance, if there is a stack with 5 blocks, and one&nbsp;with 23 blocks, then the current player can remove 5, 10, 15 or 20 blocks from the stack of&nbsp;23 blocks. The player who empties one of the stacks wins the game.</p>

<p>You have graciously decided to take the first move, but then a worry strikes you &ndash; might this&nbsp;devious preschooler still be able to beat you?</p>

### 입력

<p>One line with two integers N and M, satisfying 1 &le; N, M &le; 10<sup>18</sup>, the initial sizes of the two&nbsp;stacks of blocks.</p>

### 출력

<p>Output a single line containing a single word: the word &ldquo;win&rdquo; if you are guaranteed to win&nbsp;if you play correctly, and the word &ldquo;lose&rdquo; if your opponent can force you to lose.</p>