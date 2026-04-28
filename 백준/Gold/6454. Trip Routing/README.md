# [Gold II] Trip Routing - 6454

[문제 링크](https://www.acmicpc.net/problem/6454)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 11, 맞힌 사람: 9, 정답 비율: 14.062%

### 분류

자료 구조, 데이크스트라, 플로이드–워셜, 그래프 이론, 해시를 사용한 집합과 맵, 구현, 파싱, 최단 경로, 문자열, 집합과 맵

### 문제 설명

<p>Your employer, the California Car Club (CCC), has decided to provide a trip routing service to its members. Your job is to write a program which reads a list of departure point-destination point pairs and calculates the shortest routes between them. For each trip, your program will print a report which itemises the names of each city passed through, with route names and leg distances.</p>

### 입력

<p>Input to your program will be in two parts. The first part is a map in the form of a list of highway segments. Each segment is designated by a line containing four fields which are separated by commas. The first two fields are 1--20 characters each, and are the names of the cities which are at each end of the highway segment. The third field is the 1--10 character name of the route. The fourth field is the number of miles between the two endpoints, expressed as a positive integer. The highway segment list will be terminated by an empty line.</p>

<p>The second part of the input is a list of departure point-destination point pairs, one per line. The departure point is given first, followed by a comma and the destination point. Each of the cities is guaranteed to have appeared in the first part of the input data, and there will be a path that connects them. The list is terminated by the end of file.</p>

### 출력

<p>The output should be a series of reports, one for each departurepoint-destination point pair in the input. Each report should be inexactly the same form as those in the example below.There should be two blank linesbefore each report.</p>

<p>There will be no extraneous blanks in the input. There will be no more than 100 cities in the map and no more than 200 highwaysegments. The total distance in each best route is guaranteed to fit within a 16-bit integer.</p>