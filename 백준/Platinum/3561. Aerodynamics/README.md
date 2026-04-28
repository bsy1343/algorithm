# [Platinum IV] Aerodynamics - 3561

[문제 링크](https://www.acmicpc.net/problem/3561)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 9, 맞힌 사람: 8, 정답 비율: 21.053%

### 분류

기하학, 볼록 껍질, 다각형의 넓이

### 문제 설명

<p>Bill is working in a secret laboratory. He is developing missiles for national security projects. Bill is the head of the aerodynamics department.</p>

<p>One surprising fact of aerodynamics is called Whitcomb area rule. An object flying at high-subsonic speeds develops local supersonic airflows and the resulting shock waves create the effect called wave drag. Wave drag does not depend on the exact form of the object, but rather on its cross-sectional profile.</p>

<p>Consider a coordinate system with OZ axis pointing in the direction of object&rsquo;s motion. Denote the area of a section of the object by a plane z = z<sub>0</sub> as S(z<sub>0</sub>). Cross-sectional profile of the object is a function S that maps z<sub>0</sub> to S(z<sub>0</sub>). There is a perfect aerodynamic shape called Sears-Haack body. The closer cross-sectional profile of an object to the cross-sectional profile of Sears-Haack body, the less wave drag it introduces. That is an essence of Whitcomb area rule.</p>

<p>Bill&rsquo;s department makes a lot of computer simulations to study missile&rsquo;s aerodynamic properties before it is even built. To approximate missile&rsquo;s cross-sectional profile one takes samples of S(z<sub>0</sub>) for integer arguments z<sub>0</sub> from z<sub>min</sub> to z<sub>max</sub>.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0367bbd8-d9b9-4d5a-af7f-2a316e762024/-/preview/" style="width: 552px; height: 397px;" /></p>

<p>Your task is to find the area S(z<sub>0</sub>) for each integer z<sub>0</sub> from z<sub>min</sub> to z<sub>max</sub>, inclusive, given the description of the missile. The description of the missile is given to you as a set of points. The missile is the minimal convex solid containing all the given points. It is guaranteed that there are four points that do not belong to the same plane.</p>

### 입력

<p>The first line of the input file contains three integer numbers: n, z<sub>min</sub> and z<sub>max</sub> (4 &le; n &le; 100, 0 &le; z<sub>min</sub> &le; z<sub>max</sub> &le; 100). The following n lines contain three integer numbers each: x, y, and z coordinates of the given points. All coordinates do not exceed 100 by their absolute values. No two points coincide. There are four points that do not belong to the same plane.</p>

### 출력

<p>For each integer z<sub>0</sub> from z<sub>min</sub> to z<sub>max</sub>, inclusive, output one floating point number: the area S(z0). The area must be precise to at least 5 digits after decimal point.</p>