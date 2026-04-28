# [Silver III] UHODE - 3237

[문제 링크](https://www.acmicpc.net/problem/3237)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 25, 맞힌 사람: 24, 정답 비율: 33.333%

### 분류

구현, 자료 구조, 집합과 맵, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<p>Luka wasn&#39;t able to come to National Competition ten days earlier in order to get some hints by eavesdropping on the The Task Makers&#39; conversations. Fortunately for him, he knows that The Task Makers take daily walks through the town of Cres, during which they quietly discuss about the tasks. So, he decided to put his spy network (consisting of his relatives and good friends) in motion.</p>

<p>Curiously, the city of Cres is built in such a fasion, that it can be represented as a planar coordinate grid. The Task Makers start their walks at point (0,0), and in every turn they move on the coordinate plain in one of the four directions: right(they increase their x coordinate by one), up(they increase their y coordinate by one), left or down. Luka&#39;s spies are positioned on various (fixed) coordinates on the coordinate plain, and they can overhear bits of information if and only if they are located on the same position as the task masters or one of the other eight adjacent positions. To more easily keep track of his spies and to confuse his opponents Luka decided to mark all his spies with an unique number, in such a way that the first spy gets the number 1, the second the number 2, etc.</p>

<p>Your task is to write a program that will find out which spies have heard the conversation and output their numbers.</p>

### 입력

<p>In the first line of the input file is an integer N, 1 &le; N &le; 1000, the number of spies. In every of the following N lines are two integers, X and Y separated by exactly one space, -10000 &le; X,Y &le; 10000, the positions of the spies.</p>

<p>In the next line is an integer K, 1 &le; K &le; 100,000. The following line holds K charachters that show us the route that The Task Makers were taking that day. Those charachters will be either &#39;I&#39; - east (or right), &#39;S&#39; - north (or up), &#39;Z&#39; - west (or left) or &#39;J&#39;-south (or down).</p>

### 출력

<p>In the output file you have to write the numbers of the spies that have successfully overheard The Task Masters. The numbers have be outputted in a strictly ascending order, and each one of them has to be in a separate line.</p>

<p>If no spies were able to hear The Task Masters, in the first and only line of the output file you have to write &#39;-1&#39;.</p>