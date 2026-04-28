# [Platinum II] Priglavci - 15582

[문제 링크](https://www.acmicpc.net/problem/15582)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

이분 탐색, 최대 유량, 매개 변수 탐색, 그래프 이론

### 문제 설명

<p>Engineer Zlatko got assigned the task of checking the quality of transportation for students getting to school by bus. In a 2D-coordinate system, there are N students with coordinates u<sub>x</sub> and u<sub>y</sub>, and M bus stops with coordinates s<sub>x</sub> and s<sub>y</sub>. At the beginning, a field can be occupied by one student or by one stop, or it can be empty.</p>

<p>Also, engineer Zlatko has a list of K bus lines: for each bus line, he has a list of stops the bus stops at in the order in which the stops are listed. One stop belongs exclusively to one bus line. The stops are distinct within a bus line. There is only one bus per line. Additionally, each bus can fit C students. Bus stops don&rsquo;t have a limit on the number of students that could be waiting for it.</p>

<p>When a student boards a bus, they don&rsquo;t get off until the end of the ride when the bus has stopped at all stops of the line. A student can board only one bus. For a student to board a bus, they must reach a stop of one of the bus lines. The <strong>length of the path</strong> ​which a student walked from their position to a bus stop is measured as the <strong>squared</strong> ​Euclidean distance: (u<sub>x</sub> - s<sub>x</sub>)<sup>2</sup> + (u<sub>y</sub> - s<sub>y</sub>)<sup>2</sup>.</p>

<p>Engineer Zlatko chooses the boarding stop for each student and distributes them so that the buses can fit everyone, respecting the given limitations. The <strong>weakness</strong> of the distribution of students is measured as the distance walked by the student farthest from their boarding bus stop.</p>

<p>Help engineer Zlatko and calculate the <strong>minimal</strong> possible weakness and the distribution of students.</p>

### 입력

<p>The first line of input contains integers N, M, C, K (1 &le; N, M, C, K &le; 100) from the task.</p>

<p>Each of the following N lines contains integers u<sub>x</sub> and u<sub>y</sub> (-1000 &le; u<sub>x</sub>, u<sub>y</sub> &le; 1000), the students&rsquo; coordinates.</p>

<p>Each of the following M lines contains integers s<sub>x</sub> and s<sub>y</sub> (-1000 &le; s<sub>x</sub>, s<sub>y</sub> &le; 1000), the stops&rsquo; coordinates.</p>

<p>Each of the following K lines contains the list of bus stops: first, the number of stops K<sub>i</sub> of the bus line, then K<sub>i</sub> numbers st<sub>j</sub> (1 &le; st<sub>j</sub> &le; M) that denote the stops.</p>

### 출력

<p>If it is possible to distribute the students within the requirements, you must output the required weakness in the first line, and in the following N lines, the i<sup>th</sup> line must contain the stop the i<sup>th</sup> student must walk to. In the case that the distribution of students to bus stops with the calculated weakness is not unique, output an arbitrary distribution with such weakness. If it is impossible to distribute the students, you must output &lsquo;-1&rsquo; (without quotes).</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>The distance which both students must walk to a bus stop is 2. The squared value of that instance is 4.</p>

<p><strong>Clarification of the second test case:</strong></p>

<p>Since only one line exists, in total there is a single bus with a capacity of 1, which is not sufficient to distribute all the students properly.</p>

<p><strong>Clarification of the third test case:</strong></p>

<p>Firstly, two students go to the first stop. The nearest stop to the third student is the second stop, but that stop belongs to the bus line of an already full bus. Therefore, the third student must go to the third stop, and the squared value of their path length is 9. Every other distribution results in greater weakness.</p>