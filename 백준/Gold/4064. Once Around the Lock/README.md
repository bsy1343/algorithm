# [Gold IV] Once Around the Lock - 4064

[문제 링크](https://www.acmicpc.net/problem/4064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 8, 맞힌 사람: 7, 정답 비율: 25.926%

### 분류

많은 조건 분기, 구현, 수학, 시뮬레이션

### 문제 설명

<p>Most of us at one time or another have used a circular combination lock (think back to those glorious days in high school and your gym locker). Most combination locks consist of a dial with the numbers 0 through n-1 printed on it in clockwise order. The dial can be turned either clockwise or counterclockwise, bringing one of the numbers to the top of the dial (if 0 is at the top of the dial, a turn of 1 in the counterclockwise direction would bring 1 to the top). Each lock has a three number code (x,y,z) and can only be opened after the following series of steps:</p>

<ol>
	<li>The lock dial must first be spun clockwise at least one full rotation, ending with the number x at the top (with no intervening counterclockwise turns). Note this could be accomplished with consecutive clockwise turns.</li>
	<li>The lock must be turned counterclockwise until the number y appears at the top for the second time. Note this could be accomplished with consecutive counterclockwise turns (but no intervening clockwise turns).</li>
	<li>The lock must then be turned clockwise until the number z appears on top, without going more than one full rotation. Note this could be accomplished with consecutive clockwise turns (but no intervening counterclockwise turns).</li>
</ol>

<p>Any rotation after this last step will cause the lock to be closed again.</p>

<p>For this problem, you will be given a lock and a series of turns and you must determine at the end whether or not the lock is open. You should assume prior to the first turn that the lock has just been closed, and the dial spun counterclockwise until 0 is on top.</p>

### 입력

<p>Input will consist of multiple test cases. The first line of each test case will contain four integers n x y z, indicating the number of digits on the lock&rsquo;s dial and the three-number combination (x, y and z will all be different and n &le; 1000). The next line(s) will consist of a series of dial rotations of the form d s, where d is either C or CC (for clockwise or counterclockwise) and s (&gt; 0) indicates how many numbers to spin through at the top of the dial. For example, if n = 50 and the current number on top of the dial is 4, the rotation CC 6 would bring the number 10 to the top, while a rotation of C 6 would bring 48 to the top. The series of dial rotations may extend over multiple lines, ending with the character ?. A line with a single 0 on it will follow the last test case.</p>

### 출력

<p>For each problem instance, output a single line containing either the word Open or Closed, prefaced by the test case number as shown in the sample output.</p>