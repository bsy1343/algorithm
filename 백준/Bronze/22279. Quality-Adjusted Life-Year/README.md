# [Bronze IV] Quality-Adjusted Life-Year - 22279

[문제 링크](https://www.acmicpc.net/problem/22279)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 804, 정답: 750, 맞힌 사람: 718, 정답 비율: 93.368%

### 분류

수학, 사칙연산

### 문제 설명

<p>The Quality-Adjusted Life-Year (QALY) is a way to measure a person&#39;s quality of life that includes both the quality and the quantity of life lived.</p>

<p>The quality of life lived can be quantified as a number between $0$ and $1$. &nbsp;If someone is living with perfect health, the quality of life is $1$. &nbsp;If someone is dead, then the quality of life is $0$. &nbsp;The quality of life may increase or decrease due to medical treatements, sickness, etc.</p>

<p>The QALY for each period in which the quality of life is constant is simply the product of the quality of life and the length of the period (in years). &nbsp;We wish to know the amount of QALY accumulated by a person at the time of death, given the complete history of this person.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($1 \leq N \leq 100$), which is the number of periods of constant quality of life during the person&#39;s lifetime.</p>

<p>The next $N$ lines describe the periods of life. Each of these lines contains two real numbers $q$ ($0 &lt; q \leq 1$), which is the quality of life in this period, and $y$ ($0 &lt; y \leq 100$), which is the number of years in this period. All real numbers will be specified to exactly one decimal place.</p>

### 출력

<p>Display the QALY accumulated by the person. Your answer will be considered correct if its absolute error does not exceed $10^{-3}$.</p>