# [Gold II] Pohlepko - 13940

[문제 링크](https://www.acmicpc.net/problem/13940)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 159, 정답: 71, 맞힌 사람: 57, 정답 비율: 44.882%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프, 역추적

### 문제 설명

<p>Little Greedy got a board for his birthday. The board has N rows and M columns, and has a lowercase letter of the English alphabet​ in each field. During his birthday party, everyone got bored so they decided to play a simple board game.</p>

<p>The game begins with placing a chip on the upper left​ field labeled with coordinates (1, 1). In each turn, we must​ move the chip one field to the right or down, given the constraint that it remains on the board. The game ends with moving the chip to the lower right​ field of the board labeled with coordinates (N, M). During the game, we take note of the array of characters we form by moving the chip and therefore constructing a word. The goal of the game is to find the lexicographically smallest word.</p>

<p>The player(s) that will suceed in constructing the lexicographically smallest word get a bag of candy as a prize. Greedy wants to win the candy at any price, so he is asking you to write a programme that will find the lexicographically smallest​ possible word.</p>

<p>Please note​: The lexicographic order of words is the one in which the words appear in a dictionary. If we have two words, and the words differ in the first letter, then the smaller word is the one with the letter that comes first in the alphabet.&nbsp;</p>

### 입력

<p>The first line of input contains integers N and M, separated by space (1 &le; N, M &le; 2000).</p>

<p>The following N lines contains M lowercase letters of the English alphabet that represent the board.&nbsp;</p>

### 출력

<p>You must output the lexicographically smallest word.&nbsp;</p>

### 힌트

<p>One way of constructing the smallest word is illustrated in the following image:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13940.%E2%80%85Pohlepko/55b40b94.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13940/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-28%20%EC%98%A4%ED%9B%84%204.48.09.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:242px; width:300px" /></p>