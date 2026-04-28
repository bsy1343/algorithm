# [Silver II] Zeros - 22007

[문제 링크](https://www.acmicpc.net/problem/22007)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 268, 정답: 99, 맞힌 사람: 83, 정답 비율: 39.904%

### 분류

수학, 정수론

### 문제 설명

<p>Santa Claus is already preparing for Christmas 2021. He wants to buy some positive number of presents, such that he will be able to divide them evenly (without remainder) among all eligible (not naughty) children. However, he does not yet know how many eligible children there will be &ndash; he only knows that this number will be between $a$ and $b$. Therefore, he wants to buy the minimum positive number of presents that can be divided evenly between any number $x$ of children with $x \in \{a, a+1, \dots, b\}$.</p>

<p>He has computed this (possibly huge) number of presents, but he is unsure about the correctness, and he would like your help in performing the following basic sanity check. Are you able to tell him how many zero digits there should be at the end of this number?</p>

### 입력

<p>The first and only line of the input consists of two space-separated integers $a$ and $b$ ($1 \le a \le b \le 10^{18}$).</p>

### 출력

<p>Output a single integer -- the number of zeros at the end of the number of presents that Santa needs to buy.</p>

### 힌트

<p>First example: If there can be between 1 and 6 children, then Santa needs at least 60 presents (as this is the smallest number that is divisible by all of 1, 2, 3, 4, 5 and 6), and the number 60 has a single zero at the end.</p>

<p>Second example: If there can be either 10 or 11 children, Santa will buy 110 presents.</p>