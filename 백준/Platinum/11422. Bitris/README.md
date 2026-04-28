# [Platinum III] Bitris - 11422

[문제 링크](https://www.acmicpc.net/problem/11422)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 16, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

애드 혹, 자료 구조, 그리디 알고리즘, 수학, 세그먼트 트리

### 문제 설명

<p>There is a set of 2xN cubes. Each cube has an integer ranging from 1 to N assigned to it, labeling each of the cube&#39;s sides. Each number is written on exactly two cubes. Cubes are placed one on top of another, in a pile. If two cubes with the same number stand next to each other, they annihilate: both cubes disappear, and cubes standing above come down to fill the space. Your task is to disassemble the pile &ndash; eliminate all cubes. You are allowed to swap any two neighboring cubes. A swap could be done only after all possible annihilations are done.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11422.%E2%80%85Bitris/541a82cf.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11422/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:157px; width:36px" />For example, if N=4 and cubes are standing as you see on the right then you need to make one swap. Cubes with label 3 annihilate immediately; you swap the fourth bottom cube (with label 1) and the fifth bottom cube (with label 4); afterwards, cubes with labels 4 annihilate, followed by cubes with labels 1 and labels 2. Other option is to swap third and fourth bottom cubes (in this case cubes with labels 1 and 4 annihilate at same time, followed by cubes with label 2), or second and third.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11422.%E2%80%85Bitris/a2f11ad4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11422/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:119px; width:28px" />If N=3, and cubes are standing like shown on the right, you need to perform 3 swaps. One way to solve is to swap fifth and sixth cubes, then fourth and fifth; cubes with labels 2 annihilate; then swap second and third; other cubes annihilate simultaneously. The task is to find the minimal number of swaps, such that all cubes are eliminated.</p>

### 입력

<p>The first line in the input file contains the positive integer N, 2&lt;=N&lt;=100000. The second line contains the labels of all cubes, bottom up, split by spaces.</p>

### 출력

<p>The only line in the output should contain one non-negative integer M &ndash; the minimal number of swaps necessary to destroy all cubes.</p>