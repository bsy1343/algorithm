# [Silver III] Pack - 7159

[문제 링크](https://www.acmicpc.net/problem/7159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 32, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>There is a pack of cards on the table, containing n cards placed one on another. Each card has a positive integer written on one side and nothing on the other. On the top card the number 1 is written, on the second from top number 2, etc., and on the bottom card the number n is written. In the beginning all the cards in the pack are placed so that numbers are facing up. Archibald makes m turns. In the i-th turn he takes the upper ki cards, holding them together turns them upside down and places back on top of the pack. Your task is to write a program that determines the place and state of a card (upside up or down) in the pack after m moves made by Archibald!</p>

### 입력

<p>The first line of the standard input contains two positive integers &ndash; n (the number of cards in the pack, n&le;100000) and m (the number of turns done by Archibald, m&le;1000) &ndash; which are separated using a space symbol. Each of the following m lines contains one positive integer ki (1&le;ki&le;n) &ndash; the number of cards used in each turn.</p>

<p>The next line of the standard input contains one positive integer s (s&le;10000) &ndash; the number of cards, the final position and state of which must be determined. Each of the following s lines contains one positive integer &ndash; the number written on the card, the final position and state of which must be determined.&nbsp;</p>

### 출력

<p>The standard output must contain excatly s lines. Each line must contain one integer. If in the end the p-th card has the number that the m+i+1st line of the standrard input contains, the i-th line of the output file must contain the number</p>

<ul>
	<li>+p if the card has its number written on the side facing up or</li>
	<li>-p if the card has its number written on the side facing down.&nbsp;</li>
</ul>