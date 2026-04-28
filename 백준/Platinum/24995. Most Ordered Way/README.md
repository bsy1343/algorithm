# [Platinum III] Most Ordered Way - 24995

[문제 링크](https://www.acmicpc.net/problem/24995)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 39, 맞힌 사람: 34, 정답 비율: 50.746%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Sofia was given N assignments from school, numbered from 1 to N. For each assignment she knows two values T and D (time and deadline), indicating that the assignment takes T minutes to be done and must be completed not later than D minutes from now.</p>

<p>Sofia can do the assignments in any order, she can do a single assignment at a time, and once she starts an assignment, she keeps working on it until the assignment is done. Sofia only spends time doing the assignments. This means that she can start working right now, and each time she completed an assignment she can start working on a new one immediately, without taking any breaks (how hardworking, huh?).</p>

<p>Sofia is a perfectionist and wants to complete all the assignments. Originally, she wanted to do the assignments in the order she was given, but she soon realized that this restriction might lead to assignments not being completed on time. Thus, if there are several ways to complete the assignments within their deadlines, Sofia wants to complete them in the &ldquo;most ordered&rdquo; way. Can you tell her how to organize her work? Time is running out, she needs your advice immediately.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 5000) representing the number of assignments. Each of the next N lines describes an assignment with two integers T and D (1 &le; T &le; D &le; 10<sup>9</sup>), indicating that the assignment takes T minutes to be done and must be completed not later than D minutes from now.</p>

### 출력

<p>Output a single line with a permutation of the integers from 1 to N describing an order in which the assignments can be done so as to complete each of them on time, or the character &ldquo;<code>*</code>&rdquo; (asterisk) if such an order does not exist. If more than one permutation allows completing the assignments on time, output the lexicographically smallest permutation.</p>