# [Gold III] Urban Design - 16386

[문제 링크](https://www.acmicpc.net/problem/16386)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 46, 맞힌 사람: 41, 정답 비율: 66.129%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>A new town is being planned, and the designers have some very specific ideas about how things should be laid out. First, they lay out the streets. Each street is perfectly straight and passes completely from one end of the town to the other. These streets divide the town into regions, and each region is to be designated either &ldquo;residential&rdquo; or &ldquo;commercial.&rdquo; The town planners require that any two regions directly across the street from one another must have different designations. On this one particular day, all of the streets have been planned, but none of the regions have been designated. One town planner wishes to purchase two properties, and it is important to him that the properties eventually have different designations. For this problem, the streets can be modeled by lines in the plane that extend forever in both directions and have no width, and properties may be modeled by points. Given the lines and two points, can you decide whether or not they must get different designations, &ldquo;commercial&rdquo; or &ldquo;residential?&rdquo;</p>

### 입력

<p>Input begins with an integer S on a single line, giving the number of streets (1 &le; S &le; 10 000). The next S lines of input each contain four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, and y<sub>2</sub>, specifying the coordinates of two distinct points (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>). The unique line through these two points gives one of the streets. Each coordinate is in the range [0, 10 000], and no two lines will be identical. That is, the town will have S distinct streets. The next line contains an integer T, the number of pairs of properties to test (1 &le; T &le; 1 000). This is followed by T lines of input, each containing four integers x<sub>3</sub>, y<sub>3</sub>, x<sub>4</sub>, and y<sub>4</sub>, representing two distinct points (x<sub>3</sub>, y<sub>3</sub>) and (x<sub>4</sub>, y<sub>4</sub>), where each point lies within one of the two properties to test. None of these points will lie on any of the streets, nor will both points lie within the same property. Again, each coordinate is in the range [0, 10 000].</p>

### 출력

<p>For each of the T pairs of properties to be tested, output either &ldquo;same&rdquo; if the properties are guaranteed to receive the same designation or &ldquo;different&rdquo; if they are guaranteed to receive different designations.</p>