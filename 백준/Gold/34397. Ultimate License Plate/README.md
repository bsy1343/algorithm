# [Gold I] Ultimate License Plate - 34397

[문제 링크](https://www.acmicpc.net/problem/34397)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

백트래킹, 수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>A robber stole a very expensive cheese grater from Pear, the world's most valuable tech company. You have been hired as a detective to catch the robber and recover the cheese grater. There was not much information about the robber aside from a few witnesses who saw the getaway car the robber escaped in. While none of the witnesses remember the complete license plate of the car, they remember some details about it. Each witness you interviewed knew the maximum number of times a certain character appeared on the license place. The figure shows an example of a license plate that would not be possible if a witness said that "X" appeared at most six times on the plate. Can you use this information to determine the number of possible license plates that match the descriptions from witnesses?</p>

### 입력

<p>The first line is an integer, $N$ ($1 \leq N \leq 10$), specifying the number of characters on the car's license plate. The second line is an integer, $R$ ($0 \leq R \leq 10$), specifying the number of restrictions that were gathered. The next $R$ lines each contain a single restriction. Each restriction consists of a single ASCII character (either a capital English letter $\{A, B, \dots, Y, Z\}$ or a digit $\{0, 1, \dots, 8, 9\}$) followed by an integer, $K$ ($0 \leq K \leq N$), specifying the number of times the corresponding character appears on the license plate. Note that the restrictions are unique: that is, the same character will not appear in more than one restriction.</p>

### 출력

<p>Output a single integer specifying the number of possible license plates given the $R$ restrictions.</p>