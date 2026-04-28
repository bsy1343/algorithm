# [Bronze II] LUKA - 3234

[문제 링크](https://www.acmicpc.net/problem/3234)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 299, 정답: 224, 맞힌 사람: 184, 정답 비율: 80.000%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>Luka came to National Competition ten days earlier in order to get some hints by eavesdropping on the The Task Makers&#39; conversations. He knows that The Task Makers take daily walks through the town of Cres, during which they quietly discuss about the tasks.</p>

<p>Curiously, the city of Cres is built in such a fashion, that it can be represented as a planar coordinate grid. The Task Makers start their walks at point (0,0), and in every turn they move on the coordinate plain in one of the four directions: right (they increase their x coordinate by one), up (they increase their y coordinate by one), left or down.</p>

<p>Luka is positioned at point (X,Y) on the coordinate plain, and he can overhear bits of information only at times The Task Makers are located on the same position as Luka or one of the other eight adjacent positions.</p>

<p>Your task is to write a program that will find out the time on which Luka has heard the conversation.&nbsp;</p>

### 입력

<p>The first line of the input file consists of two inegers X and Y, -10000 &le; X,Y &le; 10000, Luka&#39;s position.</p>

<p>In the next line is an integer K, 1 &le; K &le; 100,000.</p>

<p>The following line holds K charachters that show us the route that The Task Makers were taking that day. Those charachters will be either &#39;I&#39; - east (or right), &#39;S&#39; - north (or up), &#39;Z&#39; - west (or left) or &#39;J&#39;-south (or down).</p>

### 출력

<p>In the output file you have to write the times from the Task text. The numbers have be outputted in a strictly ascending order, and each one of them has to be in a separate line.</p>

<p>If Luka wasn&#39;t able to overhear the taskmasters, in the first and only line of the output file you have to write &#39;-1&#39;.</p>