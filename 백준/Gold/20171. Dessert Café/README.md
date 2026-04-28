# [Gold II] Dessert Café - 20171

[문제 링크](https://www.acmicpc.net/problem/20171)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 725, 정답: 303, 맞힌 사람: 239, 정답 비율: 47.047%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Kim, who wishes to start a business, is trying to open a dessert cafe he has been preparing after graduating from college. The road network in the town where Kim lives forms a tree structure, that is, a connected acyclic graph as shown in the figure below. There are <em>n</em> candidate sites for a dessert caf&eacute; in the town. In the figure below, a circle represents a candidate site for a dessert caf&eacute;, a line segment between two candidate sites represents a road, and the value labeled on a line segment represents the length of a road.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20171.%E2%80%85Dessert%E2%80%85Caf%C3%A9/b76965b7.png" data-original-src="https://upload.acmicpc.net/ebc531ee-2918-4810-a999-baf35b1f0565/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 215px; height: 178px;" /></p>

<p>There are <em>k</em> apartment complexes in this town, so he wants his dessert caf&eacute; to be located as close as possible to an apartment complex. In above figure, there are three apartment complexes which are located to the candidate sites labeled by A, B, and C. Considering the competitiveness and profitability, he thinks that a candidate site satisfying the following condition is a good place.</p>

<p>Let <em>d</em>(<em>x</em>, <em>y</em>) be the length of the shortest path on a road network between two candidate sites <em>x</em> and <em>y</em>. A candidate site <em>p</em> is a good place if there exists a candidate site <em>z</em> where an apartment complex is located such that <em>d</em>(<em>p</em>, <em>z</em>) &lt; <em>d</em>(<em>q</em>, <em>z</em>) for each candidate site <em>q</em> (&ne; <em>p</em>).</p>

<p>In above figure, candidate sites 2, 4, 5, 6, 8, and 9 are good places. More specifically, for example, candidate 6 is a good place because it is closer to apartment complex B than any other candidate sites except for candidate 5, and is closer to apartment complex A than candidate 5. That is, there exists apartment complex B on candidate 5 satisfying <em>d</em>(6, 5) &lt; <em>d</em>(<em>q</em>, 5) for <em>q</em> &isin; {1, 2, 3, 4, 7, 8, 9}, and there exists apartment complex A on candidate 2 satisfying <em>d</em>(6, 2) &lt; <em>d</em>(5, 2). Candidate 7 is not a good place because none of apartment complexes are closer than candidate 6.</p>

<p>Given the information on candidate sites and apartment complexes in the town, write a program to output the number of good places.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers, <em>n</em> and <em>k</em> (3 &le; <em>n</em> &le; 100,000 , 1 &le; <em>k</em> &le; <em>n</em>), where <em>n</em> is the number of candidate sites and <em>k</em> is the number of apartment complexes. The candidate sites are numbered from 1 to <em>n</em>. In the following <em>n</em> &minus; 1 lines, each line contains three integers, <em>i</em>, <em>j</em>, and <em>w</em> (1 &le; <em>i</em>,<em>j</em> &le; <em>n</em>, 1 &le;&nbsp;<em>w</em> &le; 1,000), where <em>i</em> and <em>j</em> are candidate sites and <em>w</em> is the length of the road between <em>i</em> and <em>j</em>. The last line contains <em>k</em> integers which represent the locations of apartment complexes in the town.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the number of good places.</p>