# [Platinum III] Cars - 17886

[문제 링크](https://www.acmicpc.net/problem/17886)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 4, 정답 비율: 20.000%

### 분류

기하학, 많은 조건 분기, 선분 교차 판정, 물리학

### 문제 설명

<p>You work as an engineer at the leading self-driving car company Wayber. Wayber just got approval from the government of Sweden for their cars to drive in the streets of Stockholm. Unfortunately, all your tests so far have been with one car at a time on a closed dirt track. You are not really prepared for what will happen when two of the cars encounter each other in the city, and want to write some code to handle this.</p>

<p>The cars are already good at staying inside the lines and turning. However, they are not very good at detecting other moving vehicles. Fortunately, the government of Sweden is so enthusiastic about self-driving cars that they have banned all other forms of transportation in Stockholm, including human-driven cars, biking, and walking. If you can just detect whether two cars will collide you will be able to build a safe system.</p>

<p>You know that all cities consist of only north-south and east-west oriented streets in a perfect grid, and all cars are perfect rectangular prisms. When detecting collisions you only need to worry about cars traveling at a constant speed without turning.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17886.%E2%80%85Cars/bb63d467.png" data-original-src="https://upload.acmicpc.net/9247b337-d8ee-4dda-81d6-38f6a463e220/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 210px; height: 157px;" /></p>

<p style="text-align: center;">Figure B.1: Illustration of Sample Input 1.</p>

### 입력

<p>The first line of input contains an integer 1 &le; t &le; 10<sup>4</sup>, the duration in seconds of the trajectory of the two cars. Then follow the description of the trajectory of two cars.</p>

<p>A trajectory consists of a line containing a character d and five integers x, y, s, w and l. The starting position of the car is (x, y) (0 &le; x, y &le; 10<sup>4</sup>) and its direction is d which is either N (positive y direction), S (negative y direction), W (negative x direction) or E (positive x direction). The car is travelling at a speed of 1 &le; s &le; 10<sup>4</sup> units per second, is 1 &le; w &le; 10<sup>4</sup> units wide, and 1 &le; l &le; 10<sup>4</sup> units long.</p>

<p>Cars start out centred on their starting coordinates and do not initially overlap in a nonzero area.</p>

### 출력

<p>For each line of input, output a line &ldquo;crash&rdquo; if the two cars will crash or &ldquo;safe&rdquo; if they will not crash. If two cars overlap in an area of size zero (only on an edge or corner) they do not crash.</p>