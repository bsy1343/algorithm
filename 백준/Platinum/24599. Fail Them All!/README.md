# [Platinum II] Fail Them All! - 24599

[문제 링크](https://www.acmicpc.net/problem/24599)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 107, 정답: 36, 맞힌 사람: 32, 정답 비율: 40.506%

### 분류

그래프 이론, 그리디 알고리즘, 플로이드–워셜, 강한 연결 요소, 2-sat

### 문제 설명

<p>You are an instructor for an algorithms course, and your students have been saying mean things about you on social media. Those jerks! Being a vengeful and dishonest instructor, you are going to make them pay.</p>

<p>You have given your students a True/False exam. For each question, each student is allowed to either answer the question or leave the question blank. Each student has answered at least two questions. You want to make sure that every student fails the test, so you are going to alter the answer key so that no student gets more than one answer correct.</p>

<p>Is there an answer key such that every person has at most one submitted answer that is correct? If so, compute the lexicographically minimal such answer key.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 100$) and $k$ ($2 \le k \le 100$), where $n$ is the number of students in the class, and $k$ is the number of questions on the test.</p>

<p>Each of the next $n$ lines contains a string $s$ ($|s| = k$, $s \in \{\texttt{T}, \texttt{F}, \texttt{X}\}^*$), which are the answers to the questions, in order, for each student, where <code>&#39;T&#39;</code>&nbsp;means True, <code>&#39;F&#39;</code>&nbsp;means False, and <code>&#39;X&#39;</code>&nbsp;means the student didn&#39;t answer the question. Every student&#39;s answers will have at least two which are not <code>&#39;X&#39;</code>.</p>

### 출력

<p>If such an answer key can be constructed, output a string of length $k$ consisting of only the characters <code>&#39;T&#39;</code> and <code>&#39;F&#39;</code>, which is the answer key. If more than one such key is possible, output the one which comes first alphabetically (<code>&#39;F&#39;</code> &lt; <code>&#39;T&#39;</code>). If no such key exists, instead output <code>-1</code>.</p>