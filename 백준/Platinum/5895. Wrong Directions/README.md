# [Platinum IV] Wrong Directions - 5895

[문제 링크](https://www.acmicpc.net/problem/5895)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 54, 맞힌 사람: 38, 정답 비율: 30.400%

### 분류

구현, 자료 구조, 기하학, 집합과 맵, 누적 합, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<p>Farmer John has just purchased a fancy new programmable tractor.  To make the tractor move, he types in a string of length N (1 &lt;= N &lt;= 100,000) consisting of only the characters F, L, and R.  Each &apos;F&apos; instructs the tractor to move forward one unit, and the characters &apos;L&apos; and &apos;R&apos; result in left and right turns of 90 degrees, respectively. The tractor starts out at the origin (0,0) facing north.</p><p>After programming his tractor by typing in his intended command string, FJ remembers that he typed exactly one character in the command string incorrectly, but he can&apos;t remember which one!  For example, he might have typed &apos;F&apos; or &apos;L&apos; when his intended string contained the character &apos;R&apos;. Please compute the number of different locations in the plane at which the tractor might end up as a result (the direction the tractor faces in its final location does not matter).</p>

### 입력

<ul><li>Line 1: Farmer John&apos;s intended command string.</li></ul>

### 출력

<ul><li>Line 1: The number of positions at which the tractor might end up, given that FJ mistypes one of the characters in his command string.</li></ul>

### 힌트

<h4>Input Details</h4><p>Farmer John wants the tractor to advance forward twice, ideally ending at position (0,2).</p><h4>Output Details</h4><p>There are 4 possible mistyped sequences: FL, FR, LF, an RF.  These will land the tractor at (0,1), (0,1), (-1,0), and (1,0) respectively, a total of 3 distinct locations.</p>