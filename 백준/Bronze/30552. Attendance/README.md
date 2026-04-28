# [Bronze III] Attendance - 30552

[문제 링크](https://www.acmicpc.net/problem/30552)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 412, 정답: 275, 맞힌 사람: 251, 정답 비율: 68.392%

### 분류

구현, 문자열

### 문제 설명

<p>Taking attendance in your class is a tedious task. You call out the names of students one at a time in alphabetical order. If the student is present, they respond by saying &quot;<code>Present!</code>&quot; before you call the next name.</p>

<p>This is such a boring task that you sometimes zone out and don&#39;t keep a proper record of attendance. Write a program to help you summarize the absences!</p>

### 입력

<p>The first line of input contains a single integer $N$ $(1 \leq N \leq 200)$ indicating the number of &quot;callouts&quot;. Then $N$ lines follow indicating the callouts that were made in the order they were made. A single line consists of either a student&#39;s name or of the response <code>Present!</code>. A student&#39;s name will consist of between $2$ and $10$ characters, the first always being an uppercase letter (<code>&#39;A&#39;</code>-<code>&#39;Z&#39;</code>) and the remaining characters always being lowercase letters (<code>&#39;a&#39;</code>-<code>&#39;z&#39;</code>).</p>

<p>The student names will appear in alphabetical order in this input and a line with the response <code>Present!</code> will only appear if the previous line was the name of a student. In particular, the response <code>Present!</code> will never appear as the first callout.</p>

### 출력

<p>Output the names of all students that are absent in the order they were called, each on a separate line. If no students were absent, simply output the message <code>No Absences</code></p>