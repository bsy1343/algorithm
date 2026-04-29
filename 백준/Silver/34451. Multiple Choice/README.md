# [Silver V] Multiple Choice - 34451

[문제 링크](https://www.acmicpc.net/problem/34451)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 44, 정답: 34, 맞힌 사람: 33, 정답 비율: 78.571%

### 분류

구현, 많은 조건 분기, 정렬

### 문제 설명

<p>Mrs. Technoscan often gives multiple choice quizzes in her classroom. She likes this since she is able to feed the forms from the quizzes into a specialized scanner to automatically grade all of the quizzes.</p>

<p>However, this semester, Mrs. Technoscan's class is being held in a computer lab, and all of the students will have access to a computer during the quizzes. She created a website in which the students can input their multiple choice answers, and has the students' answers download to a file on her PC.</p>

<p>Help Mrs. Technoscan out by writing this program which reads this file on input, creating a grade for each student based on their answers, and creating sorted results on output.</p>

### 입력

<p>Input starts with a single integer on it's own line, $N$ ($1 \le N \le 40$), which indicates the number of questions on the quiz. The next $N$ lines indicate the answer key, each line with the capital letter <code>A</code>, <code>B</code>, <code>C</code>, or <code>D</code> on it.</p>

<p>After reading the answer key, you will read a single integer on its own line, $M$ ($1 \le M \le 300$), which indicates the number of students who took the quiz. Then, for each of the $M$ students comes:</p>

<ul>
	<li>A line with an integer $S$ ($1 \le S \le 10^9$) on its own, indicating the student ID of that particular student. You are guaranteed that $S$ will be unique for each student in a particular input.</li>
	<li>$N$ lines indicating the student's answers. You are guaranteed each line will only have the capital letter <code>A</code>, <code>B</code>, <code>C</code>, or <code>D</code> on it.</li>
</ul>

<p>Finally, the last line of input will contain <code>STUDENT_ID_ASC</code>, <code>STUDENT_ID_DESC</code>, <code>GRADE_ASC</code>, or <code>GRADE_DESC</code>, indicating the order in which you should output the results. These values indicate sort by student ID (ascending or descending), or by grade (ascending or descending) respectively. When two or more students have the same number of correct answers, you should order those students by student ID, ascending.</p>

### 출력

<p>Output the student ID and grade (an integer with the number of correct answers) for each student on its own line, in the order specified by the input.</p>