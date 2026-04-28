# [Gold III] Reconstructing Tape Art - 24826

[문제 링크](https://www.acmicpc.net/problem/24826)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

해 구성하기, 자료 구조, 스택

### 문제 설명

<p>Raelynn is trying to learn the newest craze in modern art: Tape Art! This wonderful new type of art is created by taking a wooden plank and pieces of tape of different colors.  Each artwork is constructed by taking multiple pieces of tape and placing them on the plank.  For each color that appears in the artwork, only a single piece of tape is used.  Tapes can be placed on top of each other in which case the tape placed last obscures already placed pieces of tape with which it overlaps.</p>

<p>Raelynn has decided the best way to learn is by copying Sheila, the world famed tape artist. Unfortunately those pieces of art are under lock and key and Raelynn can see only pictures of these marvels. Since Raelynn is having trouble reverse engineering the artwork from the picture, she has hired you to create a set of instructions with which she can copy the art. </p>

<p>Since Raelynn is spoiled by the ease of IKEA catalogs she requires instructions to be given in the following format: there should only be one instruction per color of tape and instructions should be given in the order they should be executed.</p>

### 입력

<p>The input consists of a single test case. The first line of this test case contains one integer $n$ ($1 \le n \le 10^5$), where $n$ is the length of the tape art in inches.  The next line contains $n$ integers $c_i$ ($1 \le c_i \le n$) representing the color of one inch of the plank. Planks are divided into $n$ $1$-inch sections numbered $1$ through $n$.</p>

### 출력

<p>Output <em>any</em> set of instructions that, when executed, will result in the tape art given by the input. The set of instructions should start with the number of instructions that follow.  Each instruction must consist of three numbers: $l$ $r$ $c$ where $[l, r]$ represents the inclusive range on which the tape should be placed and $c$ represents the color of the tape piece.</p>

<p>Output the string &quot;<code>IMPOSSIBLE</code>&quot; if the piece of tape art cannot be reconstructed using only one piece of each color (Sheila must have broken the rules to make it or this piece is a forgery).</p>