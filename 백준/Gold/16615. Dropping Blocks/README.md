# [Gold I] Dropping Blocks - 16615

[문제 링크](https://www.acmicpc.net/problem/16615)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 56, 맞힌 사람: 42, 정답 비율: 48.837%

### 분류

애드 혹, 그리디 알고리즘

### 문제 설명

<p>Daniel likes playing a game with blocks. The game starts with N empty piles of blocks in a line. While playing the game, Daniel does the following operation: he chooses a pile k and puts a block in every pile either to the left or to the right of pile k (including pile k). A valid game state is reached by applying only this operation zero or more times.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16615.%E2%80%85Dropping%E2%80%85Blocks/a5850f8e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16615.%E2%80%85Dropping%E2%80%85Blocks/a5850f8e.png" data-original-src="https://upload.acmicpc.net/392b8383-fa28-49a3-b813-bf13cd04feee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 592px; height: 84px;" /></p>

<p>For example, in the above image, Daniel played a game with four piles and performed four operations. Firstly, he put one block in each pile to the left of pile 2 (including pile 2), then he put one block in each pile to the right of pile 2 (including pile 2), then he put one block in each pile to the left of pile 3 (including pile 3), and finally, he put one block in each pile to the left of pile 1 (including pile 1).</p>

<p>Given the number of blocks in each pile, determine if it is a valid game state.</p>

### 입력

<p>The first line contains a single integer N (1 &le; N &le; 100 000), which is the number of piles.</p>

<p>The second line describes the piles. The line contains N integers, each of which is the number of blocks in a pile. The piles are listed from left to right and each number is at least 0 and at most 100 000.</p>

### 출력

<p>Display if the input describes a valid game state.</p>