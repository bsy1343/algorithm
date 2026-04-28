# [Gold II] Cijanobakterije - 23850

[문제 링크](https://www.acmicpc.net/problem/23850)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 28, 맞힌 사람: 28, 정답 비율: 75.676%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리의 지름

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23850.%E2%80%85Cijanobakterije/809d5e6a.png" data-original-src="https://upload.acmicpc.net/f880d6fa-259c-4b83-9d13-08c83d63caf8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 153px; float: right;" />Young microbiologist Maja is making a microscopic Christmas tree out of a species of cyanobacteria called <em>Stigonema arboreus</em>. This species is known for its colonies made from individual cells which link together, forming a tree graph. More precisely, for each pair of cyanobacteria in the colony, there is a unique path through the colony from one cyanobacterium to the other.</p>

<p>Maja wants her Christmas tree colony to contain a chain of cyanobacteria that is as long as possible. A chain is determined by a sequence of cyanobacteria, where each cyanobacterium appears at most once, and every pair of adjacent cyanobacteria are directly linked together. Because none of the colonies she currently has is long enough, Maja will have to connect some of the colonies together. She does this by repeatedly choosing two cyanobacteria from different colonies, bringing them close to each other, and joining them with superglue. Since the bacteria are sensitive to cycles, Maja has to be careful not to join two bacteria from the same colony at any time. Using a series of such gluing procedures, Maja wants to obtain a colony which contains the longest possible chain.</p>

<p>Maja is tired from using her microscope, and there a lot of cyanobacteria. Help Maja determine the length of the longest chain of cyanobacteria she could obtain by connecting the colonies. The length of a chain is determined by the number of cyanobacteria from which it is formed.</p>

### 입력

<p>The first line contains positive integers $n$ and $m$ ($1 &le; n &le; 100\,000$, $0 &le; m &lt; n$), the number of cyanobacteria and the number of direct connections between them.</p>

<p>The following $m$ lines contain a pair of positive integers $a_i$, $b_i$ ($1 &le; a_i, b_i &le; n$) which denote that the bacteria $a_i$ and&nbsp;$b_i$ are directly linked. No bacterium is directly linked to itself, and no connection will be listed more than once.</p>

<p>The connections are such that the bacteria form some colonies, each of which is a tree.</p>

### 출력

<p>In the only line print the largest possible length of a chain in the final colony.</p>

### 힌트

<p>Clarification of the second example: In the second example there are two colonies of cyanobacteria. In the first colony, all cyanobacteria are directly connected to cyanobacterium 1, and in the second with cyanobacterium 5. If any two cyanobacteria except 1 and except 5 are connected, the resulting colony will contain the longest possible chain. Eg. if 2 and 6 are connected, one such chain will be 3 - 1 - 2 - 6 - 5 - 7 which has length 6.</p>