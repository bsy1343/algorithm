# [Bronze II] Scores of Final Examination - 17577

[문제 링크](https://www.acmicpc.net/problem/17577)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 278, 정답: 232, 맞힌 사람: 202, 정답 비율: 85.593%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>I am a junior high school teacher. The final examination has just finished, and I have all the students&#39; scores of all the subjects. I want to know the highest total score among the students, but it is not an easy task as the student scores are listed separately for each subject. I would like to ask you, an excellent programmer, to help me by writing a program that finds the total score of a student with the highest total score.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>
<!-- end en only -->

<pre>
<i>n m</i>
<i>p</i><sub>1,1</sub> <i>p</i><sub>1,2</sub> &hellip; <i>p</i><sub>1,<i>n</i></sub>
<i>p</i><sub>2,1</sub> <i>p</i><sub>2,2</sub> &hellip; <i>p</i><sub>2,<i>n</i></sub>
&hellip;
<i>p</i><sub><i>m</i>,1</sub> <i>p</i><sub><i>m</i>,2</sub> &hellip; <i>p</i><sub><i>m,n</i></sub></pre>

<p>The first line of a dataset has two integers <i>n</i> and <i>m</i>. <i>n</i> is the number of students (1 &le; <i>n</i> &le; 1000). <i>m</i> is the number of subjects (1 &le; <i>m</i> &le; 50). Each of the following <i>m</i> lines gives <i>n</i> students&#39; scores of a subject. <i>p</i><sub><i>j,k</i></sub> is an integer representing the <i>k</i>-th student&#39;s score of the subject <i>j</i> (1 &le; <i>j</i> &le; <i>m</i> and 1 &le; <i>k</i> &le; <i>n</i>). It satisfies 0 &le; <i>p</i><sub><i>j,k</i></sub> &le; 1000.</p>

<p>The end of the input is indicated by a line containing two zeros. The number of datasets does not exceed 100.</p>

### 출력

<p>For each dataset, output the total score of a student with the highest total score. The total score <i>s</i><sub><i>k</i></sub> of the student <i>k</i> is defined by <i>s</i><sub><i>k</i></sub> = <i>p</i><sub>1,<i>k</i></sub> + &hellip; + <i>p</i><sub><i>m,k</i></sub>.</p>