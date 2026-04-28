# [Silver I] Globetrotter - 6596

[문제 링크](https://www.acmicpc.net/problem/6596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>As a member of an ACM programming team you&#39;ll soon find yourself always traveling around the world: Z&uuml;rich, Philadelphia, San Jos&eacute;, Atlanta,... from 1999 on the Contest Finals even will be on a different continent each year, so one day you might get to Japan or Australia.&nbsp;</p>

<p>At the contest site it would be interesting to know how many miles you are away from home. For this sake, your job is to write a program to compute the geographical distance between two given locations on the Earth&#39;s surface.&nbsp;</p>

<p>We assume that the Earth is a perfect sphere with a radius of exactly 6378 km. The geographical distance between A and B is the length of the geodetic line segment connecting A and B.&nbsp;</p>

<p>The geodetic line segment between two points on a sphere is the shortest connecting curve lying entirely in the surface of the sphere.&nbsp;</p>

<p>The value of pi is approximately 3.141592653589793.</p>

### 입력

<p>The input file will consist of two parts: a list of cities and a list of queries.</p>

<p>City List</p>

<ul>
	<li>The city list consists of up to 100 lines, one line per city. Each line will contain a string ci and two real numbers lati and longi, representing the city name, its latitude and its longitude, respectively.&nbsp;</li>
	<li>The city name will be shorter than 30 characters and will not contain white-space characters.&nbsp;</li>
	<li>The latitude will be between -90 (South Pole) and +90 (North Pole). The longitude will be between -180 and +180 where negative numbers denote locations west of the meridian and positive numbers denote locations east of the meridian. (The meridian passes through Greenwich, London.)&nbsp;</li>
	<li>The city list will be terminated by a line consisting of a single &quot;#&quot;.</li>
</ul>

<p>Query List</p>

<ul>
	<li>Each line will contain two city names A and B.&nbsp;</li>
	<li>The query list will be terminated by the line &quot;# #&quot;.</li>
</ul>

### 출력

<p>For each query, print a line saying &quot;A - B&quot; where A and B are replaced by the city names. Then print a line saying x km&quot; where x is replaced by the geographical distance (in km) between the two cities, rounded to the nearest integer.</p>

<p>If one of the cities in the query didn&#39;t occur in the city list, print a line saying &quot;Unknown&quot; instead. Print a blank line after each query.</p>