# [Platinum I] Paint By Numbers - 20088

[문제 링크](https://www.acmicpc.net/problem/20088)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 20, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Paint By Numbers is a well-known puzzle game. We consider a simple onedimensional version of this puzzle. In this puzzle, the player is given a row of <em>n</em> cells. The cells are numbered 0 through <em>n</em> - 1 from the left to the right. The player has to paint each cell black or white. We use &lsquo;<code>X</code>&rsquo; to denote black cells and &lsquo;<code>_</code>&rsquo; to denote white cells.</p>

<p>The player is given a sequence <em>c</em> = [<em>c</em><sub>0</sub>, ..., <em>c</em><sub><em>k</em>-1</sub>] of <em>k</em> positive integers: the clues. He has to paint the cells in a way such that the black cells in the row form exactly <em>k</em> blocks of consecutive cells. Moreover, the number of black cells in the <em>i</em>-th block (0 - based) from the left should be equal to <em>c<sub>i</sub></em>. For example, if the clues are <em>c</em> = [3, 4], the solved puzzle must have exactly two blocks of consecutive black cells: one of length 3 and then another of length 4. Hence, if <em>n</em> = 10 and <em>c</em> = [3, 4], one solution satisfying the clues is &ldquo;<code>_XXX__XXXX</code>&rdquo;. Note that &ldquo;<code>XXXX_XXX__</code>&rdquo; does not satisfy the clues because the blocks of black cells are not in the correct order. Also, &ldquo;<code>__XXXXXXX_</code>&rdquo; does not satisfy the clues because there is a single block of black cells, not two separate blocks.</p>

<p>You are given a partially solved Paint By Numbers puzzle. That is, you know <em>n</em> and <em>c</em>, and additionally you know that some cells must be black and some cells must be white. Your task is to deduce additional information about the cells.</p>

<p>Specifically, a <em>valid solution</em> is one that satisfies the clues, and also agrees with the colors of the known cells. Your program should find cells that are painted black in every valid solution, and cells that are painted white in every valid solution.</p>

<p>You may assume that the input is such that there is at least one valid solution.</p>

### 입력



### 출력



### 제한

<p>In all subtasks 1 &le; <em>k</em> &le; <em>n</em>, and 1 &le; <em>c<sub>i</sub></em> &le; <em>n</em> for each 0 &le; <em>i</em> &le; <em>k</em> - 1.</p>