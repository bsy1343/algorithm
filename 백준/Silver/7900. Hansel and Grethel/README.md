# [Silver I] Hansel and Grethel - 7900

[문제 링크](https://www.acmicpc.net/problem/7900)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 25, 맞힌 사람: 22, 정답 비율: 81.481%

### 분류

기하학

### 문제 설명

<p>On a warm summer afternoon, Hansel and Grethel are walking together in the fields. It is getting late and, to be honest, they are lost. Grethel is a little scared, still vividly remembering the last time they got lost in the forest. That time, an evil witch had locked them inside a house built of gingerbread and sugar! But Hansel can reassure her: this time they are well prepared. Hansel has taken a map and a compass with him!</p>

<p>Hansel picks two clearly outstanding features in the landscape, and uses the compass to measure the direction towards both objects. Grethel locates the objects on the map, and writes down the corresponding map coordinates. Based on this information, they will be able to accurately determine their own position on the map.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7900/1.png" style="height:391px; width:401px" /></p>

<p>The coordinates of two marker objects, and the direction (angle from the North) towards these objects are known. Write a program which uses this data to calculate the coordinates of Hansel and Grethel&rsquo;s current location.</p>

### 입력

<p>The first line of the input contains one positive number: the number of situations in which a position must be determined. Following are two lines per situation, describing the two marker objects. Each marker object is described by a line containing three integer numbers:</p>

<ul>
	<li>the x-coordinate of the object on the map (0 &le; x &le; 100); the x-axis runs West-to-East on the map, with increasing values towards the East.</li>
	<li>the y-coordinate of the object on the map (0 &le; y &le; 100); the y-axis runs South-to-North on the map, with increasing values towards the North.</li>
	<li>the direction d of the object in degrees (0 &le; d &le; 360); with 0&deg; = North, 90&deg; = East, 180&deg; = South, and so on.</li>
</ul>

<p>To keep the position calculations accurate, Hansel makes sure that the directions of the two objects are not exactly equal, and do not differ by exactly 180&deg;.</p>

### 출력

<p>One line per situation, containing the result of the position calculation: two numbers, separated by a space, each having exactly 4 digits after the decimal point. These numbers represent the x and y coordinates of the position of Hansel and Grethel (0 &le; x, y &le; 100). Round the numbers as usual: up if the next digit would be &ge; 5, down otherwise.</p>