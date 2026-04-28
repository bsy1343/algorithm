# [Bronze III] Briefcases Full of Money - 25849

[문제 링크](https://www.acmicpc.net/problem/25849)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 339, 정답: 281, 맞힌 사람: 262, 정답 비율: 83.175%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>It is your birthday party and the six UCF programming team coaches arrive, each holding a briefcase containing money (gift) for you. The coaches were planning to give you the six briefcases but Dr. &ldquo;O&rdquo; points out that the team needs money to travel to World Contest Finals! So, you get to choose one briefcase, i.e., you are not getting all the briefcases (sorry).</p>

<p>Each briefcase contains a stack of bills; each briefcase containing one of the 6 denominations \$1, \$5, \$10, \$20, \$50, \$100, i.e., first briefcase contains only \$1 bills, second contains only \$5 bills, third only \$10 bills, fourth only \$20 bills, fifth only \$50 bills, and sixth only \$100 bills. You, of course, want to pick the one with the highest total amount.</p>

<p>You can randomly pick one briefcase but, as a programmer, you trust your coding skills more than chance and decide to write a program to help you pick the briefcase with the highest amount.</p>

### 입력

<p>There is only one input line; it contains six integers (each integer between 1 and 1000, inclusive). These integers represent, respectively, the number of \$1, \$5, \$10, \$20, \$50, \$100 bills.</p>

### 출력

<p>Output which briefcase to choose by printing the denomination in that briefcase (1, 5, 10, 20, 50, 100). If two or more briefcases have the highest total, pick (print) the one with fewest number of bills among those briefcases since that one is lighter!</p>

### 힌트

<p>Explanation of the second Sample Input/Output: Three briefcases ($1, $10, $50) have the highest total ($200) so the output is the briefcase with the fewest number of bills.</p>