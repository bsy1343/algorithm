# [Platinum II] Skyscraper Floors - 3491

[문제 링크](https://www.acmicpc.net/problem/3491)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 142, 정답: 21, 맞힌 사람: 13, 정답 비율: 10.000%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 너비 우선 탐색, 깊이 우선 탐색, 중국인의 나머지 정리, 확장 유클리드 호제법

### 문제 설명

<p>What a great idea it is to build skyscrapers! Using not too large area of land, which is very expensive in many cities today, the skyscrapers offer an extremely large utility area for flats or offices. The only disadvantage is that it takes too long to get to the upper floors. Of course these skyscrapers have to be equiped not only with a stairway but also with several elevators. But even using ordinary elevators is very slow. Just imagine you want to get from the very top floor to the base floor and many other people on other floors want the same. As a result the elevator stops on almost every floor and since its capacity is limited and the elevator is already full from the upper floors, most stops are useless and just cause a delay. If there are more elevators in the skyscrapers, this problem is a little bit eliminated but still not completely. Most people just press all the buttons of all the elevators and then take the first one so that all elevators will stop on the floor anyway.</p>

<p>However, the solution exists as we shall see. The Antique Comedians of Midilesia headquarters reside in a skyscraper with a very special elevator system. The elevators do not stop on every floor but only on every&nbsp;<var>X</var>-th floor. Moreover each elevator can go just to a certain floor&nbsp;<var>Y</var>&nbsp;(called starting floor) and cannot go any lower. There is one high-capacity elevator which can stop on every elevator&#39;s starting floor.</p>

<p>The ACM has a big problem. The headquarters should be moved to another office this week, possibly on a different floor. Unfortunately, the high-capacity elevator is out of order right now so it is not always possible to go to the base floor. One piece of furniture cannot be moved using the stairway because it is too large to pass through the stairway door. You are to write a program that decides whether it is possible to move a piece of furniture from the original office to the other.</p>

### 입력

<p>The input consists of&nbsp;<var>N</var>&nbsp;cases. The first line contains only one positive integer&nbsp;<var>N</var>. Then follow the cases. Each case starts with a line containing four integers&nbsp;<var>F</var>,&nbsp;<var>E</var>,&nbsp;<var>A</var>,&nbsp;<var>B</var>, where&nbsp;<var>F</var>,&nbsp;<var>1 &lt;= F &lt; 50000000</var>&nbsp;determines the number of floors in the skyscraper (this means that there are floors<var>0</var>&nbsp;to&nbsp;<var>F-1</var>),&nbsp;<var>E</var>,&nbsp;<var>0 &lt; E &lt; 100</var>&nbsp;is the number of elevators and&nbsp;<var>A</var>,&nbsp;<var>B</var>,&nbsp;<var>0 &lt;= A,B &lt; F</var>&nbsp;are numbers of the two floors between which the piece of furniture should be moved. Then follow&nbsp;<var>E</var>&nbsp;lines. Each of them contains description of one elevator. There are exactly two integers&nbsp;<var>X</var>&nbsp;and&nbsp;<var>Y</var>,&nbsp;<var>X &gt; 0</var>,&nbsp;<var>Y &gt;= 0</var>&nbsp;at each line.&nbsp;<var>Y</var>&nbsp;determines, that the elevator starts on the&nbsp;<var>Y</var>-th floor and&nbsp;<var>X</var>determines, that it stops on every&nbsp;<var>X</var>-th floor, eg. for&nbsp;<var>X = 3</var>,&nbsp;<var>Y = 7</var>&nbsp;the elevator stops on floors 7, 10, 13, 16, etc.).</p>

### 출력

<p>For each case, print exactly one line. If floor&nbsp;<var>B</var>&nbsp;is reachable from floor&nbsp;<var>A</var>&nbsp;not using the stairway, print the sentence &#39;<code>It is possible to move the furniture.</code>&#39;, otherwise print &#39;<code>The furniture cannot be moved.</code>&#39;.</p>