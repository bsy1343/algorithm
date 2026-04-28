# [Platinum V] Forged Answers - 11011

[문제 링크](https://www.acmicpc.net/problem/11011)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 110, 정답: 52, 맞힌 사람: 37, 정답 비율: 51.389%

### 분류

브루트포스 알고리즘, 그리디 알고리즘

### 문제 설명

<p>wen, dream, and moon had to take the make-up exam, since they had not gotten enough scores to pass the course. The make-up exam consisted of n multiple choice questions. There is one point for each question, and each question had four choices A, B, C, and D. Students submitted their answers sheets for computer scoring. After the exam, their best friend, drazil, has found out they submitted a wrong answer for every question.</p>

<p>drazil feels they are miserable, so he decides to crack into the teacher&rsquo;s computer to modify the standard answers. drazil aims to maximize the minimum of their scores. For example, assume there were 3 questions in the make-up exam, wen answered ABC, dream answered BCD, moon answered CDA, and the original standard answers were DAB. They answered wrongly to all questions, so drazil modifies the answers to CCC to make them &ldquo;correctly&rdquo; answered at least one question in the make-up exam.</p>

<p>Now, you are informed about how wen, dream, and moon answered in the make-up exam. Please help drazil to find out how to modify the standard answers to maximize the minimum of their scores.</p>

### 입력

<p>The first line contains a positive integer T (T &le; 100) indicating the number of test cases. Each test case consists of four lines. The first line contains a positive integer n (n &le; 30000) indicating the make-up exam consisted of n questions. The following three lines represent wen&rsquo;s, dream&rsquo;s, moon&rsquo;s answers, respectively. Each of these line contains a string of n characters, and the i-th character is the answer to i-th question written on the sheet.</p>

### 출력

<p>For each test case, output one line containing an integer indicating the maximum possible value of the minimum of their scores.</p>