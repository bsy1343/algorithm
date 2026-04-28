# [Bronze IV] Multiple Choice - 6784

[문제 링크](https://www.acmicpc.net/problem/6784)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1207, 정답: 1007, 맞힌 사람: 953, 정답 비율: 84.938%

### 분류

구현

### 문제 설명

<p>Your teacher likes to give multiple choice tests. One benefit of giving these tests is that they are easy to mark, given an answer key. The other benefit is that students believe they have a one-in-five chance of getting the correct answer, assuming the multiple choice possibilities are A,B,C,D or E.</p>

<p>Write a program that your teacher can use to grade one multiple choice test.</p>

### 입력

<p>The input will contain the number N (0 &lt; N &lt; 10000) followed by 2N lines. The 2N lines are composed of N lines of student responses (with one of A,B,C,D or E on each line), followed by N lines of correct answers (with one of A,B,C,D or E on each line), in the same order as the student answered the questions (that is, if line i is the student response, then line N +i contains the correct answer to that question).</p>

### 출력

<p>Output the integer C (0 &le; C &le; N) which corresponds to the number of questions the student answered correctly.</p>