# [Platinum I] Slalom - 3861

[문제 링크](https://www.acmicpc.net/problem/3861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 11, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3861.%E2%80%85Slalom/f8e6aa33.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3861.%E2%80%85Slalom/f8e6aa33.png" data-original-src="https://www.acmicpc.net/upload/images2/slalom.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:275px; width:228px" /></p>

<p>In spite of the scarcity of snowfall in Madrid, interest in winter sports is growing in the city, especially with regard to skiing. Many people spend several weekends or even full weeks improving their skills in the mountains.</p>

<p>In this problem we deal with only one of the multiple alpine skiing disciplines: slalom. A course is constructed by laying out a series of gates, which are formed by two poles. The skier must pass between the two poles forming each gate. The winner is the skier who takes the least time to complete the course while not missing any of the gates.</p>

<p>You have recently started to learn to ski, but you have already set yourself the goal of taking part in the Winter Olympic Games of 2018, for which Madrid will presumably present a candidature. As part of the theoretical training, you need to write a program that calculates, given a starting point and a series of gates, the minimum-length path starting from the point given and passing through each gate until you reach the last one, which is the finish line. You may assume that the gates are horizontal and are ordered from highest to lowest, so that you need to pass through them in order. You consider yourself an accomplished skier, so you can make any series of turns, no matter how difficult, and your only concern is minimizing the total length of the path.</p>

### 입력

<p>The first line of each case gives the number of gates n (1 &le; n &le; 1 000). The next line contains two floating point numbers, the Cartesian coordinates x and y of the starting position, in that order. Next come n lines with three floating point numbers each, y x1 x2, meaning that the next gate is a horizontal line from (x1, y) to (x2, y). You can safely assume that x1 &lt; x2. The values of y are strictly decreasing and are always smaller than that of the starting position. The last gate represents the finish line. All coordinates are between &minus;500 000 and 500 000, inclusive. A value of 0 for n means the end of the input. A blank line follows each case.</p>

### 출력

<p>For each test case, output a line with the minimum distance needed to reach the finish line. Your answer should be accurate to within an absolute or relative error of 10<sup>&minus;7</sup>.</p>