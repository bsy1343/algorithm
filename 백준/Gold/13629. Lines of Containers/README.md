# [Gold I] Lines of Containers - 13629

[문제 링크](https://www.acmicpc.net/problem/13629)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 32, 맞힌 사람: 28, 정답 비율: 70.000%

### 분류

수학, 정렬, 순열 사이클 분할

### 문제 설명

<p>A shipment of Nlogs, the main export product from Nlogonia, is in the harbour, in containers, ready to be shipped. All containers have the same dimensions and all of them are cubes. Containers are organized in the cargo terminal in L lines and C columns, for a total of LC containers. Each container is marked with a distinct identification number, from 1 to LC.</p>

<p>Each one of the L container lines will be loaded in a different ship. To make it simpler when unloading at each destination country, containers from a line must be organized such that the identifiers are in sequential order. More precisely, the first line must have the containers identified from 1 to C in increasing order, line 2 must have containers numbered from C + 1 to 2C (in increasing order), and so on until the last line. which will have containers numbered (L&minus;1)C + 1 to LC (again, in increasing order). Figure (a) shows the organization of a shipment with 5 lines and 4 columns of containers.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13629.%E2%80%85Lines%E2%80%85of%E2%80%85Containers/2179a50e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13629.%E2%80%85Lines%E2%80%85of%E2%80%85Containers/2179a50e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13629/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%208.48.10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:166px; width:500px" /></p>

<p>A crane is able to move either a full line or a full column of containers. It cannot move other groupments or individual containers.</p>

<p>In night before the loading, a group of workers operated the cranes to swap shipment lines and columns as a way of protest because of low salaries. Figure (b) shows the configuration after swapping lines 1 and 4; Figure (c) shows the configuration after another swap, this time between colummns 2 and 3.</p>

<p>The loading must be done today, but before starting the containers must be reorganized as described previously. You must write a program which, given the information about the position of every container after the protest, determines whether you can reposition the containers in such way that every one of them is in its expected positions, using only cranes. If repositioning is possible, you must also calculate the smallest number of column and line swaps needed to do it.</p>

### 입력

<p>The first line of input contains two integers L and C which describe, respectively, the number of lines and columns of the shipment. The next L lines show the configuration of the containers after the workers protest. Each of these L lines will have C integers X<sub>l,c</sub>, indicating the position of a container. Every integer between 1 and LC appears exactly once in the input.</p>

<p>Restrictions</p>

<ul>
	<li>1 &le; L &le; 300</li>
	<li>1 &le; C &le; 300</li>
	<li>1 &le; X<sub>l,c</sub> &le; LC</li>
</ul>

### 출력

<p>Your program must produce a single line, containing a single integer, the minimum number of column and line swaps needed to place the containers in their original positions. If there is no way to place&nbsp;the containers in their original positions using only cranes, the line must contain only the character &lsquo;*&rsquo;.</p>