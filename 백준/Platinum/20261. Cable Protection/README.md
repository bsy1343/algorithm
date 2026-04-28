# [Platinum IV] Cable Protection - 20261

[문제 링크](https://www.acmicpc.net/problem/20261)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 26, 맞힌 사람: 24, 정답 비율: 58.537%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>A company ICPC (International Cable Protection Company) produces a cable protection tool that can be installed in a network switch to monitor whether all cable links connected to it are working properly. Because the protection tool would cause transmission delay, it is not suitable for installation on every switch.</p>

<p>Usually network topology consists of two parts: a backbone and several subnets. The switches on the backbone are linked as a ring structure and each backbone switch is treated as a root of a subnet in which the switches are linked as a tree structure. We call such topology as unicyclic topology. Figure 2 shows an example of a unicyclic topology.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20261.%E2%80%85Cable%E2%80%85Protection/2d07672c.png" data-original-src="https://upload.acmicpc.net/6087a323-2150-4d8b-b7d1-67443ded3c65/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 453px; height: 201px;" /></p>

<p style="text-align: center;">Figure 2: An example of uncyclic topology.</p>

<p>Suppose there are n backbone switches and m subnet switches. The switches are numbered by integers from 0 to m + n &minus; 1. Backbone switches are numbered from 0 to n &minus; 1 in clockwise order and the subnet switches are numbered from n to n + m &minus; 1 where the index of each subnet switch is larger than the index of its parent in the rooted tree structure of the subnet it belongs. Figure 3 shows an example of switch numbering.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20261.%E2%80%85Cable%E2%80%85Protection/1564e4d6.png" data-original-src="https://upload.acmicpc.net/447c5273-4480-4cde-a326-0b6b3022993e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 448px; height: 212px;" /></p>

<p style="text-align: center;">Figure 3: An example of switch numbering.</p>

<p>Please write a program for ICPC to decide the minimum number of switches selected for installing cable protection tools that can monitor all the cable links. Figure 4 shows an optimum solution (circled by ellipses) for the given network.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20261.%E2%80%85Cable%E2%80%85Protection/a5e4b47c.png" data-original-src="https://upload.acmicpc.net/5ff9f730-c3c1-40a5-ab24-ff82605253ce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 446px; height: 214px;" /></p>

<p style="text-align: center;">Figure 4: An optimum solution for the given network.</p>

### 입력

<p>The first line of the input file contains two integers n and m, separated by a space, indicating the numbers of backbone switches and subnet switches respectively. Each of the next n+m lines consists of two integers, separated by a space, indicating the indices of the two end switches of a link.</p>

### 출력

<p>Output the minimum number of switches selected for installing cable protection tools that can monitor all the cable links.</p>

### 제한

<ul>
	<li>3 &le; n &le; 100000</li>
	<li>1 &le; m &le; 100000</li>
</ul>