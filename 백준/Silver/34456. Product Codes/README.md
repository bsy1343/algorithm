# [Silver IV] Product Codes - 34456

[문제 링크](https://www.acmicpc.net/problem/34456)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 35, 맞힌 사람: 32, 정답 비율: 88.889%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>A store has hired the Code Cleaning Crew to help it update all of its product codes.</p>

<p>The original product codes are sequences of letters, positive integers, and negative integers. For example, <code>cG23mH-9s</code> is a product code that contains two uppercase letters, three lowercase letters, one positive integer, and one negative integer.</p>

<p>The new product codes are made by removing all lowercase letters, keeping all uppercase letters in order, and adding all the integers to form one new integer which is placed at the end of the code. For example, the new product code for <code>cG23mH-9s</code> is <code>GH14</code>.</p>

<p>Your job is to take a list of original product codes and determine the new product codes.</p>

### 입력

<p>The first line of input contains a positive integer, $N$, representing the number of original product codes that need to be updated. The following $N$ lines each contain one original product code.</p>

<p>Each original product code contains at least one uppercase letter, at least one lowercase letter, and at least one integer. Also, a positive integer never immediately follows another integer. This means, for example, that $23$ is the integer $23$ instead of the integer $2$ followed by the integer $3$.</p>

<p> </p>

### 출력

<p>Output the $N$ new product codes, one per line.</p>