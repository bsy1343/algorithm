# [Gold I] PLANKS - 4878

[문제 링크](https://www.acmicpc.net/problem/4878)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Build a bridge over a swamp by connecting tree stumps with planks.</p>

<p>You are being chased by cannibals and you must figure out a way to get across a crocodile-infested swamp. The swap contains tree stumps which are thankfully spaced on a regular, 10x10, grid, where each grid point is 1 foot apart. In addition, there are thankfully some planks nearby that can be placed across the tree stumps. The tree stump at the upper left corner of the grid is on land, as is the tree stump on the opposite bank of the swamp at the lower right. You must figure out a layout of the planks that will get you across the swamp. Each plank can only be used once and must start and end on a tree stump (with no stumps in-between). In addition, the planks must follow the grid horizontally or vertically -- no diagonally placed planks are allowed. This scenario is illustrated by the following figure.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4878.%E2%80%85PLANKS/d3b6313f.png" data-original-src="https://upload.acmicpc.net/b1b97979-d4dc-4dd2-a4fc-abc78462bd08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>A given problem may have more than one solution, but you are required to find only one solution. Your solution does not have to be the most efficient, and you can use any combination of the planks. A valid solution can contain planks that cross over each other.</p>

### 입력

<p>The input file contains one or more problems for a given swamp. The swamp is defined as a 10 by 10 grid of characters. Each period (&quot;.&quot;) represents open space and each asterik (&quot;*&quot;) represents a stump. Each plank problem is defined on one input line after the swamp definition. The first number on the line is the number of planks available (max of 20). The remaining numbers are the lengths of the available planks. Each plank is assigned a number based on its order in the list. For example, in line 11, plank 1 is 9 ft long, plank 2 is 9 ft long, plank 3 is 5 ft long, and plank 4 is 8 ft long.</p>

### 출력

<p>Other than the standard header and trailer messages, each line of the output file contains the placement of one plank to a specific stump, as shown in the sample output below. (Use the exact same wording and formating for your output file.) The plank order given by the output file should take you from stump (1,1) to stump (10,10). If no solution is possible with the specified planks, print &quot;<i>no solution possible</i>.&quot; Print a single blank line after each problem solution.</p>