# [Bronze II] Košnja - 15322

[문제 링크](https://www.acmicpc.net/problem/15322)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 406, 정답: 290, 맞힌 사람: 248, 정답 비율: 72.515%

### 분류

수학, 사칙연산

### 문제 설명

<p>Mirko wants to buy land on which he will build a house for his family. So far, he&rsquo;s seen K pieces of land. Each of them is in the shape of a rectangle and we can think of it as a matrix with N rows and M columns, N &times; M fields in total.</p>

<p>Mirko is aware that, before construction begins, the property needs to be regularly maintained and the lawn needs to be mowed. Because of this, Mirko bought a lawn mower. In order to mow the entire lawn of N rows and M columns, he needs to go over each field at least once. He can start from any field facing one of the four main directions (up, down, left, and right). His lawn mower can only go forwards (to the adjacent field facing the current direction) or make a 90 degree turn. Additionally, because of his own safety, Mirko can only use the lawn mower on his land, so he cannot leave the matrix.</p>

<p>Since making the lawn mower turn isn&rsquo;t simple, Mirko wants to mow the lawn with the minimal amount of turns. For each piece of land he saw so far, Mirko wants to know the minimal number of turns he can make so that the entire lawn is mowed. Help Mirko solve this problem.</p>

### 입력

<p>The first line of input contains the positive integer K (1 &le; K &le; 50 000), the number from the task.</p>

<p>Each of the following K lines contains two positive integers N and M (1 &le; N, M &le; 1 000 000), the numbers from the task.</p>

### 출력

<p>For each piece of land Mirko saw so far, output in a separate line the minimal amount of turns he can take so that the entire lawn is mowed.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​first​ ​test​ ​case: The first piece of land can be mowed without making any turns if he starts from the field in the first column of the table, faced to the right and only going forwards. A similar idea applies for the second piece of land.</p>