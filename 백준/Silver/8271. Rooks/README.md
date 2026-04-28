# [Silver V] Rooks - 8271

[문제 링크](https://www.acmicpc.net/problem/8271)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 114, 정답: 85, 맞힌 사람: 63, 정답 비율: 78.750%

### 분류

해 구성하기

### 문제 설명

<p>After quite a lot of effort Bytie has finally managed to put <em>n</em>&nbsp;rooks on a board of size <em>n</em>&nbsp;&times; <em>n</em>&nbsp;so that no two of them attack each other. A quick reminder: a rook attacks all the fields of the board that are located in the same row or in the same column as it is<sup>1</sup>.</p>

<p>Unfortunately, the boy has now accidentally hit the board. As a result, several rooks have fallen down from it. Could you help Bytie put these rooks back on the board? The boy would like to leave the rooks that are still on the board intact.</p>

<p>1. See also&nbsp;<a href="http://en.wikipedia.org/wiki/Rook_(chess)">http://en.wikipedia.org/wiki/Rook_(chess)</a></p>

### 입력

<p>The first line of the standard input contains one integer <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 1 000) that represents the size of the board. A description of the configuration of the rooks follows: the following <em>n</em>&nbsp;lines contain&nbsp;<em>n</em>&nbsp;characters each. The character &#39;<code>.</code>&#39; represents an empty field whereas the letter &#39;<code>W</code>&#39; represents a field occupied by a rook.</p>

<p>You can assume that there are <em>w</em>&nbsp;rooks on the board with 1 &le; <em>w</em> &le; <em>n</em> - 1&nbsp;and that no pair of rooks on the board attacks each other.</p>

### 출력

<p>Your program should write to the standard output <em>n</em>&nbsp;lines containing&nbsp;<em>n</em>&nbsp;characters &#39;<code>.</code>&#39; or &#39;<code>W</code>&#39; each: the final configuration of rooks on the board. The description should contain exactly&nbsp;<em>n</em>&nbsp;occurrences of the letter &#39;<code>W</code>&#39; with <em>w</em>&nbsp;rooks placed in the same positions as in the initial board. No two rooks may attack each other. If there are multiple ways of placing <em>n</em> - <em>w</em>&nbsp;rooks on the initial board, your program should output&nbsp;<i>any</i>&nbsp;one of them.</p>