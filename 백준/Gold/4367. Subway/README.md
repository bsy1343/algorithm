# [Gold IV] Subway - 4367

[문제 링크](https://www.acmicpc.net/problem/4367)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 15, 정답 비율: 57.692%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>You have just moved from a quiet Waterloo neighbourhood to a big, noisy city. Instead of getting to ride your bike to school every day, you now get to walk and take the subway. Because you don&#39;t want to be late for class, you want to know how long it will take you to get to school.</p>

<p>You walk at a speed of 10 km/h. The subway travels at 40 km/h. Assume that you are lucky, and whenever you arrive at a subway station, a train is there that you can board immediately. You may get on and off the subway any number of times, and you may switch between different subway lines if you wish. All subway lines go in both directions.</p>

<p>&nbsp;</p>

### 입력

<p>Input consists of the x,y coordinates of your home and your school, followed by specifications of several subway lines. Each subway line consists of the non-negative integer x,y coordinates of each stop on the line, in order. You may assume the subway runs in a straight line between adjacent stops, and the coordinates represent an integral number of metres. Each line has at least two stops. The end of each subway line is followed by the dummy coordinate pair -1,-1. In total there are at most 200 subway stops in the city.</p>

### 출력

<p>Output is the number of minutes it will take you to get to school, rounded to the nearest minute, taking the fastest route.</p>