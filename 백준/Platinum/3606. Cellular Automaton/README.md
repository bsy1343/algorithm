# [Platinum I] Cellular Automaton - 3606

[문제 링크](https://www.acmicpc.net/problem/3606)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 138, 정답: 57, 맞힌 사람: 41, 정답 비율: 40.196%

### 분류

수학, 분할 정복을 이용한 거듭제곱, 선형대수학

### 문제 설명

<p>A cellular automaton is a collection of cells on a grid of specified shape that evolves through a number of discrete time steps according to a set of rules that describe the new state of a cell based on the states of neighboring cells. The order of the cellular automaton is the number of cells it contains. Cells of the automaton of order n are numbered from 1 to n.</p>

<p>The order of the cell is the number of different values it may contain. Usually, values of a cell of order m are considered to be integer numbers from 0 to m &minus; 1.</p>

<p>One of the most fundamental properties of a cellular automaton is the type of grid on which it is computed. In this problem we examine the special kind of cellular automaton &mdash; circular cellular automaton of order n with cells of order m. We will denote such kind of cellular automaton as n,m-automaton.</p>

<p>A distance between cells i and j in n,m-automaton is defined as min(|i&minus;j|, n&minus;|i&minus;j|). A d-environment of a cell is the set of cells at a distance not greater than d.</p>

<p>On each d-step values of all cells are simultaneously replaced by new values. The new value of cell i after d-step is computed as a sum of values of cells belonging to the d-enviroment of the cell i modulo m.</p>

<p>The following picture shows 1-step of the 5,3-automaton.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3606.%E2%80%85Cellular%E2%80%85Automaton/4f96cac0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3606.%E2%80%85Cellular%E2%80%85Automaton/4f96cac0.png" data-original-src="https://www.acmicpc.net/upload/images2/auto.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:127px; width:266px" /></p>

<p>The problem is to calculate the state of the n,m-automaton after k d-steps.</p>

### 입력

<p>The first line of the input file contains four integer numbers n, m, d, and k (1 &le; n &le; 500, 1 &le; m &le; 1 000 000, 0 &le; d &lt; n/2 , 1 &le; k &le; 10 000 000). The second line contains n integer numbers from 0 to m &minus; 1 &mdash; initial values of the automaton&rsquo;s cells.</p>

### 출력

<p>Output the values of the n,m-automaton&rsquo;s cells after k d-steps.</p>