# [Gold II] Maze - 6334

[문제 링크](https://www.acmicpc.net/problem/6334)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>By filling a rectangle with slashes (/) and backslashes (\), you can generate nice little mazes. Here is an example:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6334.%E2%80%85Maze/cfbf1e70.png" data-original-src="https://www.acmicpc.net/upload/images2/maze.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:173px; width:246px" /></p>

<p>As you can see, paths in the maze cannot branch, so the whole maze only contains cyclic paths and paths entering somewhere and leaving somewhere else. We are only interested in the cycles. In our example, there are two of them.&nbsp;</p>

<p>Your task is to write a program that counts the cycles and finds the length of the longest one. The length is defined as the number of small squares the cycle consists of (the ones bordered by gray lines in the picture). In this example, the long cycle has length 16 and the short one length 4.&nbsp;</p>

### 입력

<p>The input contains several maze descriptions. Each description begins with one line containing two integers w and h (1 &le; w,h &le; 75), the width and the height of the maze. The next h lines represent the maze itself, and contain w characters each; all these characters will be either &quot;/&quot; or &quot;\&quot;.&nbsp;</p>

<p>The input is terminated by a test case beginning with w = h = 0. This case should not be processed.</p>

### 출력

<p>For each maze, first output the line &quot;Maze #n:&quot;, where n is the number of the maze. Then, output the line &quot;k Cycles; the longest has length l.&quot;, where k is the number of cycles in the maze and l the length of the longest of the cycles. If the maze does not contain any cycles, output the line &quot;There are no cycles.&quot;.&nbsp;</p>

<p>Output a blank line after each test case.</p>