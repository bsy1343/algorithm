# [Platinum II] A Broken Door - 4954

[문제 링크](https://www.acmicpc.net/problem/4954)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 11, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

0-1 너비 우선 탐색, 너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 구현, 매개 변수 탐색, 최단 경로

### 문제 설명

<p>There is a rectangular maze consisting of a number of square rooms arranged in grid. The maze is surrounded by walls except for its entry and exit. The entry to the maze is at the leftmost part of the upper side of the rectangular area, that is, the upper side of the uppermost leftmost room of the maze is open. The exit is located at the rightmost part of the lower side, likewise.</p>

<p>There is a wall between each pair of vertically or horizontally adjacent rooms. Such a wall has either a door with a card key lock, or no door at all. If you insert a card to a door, the door opens and you can pass the door. The opened door will close immediately, and the inserted card won&#39;t return. You can open any door with any card. You cannot go through a wall that has no door.</p>

<p>When a maze map is given, you can easily determine how many cards are needed to pass through the maze from the entry to the exit. In the maze in Figure G-1, you can pass through it with ten cards, following the path represented by the green arrows (<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/0c7272a7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-green-arrow.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:9px; width:19px" />) in Figure G-2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/964018a1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:183px" /></p>

<p style="text-align: center;">Figure G-1: A map of a maze</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/7a4cd9c5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:183px" /></p>

<p style="text-align: center;">Figure G-2: One of the shortest paths</p>

<p>Now, you are informed that one of the doors is broken and can&#39;t be passed. But you don&#39;t know which door is broken. If you insert a card to a broken door, the inserted card immediately returns. However, you can&#39;t tell a broken door from a working door just by its appearance.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/6ab74b04.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:183px" /></p>

<p style="text-align: center;">Figure G-3: A maze that potentially can&#39;t be passed through</p>

<p>If the door marked with a red X (<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/c1c7403e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-red-X.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:15px; width:15px" />) in Figure G-3 is broken, you have no way to pass through the maze from the entry to the exit. However, you can pass the maze in Figure G-1 whichever door is broken. When you intend to follow the shortest path in Figure G-2, and find that the door marked with a red X in Figure G-4 is broken, you might follow the path represented as green arrows. In this case, you need twenty cards.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/367a1cea.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:183px" /></p>

<p style="text-align: center;">Figure G-4: A maze with a broken door</p>

<p>However, you can pass through the maze with less cards. You should follow the path in Figure G-5, until you find the broken door. The path is not the shortest path because it needs twelve cards at least. After you&#39;ve found a broken door on the path, you should follow the shortest path to the exit that doesn&#39;t use the broken door. With this strategy, you can pass the maze with sixteen cards whichever door is broken. Figure G-6 shows one of the worst cases of this strategy; it needs sixteen cards.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/c9ab9d7b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:183px" /></p>

<p style="text-align: center;">Figure G-5: The path before you find the broken door</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4954.%E2%80%85A%E2%80%85Broken%E2%80%85Door/959ef28d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4954/G-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:183px" /></p>

<p style="text-align: center;">Figure G-6: One of the worst cases of the strategy</p>

<p>You are requested to write a program that prints the minimum number of cards to pass the maze whichever door is broken.</p>

### 입력

<p>The input consists of one or more datasets, each of which represents a maze. The number of datasets is no more than 100.</p>

<p>The first line of a dataset contains two integer numbers, the height h and the width w of the rectangular maze, in this order. You may assume that 2 &le; h, w &le; 30. The following 2 &times; h &minus; 1 lines of a dataset describe whether there are doors between rooms or not. The first line starts with a space and the rest of the line contains w &minus; 1 integers, 1 or 0, separated by a space. These indicate whether doors connect horizontally adjoining rooms in the first row. An integer 0 indicates a door is placed, and 1 indicates no door is there. The second line starts without a space and contains w integers, 1 or 0, separated by a space. These indicate whether doors connect vertically adjoining rooms in the first and the second rows. An integer 0/1 indicates a door is placed or not. The following lines indicate placing of doors between horizontally and vertically adjoining rooms, alternately, in the same manner.</p>

<p>The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each dataset, output a line having an integer indicating the minimum number of cards needed. If there exists no path to pass through the maze when a certain door is broken, output a line containing &minus;1. The line should not contain any character other than this number.</p>