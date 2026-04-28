# [Platinum II] Circle of Life - 14046

[문제 링크](https://www.acmicpc.net/problem/14046)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 193, 정답: 82, 맞힌 사람: 43, 정답 비율: 43.000%

### 분류

수학, 비트마스킹

### 문제 설명

<p>You may have heard of Conway&rsquo;s Game of Life, which is a simple set of rules for cells on a grid that can produce incredibly complex configurations. In this problem we will deal with a simplified version of the game.</p>

<p>There is a one-dimensional circular strip of N cells. The cells are numbered from 1 to N in the order you would expect: that is, cell 1 and cell 2 are adjacent, cell 2 and cell 3 are adjacent, and so on up to cell N &minus; 1, which is adjacent to cell N. Since the strip is circular, cell 1 is also adjacent to cell N.</p>

<p>Each cell is either alive (represented by a &lsquo;1&rsquo;) or dead (represented by a &lsquo;0&rsquo;). The cells change over a number of generations. If exactly one of a cell&rsquo;s neighbours is alive in the current generation, then the cell will be alive in the next generation. Otherwise, the cell will be dead in the next generation.</p>

<p>Given the initial state of the strip, find the state after T generations.</p>

### 입력

<p>The first line will contain two space-separated integers N and T (3 &le; N &le; 100 000; 1 &le; T &le; 10<sup>15</sup>). The second line will contain a string consisting of exactly N characters, representing the initial configuration of the N cells. Each character in the string will be either &lsquo;0&rsquo; or &lsquo;1&rsquo;. The initial state of cell i is given by the i-th character of the string. The character &lsquo;1&rsquo; represents an alive cell and the character &lsquo;0&rsquo; represents a dead cell.</p>

### 출력

<p>Output the string of N characters representing the final state of the cells, in the same format and order as the input.</p>