# [Gold IV] Unique Dice - 31050

[문제 링크](https://www.acmicpc.net/problem/31050)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>You are about to leave home for your weekly game of Pumpkins and Flagons (P&amp;F) when a text comes in asking you to bring a large collection of identical P&amp;F dice. They have asked the right person, for you have a very large collection of P&amp;F dice which, unfortunately, is currently unsorted.</p>

<p>These dice are ordinary cubes with a number on each of the six faces. The numbers are in the range 1&ndash;6, but they do not need to be distinct. For example, $\{ 1, 2, 3, 4, 5, 6\} $, $\{ 1, 1, 1, 1, 1, 1\} $ and $\{ 2, 2, 2, 4, 4, 5\} $ are all valid sets of numbers for the six faces. For this problem you want to find the size of the largest set of identical dice you can create from your very large collection. Two dice are considered identical to each other if it is possible to rotate one of the dice so that their top numbers are the same, their bottom numbers are the same, and so on for all six faces.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ae3cbf21-d308-4359-bab3-8ba7efbac5a9/-/preview/" style="width: 200px; height: 144px;" /></p>

<p style="text-align: center;"><b>Figure 1</b>: The six faces of a die.</p>

### 입력

<p>The first line contains an integer $n$ $( 1 \leq n \leq 500\, 000)$, indicating the number of dice in your collection. The next $n$ lines each contains six integers in the range $1$&ndash;$6$, separated by spaces, giving, in order, the numbers that appears on the top, bottom, front, back, left and right faces (see Figure 1).</p>

### 출력

<p>Print a single integer giving the size of the largest set of identical dice that can be made from given collection.</p>