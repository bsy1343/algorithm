# [Gold V] Don't Get Rooked - 4672

[문제 링크](https://www.acmicpc.net/problem/4672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 165, 정답: 104, 맞힌 사람: 84, 정답 비율: 61.765%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>In chess, the rook is a piece that can move any number of squares vertically or horizontally. In this problem we will consider small chess boards (at most 4x4) that can also contain walls through which rooks cannot move. The goal is to place as many rooks on a board as possible so that no two can capture each other. A configuration of rooks is legal provided that no two rooks are on the same horizontal row or vertical column unless there is at least one wall separating them.</p>

<p>The following image shows five pictures of the same board. The first picture is the empty board, the second and third pictures show legal configurations, and the fourth and fifth pictures show illegal configurations. For this board, the maximum number of rooks in a legal configuration is 5; the second picture shows one way to do it, but there are several other ways.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4672.%E2%80%85Don't%E2%80%85Get%E2%80%85Rooked/55321dc2.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4672.%E2%80%85Don't%E2%80%85Get%E2%80%85Rooked/b3798fc5.gif" data-original-src="https://boja.mercury.kr/assets/problem/4672-1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:152px; width:800px" /></p>

<p>Your task is to write a program that, given a description of a board, calculates the maximum number of rooks that can be placed on the board in a legal configuration.</p>

### 입력

<p>The input file contains one or more board descriptions, followed by a line containing the number 0 that signals the end of the file. Each board description begins with a line containing a positive integer n that is the size of the board; n will be at most 4. The next n lines each describe one row of the board, with a &#39;.&#39; indicating an open space and an uppercase &#39;X&#39; indicating a wall. There are no spaces in the input file.</p>

### 출력

<p>For each test case, output one line containing the maximum number of rooks that can be placed on the board in a legal configuration.</p>