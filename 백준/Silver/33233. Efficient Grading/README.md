# [Silver I] Efficient Grading - 33233

[문제 링크](https://www.acmicpc.net/problem/33233)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 수학, 이분 탐색

### 문제 설명

<p>You are the new responsible instructor for the newest course at TU Delft: Financial Project Coordination (FPC). The course went smoothly throughout the quarter, but now you are faced with a new challenge: you have a multitude of exams to grade. You want to finish the exams as quickly as possible before your new course starts. Luckily for you, you can employ some teaching assistants (TAs) to help out. For each TA that you employ, you need to spend some time giving them a quick training, by quickly going through an example exam. As a result, a trained TA can, in turn, grade exams as well and can also train other TAs. The time you spend training is the same as the time you could spend grading.</p>

<p>With this in mind, you need to find out 2 things. Firstly, what is the minimum amount of time needed to grade all exams? Secondly, what is the minimum number of graders needed to achieve this time?</p>

### 입력

<p>The input consists of a single line containing two integers:</p>

<ul>
	<li>$n$ ($1\leq n\leq 10^6$), the number of exams to grade.</li>
	<li>$t$ ($1\leq t\leq 10^9$), the amount of time needed to grade an exam or train a TA.</li>
</ul>

### 출력

<p>Output a single line, with 2 space-separated numbers:</p>

<ul>
	<li>The minimum amount of time needed to grade all exams.</li>
	<li>The minimum number of graders (yourself plus the number of trained TAs) needed to finish grading within the minimum amount of time.</li>
</ul>