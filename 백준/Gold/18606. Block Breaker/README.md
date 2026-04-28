# [Gold III] Block Breaker - 18606

[문제 링크](https://www.acmicpc.net/problem/18606)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 101, 정답: 39, 맞힌 사람: 34, 정답 비율: 44.737%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 재귀

### 문제 설명

<p>Consider a rectangle frame of size n&times;m hanging in the air horizontally. Initially, the frame is filled tightly with n &times; m square blocks of size 1 &times; 1. Due to the friction with the frame and each other, the blocks are stable and will not drop.</p>

<p>However, the blocks can be knocked down. When a block is knocked down, other remaining blocks may also drop since the friction provided by other remaining blocks may not sustain them anymore. Formally, a block will drop if it is knocked or unstable. A block is unstable when at least one of its left and right neighbors has dropped, and at least one of its front and back neighbors has also dropped. In this definition, the frame can be regarded as a huge block that is always stable.</p>

<p>Now you, the block breaker, want to knock down the blocks. Formally, you are going to make q moves. On i-th move, you choose position (x<sub>i</sub>, y<sub>i</sub>). If there is still a block at the chosen position, you knock it down; otherwise, nothing happens. After each move, you have to wait until no unstable blocks are going to drop before making the next move.</p>

<p>For example, please look at the following illustration. The frame is of size 2 &times; 2, and the blocks (1, 1) and (1, 2) have dropped already. If we knock down the block (2, 2), it will drop, and then the last remaining block (2, 1) will also drop because it will become unstable.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18606.%E2%80%85Block%E2%80%85Breaker/0e1063cb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18606.%E2%80%85Block%E2%80%85Breaker/0e1063cb.png" data-original-src="https://upload.acmicpc.net/5027fa1c-5cca-415d-8805-69656ea1ee5d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 543px; height: 123px;" /></p>

<p>You are given a sequence of moves to make. How many blocks will drop as a result of each move? Specifically, if nothing happens during a move, the answer for that move is 0.</p>

### 입력

<p>The first line contains one positive integer T (1 &le; T &le; 10), denoting the number of test cases. For each test case:</p>

<p>The first line contains three positive integers, n, m, and q (1 &le; n, m &le; 2000, 1 &le; q &le; 100 000), denoting the dimensions of the frame and the number of moves.</p>

<p>Each of the following q lines contains two positive integers x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub> &le; n, 1 &le; y<sub>i</sub> &le; m), describing the next move to make.</p>

### 출력

<p>For each test case, output q lines. Each of them must contain a non-negative integer: the number of blocks that will drop as a result of the corresponding move.</p>