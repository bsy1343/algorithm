# [Gold IV] ASCII Labyrinth - 1775

[문제 링크](https://www.acmicpc.net/problem/1775)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 백트래킹

### 문제 설명

<p>We are trying to construct a labyrinth on a board of size&nbsp;<em>m</em>&nbsp;&times;&nbsp;<em>n</em>. Initially, on each square of the board we find a piece of thin plywood of size 1&nbsp;&times;&nbsp;1 with one of the following three patterns painted on it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1775.%E2%80%85ASCII%E2%80%85Labyrinth/e143bfb9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/1775.%E2%80%85ASCII%E2%80%85Labyrinth/e143bfb9.png" data-original-src="https://upload.acmicpc.net/b45005be-d06e-43e4-bf30-1e6750aa919b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>While constructing the labyrinth we may turn the pieces arbitrarily but each piece must exactly cover a square of the board. We are not allowed to move a piece to another square of the grid.</p>

<p>Given an initial board covered with the pieces, we would like to turn the pieces in such a way that the patterns on the pieces form at least one polygonal curve connecting the top left corner square of the board with the bottom right square of the board. The picture below presents an initial state of a board of size 4&nbsp;&times;&nbsp;6 and a labyrinth constructed from the board in which the above stated goal has been achieved.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1775.%E2%80%85ASCII%E2%80%85Labyrinth/ba172614.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/1775.%E2%80%85ASCII%E2%80%85Labyrinth/ba172614.png" data-original-src="https://upload.acmicpc.net/6776cfbf-b922-43fb-beb2-fab7b3e59e7a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Your task is to read a description of the initial board with the pieces placed on it and to decide whether one can turn the pieces in such a way that the patterns form a line connecting some edge of the top left square and some edge of the bottom right square of the board.</p>

### 입력

<p>The first line of input contains a number&nbsp;<em>c</em>&nbsp;giving the number of cases that follow. The test data for each case start with two numbers&nbsp;<em>m</em>&nbsp;and&nbsp;<em>n</em>&nbsp;giving the number of rows and columns on the board. The remaining lines form an ASCII rendition of the initial board with the pieces placed on squares. The characters used in the rendition are&nbsp;<tt>+</tt>,&nbsp;<tt>-</tt>,&nbsp;<tt>|</tt>,&nbsp;<tt>*</tt>&nbsp;and space. See the sample input for the format. The size of the input board will be such that&nbsp;<em>m</em>&nbsp;&times;&nbsp;&nbsp;<em>n</em>&nbsp;&le;&nbsp;64.</p>

### 출력

<p>For each case when a labyrinth with the desired property can be constructed print the labyrinth in the format like the input format which illustrates a path with the smallest number of squares. (If there are many such paths then anyone will do.) The squares not participating in the path should be left blank. If the labyrinth cannot be formed then do not print the board. After printing the board (if any) print how many different paths exist in the solutions to the labyrinth problem in the format shown below.</p>