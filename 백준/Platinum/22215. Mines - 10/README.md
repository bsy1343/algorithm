# [Platinum II] Mines - 10 - 22215

[문제 링크](https://www.acmicpc.net/problem/22215)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 34, 맞힌 사람: 34, 정답 비율: 82.927%

### 분류

수학, 구현, 그래프 이론, 그래프 탐색, 애드 혹, 해 구성하기

### 문제 설명

<p>Heino drew an H &times; W grid. Each cell was either empty or contained a mine. Indrek, a good friend of Heino, drew another H &times; W grid. In each cell of his grid, he wrote the total number of mines in the corresponding cell of Heino&rsquo;s grid and all its adjacent cells (two cells are adjacent if they share a common point). Indrek then erased Heino&rsquo;s grid. Given Indrek&rsquo;s grid, your task is to help Heino restore his original grid.</p>

<p>You may assume that at least one solution always exists.</p>

### 입력

<p>The first line of the input file contains two integers: H (1 &le; H &le; 600), the height of the grid, and W (1 &le; W &le; 600), the width of the grid. The following H lines each containing W digits describe Indrek&rsquo;s grid.</p>

### 출력

<p>The output file should contain H lines. Each of these lines should contain W characters: &lsquo;<code>X</code>&rsquo; for a mine and &lsquo;<code>.</code>&rsquo; for an empty cell.</p>

<p>If there are several correct solutions, submit any one of them.</p>

### 힌트

<p>In this task you&rsquo;re given 10 input files named&nbsp;<a href="https://upload.acmicpc.net/a15c4878-a517-4d88-95b2-f05d68c35b53/">minestest01.in</a>, <a href="https://upload.acmicpc.net/53c6a4c3-1fa3-4269-972b-6a93c72cc59f/">minestest02.in</a>, <a href="https://upload.acmicpc.net/72bd9af9-59a3-496f-b463-ff1107353822/">minestest03.in</a>, <a href="https://upload.acmicpc.net/bca6a760-9145-48f3-afdf-54800f92aa5d/">minestest04.in</a>, <a href="https://upload.acmicpc.net/6d0a98ef-e2db-4f33-8989-432214810d10/">minestest05.in</a>, <a href="https://upload.acmicpc.net/b81f3b36-e524-4ede-9e08-961ab192bdbe/">minestest06.in</a>, <a href="https://upload.acmicpc.net/1e4e0066-cc89-4e60-9e42-411eb3958574/">minestest07.in</a>, <a href="https://upload.acmicpc.net/b8dd65eb-e31a-47fb-b45e-1a18d5c62cd3/">minestest08.in</a>, <a href="https://upload.acmicpc.net/be61eb7a-d972-4a96-a945-eae09e28ee74/">minestest09.in</a>,&nbsp;<a href="https://upload.acmicpc.net/396b774a-91ca-4eeb-ad32-14baee6b27d1/">minestest10.in</a> and as a solution you need to submit corresponding output files. You should not submit a program.</p>