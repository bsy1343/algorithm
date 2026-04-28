# [Gold III] Emergency Rations - 5124

[문제 링크](https://www.acmicpc.net/problem/5124)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 9, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>You have prepared for the coming apocalypse by constructing an underground bunker. Now you need to fill that bunker with food and other rations to last you as long as possible.</p>

<p>Emergency rations come in boxes, each the same size as the last. A rations box has two properties: (1) it can be consumed for some number of units; (2) it expires some number of days after the apocalyptic event, after which it cannot be consumed.</p>

<p>You will need to consume the first unit of rations on day 1 and must consume one unit of rations every day afterward. A rations box with an expiration date X and that can be consumed for Y units can be consumed on up to Y different days and only on days less than or equal to X. For example: a box with expiration date 3 and worth 2 units can be consumed on days 1 and 2, or days 2 and 3, or days 1 and 3, or even just on day 3 (leaving the box only partially consumed).</p>

<p>You want to know the last day D that you will be able to consume rations without a break in your daily consumption. Since all rations boxes are the same size, and you don&rsquo;t want to waste space in your bunker, you also want to know the minimum number of boxes B needed to last you D days.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains the integer N (1 &le; N &le; 1000), the number of emergency ration boxes you can select from to store in your bunker. Next come two lines each containing N integers. The ith integer in the first line is the number of days Di that box i will last you. The ith integer in the second line is the expiration date Ei of box i. Each integer Di and Ei will be between 1 and 1,000,000,000 inclusive.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line output two integers D and B, separated by a single space, where D is the last day you can consume rations and B is the minimum number of boxes needed to reach D. Each data set should be followed by a blank line.</p>