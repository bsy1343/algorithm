# [Platinum IV] Team Selection - 7580

[문제 링크](https://www.acmicpc.net/problem/7580)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>It is the night before the IOI team selection is to be announced. All the students are awake and confident, eagerly anticipating the results. Looking through the exam scores, however, Bernard begins to worry. Every student has achieved a perfect score on the exam, making it impossible to determine who should be on the team.</p>

<p>Shutting the lid of his laptop, Bernard announces that team selection this year will take place a little differently. The process will start by Bernard announcing a number, k, and then have all the students stand in a circle. Bernard will then, starting with the first student in the circle, move around the circle removing every kth student until the circle is empty. The last four students removed from the circle will form the team.</p>

<p>You decide that if you want to make the team, you will have to act fast and ensure you stand in one of the four selected positions in the circle. Your task is to write a program that, given the number of students in the circle and the number k, will determine the last four positions to be selected by Bernard.&nbsp;</p>

### 입력

<p>The input consists of a series of single lines consisting of two integers, n k, separated by a single space 4 &lt;= N &lt;= 10,000,000, 1 &lt;= K &lt;=10,000,000. N represents the number of students in the circle, while K represents how often Bernard removes a student. The last line is 0 0. This represents the end of the input – do not process this line.</p>

### 출력

<p>For each line of input the output should consist of a single line with four integers, each separated by a single space. These integers are the last four positions in the circle to be removed by Bernard. These positions should be listed in the order in which Bernard removes them.&nbsp;</p>

### 힌트

<p>In the first sample input, there are 9 students in the circle and every 3rd student is removed. Students are removed in the circle in the order 3, 6, 9, 4, 8, 5, 2, 7, 1. The last four students to be removed are therefore 5, 2, 7 and 1. These students form the team.&nbsp;</p>