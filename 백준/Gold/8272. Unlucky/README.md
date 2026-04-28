# [Gold I] Unlucky - 8272

[문제 링크](https://www.acmicpc.net/problem/8272)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 28, 맞힌 사람: 18, 정답 비율: 29.508%

### 분류

수학

### 문제 설명

<p>Quite unluckily Byteasar has found himself in the middle of a desert, <em>s</em>&nbsp;meters from the closest oasis.</p>

<p>Lucky enough, Byteasar has a compass and he perfectly knows in which direction he should go to reach the oasis. He has <em>w</em>&nbsp;milliliters of water with him, but he is able to carry at most <em>k</em>&nbsp;milliliters at a time. Walking one meter requires drinking one milliliter of water for Byteasar; for simplicity we assume that Byteasar drinks water at a fixed pace, e.g. after walking 1 / 3&nbsp;meters he has drunk 1 / 3&nbsp;milliliters of water. At each moment of time Byteasar can put aside any amount of water that he can drink later. Sometimes it may pay him off to come back for water that he has left behind.</p>

<p>To prevent further unlucky coincidence, Byteasar would like to bring as much water to the oasis as possible (who knows if there is any water in that oasis, anyway?). How much water is he able to bring?</p>

<p>We assume that Byteasar is able to reach the oasis if he chooses a smart enough water-drinking strategy.</p>

### 입력

<p>The first line of the standard input contains three integers <em>s</em>, <em>w</em>&nbsp;and <em>k</em>&nbsp;(10 &le; <em>s</em>, <strong><em>w</em></strong>, <em>k</em> &le; 100 000 000) that represent Byteasar&#39;s distance from the oasis, the quantity of water that he has and the maximum quantity of water that he can carry.</p>

### 출력

<p>Your program should write to the standard output one real number: the maximum volume of water (in milliliters) that Byteasar can bring to the oasis. The number should be written with three digits after the dot. Your solution will be accepted if it differs from the exact result by at most 10<sup>-3</sup>.</p>