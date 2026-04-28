# [Platinum I] Turning in Homework - 27015

[문제 링크](https://www.acmicpc.net/problem/27015)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 6, 맞힌 사람: 5, 정답 비율: 25.000%

### 분류

이분 탐색, 다이나믹 프로그래밍

### 문제 설명

<p>Bessie must turn in her homework for her C classes (1 &le; C &le; 1,000) at Moo U so that she still has time to chew the cud with her fellow classmates as they wait for the bus to go home.</p>

<p>Teachers accept homework submissions only after they have finished their classes and also cleaned the chalkboard, put away lab supplies,and so on. The input data tells the earliest time a teacher will accept homework.</p>

<p>Bessie starts at one end (distance 0) of a hallway H (1 &le; H &le; 1,000) meters long and walks at the rate of one meter per second to various classrooms (in any order she chooses) to turn in her homework. Each classroom is located along this hallway, as well as the door to the waiting area for the buses.</p>

<p>Given the location of both the exit and the classrooms and also the teachers&#39; schedules, determine the earliest time that Bessie can exit the door to the waiting area for the buses. Bessie must turn in all her homework before exiting. The act of turning in the homework takes no time, by the way.</p>

### 입력

<ul>
	<li>Line 1: Three integers: C, H, and B. B (0 &le; B &le; H) is the distance from the hall entrance to the bus waiting area.</li>
	<li>Lines 2..C+1: Each line contains two integers that describe a classroom where homework is to be submitted. The first integer (0..H) is the number of meters to the classroom from the hallway entrance. The second integer (0..10,000) is the first time (in seconds) that the teacher for that course will accept homework.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer: the earliest second that Bessie can exit the door to the waiting area for the buses.</li>
</ul>

### 힌트

<pre>
Time   Action
  0   Bessie walks to the classrooms 8 meters down the hall (at 8m)
  8   Bessie waits 1 second
  9   Bessie turns in the first set of homework 
  9   Bessie waits 3 seconds, thinking about cool hay in the summertime
 12   Bessie turns in the other homework for this location
 12   Bessie walks back to the classroom 4 meters down the hall (at 4m)
 16   Bessie waits 5 seconds, thinking of a handsome bull she once met
 21   Bessie turns in her homework
 21   Bessie walks back to the classroom 1 meters down the hall (at 3m)
 22   Bessie turns in her homework
 22   Bessie exits, since this also the location of the bus exit
</pre>

<p>Thus, Bessie can leave at time 22. No better schedule exists.</p>