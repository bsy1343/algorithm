# [Gold I] Sort the Panels - 13828

[문제 링크](https://www.acmicpc.net/problem/13828)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>There was an explorer Henry Nelson traveling all over the world. One day he reached an ancient building. He decided to enter this building for his interest, but its entrance seemed to be locked by a strange security system.</p>

<p>There were some black and white panels placed on a line at equal intervals in front of the entrance, and a strange machine with a cryptogram attached. After a while, he managed to read this cryptogram: this entrance would be unlocked when the panels were rearranged in a certain order, and he needed to use this special machine to change the order of panels.</p>

<p>All he could do with this machine was to swap arbitrary pairs of panels. Each swap could be performed by the following steps:</p>

<ul>
	<li>move the machine to one panel and mark it;</li>
	<li>move the machine to another panel and again mark it; then</li>
	<li>turn on a special switch of the machine to have the two marked panels swapped.</li>
</ul>

<p>It was impossible to have more than two panels marked simultaneously. The marks would be erased every time the panels are swapped.</p>

<p>He had to change the order of panels by a number of swaps to enter the building. Unfortunately, however, the machine was so heavy that he didn&rsquo;t want to move it more than needed. Then which steps could be the best?</p>

<p>Your task is to write a program that finds the minimum cost needed to rearrange the panels, where moving the machine between adjacent panels is defined to require the cost of one. You can arbitrarily choose the initial position of the machine, and don&rsquo;t have to count the cost for moving the machine to that position.</p>

### 입력

<p>The input consists of multiple datasets.</p>

<p>Each dataset consists of three lines. The first line contains an integer N, which indicates the number of panels (2 &le; N &le; 16). The second and third lines contain N characters each, and describe the initial and final orders of the panels respectively. Each character in these&nbsp;descriptions is either &lsquo;B&rsquo; (for black) or &lsquo;W&rsquo; (for white) and denotes the color of the panel. The panels of the same color should not be distinguished.</p>

<p>The input is terminated by a line with a single zero.</p>

### 출력

<p>For each dataset, output the minimum cost on a line. You can assume that there is at least one way to change the order of the panels from the initial one to the final one.</p>